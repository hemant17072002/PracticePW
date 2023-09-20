/* 

Single level Inheritance
class human{
    int age;
    void sleep(){
        age=18;
        
        System.out.println(age);
    }
}
class students extends human{

}

public class inheritance {
    public static void main(String[] args){
        students st=new students();

        st.sleep();
    }
    
}
 */

 //Methods in Inheritance{

    // Inhherited
   /*  class Aeroplane{
        public void takeoff(){
            System.out.println("Aeroplane is Taking off");
        }
        public void fly(){
            System.out.println("Aeroplane is flying");
        }
    }
    class cargoPlane extends Aeroplane{


    }
    class passengerPlane extends Aeroplane{

    }

    public class inheritance{
        public static void main(String[] args) {
            cargoPlane cp=new cargoPlane();
            cp.takeoff();
            cp.fly();
        }
    } */
 
    // Overridden method

    /*class Aeroplane{
        public void takeoff(){
            System.out.println("Aeroplane is Taking off");
        }
        public void fly(){
            System.out.println("Aeroplane is flying");
        }
    }
    class cargoPlane extends Aeroplane{
        public void takeoff(){
            System.out.println("cargoPlane is taking off");
        }
        public void fly(){
            System.out.println("Cargoplane is Flying ");
        }


    }
    class passengerPlane extends Aeroplane{
        public void takeoff(){
            System.out.println("passenger plane is taking off");
        }
        public void fly(){
            System.out.println("passenger plane is flying");
        }

    }

    public class inheritance{
        public static void main(String[] args) {
            cargoPlane cp=new cargoPlane();
            cp.takeoff();
            cp.fly();
        }
    } */
