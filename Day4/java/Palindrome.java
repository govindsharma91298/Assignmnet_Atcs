class Palindrome
{
public static void main(String args[])
{
int n=13431;
int k=n,r,s=0;
while(k!=0)
{
r=k%10;
s=s*10+r;
k=k/10;
}
if(n==s)
System.out.println("Palindrome");

else
System.out.println("Not Palindrome");
}
}