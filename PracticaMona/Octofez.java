package PracticaMona;

import java.sql.SQLOutput;

class Octofez extends Mona{
    String sonido;

    Octofez(int id, int p, String nom, String esp, String col,String son) {
        super(id, p, nom, esp, col);
        this.sonido = son;
    }

    @Override
    void Mon() {
        System.out.println("Soy un tierno cachorro con manchas");
        System.out.println(OctoCat());
    }
}
