package Exercicio4;

public class Main {

    public static void main(String[] args) {



    Mamifero camelo = new Mamifero("Camelo",2.5,4,"Amarelo","Deserto", 15.0, "Cactus");
    Peixe tubarao = new Peixe("Tubarão", 300, 0, "Azul","Mar",50.0 );
    Mamifero urso = new Mamifero("Urso", 180, 4, "Castanho", "Terra", 30.0, "Mel");
    Animal iguana = new Animal("Iguana", 90, 4, "Verde", "Terra", 10);
    Mamifero leao = new Mamifero("Leão",3.0,4,"Amarelo","Terra", 50.0,"Carne");
    Animal micoLeaoDourado = new Animal("Mico-leão-dourado", 30, 4, "Dourado", "Terra", 15);

        System.out.println(camelo);
        System.out.println(tubarao);
        System.out.println(urso);
        System.out.println(iguana);
        System.out.println(leao);
        System.out.println(micoLeaoDourado);

    }
}
