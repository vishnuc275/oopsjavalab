import java.io.*;
import java.util.Scanner;
class Bank
{
int accno;
String name;
String acctype;
float balance;
float dip;
float wd;

void initial()
{
accno=123456789;
name="Sidharth";
acctype="savings";
balance=0;
}

void deposit()
{
balance=balance+dip;
System.out.println(" balance after deposit: "+balance);
}
void withdraw()
{
if(wd<balance)
{
balance=balance-wd;
System.out.println(" balance after withdraw : "+balance);
}
else
{
System.out.println(" low balance");
}
}
void name_balance()
{
System.out.println("Account name : "+name);
System.out.println("Account balance : "+balance);
}
public static void main(String [] args)
{
String a;
Scanner s = new Scanner(System.in);
Bank b=new Bank();
b.initial();
do
{
System.out.println("               what do you want ");
System.out.println();
System.out.println("               1. deposit money ");
System.out.println();
System.out.println("               2. withdraw money ");
System.out.println();
System.out.println("               3. view account details  ");
System.out.println();
System.out.println("enter your choice : ");
int choice = s.nextInt();
switch(choice)
{
case 1:
	System.out.println("current balance : "+b.balance);
	System.out.println("enter amount to deposit : ");
	b.dip=s.nextFloat();
	b.deposit();
	break;
case 2:
	System.out.println("current balance : "+b.balance);
	System.out.println("enter amount to withdraw : ");
	b.wd=s.nextFloat();
	b.withdraw();
	break;
case 3:
	b.name_balance();
	break;
default:
	System.out.println("wrong choice entered");
	
}
System.out.println("do you wish to continue : (y/n)");
a=s.next();
}
while(a.equalsIgnoreCase("Y"));
}
}
