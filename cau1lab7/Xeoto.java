package cau1lab7;

public class Xeoto extends Phuongtiendichuyen {
    private String loainhienlieu;

    public Xeoto() {
    }

    public Xeoto(String loainhienlieu) {
        this.loainhienlieu = loainhienlieu;
    }

    public Xeoto(String loainhienlieu, String loaiphuongtien, Hangsanxuat hangsanxuat) {
        super(loaiphuongtien, hangsanxuat);
        this.loainhienlieu = loainhienlieu;
    }

    public Xeoto(String loainhienlieu, String loaiphuongtien, Hangsanxuat hangsanxuat, String tenHangsanxuat, String tenQuocgia) {
        super(loaiphuongtien, hangsanxuat, tenHangsanxuat, tenQuocgia);
        this.loainhienlieu = loainhienlieu;
    }

    public String getLoainhienlieu() {
        return loainhienlieu;
    }

    public void setLoainhienlieu(String loainhienlieu) {
        this.loainhienlieu = loainhienlieu;
    }

    public String getLoaiphuongtien() {
        return loaiphuongtien;
    }

    public void setLoaiphuongtien(String loaiphuongtien) {
        this.loaiphuongtien = loaiphuongtien;
    }

    public Hangsanxuat getHangsanxuat() {
        return hangsanxuat;
    }

    public void setHangsanxuat(Hangsanxuat hangsanxuat) {
        this.hangsanxuat = hangsanxuat;
    }
    
    
    @Override
    double layVantoc() {
        return 80;
    }
    
}
