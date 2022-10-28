public class HiloRunnable implements Runnable {
    private Thread thread;

    public HiloRunnable(String nombre) {
        this.thread = new Thread(this, nombre);
        thread.start();
    }

    public HiloRunnable(String nombre, int prioridad) {
        this.thread = new Thread(this, nombre);
        this.thread.setPriority(prioridad);
    }

    public void join() throws InterruptedException {
        this.thread.join();
    }

    public void interrupt() {
        this.thread.interrupt();
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("DESPERTADO");
        }
        System.out.println("Hijo Runnable: " + this.thread.getName());
    }
}
