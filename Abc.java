class Abc
{
public static void main(String[] args)
{
int[] b={4,8,9,4,7};
int[] a=new int[4];
a[0]=1;
a[1]=2;
a[2]=3;
a[3]=4;
for(int i=0;i<4;i++)
System.out.println(a[i]);
m1(b);
}
static void m1(int[] a)
{
for(int n:a)
System.out.println(n);
}
}
