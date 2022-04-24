package PracticaMona;

class Kimonotogato extends Mona{
    String pais, atuendo;

    Kimonotogato(int id, int p, String nom, String esp, String col, String pais, String at) {
        super(id, p, nom, esp, col);
        this.pais = pais;
        this.atuendo = at;
    }

    @Override
    void Mon() {
        System.out.println("Estoy bailando la danza del kimono");
        System.out.println(OctoCat());
    }
}
