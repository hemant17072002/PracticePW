
class Student {
    private int age;
    private String name;

    public void setData1(int a) {
        age = a;
       

    }

    // public void show1() {
    // System.out.println(name + " " + age);
    // }

    public void setData2(String d) {
        name=d;

    }

    public void show() {
        System.out.println(name + " " + age);
    }
}

public class encap {
    public static void main(String[] args) {
        Student obj = new Student();
        Student obj1 = new Student();
        obj.setData1(18);
        obj1.setData2("hemant");
        obj.show();
        obj1.show();
        // obj.show2();

    }
}
