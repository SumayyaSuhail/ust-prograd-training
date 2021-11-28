public class DRoot {
    public static int digital_root(int n) {
        int sum=0;
        int rem=0;
        while(n>0){
            rem = n%10;
            sum=sum+rem;
            n=n/10;
        }
        if(sum>9){
            return digital_root(sum);
        }
        return sum;
    }
}