package learnProgramming;

public class MyMain {
    public static void main(String[] args) {

        Animal myAnimalObject = new Animal();
        System.out.println("Animal"+myAnimalObject.getNumberOfLegs());
        Dog myDogObject = new Dog();
        System.out.println("Dog"+myDogObject.getNumberOfLegs());
        GermanShep myGermanShepObject = new GermanShep();
        System.out.println("GermanShep"+myGermanShepObject.getNumberOfLegs());

        myAnimalObject.printInfo();
        myDogObject.printInfo();
        myGermanShepObject.printInfo();
    }



}
