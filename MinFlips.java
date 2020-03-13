public class MinFlips
{
    public static void binCov(int a,int[] a1)
    {
        int ai=0;
        while(a>0)
        {
            a1[ai++]=a%2;
            a=a/2;
        }
    }
    public static void addZeroes(int[] a1,int count)
    {
        for(int i=a1.length;i<=count;i++)
            a1[i]=0;
    }
    public static void main(String args[])
    {
        int a=2,b=6,c=5,ai=0,bi=0,ci=0,diff=0;
        int[] a1=new int[10];
        int[] b1=new int[10];
        int[] c1=new int[10];
        binCov(a,a1);
        binCov(b,b1);
        binCov(c,c1);
        int max=a1.length;
        if(b1.length>max && max>c1.length)
            max=b1.length;
        else if(b1.length<max && max<c1.length)
            max=b1.length;
        addZeroes(a1,max-a1.length);
        addZeroes(b1,max-b1.length);
        addZeroes(c1,max-c1.length);
        for(int i=max-1;i>=0;i--)
        {
            if(c1[i]==1 && a1[i]==0 && b1[i]==0)
                diff=diff+1;
            else if( c1[i]==0 && (a1[i]==1 || b1[i]==1))
            {
                if(a1[i]==1)
                    diff=diff+1;
                if(b1[i]==1)
                    diff=diff+1;
            }
        }
        System.out.println(diff);
    }
}
