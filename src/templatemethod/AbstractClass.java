package templatemethod;

public abstract class AbstractClass {

    public void templateMethod() {
        System.out.println("Operation 1:");
        operation1();
        System.out.println("Operation 2:");
        operation2();
    }

    public abstract void operation1();

    public abstract void operation2();

}
