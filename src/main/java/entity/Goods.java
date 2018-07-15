package entity;

import java.util.Date;

public class Goods {

    private int Gno ; //编号
    private String gname ;  //物质名称
    private String gtype ;  //物质类型
    private int Gnumber ;  //物质数量
    private String Gcompany ;  //生产商
    private Date Gcreatetime ;  //生产日期
    private Date Uintime ;  //入库时间

    public int getGno() {
        return Gno;
    }

    public void setGno(int gno) {
        Gno = gno;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGtype() {
        return gtype;
    }

    public void setGtype(String gtype) {
        this.gtype = gtype;
    }

    public int getGnumber() {
        return Gnumber;
    }

    public void setGnumber(int gnumber) {
        Gnumber = gnumber;
    }

    public String getGcompany() {
        return Gcompany;
    }

    public void setGcompany(String gcompany) {
        Gcompany = gcompany;
    }

    public Date getGcreatetime() {
        return Gcreatetime;
    }

    public void setGcreatetime(Date gcreatetime) {
        Gcreatetime = gcreatetime;
    }

    public Date getUintime() {
        return Uintime;
    }

    public void setUintime(Date uintime) {
        Uintime = uintime;
    }
}
