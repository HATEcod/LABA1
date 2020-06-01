public class WTF
{
    public WTF() {

    }

    public static int getTHREADS() {
        return THREADS;
    }

    private static int THREADS;

    public static long getNumber_of_iterations() {
        return number_of_iterations;
    }


    private final static long number_of_iterations = (long)1e9;


    public WTF(int THREADS) {
        this.THREADS = THREADS;
    }


    public static double getPi(int n) throws InterruptedException {
        THREADS = n;
        long number_of_passed =0;
        long iterations_in_process = number_of_iterations/THREADS;

        Threads[] threads = new Threads[THREADS];
        for (int i = 0;i<THREADS;i++){
            threads[i] = new Threads(iterations_in_process);
            threads[i].start();
        }
        for (Threads threads1 : threads){
            threads1.Count();
            number_of_passed += threads1.number_of_passed;
        }
        return ((double)number_of_passed/number_of_iterations)*4;
    }
}

