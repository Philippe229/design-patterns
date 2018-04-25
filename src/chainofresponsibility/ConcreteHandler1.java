package chainofresponsibility;

public class ConcreteHandler1 extends Handler {

    @Override
    public void handleRequest() {
        System.out.println("ConcreteHandler1 handle request.");
    }

}
