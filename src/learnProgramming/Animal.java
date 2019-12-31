package learnProgramming;

public class Animal {
    String name;
    int numberOfLegs;
    public int Constant = 10;

    public int getTailLength(){ return 5; }

    public void setNumberOfLegs(int numberOfLegs){
        this.numberOfLegs = numberOfLegs;
    }


    public int getNumberOfLegs(){ return numberOfLegs; }

    //public abstract String getName();

    public void printInfo(){
        System.out.println("I am in animal print Info");
    }
}
