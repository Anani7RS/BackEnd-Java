package PracticaComic;

import imonsh.Colors;
import imonsh.Screen;

public class Justo extends Pesonaje implements ActionJusto{

    Justo(String n, String e, String g) {
        super(n, e, g);
    }

    @Override
    public void enojarse(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"Times New Roman",20, Colors.Desire);
        s.showImage("5.png");
        s.setBounds(200,100,600,600);
    }

    @Override
    public void manejar(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("12.png");
        s.setBounds(200,100,600,600);
    }

    @Override
    public void conjurar(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("10.png");
        s.setBounds(200,100,600,600);
    }

    @Override
    public void molestarse(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("6.png");
        s.setBounds(200,100,600,600);
    }
}
