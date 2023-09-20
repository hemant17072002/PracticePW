class Calculator{
    
    int a;
    int b;
    int res;
    
    int add(){
        a=10;
        b=20;
        res=a+b;
        return res;

        
        
    }
}

public class functionsprac{
    public static void main(String[] args) {
       Calculator s=new Calculator();
       int sum=s.add();
       System.out.println(sum);
        


        
    }
}