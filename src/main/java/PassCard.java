import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
 class PassCard {
     private int id;
     private boolean isActive;
     private boolean isDiscount;
     private ArrayList<LocalDateTime> declinesList = new ArrayList<LocalDateTime>();
     private ArrayList<LocalDateTime> acceptsList = new ArrayList<LocalDateTime>();

     PassCard(int Id, boolean IsDiscount) {
         id = Id;
         isActive = true;
         isDiscount = IsDiscount;
     }

     PassCard(int Id) {
         id = Id;
         isActive = true;
         isDiscount = false;
     }

     public int GetId() {
         return id;
     }

     public boolean GetIsDiscount() {
         return isDiscount;
     }

     public void SetIsDiscount(boolean discount) {
         isDiscount = discount;
     }

     public boolean GetIsActive() {
         return isActive;
     }

     public void SetIsActive(boolean active) {
         isActive = active;
     }

     public String GetDeclines() {
         DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
         String result = "Відмови: \n";
         for (LocalDateTime dateObj: declinesList) {
             String formattedDate = dateObj.format(myFormatObj);
             result += formattedDate + "\n";
         }
         return result;
     }
     public void AddDeclines(){
         declinesList.add(LocalDateTime.now());
     }
     public  int GetNumberDeclines()
     {
         return declinesList.size();
     }
     public  int GetNumberAccepts()
     {
         return acceptsList.size();
     }
    public void AddAccept(){
         acceptsList.add(LocalDateTime.now());
    }
     public String GetAccepts(){
         DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
         String result = "Проходження: \n";
         for (LocalDateTime dateObj: acceptsList) {
             String formattedDate = dateObj.format(myFormatObj);
             result += formattedDate + "\n";
         }
        return result;
     }

 }

