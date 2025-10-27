public class Person {
    int age;
    String name;
    String city;

    Person(){
        this.age=0;
        this.name=null;
        this.city=null;
    }
    Person(String name){
        this.name=name;
    }

    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    Person(String name, int age, String city){
        this.name=name;
        this.age=age;
        this.city=city;
    }

    void display(){
        System.out.println("name: \t"+name+"\n"+"age: \t"+age+"\n"+"city: \t"+city);
    }
    
    public static void main(String[] arg){
        Person s1= new Person("rohan");
        Person s2= new Person("Rohan", 20);
        Person s3 = new Person("rohan",20,"solapur");
        s1.display();
        s2.display();
        s3.display();
    } 
}
