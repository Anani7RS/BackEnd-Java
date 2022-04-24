package PracticaMultiverse;

import imonsh.Screen;

import java.util.Scanner;

public class SpiderVerse {
    public static void main(String[] args) {
        Screen screen = new Screen();
        CosmicSpiderman cosmic = new CosmicSpiderman(
                "Azul con blanco",
                "Peter Parker (Tierra-13)",
                "Los herederos",
                "Masculino"+"\n"
        );

        SpiderWolf spiderwolf = new SpiderWolf(
                "Azul indigo",
                "Peter Parker (Tierra-16827)",
                "Él es el villano",
                "Masculino"+"\n"
        );

        SpidermanTobey spiderT = new SpidermanTobey(
                "Azul indigo con rojo",
                "Peter Parker (Tierra-96283)",
                "Duende verde",
                "Maculino"+"\n"
            );

        Runnable attack = new Runnable() {
            @Override
            public void run() {
                try {
                    cosmic.uniPoder(screen);
                    Thread.sleep(5000);

                    cosmic.controlEnergia(screen);
                    Thread.sleep(5000);

                    spiderwolf.rastreo(screen);
                    Thread.sleep(5000);

                    spiderwolf.sentidoAracnido(screen);
                    Thread.sleep(5000);

                    spiderT.combatienteExperto(screen);
                    Thread.sleep(5000);

                    spiderT.telarañaOrganica(screen);
                    Thread.sleep(5000);

                }catch(InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
        Thread attacks = new Thread(attack);
        attacks.start();
        }
}

