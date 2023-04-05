package cau2lab7;

public class Main {
    public static void main(String[] args) {
        Moveable m=new Movepoint(5,5,5,5);
        
        
        m.moveup();
        
        m.movedown();
        
        m.moveleft();
        
        m.moveright();
        
        m.toString();
    }
}