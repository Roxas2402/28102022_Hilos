package ejercicio;

public class Animal extends Thread {
    public Animal(String nombre, int prioridad) {
        this.setName(nombre);
        this.setPriority(prioridad);
    }

    @Override
    public void run() {
        try {
            Thread.sleep((long) Math.pow(getPriority(), this.getPriority()));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        for (int i = 0; i < 10000; i++) {

        }
        System.out.println("Soy " + getName());
    }
}
