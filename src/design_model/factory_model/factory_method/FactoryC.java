package design_model.factory_model.factory_method;

import design_model.factory_model.simple_factory.Product;


public class FactoryC implements Factory {
    //实现工厂类的方法生成产品类A
    public Product createProduct()
    {
        return new ProductC();
    }

}
