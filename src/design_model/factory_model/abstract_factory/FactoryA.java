package design_model.factory_model.abstract_factory;

import design_model.factory_model.simple_factory.Product;
import design_model.factory_model.simple_factory.ProductA;

public class FactoryA implements Factory {
    @Override
    public Product createProduct()
    {
        return new ProductA();
    }
    @Override
    public Gift createGift()
    {
        return new GiftA();
    }
}