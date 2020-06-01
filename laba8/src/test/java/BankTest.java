import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    Bank bank;
    int accountsAmount = (int) (Math.random() * 100);
    int threadsAmount = 2000 + (int) (Math.random() * 10000);
    int transactionsAmount = 100000 + (int) (Math.random() * 10000);
    ExecutorService executorService = Executors.newFixedThreadPool(threadsAmount);

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        bank = new Bank("PrivatBank");
        for (int i = 0; i < accountsAmount; i++) {
            bank.addAccount(new Acccount("Vova", bank.getID()));
            bank.getAcccounts().stream().forEach(x -> x.Make_deposit((int) Math.random() * 100000));
        }
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        bank = null;
    }

    @Test
    @org.jetbrains.annotations.NotNull
    private ArrayList<Future> Upgrade() {
        ArrayList<Future> futures = new ArrayList<>();
        for (int i = 0; i < transactionsAmount; i++) {
            int fromID = (int) (Math.random() * accountsAmount);
            int toIDtmp = (int) (Math.random() * accountsAmount);
            while ((toIDtmp = (int) (Math.random()) * accountsAmount) == fromID) ;
            int toID = toIDtmp;
            futures.add(executorService.submit(() ->
                    bank.Make_transfer(bank.getAcccounts().get(fromID), bank.getAcccounts().get(toID), (int) (Math.random() * 10000))));

        }
        return futures;
    }

    @Test
    void TestGetAccountBalance() throws ExecutionException, InterruptedException {
        for (int i = 0; i<10;i++){
            long previousbalance = bank.GetAccountBalance();
            for (Future future: Upgrade()){
                future.get();
            }
            if (previousbalance != bank.GetAccountBalance()){
                System.out.println("FAIL!!!!!" + previousbalance + " " + bank.GetAccountBalance());
           return;
            }

        }
    }
}