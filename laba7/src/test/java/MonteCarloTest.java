import static org.junit.jupiter.api.Assertions.*;

class MonteCarloTest {

    @org.junit.jupiter.api.Test
    void getPi() throws InterruptedException {
        System.out.println("the number of processors available to the Java virtual machine :" + Runtime.getRuntime().availableProcessors());
        long startTime;
        for (int i = 1;i<=8;i++){
            startTime = System.currentTimeMillis();
            System.out.println("PI is " + MonteCarlo.getPi(i));
            long endTime=System.currentTimeMillis()-startTime;
            System.out.println(endTime + " мс " + "при" + i + "потоках.");
        }
    }
}