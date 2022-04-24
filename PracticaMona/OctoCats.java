package PracticaMona;

public class OctoCats {
    public static void main(String[] args) {
        Mona mon = new Mona(
                1,
                8,
                "OctoCat",
                "Gato",
                "Negro"
        );
        mon.Mon();

        ActodeClase ac= new ActodeClase(
                2,
                8,
                "Acto de Clase",
                "Gato",
                "Negro",
                "Martini");
        ac.Mon();

        GatoGrinch gg= new GatoGrinch(
                109,
                8,
                "Gato Grinch",
                "Gato",
                "Verde",
                "Grinch");
        gg.Mon();

        Kimonotogato km= new Kimonotogato(
                95,
                8,
                "Kimonotogato",
                "Gato",
                "Negro",
                "Japon",
                "Kimono");
        km.Mon();

        Nemesis nm = new Nemesis(
                64,
                8,
                "Nemesis",
                "Gato cangrejo",
                "Rojo",
                "Mar");
        nm.Mon();

        Octofez of = new Octofez(
                7,
                8,
                "Octofez",
                "Perro",
                "Negro",
                "Ladrido");
        of.Mon();

        Oktobercat ok = new Oktobercat(
                48,
                8,
                "Oktobercat",
                "Gato",
                "Negro",
                "Irlandes");
        ok.Mon();
    }
}
