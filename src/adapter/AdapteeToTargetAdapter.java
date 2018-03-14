package adapter;

public class AdapteeToTargetAdapter implements Target {

    private Adaptee adaptee;

    public AdapteeToTargetAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }

}
