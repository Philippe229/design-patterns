package bridge;

public abstract class Employee {

    /**
     * Bridge to Pay inheritance hierarchy
     */
    Pay pay;

    Employee(Pay pay) {
        this.pay = pay;
    }

    public abstract void salary();

}
