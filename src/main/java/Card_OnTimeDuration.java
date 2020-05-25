import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Card_OnTimeDuration extends PassCard {
    private int daysActive;
    private LocalDateTime createdAt;

     Card_OnTimeDuration(int Id,  boolean  IsDiscount, int DaysActive) {
         super(Id, IsDiscount);
         createdAt = LocalDateTime.now();
         daysActive = DaysActive;
     }
    Card_OnTimeDuration(int Id,  boolean  IsDiscount, int DaysActive, LocalDateTime date) {
        super(Id, IsDiscount);
        createdAt = date;
        daysActive = DaysActive;
    }



     public int GetDaysLeft(){
         return  daysActive- GetDaysAlive();
     }

     public int GetDaysActive() {
         return daysActive;
     }
     public int GetDaysAlive()
     {
         
         DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
         LocalDateTime today = LocalDateTime.now();
         if (today.getMonth() == createdAt.getMonth() && createdAt.getYear()==today.getYear()) {
             try {
                 createdAt.format(myFormatObj);
                 today.format(myFormatObj);
             } catch (Exception e) {
                 e.printStackTrace();
             }

             return today.getDayOfMonth() - createdAt.getDayOfMonth();
         } else {
             return 31;
         }

     }

     public void SetDaysActive(int daysActive) {
         this.daysActive = daysActive;
     }

     public String GetCreatedAt() {
         DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
         String fD =createdAt.format(myFormatObj);
         return "Була створена" + fD;
     }


 }
