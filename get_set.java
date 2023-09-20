class Student {
    private int age;
    private String name;

    public void setAge(int age) { // setter method
        this.age = age;
    }

    public int getAge() { // getter method
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

public class get_set {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setAge(18);
        obj.setName("Hemant");
        int Age = obj.getAge();
        System.out.println(Age);
        String Name = obj.getName();
        System.out.println(Name);
    }

}