import java.util.Scanner;
class factorsc
{
public static void main(String args[])
{
int n,i;
Scanner obj=new Scanner(System.in);
System.out.println("enter the num");
n=obj.nextInt();
System.out.println("factors are");
for(i=1;i<=n;i++)
{if(n%i==0)
System.out.println(i); 
}
}}

