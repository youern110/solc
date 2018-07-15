package controller;

import com.opensymphony.xwork2.ActionContext;
import entity.Goods;
import service.GoodsService;

import java.util.Date;
import java.util.List;

public class GoodsController {
    private GoodsService goodsService;

    private Goods goods;

    private Date firstTime;
    private Date lastTime;
    private String Gnos;

    public String getGnos() {
        return Gnos;
    }

    public void setGnos(String gnos) {
        Gnos = gnos;
    }

    public Date getFirstTime() {
        return firstTime;
    }

    public void setFirstTime(Date firstTime) {
        this.firstTime = firstTime;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public GoodsService getGoodsService() {
        return goodsService;
    }

    public void setGoodsService(GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    //查询全部
    public String list(){
        List<Goods> goods = goodsService.getAll();
        ActionContext.getContext().put("goods",goods);
        return "list";
    }
    //添加商品
    public String add(){
        goodsService.addGoods(goods);
        return "success";
    }
    //删除商品
    public String delete(){
        goodsService.delete(goods.getGno());
        return "success";
    }
    //批量删除
    public String deleteAll(){
        System.out.println(Gnos);
        String[] gnos = Gnos.split(",");
        goodsService.deleteAll(gnos);
        return "success";
    }
    //查询要修改的商品
    public String edit(){
        Goods goods1 = goodsService.getById(goods.getGno());
        ActionContext.getContext().put("goods1",goods1);
        return "edit";
    }
    //修改商品
    public String update(){
        goodsService.update(goods);
        return "success";
    }

    //按条件查询
    public String getByTerm(){
        List<Goods> goods2 = goodsService.getByTerm(goods.getGname(),firstTime,lastTime);
        ActionContext.getContext().put("goods",goods2);
        return "list";
    }
}
