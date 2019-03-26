package design_model.factory_model.abstract_factory;

import design_model.factory_model.simple_factory.Product;
import design_model.factory_model.simple_factory.ProductB;

public class FactoryB implements Factory {
    @Override
    public Product createProduct()
    {
        return new ProductB();
    }
    @Override
    public Gift createGift()
    {
        return new GiftB();
    }
}