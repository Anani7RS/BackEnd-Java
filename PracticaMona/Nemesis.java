package PracticaMona;

class Nemesis extends Mona{
    String habitat;

    Nemesis(int id, int p, String nom, String esp, String col, String h) {
        super(id, p, nom, esp, col);
        this.habitat = h;
    }

    @Override
    void Mon() {
        System.out.println("Bajo el mar la vida es mejor");
        System.out.println(OctoCat());
    }
}
