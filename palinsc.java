import java.util.Scanner;
class palinsc
{public static void main(String args[])
{int n,a,rev=0,m;
Scanner obj=new Scanner(System.in);
System.out.println("enter the num");
n=obj.nextInt();
m=n;
while(n!=0)
{a=n%10;
rev=rev*10+a;
n=n/10;
}
if(rev==m)
System.out.println("palindrome");
else
System.out.println("not palindrome");
}}
