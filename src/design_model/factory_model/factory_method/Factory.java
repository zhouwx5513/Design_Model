package design_model.factory_model.factory_method;

import design_model.factory_model.simple_factory.Product;

public interface Factory {
    //声明产生产品类的方法
    public Product createProduct();
}