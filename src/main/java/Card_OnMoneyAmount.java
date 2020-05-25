 class Card_OnMoneyAmount extends PassCard {
    private int moneyLeft;

     Card_OnMoneyAmount(int Id, int Money) {
         super(Id);
         moneyLeft = Money;
     }




     public int GetMoneyLeft() {
         return moneyLeft;
     }

     public void AddMoney(int money) {
         this.moneyLeft += money;
     }
     public void MinusMoney(int money) {
         this.moneyLeft -= money;
     }
 }
