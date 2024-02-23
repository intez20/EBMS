package newpackage;
class xyz extends javapracitce.TestDemo{
    public void check()
    {
        System.out.println("check called");
        System.out.println("value of a="+a);
    }        
}    
public class Test {
    public static void main(String arg[]){
        xyz p=new xyz();
        p.check();
        System.out.println("value of a="+p.a);
    }
}
