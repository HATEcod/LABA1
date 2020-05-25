import java.time.LocalDateTime;

public class Program {
    public static void main(String[] args)
    {
        CardCatalog cardCatalog = new CardCatalog();
        Turnstile turnstile = new Turnstile(cardCatalog);
        PassCard cardNummber = new Card_OnNumerOfPasses(1, true, 1);
        PassCard cardMoney = new Card_OnMoneyAmount(2,32);
        PassCard cardDaysToday = new Card_OnTimeDuration(3, true, 24);
        PassCard cardDaysPrev = new Card_OnTimeDuration(4, false, 6, LocalDateTime.parse("2020-02-01T12:45:30"));
        cardCatalog.AddInCatalog(cardNummber);
        cardCatalog.AddInCatalog(cardMoney);
        cardCatalog.AddInCatalog(cardDaysToday);
        cardCatalog.AddInCatalog(cardDaysPrev);
        PassCard cardMoneyOutOfCatalog = new Card_OnMoneyAmount(5,17);

        System.out.println(ANSI_BLACK +"Перший прохід" + ANSI_RESET);
        for (PassCard card: cardCatalog.GetList()) {
            turnstile.PassTheCard(card);
        }

        turnstile.PassTheCard(cardMoneyOutOfCatalog);

        System.out.println(ANSI_BLACK + "Другий прохід" + ANSI_RESET);
        for (PassCard card: cardCatalog.GetList()) {
            turnstile.PassTheCard(card);
        }
        turnstile.PassTheCard(cardMoneyOutOfCatalog);

        cardCatalog.BanTheCard(1234);
        cardCatalog.ShowCardInfo(1234);
        cardCatalog.ShowAcceptsAndDeclines(1234);


    }


    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";

}
