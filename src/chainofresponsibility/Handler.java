package chainofresponsibility;

public abstract class Handler {

    private Handler successor;

    public void setNext(Handler successor) {
        this.successor = successor;
    }

    public void handle() {
        // some conditions
        handleRequest();

        if (successor != null)
            successor.handle();
    }

    public abstract void handleRequest();

}
