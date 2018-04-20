package bridge;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(Pay pay) {
        super(pay);
    }

    @Override
    public void salary() {
        System.out.println("Full time employee salary.");
        pay.pay();
    }

}
