class demo{
    void add(int a, int b){
        int c=a+b;
        System.out.println(c);
    }
    void add(int a,int b,int c){
        int d=a+b+c;
        System.out.println(d);
    }
}


public class method_overloading {
    public static void main(String[] args) {
        demo d=new demo();
        d.add(1,2,3);
        d.add(2,3);
        
    }
    
}
