package exceptiom;

public class classCastException {
    public static void main(String[] args) {
        Dog dog = new Dog();
        ChangeDog(dog);

        Cat cat = new Cat();
        ChangeCat(cat);
    }
    public static void ChangeDog(Animal animal) {
        //if (animal instanceof Dog) {
        Dog dog = (Dog) animal;   // classcastexception 발생가능
        //}
    }
}
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
