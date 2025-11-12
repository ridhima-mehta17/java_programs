import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int even_count=0;
        int odd_count=0;
        while(num>0)
        {
            int rem=num%10;
            if(rem%2==0) {
                even_count++;
            }
            else
            {
                odd_count++;
            }
          num=num/10;
        }
        System.out.println(even_count);
        System.out.println(odd_count);


    }
}
