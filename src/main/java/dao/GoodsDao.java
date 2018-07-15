package dao;

import entity.Goods;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.Date;
import java.util.List;

public class GoodsDao {
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    //查询全部
    public List<Goods> getAll(){
        Session session = sessionFactory.getCurrentSession();
        String sql = "from Goods as g order by g.Gcreatetime desc";
        return session.createQuery(sql).list();
    }

    //增加
    public void addGoods(Goods goods){
        Session session = sessionFactory.getCurrentSession();
        session.save(goods);
    }

    //删除
    public void delete(int Gno){
        Session session = sessionFactory.getCurrentSession();
        session.delete(session.get(Goods.class,Gno));
    }

    //根据编号查询
    public Goods getById(int Gno){
        Session session = sessionFactory.getCurrentSession();
        return session.get(Goods.class,Gno);
    }

    //修改
    public void update(Goods goods){
        Session session = sessionFactory.getCurrentSession();
        session.update(goods);
    }

    //按条件查询
    public List<Goods> getByTerm(String gname, Date firstTime,Date lastTime){
        Session session = sessionFactory.getCurrentSession();
        String hql = "from Goods g where g.gname like :gname and g.Gcreatetime between :firstTime and :lastTime";
        Query query = session.createQuery(hql);
        query.setParameter("gname","%"+gname+"%");
        query.setParameter("firstTime",firstTime);
        query.setParameter("lastTime",lastTime);
        return query.list();

    }

    //批量删除
    public void deleteAll(String[] Gno){
        Session session = sessionFactory.getCurrentSession();
        for(int i=0;i<Gno.length;i++){
            Goods goods = this.getById(Integer.parseInt(Gno[i]));
            session.delete(goods);
        }
    }

}
