package design_model.factory_model.abstract_factory;

public class Client {
    public static void main(String[] args) {
        Factory factory;
        factory = new FactoryA();
        factory.createProduct();
        factory.createGift();
        factory = new FactoryB();
        factory.createProduct();
        factory.createGift();
    }
}