package builder;

public class ConcreteBuilder implements Builder {

    private Product product = new Product();

    @Override
    public Builder buildStepA() {
        product.setFieldA("ConcreteBuilder fieldA");
        return this;
    }

    @Override
    public Builder buildStepB() {
        product.setFieldB("ConcreteBuilder fieldB");
        return this;
    }

    @Override
    public Product getProduct() {
        return product;
    }

}
