class Pr
{
public static void main(String[] args)
{
int n=21;
for(int i=2;i<=n;i++)
{
if(n%i==0)
{
System.out.println("not a prime no");
return;
}
}
System.out.println("it is a prime no");
}
}
