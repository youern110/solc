package service;

import dao.GoodsDao;
import entity.Goods;

import java.util.Date;
import java.util.List;

public class GoodsService {
    private GoodsDao goodsDao;

    public GoodsDao getGoodsDao() {
        return goodsDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }

    public List<Goods> getAll(){
        return goodsDao.getAll();
    }

    public void addGoods(Goods goods){
        goodsDao.addGoods(goods);
    }

    public void delete(int Gno){
        goodsDao.delete(Gno);
    }

    public Goods getById(int Gno){
        return goodsDao.getById(Gno);
    }

    public void update(Goods goods){
        goodsDao.update(goods);
    }

    public List<Goods> getByTerm(String gname, Date firstTime, Date lastTime){
        return goodsDao.getByTerm(gname,firstTime,lastTime);
    }

    public void deleteAll(String[] Gno){
        goodsDao.deleteAll(Gno);
    }
}
