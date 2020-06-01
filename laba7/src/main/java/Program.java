public class Program
{
    public static void main(String[] args) throws InterruptedException {
        long startTime;
        long endTime;
        double PI;

        startTime = System.currentTimeMillis();
        PI = new  WTF().getPi(8);
        endTime = System.currentTimeMillis() - startTime;

        System.out.println("PI is " + PI);
        System.out.println("THREADS " + WTF.getTHREADS());
        System.out.println("ITERATIONS " + WTF.getNumber_of_iterations());
        System.out.println("TIME " + endTime);
    }
}
