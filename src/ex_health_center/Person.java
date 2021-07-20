package ex_health_center;
public abstract class Person {
    private int age;
    private char gender;
    
    public Person(char gender,int age){
        this.age=age;
        if(!Character.isUpperCase(gender)) gender=Character.toUpperCase(gender);
        this.gender=gender;
    }
    
    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
