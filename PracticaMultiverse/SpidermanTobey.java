package PracticaMultiverse;

import imonsh.Colors;
import imonsh.Screen;

public class SpidermanTobey extends Spiderman implements ATobey {
    SpidermanTobey(String t, String u, String v, String g) {
        super(t, u, v, g);
    }

    @Override
    public void velocidad(Screen s) {
        s.setVisible(true);
        s.out(showMessage(),"Times New Roman",20, Colors.Desire);
        s.showImage("Velocidad.gif");
        s.setBounds(200,100,900,900);
    }

    @Override
    public void factorCuracion(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"Times New Roman",20, Colors.RoyalBlue);
        s.showImage("FactorCuracion.gif");
        s.setBounds(200,100,900,900);
    }

    @Override
    public void habilidadSalto(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"Times New Roman",20, Colors.Desire);
        s.showImage("HabilidadSalto.gif");
        s.setBounds(200,100,900,900);
    }

    @Override
    public void trepaMuros(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"Times New Roman",20, Colors.RoyalBlue);
        s.showImage("TrepaMuros.gif");
        s.setBounds(200,100,900,900);
    }

    @Override
    public void telarañaOrganica(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"Times New Roman",20, Colors.Desire);
        s.showImage("TelarañaOrganica.gif");
        s.setBounds(200,100,900,900);
    }

    @Override
    public void combatienteExperto(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"Times New Roman",20, Colors.RoyalBlue);
        s.showImage("CombatienteExperto.gif");
        s.setBounds(200,100,900,900);
    }
}
