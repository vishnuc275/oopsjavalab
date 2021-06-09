import java.util.Scanner;
class Studmark
{
public static void main(String[] args)
{
int n,percent,z,total=0;
Scanner s= new Scanner(System.in);
System.out.println("enter the no of subjects : ");
n= s.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
System.out.println("enter mark: ");
arr[i]= s.nextInt();
total=total+arr[i];
}
System.out.println("total is :" +total);
System.out.println("enter total marks for finding percentage:");
z= s.nextInt();
percent=total*100/z;
System.out.println("percent is :" +percent);
}
}
