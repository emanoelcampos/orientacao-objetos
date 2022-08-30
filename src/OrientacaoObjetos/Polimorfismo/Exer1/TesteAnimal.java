package OrientacaoObjetos.Polimorfismo.Exer1;

public class TesteAnimal {
    public static void main(String[] args) {
        //Animal animal = new Animal(); - classe abstrata não pode ser instanciada

        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        Cachorro dog = new Cachorro();
        dog.reagir("Olá!");
        dog.reagir("Vai apanhar");
        dog.reagir(11, 45);
        dog.reagir(21, 00);
        dog.reagir(true);
        dog.reagir(false);
        dog.reagir(2, 12.5);
        dog.reagir(17, 4.5);

    }
}
