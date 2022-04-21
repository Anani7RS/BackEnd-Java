package PracticaHarry;

import java.util.Scanner;

public class Hogwarts {
    public static void main(String[] args) {
        int salir;
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido a Hogwarts");
        do{
            System.out.println("***Menu***");
            System.out.println("1: Harry Potter");
            System.out.println("2: Luna Lovegood");
            System.out.println("3: Newt Scamander");
            System.out.println("4: Rubeus Hadgrid");
            System.out.println("5: Sirius Black");
            int Us = leer.nextInt();
            switch (Us){
                case 1:
                    Harry();
                    break;
                case 2:
                    Luna();
                    break;
                case 3:
                    Newt();
                    break;
                case 4:
                    Hadgrid();
                    break;
                case 5:
                    Sirius();
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            System.out.println("Deseas continuar 1:Si 0:No");
            salir = leer.nextInt();
        }while (salir==1);
    }
    public static void Harry(){
        HarryPotter HP = new HarryPotter("Harry Potter","Masculino", "Gryffindor",
                "Ciervo","Dementores","Pluma de Fenix");

        String msg= "Soy alumno de Hogwarts: ";
        msg+= "\nNombre: "+ HP.getNombre();
        msg+= "\nGenero: "+ HP.getGenero();
        msg+= "\nCasa: "+ HP.getCasa();
        msg+= "\nPatronus: "+ HP.getPatronus();
        msg+= "\nBoggart: "+ HP.getBoggart();
        msg+= "\nNúcleo de la Varita: "+ HP.getVarita();

        System.out.println(msg);
    }

    public static void Luna(){
        LunaLovegood LL = new LunaLovegood("Luna Lovegood","Femenino","Ravenclaw",
                "Liebre","Ver morir a su padre","Desconocido");

        String msg= "Soy alumna de Hogwarts: ";
        msg+= "\nNombre: "+ LL.getNombre();
        msg+= "\nGenero: "+ LL.getGenero();
        msg+= "\nCasa: "+ LL.getCasa();
        msg+= "\nPatronus: "+ LL.getPatronus();
        msg+= "\nBoggart: "+ LL.getBoggart();
        msg+= "\nNúcleo de la Varita: "+ LL.getVarita();

        System.out.println(msg);
    }

    public static void Newt(){
        NewtScamander NS = new NewtScamander("Newt Scamander","Masculino","Hufflepuff",
                "Puercoespin","Trabajar en una oficina","Hueso");

        String msg= "Soy Magizoologo: ";
        msg+= "\nNombre: "+ NS.getNombre();
        msg+= "\nGenero: "+ NS.getGenero();
        msg+= "\nCasa: "+ NS.getCasa();
        msg+= "\nPatronus: "+ NS.getPatronus();
        msg+= "\nBoggart: "+ NS.getBoggart();
        msg+= "\nNúcleo de la Varita: "+ NS.getVarita();

        System.out.println(msg);
    }

    public static void Hadgrid(){
        RubeusHadgrid RH = new RubeusHadgrid("Rebeus Hadgrid","Masculino","Gryffindor",
                "No tiene","Ver muerto a un amigo o criatura","Desconocido");

        String msg= "Soy profesor y el guardian de Hogwarts: ";
        msg+= "\nNombre: "+ RH.getNombre();
        msg+= "\nGenero: "+ RH.getGenero();
        msg+= "\nCasa: "+ RH.getCasa();
        msg+= "\nPatronus: "+ RH.getPatronus();
        msg+= "\nBoggart: "+ RH.getBoggart();
        msg+= "\nNúcleo de la Varita: "+ RH.getVarita();

        System.out.println(msg);
    }
    public static void Sirius(){
        SiriusBlack SB = new SiriusBlack("Sirius Black","Masculino","Gryffindor",
                "Perro","Dementores","Corazon de Dragon");

        String msg= "Soy un animago y padrino de Harry Potter: ";
        msg+= "\nNombre: "+ SB.getNombre();
        msg+= "\nGenero: "+ SB.getGenero();
        msg+= "\nCasa: "+ SB.getCasa();
        msg+= "\nPatronus: "+ SB.getPatronus();
        msg+= "\nBoggart: "+ SB.getBoggart();
        msg+= "\nNúcleo de la Varita: "+ SB.getVarita();

        System.out.println(msg);
    }
}
