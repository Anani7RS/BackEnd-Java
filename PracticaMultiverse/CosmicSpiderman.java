package PracticaMultiverse;

import imonsh.Colors;
import imonsh.Screen;

public class CosmicSpiderman extends Spiderman implements ACosmic {

    CosmicSpiderman(String t, String u, String v, String g) {
        super(t, u, v, g);
    }

    @Override
    public void uniPoder(Screen s) {
        s.setVisible(true);
        s.out(showMessage(),"Times New Roman",20, Colors.AntiFlashWhite);
        s.showImage("UniPoder.jpg");
        s.setBounds(200,100,900,900);
    }

    @Override
    public void combatienteExperto(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"Times New Roman",20, Colors.RoyalBlue);
        s.showImage("CombatienteExperto.png");
        s.setBounds(200,100,900,900);
    }

    @Override
    public void controlMateria(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"Times New Roman",20, Colors.AntiFlashWhite);
        s.showImage("ControlMateria.png");
        s.setBounds(200,100,900,900);
    }

    @Override
    public void controlEnergia(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"Times New Roman",20, Colors.RoyalBlue);
        s.showImage("ControlEnergia.gif");
        s.setBounds(200,100,900,900);
    }

    @Override
    public void supresion(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"Times New Roman",20, Colors.AntiFlashWhite);
        s.showImage("Supresion.png");
        s.setBounds(200,100,900,900);
    }

    @Override
    public void fuerzaDescomunal(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"Times New Roman",20, Colors.RoyalBlue);
        s.showImage("FuerzaDescomunal.png");
        s.setBounds(200,100,900,900);
    }
}

