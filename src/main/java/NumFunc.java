public class NumFunc {
    public int CharacktersSum(String[] inS)
    {
        int sum = 0;
        for (int i = 0; i < inS.length; i++) {
            sum += inS[i].length();
        }
        return sum;
    }
    public int Middle(int sum, int count)
    {
        int middle = sum/count;
        return middle;
    }
    public int CountLess(String[] inS, int middle)
    {
        int count = 0;
        for(int i = 0; i < inS.length; i++){
            if(inS[i].length()<= middle) count++;
        }
        return count;
    }
    public String[] FillArrayWithLess(String[] inCome, int count, int middle){
        String[] outCome = new String[count];
       int a = 0;
       for(int i = 0; i < inCome.length; i++)
       {
           if(inCome[i].length()<= middle){
               outCome[a] = inCome[i];
               a++;
           }
       }
       return outCome;
    }
}
