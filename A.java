class A
{
public static void main(String[] args)
{
int n=7;
for(int i=2;i<=n/2;i++)
{
if(n%i==0)
{
System.out.println("not a prime");
return;

}

}
System.out.println("is a prime");

}
}
