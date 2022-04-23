package PracticaMona;

class GatoGrinch extends Mona{
    String traje;

    GatoGrinch(int id, int p, String nom, String esp, String col,String traje) {
        super(id,p,nom,esp,col);
        this.traje = traje;
    }

    @Override
    void Mon() {
        System.out.println("Odio la navidad");
        System.out.println(OctoCat());
    }
}
