package West2Online.Android;

public class Animal {
    String name;
    int age;
    char gender;
    double price;
    public Animal(String name,int age,char gender,double price){
        this.age=age;
        this.name=name;
        this.gender=gender;
        this.price=price;
    }

    public Animal() {

    }
}
class toString{
    public static void main(String[] args) {
        Animal animal =new Animal();
    }
}
