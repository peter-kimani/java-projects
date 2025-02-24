public class A
{
public static void main(String[]args)
{
String str ="aaaaa";
int minLength=15;
while(str.length()<minLength)
{
str = str +"b";
}
System.out.print(str);
}
}