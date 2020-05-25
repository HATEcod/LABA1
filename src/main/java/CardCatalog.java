import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class
import java.util.ArrayList;

public class CardCatalog {
    private ArrayList<PassCard> catalog = new ArrayList<PassCard>();

    void AddInCatalog(PassCard card)
    {
        catalog.add(card);
    }

    ArrayList<PassCard> GetList(){
        return catalog;
    }
boolean IsInCatalog(PassCard card)
{
    boolean result = false;
    for (PassCard c: catalog) {
        if(c.equals(card)) result = true;
    }
    return result;
}
    public void BanTheCard(int id)
    {
        for (PassCard c: catalog) {
            if(c.GetId()==id)
            {
                c.SetIsActive(false);
            }
        }

    }
    public void ShowCardInfo(int id)
    {
        String str = "";
        for (PassCard c: catalog) {
            if(c.GetId()==id)
            {
                String pilga = c.GetIsDiscount() ? " Пільгова, ":"";
                String active = c.GetIsActive() ? "\n":"Заблокована, \n ";

                str += "\n Інформація по картці: \n ID" + c.GetId() +
                         ", \n Кількість проходів: " + c.GetNumberAccepts() +
                         ",\n Кількість відмов: " + c.GetNumberDeclines() + ",\n" + pilga + active;
                if(c instanceof Card_OnTimeDuration)
                { str+= "Залишок днів: " + ((Card_OnTimeDuration) c).GetDaysLeft();}
                if(c instanceof  Card_OnNumerOfPasses)
                { str += "Залишок проходів: "+ ((Card_OnNumerOfPasses) c).GetPassesLeft();}
                if(c instanceof  Card_OnMoneyAmount)
                { str += "Залишок грошей" + ((Card_OnMoneyAmount) c).GetMoneyLeft();}
            }

        }
         System.out.println(str);
    }
  public void ShowAcceptsAndDeclines(int id)
  {
      String str = "";
      for (PassCard c: catalog) {
          if (c.GetId() == id) {
              str += "\n Картка ID: "+c.GetId() +",\n"+ c.GetAccepts()  + c.GetDeclines();
          }
          
      }

      System.out.println(str);
  }
}
