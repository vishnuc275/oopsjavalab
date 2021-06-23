public class Stringmanip
{
  public static void main(String[] args){
//String Concatenation
String str1 = "Rock";
String str2 = "Star";
String str5 = "Royal";
String str6 = "Enfield";
//Method 1 : Using concat
String str3 = str1.concat(str2);
System.out.println(str3);
//Method 2 : Using "+" operator
String str4 = str5 + str6;
System.out.println(str4);
String str_Sample = "RockStar";
  //Length of a String
  System.out.println("Length of String: " + str_Sample.length());
System.out.println("Character at position 5: " + str_Sample.charAt(5));
//Index of a given character
System.out.println("Index of character 'S': " + str_Sample.indexOf('S'));
System.out.println("Character at position 5: " + str_Sample.charAt(5));
  System.out.println("Compare To 'ROCKSTAR': " + str_Sample.compareTo("rockstar"));
  //Compare to - Ignore case
  System.out.println("Compare To 'ROCKSTAR' - Case Ignored: " + str_Sample.compareToIgnoreCase("ROCKSTAR"));
  System.out.println("Contains sequence 'tar': " + str_Sample.contains("tar"));
  System.out.println("EndsWith character 'r': " + str_Sample.endsWith("r"));
System.out.println("Replace 'Rock' with 'Duke': " + str_Sample.replace("Rock", "Duke"));
System.out.println("Convert to LowerCase: " + str_Sample.toLowerCase());
//Convert to UpperCase
System.out.println("Convert to UpperCase: " + str_Sample.toUpperCase());
}
}
