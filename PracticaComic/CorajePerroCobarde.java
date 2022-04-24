package PracticaComic;

import imonsh.Screen;
//https://www.canva.com/design/DAE-zgA3ouA/fn-xE2kc9fEhRlgpuUe9_A/edit?utm_content=DAE-zgA3ouA&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton

public class CorajePerroCobarde {
    public static void main(String[] args) {
        Screen screen = new Screen();

        Coraje co = new Coraje(
                "Coraje",
                "Perro",
                "Macho"+"\n"
        );

        Muriel mu = new Muriel(
                "Muriel",
                "Humano",
                "Femenino"+"\n"
        );

        Justo ju = new Justo(
                "Justo",
                "Humano",
                "Masculino"+"\n"
        );

        Runnable attack = new Runnable() {
            @Override
            public void run() {
                try {
                    co.presentar(screen);
                    Thread.sleep(5050);

                    mu.adoptar(screen);
                    Thread.sleep(5050);

                    co.descansar(screen);
                    Thread.sleep(5050);

                    mu.vertele(screen);
                    Thread.sleep(5050);

                    ju.enojarse(screen);
                    Thread.sleep(5050);

                    ju.molestarse(screen);
                    Thread.sleep(5050);

                    co.asustarse(screen);
                    Thread.sleep(5050);

                    co.gritar(screen);
                    Thread.sleep(5050);

                    co.buscar(screen);
                    Thread.sleep(5050);

                    ju.conjurar(screen);
                    Thread.sleep(5050);

                    co.conjurar(screen);
                    Thread.sleep(5050);

                    ju.manejar(screen);
                    Thread.sleep(5050);

                    co.nadar(screen);
                    Thread.sleep(5050);

                    co.despedir(screen);
                    Thread.sleep(5050);

                }catch(InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
        Thread attacks = new Thread(attack);
        attacks.start();
    }
}
