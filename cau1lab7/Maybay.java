package cau1lab7;

public class Maybay extends Phuongtiendichuyen {

    private String loainhienlieu;

    public Maybay() {
    }

    public Maybay(String loainhienlieu) {
        this.loainhienlieu = loainhienlieu;
    }

    public Maybay(String loainhienlieu, String loaiphuongtien, Hangsanxuat hangsanxuat) {
        super(loaiphuongtien, hangsanxuat);
        this.loainhienlieu = loainhienlieu;
    }

    public String getLoainhienlieu() {
        return loainhienlieu;
    }

    public void setLoainhienlieu(String loainhienlieu) {
        this.loainhienlieu = loainhienlieu;
    }
    
    public void catCanh() {
        System.out.println("may bay cat canh");
    }

    public void haCanh() {
        System.out.println("may bay ha canh");
    }
    @Override
    public double layVantoc() {
        return 320;
    }


}