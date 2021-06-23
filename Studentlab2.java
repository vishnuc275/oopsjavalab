import java.io.*;
import java.util.Scanner;
class Studentlab2
{
int sid;
String name;
String branch;
int year;
float total;
float[] arr1=new float[6];
public static void main(String [] args)
{
Scanner s = new Scanner(System.in);
System.out.println("enter the no of students : ");
int n =  s.nextInt();
Studentlab2[] arr=new Studentlab2[n];
for(int i=0; i<n; i++)
{
arr[i]=new Studentlab2();
System.out.println("enter the id of student : ");
arr[i].sid=s.nextInt();
System.out.println("enter the name of student : ");
arr[i].name=s.next();
System.out.println("enter the branch : ");
arr[i].branch=s.next();
System.out.println("enter the year : ");
arr[i].year=s.nextInt();
}

for(int i=0; i<n; i++)
{
for(int j=0; j<6; j++)
{
System.out.println("enter the marks of "+arr[i].name+" is : ");
arr[i].arr1[j]=s.nextFloat();
}
}

for(int i=0;i<n;i++)
{
arr[i].total=arr[i].arr1[0] + arr[i].arr1[1] + arr[i].arr1[2] + arr[i].arr1[3] + arr[i].arr1[4] + arr[i].arr1[5];
System.out.println("total mark of student " +arr[i].name +" is : "+arr[i].total);
float avg=arr[i].total/6;
System.out.println("average mark of student " +arr[i].name +" is : "+avg);
if(avg>=80)
{System.out.println("grade : A");}
else if((avg<80) && (avg>=60))
{System.out.println("grade : B");}
else if((avg<60) && (avg>=40))
{System.out.println("grade : C");}
else
{System.out.println("grade : D");}
}

float[] arr2=new float[n];
for(int i=0;i<n;i++)
{
arr2[i]=arr[i].total;
}


float largest1 = arr2[0];
    for (int i=0;i<n;i++) {
        if (arr2[i] > largest1) {
            largest1 = arr2[i];
        }
}


float largest2=0;
    for (int i = 1;i<n;i++) {
        if (arr2[i] > largest2 && arr2[i] < largest1)
            largest2 = arr2[i];
    }

if(largest1==arr2[0] && arr2[0]==arr[0].total)
{
System.out.println("student having highest mark, position 1 : "+arr[0].name);
System.out.println("student id is "+arr[0].sid);
System.out.println("branch is "+arr[0].branch);
System.out.println("year is "+arr[0].year);
System.out.println("total mark is "+arr[0].total);
}
int k=1;
while(arr[k].total==largest1 && ((largest1==arr2[1]) || (largest1==arr2[2]) || (largest1==arr2[3]) || (largest1==arr2[4]) || (largest1==arr2[5]))) 
{
System.out.println("student holding first position, total markwise is : "+arr[k].name);
System.out.println("student id is "+arr[k].sid);
System.out.println("branch is "+arr[k].branch);
System.out.println("year is "+arr[k].year);
System.out.println("total mark is "+arr[k].total);
k++; 
if(k==n)
{break;}
}

while(arr[k].total==largest2 && ((largest2==arr2[1]) || (largest2==arr2[2]) || (largest2==arr2[3]) || (largest2==arr2[4]) || (largest2==arr2[5]))) 
{
System.out.println("student holding second position,  total markwise is : "+arr[k].name);
System.out.println("student id is "+arr[k].sid);
System.out.println("branch is "+arr[k].branch);
System.out.println("year is "+arr[k].year);
System.out.println("total mark is "+arr[k].total);
k++;
if(k==n)
{break;}
}
}
}