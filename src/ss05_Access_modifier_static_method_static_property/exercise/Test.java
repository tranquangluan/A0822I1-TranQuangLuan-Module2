package ss05_Access_modifier_static_method_static_property.exercise;
class Student{
    private String name = "John";
    private String classes = "C02";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName(" ");
        student.setClasses(" ");
    }
}
