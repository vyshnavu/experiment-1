import java.io.*;
import java.util.Scanner;
class sumsc
{
public static void main(String args[])
{
int a,b,s=0;
Scanner obj=new Scanner(System.in);
System.out.println("enter two numbers to add :\n");
a=obj.nextInt();
b=obj.nextInt();
s=s+a+b;
System.out.println("sum is"+s);
}
}
