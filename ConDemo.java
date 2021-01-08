class ConDemo
{
 int a;
double b,c;
String s;
 ConDemo(int x)
  {
    System.out.println("Constructor of one 1 int args");
    a=x;
   }
  ConDemo(double x,double y)
   {
     System.out.println("Constructor of 2 double args");
     b=x;
     c=y;
    }
   ConDemo(String x)
   {
    System.out.println("constructor of 1 string s args");
    s=x;
    }
   void display(){
  System.out.println("value of int a:"+a);
  System.out.println("value of double b:"+b);
  System.out.println("value of double c:"+c);
  System.out.println("value of String s:"+s);
}
public static void main(String args[])
{
 ConDemo ob=new ConDemo(10);
 ConDemo ob1=new ConDemo(7.5,8.6);
 ConDemo ob2=new ConDemo("Hello");
 ob.display();
ob1.display();
ob2.display();
}
}