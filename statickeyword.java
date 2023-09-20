class Demo{
    static int a;
    static int b;

    static{
        System.out.println("Static value");
        a=10;
        b=20;
    }

    void displ(){
        System.out.println(a);
        System.out.println(b);

    }

    

}

public class statickeyword{
    public static void main(String[] args) {
        Demo obj=new Demo();
        obj.displ();
    }
}