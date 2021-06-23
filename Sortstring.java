import java.util.Scanner;

public class Sortstring
{
    public static void main(String[] input)
    {
        int i, j;
        String temp;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no of words you are wishing to enter : ");
	int n=scan.nextInt();
        String names[] = new String[n];
		
        System.out.print("Enter the Names/Words : ");
        for(i=0; i<n; i++)
        {
            names[i] = scan.nextLine();
        }
		
        System.out.println("\nSorting Words/Names in Alphabetical Order...\n");
        for(i=0; i<n; i++)
        {
            for(j=1; j<n; j++)
            {
                if(names[j-1].compareTo(names[j])>0)
                {
                    temp=names[j-1];
                    names[j-1]=names[j];
                    names[j]=temp;
                }
            }
        }
		
        System.out.print("Words/Names Sorted in Alphabetical Order Successfully..!!");
		
        System.out.println("\nNow the List is :\n");
        for(i=0;i<n;i++)
        {
            System.out.println(names[i]);
        }
    }
}