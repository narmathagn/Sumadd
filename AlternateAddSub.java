import java.util.*;
public class AlternateAddSub {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int N=s.nextInt();
        System.out.println("Enter the value of opt:");
        int opt=s.nextInt();
        int a=N,j=5;
        for(int i=N;i>0;i--)
        {
            if((opt==1)&&(i%2==0))
            {
                a=a-j;;
            }
            if((opt==1)&&(i%2!=0))
            {
                a=a+j;
            }
            if((opt==2)&&(i%2!=0))
            {
                a=a-j;;
            }
            if((opt==2)&&(i%2==0))
            {
                a=a+j;
            }
            j--;
        }
        System.out.println(a);
    }
}