import java.util.Scanner;

public class searchElement {
    public static void main(String []args)
    {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int a[]=new int[size];
        for(int i=0;i<a.length;i++)
        {
            a[i]=scanner.nextInt();
        }
        int search=scanner.nextInt();
        boolean flag=false;
        for(int i=0;i<a.length;i++)
        {
            if(search==a[i])
            {
                System.out.println("Element found at "+i);
                flag=true;
                break;
            }
        }
        if(flag==false)
        {
            System.out.println("Element not found");
        }
    }
}
