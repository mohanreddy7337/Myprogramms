class A
{
int i=10;
void m1()
{
int i=2;
System.out.println(i);
System.out.println(this.i);
System.out.println("m1() in class A");
}
}
class B extends A
{
void m2()
{
System.out.println(super.i);
System.out.println("m1() in class B");
}
}
class Test1
{
public static void main(String[] args)
{
A a1=new B();
a1.m1();
B b1=(B)a1;
b1.m2();

}
}