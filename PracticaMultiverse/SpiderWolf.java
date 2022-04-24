package PracticaMultiverse;

import imonsh.Colors;
import imonsh.Screen;

public class SpiderWolf extends Spiderman implements AWolf {
    SpiderWolf(String t, String u, String v, String g) {
        super(t, u, v, g);
    }

    @Override
    public void fuerzaSobreH(Screen s) {
        s.setVisible(true);
        s.out(showMessage(),"Times New Roman",20, Colors.BlueHorizon);
        s.showImage("FuerzaSH.gif");
        s.setBounds(200,100,900,900);
    }

    @Override
    public void desgarre(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"Times New Roman",20, Colors.BlueHorizon);
        s.showImage("Desgarre.gif");
        s.setBounds(200,100,900,900);
    }

    @Override
    public void rastreo(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"Times New Roman",20, Colors.red);
        s.showImage("Rastreo.jpg");
        s.setBounds(200,100,900,900);
    }

    @Override
    public void sentidoAracnido(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"Times New Roman",20, Colors.red);
        s.showImage("SentidoAracnido.gif");
        s.setBounds(200,100,900,900);
    }
}
