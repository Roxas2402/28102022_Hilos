package ejercicio;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Animal tortuga, liebre, guepardo;

        tortuga = new Animal("tortuga", 10);
        liebre = new Animal("liebre", 5);
        guepardo = new Animal("guepardo", 1);

        tortuga.start();
        liebre.start();
        guepardo.start();
        tortuga.join();
        liebre.join();
        guepardo.join();
        System.out.println("Carrera terminada");

    }
}
