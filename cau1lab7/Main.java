package cau1lab7;

public class Main {

    public static void main(String[] args) {
        Maybay mb = new Maybay();
        mb.setLoainhienlieu("dau");
        System.out.println("nhien lieu:" + mb.getLoainhienlieu());
        mb.catCanh();
        mb.haCanh();
        Phuongtiendichuyen p1 = new Maybay();
        System.out.println("vt may bay:" + p1.layVantoc());

        Xeoto ot = new Xeoto();
        ot.setLoainhienlieu("dau");
        System.out.println("nhien lieu:" + ot.getLoainhienlieu());
        Phuongtiendichuyen p2 = new Xeoto();
        System.out.println("vt oto:" + p2.layVantoc());

        Phuongtiendichuyen p3 = new Xedap();
        System.out.println("vt xe may:" + p3.layVantoc());

    }
}