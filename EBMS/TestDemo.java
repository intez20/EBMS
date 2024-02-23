package javapracitce;
public class TestDemo
{
     public int a=10;
     public void disp()
     {
         System.out.println("Value of a="+a);
     }       
}
class B extends TestDemo
{
    public void show()
    {
        System.out.println("Show called!");
        System.out.println("value of a="+a);
    }        
}       
class A {
      public static void main(String arg[]){
          B x=new B();
          x.disp();
          x.show();
          System.out.print("a="+x.a);
      }
}


