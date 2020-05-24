public class NewArr {
    public String[] NewArray(String[] st)
    {
        NumFunc numFunc = new NumFunc();

        int sum = numFunc.CharacktersSum(st);
        System.out.println("sum = " + sum);

        int mid = numFunc.Middle(sum, st.length);
        System.out.println("middle = " + mid);

        int count = numFunc.CountLess(st, mid);
        System.out.println("count = " + count);

        String arr[] = numFunc.FillArrayWithLess(st, count, mid);
        return arr;
    }
}
