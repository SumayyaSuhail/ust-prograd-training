public class Solution{
    public static long sumCubes(long n)
    {
        long sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+(i*i*i);
        }
        return sum;
    }
}