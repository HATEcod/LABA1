
import java.util.Random;

public class Threads extends Thread
{
    public  long number_of_passed;
    private long iterations_in_process;


    public Threads(long iterations_in_process) {

        this.iterations_in_process = iterations_in_process;
    }


    public void Count(){

        double x;
        double y;
        number_of_passed = 0;
        for (int i =0 ;i<iterations_in_process;i++){
            x = Math.random();
            y = Math.random();
            if ((x*x + y*y) < 1.0)
                number_of_passed++;
        }

    }

}
