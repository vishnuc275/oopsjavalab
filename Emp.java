import java.io.*;
import java.util.Scanner;
class Emp
{
int eNo;
String eName;
int eSalary;
public static void main(String [] args)
{
Scanner s = new Scanner(System.in);
System.out.println("enter the no of employees : ");
int num =  s.nextInt();
Emp[] arr=new Emp[num];
for(int i=0; i<num; i++)
{
arr[i]=new Emp();
System.out.println("enter the id of employee : ");
arr[i].eNo=s.nextInt();
System.out.println("enter the salary of employee : ");
arr[i].eSalary=s.nextInt();
System.out.println("enter the eName of employee : ");
arr[i].eName=s.next();
}
System.out.println("enter the id of employee to search : ");
int sno=s.nextInt();
for(int i=0; i<num; i++)
{
if(arr[i].eNo==sno)
{
System.out.println("yes,employee id "+arr[i].eNo+" exist. His/Her details shown below");
System.out.println("****** id of employee : "+arr[i].eNo+"   ******");
System.out.println("****** name of employee : "+arr[i].eName+"   ******");
System.out.println("****** eSalary of employee : "+arr[i].eSalary+"   ******");
break;
}
if(i==num-1)
{System.out.println("no such employee exist");
}
}
}
}
