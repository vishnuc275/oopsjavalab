import java.util.*;
class Cpu
{
int price;
void outermeth()
{
Processor inobj=new Processor();
inobj.innermeth();
}
class Processor
{
int corenum=8;
String manf="Intel";
void innermeth()
{
System.out.println("no of cores is " +corenum);
System.out.println("processor manufacture is " +manf);
System.out.println("price is " +price);
}
}
static class Ram
{
int memory=6;
String manftr ="Kingston";
void nestmethod()
{
System.out.println("ram memory is " +memory);
System.out.println("ram manufacturer is " +manftr);
}
};
public static void main(String []args)
{
Cpu outobj = new Cpu();
outobj.price=10000;
outobj.outermeth();
Cpu.Ram inobj = new Cpu.Ram();
inobj.nestmethod(); 
}
}