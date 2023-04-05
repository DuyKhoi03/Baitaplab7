package cau1lab7;

public class Xedap extends Phuongtiendichuyen{

    public Xedap() {
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
        return 15;
    }
    
}