package PracticaHarry;

public class HarryPotter {
    public String nombre, genero, casa, patronus, boggart, varita;
    public HarryPotter(String nom, String gen, String casa, String pat,String bog,String v){
        this.nombre = nom;
        this.genero = gen;
        this.casa = casa;
        this.patronus = pat;
        this.boggart = bog;
        this.varita = v;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public String getCasa() {
        return casa;
    }

    public String getPatronus() {
        return patronus;
    }

    public String getBoggart() {
        return boggart;
    }

    public String getVarita() {
        return varita;
    }

    public boolean setNombre(String nombre) {
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
            return true;
        } else
            return false;
    }

    public boolean setGenero(String genero) {
        if (!genero.isEmpty()) {
            this.genero = genero;
            return true;
        } else
            return false;
    }

    public boolean setCasa(String casa) {
        if (!casa.isEmpty()) {
            this.casa = casa;
            return true;
        } else
            return false;
    }

    public boolean setPatronus(String patronus) {
        if (!patronus.isEmpty()) {
            this.patronus = patronus;
            return true;
        } else
            return false;
    }
    public boolean setBoggart(String boggart) {
        if (!boggart.isEmpty()) {
            this.boggart = boggart;
            return true;
        } else
            return false;
    }
    public boolean setVarita(String varita) {
        if (!varita.isEmpty()) {
            this.varita = varita;
            return true;
        } else
            return false;
    }

    public String H(){
        return "Nombre: "+ nombre + "\n" +
                "Genero: "+ genero + "\n" +
                "Casa: "+ casa + "\n" +
                "Patronus: "+ patronus + "\n" +
                "Boggart: "+ boggart + "\n" +
                "Varita: "+ varita;
    }
}
