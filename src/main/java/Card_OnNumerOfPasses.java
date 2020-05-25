 class Card_OnNumerOfPasses extends PassCard {
    private int passesLeft;

     Card_OnNumerOfPasses(int Id, boolean IsDiscount, int Passes) {
         super(Id, IsDiscount);
         passesLeft = Passes;
     }



     public int GetPassesLeft() {
         return passesLeft;
     }

     public void SetPassesLeft(int passesLeft) {
         this.passesLeft = passesLeft;
     }
     public void Minus1Pass() {
         this.passesLeft -= 1;
     }
 }
