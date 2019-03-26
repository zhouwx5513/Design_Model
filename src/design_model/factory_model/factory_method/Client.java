package design_model.factory_model.factory_method;

public class Client {
    public static void main(String[] args) {
        Factory factory;
        factory = new FactoryA();
        factory.createProduct();
        factory = new FactoryB();
        factory.createProduct();
        factory = new FactoryC();
        factory.createProduct();
    }
}