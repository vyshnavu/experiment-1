import java.util.Scanner;
class fibsc
{
public static void main(String args[])
{
int n,a=0,b=1,i,x;
Scanner obj=new Scanner(System.in);
System.out.println("enter the number of fibonacci numbers needed");
n=obj.nextInt();
System.out.println(a);
System.out.println(b);
for(i=2;i<n;i++)
{x=a+b;
System.out.println(x);
a=b;
b=x; 
}
}}

