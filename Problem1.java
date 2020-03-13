import java.io.*;
import java.util.*;
public class Problem1
{
    public static int xoroprtn(int[] a,int l,int r)
    {
    int result=0,i;
    for(i=l;i<=r;i++)
    {
        result=result^a[i];
    }
    return result;
    }
    public static void prinElemnts(int[] arL)
    {
        for(int k=0;k<arL.length;k++)
            System.out.print(arL[k]+" ");
    }
    public static void main(String args[]) throws Exception
    {

        int[] a={1,3,4,8};
        int[] arL=new int[a.length];
        int[][] queries={{-1,0},{1,2},{0,3},{3,3}};
        for(int j=0;j<queries.length;j++)
        {
            arL[j]=(xoroprtn(a,queries[j][0],queries[j][1]));
        }
        prinElemnts(arL);
    }
}
