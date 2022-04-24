package PracticaComic;

import imonsh.Colors;
import imonsh.Screen;

public class Muriel extends Pesonaje implements ActionMuriel{

    Muriel(String n, String e, String g) {
        super(n, e, g);
    }

    @Override
    public void adoptar(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"Times New Roman",20, Colors.RoyalBlue);
        s.showImage("2.png");
        s.setBounds(200,100,600,600);
    }

    @Override
    public void vertele(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("4.png");
        s.setBounds(200,100,600,600);
    }
}
