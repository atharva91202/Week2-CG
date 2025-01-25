class Animal{
    String name;
    int age;
    public Animal(String name,int age){
        this.name = name;
        this.age = age;
    }
    void makesound(){
        System.out.println("Animals can make different sounds");
    }
}
class Dog extends Animal{
    public Dog(String name , int age){
        super(name,age);
    }
    @Override
    void makesound() {
        System.out.println("The Dog barks");
    }
}
class Cat extends Animal{
    public Cat(String name , int age){
        super(name, age);
    }

    @Override
    void makesound() {
        System.out.println("The cat meows");;
    }
}
class Bird extends Animal{
    public Bird(String name , int age){
        super(name, age);
    }

    @Override
    void makesound() {
        System.out.println("The bird chirps");;
    }
}
public class Animal_Hierarchy {
    public static void main(String[] args) {
        Animal dog = new Dog("Sheru", 4);
        Animal cat = new Cat("Kiwi", 1);
        Animal bird = new Bird("tweaks", 2);
        dog.makesound();
        cat.makesound();
        bird.makesound();
        }
    }
