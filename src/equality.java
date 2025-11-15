import java.util.Arrays;
import java.util.Scanner;

public class equality {
    public static void main(String []args)
    {
        Scanner scanner=new Scanner(System.in);
        int size1= scanner.nextInt();
        System.out.println("Enter size1:"+size1);

        int[] a1=new int[size1];
        for(int i=0;i<size1;i++)
        {
            a1[i]=scanner.nextInt();
        }

        int size2= scanner.nextInt();
        System.out.println("Enter size2:"+size2);

        int[] a2=new int[size2];
        for(int i=0;i<size2;i++)
        {
            a2[i]=scanner.nextInt();
        }
        boolean status= Arrays.equals(a1,a2);
        if(status==true)
        {
            System.out.println("Arrays are equal");
        }
        else
        {
            System.out.println("Arrays are not equal");
        }
    }
}
