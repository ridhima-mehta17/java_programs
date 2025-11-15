import java.util.Scanner;

public class maxAndmin {
    public static void main(String []args)
    {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        System.out.println("Enter size:"+size);
        int[] a=new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=scanner.nextInt();
        }
        int max=a[0],min=a[0];
        for(int i=1;i<a.length;i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
            System.out.println("Maximum element: " +max);
            for(int j=1;j<a.length;j++)
            {
                if(a[j]<min)
                {
                    min=a[j];
                }
            }
            System.out.println("Minimun element: " +min);
        }

    }

