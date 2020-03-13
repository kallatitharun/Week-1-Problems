public class MinReplacements
{
    public static int minReplacemnts(int n)
    {
        if(n==1)
            return 0;
        else if(n%2==0)
            return 1+minReplacemnts(n/2);
        else
            return 1+Math.min(minReplacemnts(n+1),minReplacemnts(n-1));
    }
    public static void main(String args[])
    {
        int a=8;
        System.out.println(minReplacemnts(a));
    }
}
