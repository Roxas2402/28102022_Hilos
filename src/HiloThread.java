public class HiloThread extends Thread {
    //Creamos el constructor - Cómo se configura el hilo
    public HiloThread(String name) {
        this.setName(name);
    }

    public HiloThread(String name, int prioridad) {
        this.setName(name);
        this.setPriority(prioridad);
    }

    //Ejecución (run) - Trabajo a desarrollar

    @Override
    public void run() {

        int cont = 0;

        for (int i = 0; i < 1000; i++) {
            cont++;

            /*try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("Hilo reactivado. ");
            }
            finally {
                System.out.println("Fin interacción");
            }*/

        }


        System.out.println("Soy un hilo creado como Thread, y mi nombre es: " + getName());
    }

    public void aMimir(int tiempo) throws InterruptedException {
        Thread.sleep(tiempo);
    }
}
