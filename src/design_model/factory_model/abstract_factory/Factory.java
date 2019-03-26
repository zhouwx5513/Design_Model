package design_model.factory_model.abstract_factory;

import design_model.factory_model.simple_factory.Product;

public interface Factory {
    public Product createProduct();
    public Gift createGift();

}