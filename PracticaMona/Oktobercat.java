package PracticaMona;

class Oktobercat extends Mona{
    String baile;

    Oktobercat(int id, int p, String nom, String esp, String col , String bai) {
        super(id, p, nom, esp, col);
        this.baile = bai;
    }

    @Override
    void Mon() {
        System.out.println("Los treboles son de la buena suerte");
        System.out.println(OctoCat());
    }
}
