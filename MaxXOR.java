public class MaxXOR
{
    public static int maxXorVal(int[] array)
    {
        int ans=0;
        for(int i=0;i<array.length;i++)
            for(int j=i+1;j<array.length;j++)
                ans=Math.max(ans,array[i] ^ array[j]);

        return ans;
    }
    public static void main(String[] args)
    {
        int[] array=new int[]{3,10,5,25,2,8q};
        System.out.println(maxXorVal(array));
    }
}
