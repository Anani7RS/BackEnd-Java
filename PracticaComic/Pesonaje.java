package PracticaComic;

public class Pesonaje {
    String nombre, especie, genero;
    Pesonaje(String n, String e, String g){
        this.nombre = n;
        this.especie = e;
        this.genero = g;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public boolean setGenero(String g){
        if(!g.isEmpty()){
            this.genero = g;
            return true;
        }else
            return false;
    }

    public String showMessage(){
        return "Nombre: "+ nombre + "\n" +
                "Especie: "+ especie + "\n" +
                "Genero: "+ genero;
    }
}
