public class Main {
    public static void main(String[] args) throws InterruptedException {
        //HiloThread:
        /* for (int i = 0; i < 10; i++) {
            int prioridad = i % 2 == 0 ? 1 : 2;
            HiloThread hiloThread = new HiloThread("Hilo " + i, prioridad);
            hiloThread.start();
            hiloThread.aMimir(1000);
        } */

        //HiloRunnable
        HiloRunnable hiloRunnable = new HiloRunnable("Hijo 1 ");
        hiloRunnable.interrupt();
        //hiloRunnable.join();
        System.out.println("TERMINADO MAIN");
    }



}