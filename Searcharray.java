import java.io.*;
import java.util.Scanner;
class Searcharray
{
public static void main(String[] args)
{
Scanner s= new Scanner(System.in);
System.out.println("enter size of array : ");
int size=s.nextInt();
int [] arr = new int[size];
for(int i=0;i<size;i++)
{
System.out.println("enter array elements : ");
arr[i]=s.nextInt();
}
System.out.println("enter the no. to search : ");
int num=s.nextInt();
for(int i=0;i<size;i++)
{
if(arr[i]==num)
{
System.out.println("element found at "+i+"th position");
break;
}
if(i==size-1)
{
System.out.println("element not found");
}
}
} 
}
 