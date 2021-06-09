import java.util.*;
class Product
{
int pcode,price;
String pname;
Product ()
{
pcode=1;
price=100;
pname="book1";
}
Product (int a,int b,String s)
{
pcode=a;
price=b;
pname=s;
}
public static void main(String [] args)
{
Product p1= new Product ();
System.out.println("name of book is = " +p1.pname);
System.out.println("pcode of book1 = " +p1.pcode);
System.out.println("price of book1 = " +p1.price);
Product p2= new Product ();
p2.pcode=2;
p2.price=200;
p2.pname="book2";
System.out.println("name of book is = " +p2.pname);
System.out.println("pcode of book2 = " +p2.pcode);
System.out.println("price of book2 = " +p2.price);
Product p3=new Product(3,50,"book3");
System.out.println("name of book is = " +p3.pname);
System.out.println("pcode of book3 = " +p3.pcode);
System.out.println("price of book3 = " +p3.price);
if(p1.price > p2.price & p1.price > p3.price)
{
System.out.println("book1 is expensive than book2 and book3");
}
else if(p2.price > p1.price & p2.price > p3.price)
{
System.out.println("book2 is more expensive than book1 and book3");
}
else
{
System.out.println("book3 is expensive");
}
}
}