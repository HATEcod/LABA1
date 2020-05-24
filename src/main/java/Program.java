public class Program {
    public static void main(String[] args) {
        NewArr newArr = new NewArr();
        String st[] = new String[]{"thank", "god","i","am", "not", "on", "the", "additional", "session"};
        PrintArray(st); System.out.println(" ");
        PrintArray(newArr.NewArray(st));

    }

    public static void PrintArray(String[] Arr)
    {
        for(int i = 0; i<Arr.length; i++)
        {
            System.out.print(" " + Arr[i]);
        }
    }
}
