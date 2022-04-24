package PracticaMona;

class ActodeClase extends Mona{
    String bebida = "Matini";

    ActodeClase(int id, int p, String nom, String esp, String col,String beb) {
        super(id, p, nom, esp, col);
        this.bebida = beb;
    }
    void Mon() {
        System.out.println("El look ante todo");
        System.out.println(OctoCat());
    }
}
