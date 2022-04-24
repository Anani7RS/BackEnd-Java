package PracticaComic;

import imonsh.Colors;
import imonsh.Screen;

public class Coraje extends Pesonaje implements ActionCoraje{

    Coraje(String n, String e, String g) {
        super(n, e, g);
    }


    @Override
    public void presentar(Screen s) {
        s.setVisible(true);
        s.out(showMessage(),"Times New Roman",20, Colors.pink);
        s.showImage("1.png");
        s.setBounds(200,100,600,600);
    }

    @Override
    public void asustarse(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("7.png");
        s.setBounds(200,100,600,600);
    }

    @Override
    public void conjurar(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("11.png");
        s.setBounds(200,100,600,600);
    }

    @Override
    public void buscar(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("9.png");
        s.setBounds(200,100,600,600);
    }

    @Override
    public void nadar(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("13.png");
        s.setBounds(200,100,600,600);
    }

    @Override
    public void gritar(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("8.png");
        s.setBounds(200,100,600,600);
    }

    @Override
    public void descansar(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("3.png");
        s.setBounds(200,100,600,600);
    }

    @Override
    public void despedir(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("14.png");
        s.setBounds(200,100,600,600);
    }
}
