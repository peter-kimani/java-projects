import java.util.*;
public class Menu
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
int x, y;
int Sum, Substract, Multiply, Divide;
for(int i=3; i>0; i++)
{
System.out.println("Menu");
System.out.println("1.Add");
System.out.println("2.Substract");
System.out.println("3.Multiply");
System.out.println("4.Divide");
System.out.println("5.EXIST");
System.out.println("Select your choice");
i=input.nextInt();

 if(i==1)
{
System.out.print("Enter first number:");
x=input.nextInt();
System.out.print("Enter second number:");
y=input.nextInt();
Sum=x + y;
System.out.println("Add= "+Sum);
}
else if(i==2)
{
System.out.print("Enter first number:");
x=input.nextInt();
System.out.print("Enter second number:");
y=input.nextInt();
Substract=x - y;
System.out.println("Substract= "+Substract);
}
else if(i==3)
{
System.out.print("Enter first number:");
x=input.nextInt();
System.out.print("Enter second number:");
y=input.nextInt();
Multiply=x * y;
System.out.println("Multiply= "+Multiply);
}
else if(i==4)
{
System.out.print("Enter first number:");
x=input.nextInt();
System.out.print("Enter second number:");
y=input.nextInt();
Divide=x / y;
System.out.println("Divide= "+Divide);
}
else if(i>=5 || i<1)
{
break;
}
}
}
}