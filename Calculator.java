import java.util.Scanner;
public class Calculator
{
public float addition(float x, float y)
{
return x+y;
}
public float subtraction(float x, float y)
{
return x-y;
}
public float multiplication(float x, float y)
{
return x*y;
}
public float division(float x, float y)
{
return x/y;
}
public static void main(String[] args)
{
int choice;
float num1, num2;
System.out.println("Enter the number based on your choice of operation:\n(1) Addition\n(2) Subtraction\n(3) Multiplication\n(4) Division\n");
Scanner a = new Scanner(System.in);
choice = a.nextInt();
System.out.println("Enter Two Numbers:\n");
num1 = a.nextFloat();
num2 = a.nextFloat();
Calculator calci = new Calculator();
if (choice==1)
{
float add = calci.addition(num1, num2);
System.out.println("Addition Result is:"+add);
}
else if (choice==2)
{
float sub = calci.subtraction(num1, num2);
System.out.println("Subtraction Result is:"+sub);
}
else if (choice==3)
{
float mul = calci.multiplication(num1, num2);
System.out.println("Multiplication Result is:"+mul);
}
else if (choice==4)
{
float div = calci.division(num1, num2);
System.out.println("Division Result is:"+div);
}
}
}
