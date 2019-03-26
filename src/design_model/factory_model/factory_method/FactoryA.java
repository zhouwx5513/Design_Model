package design_model.factory_model.factory_method;

import design_model.factory_model.simple_factory.Product;
import design_model.factory_model.simple_factory.ProductA;

public class FactoryA implements Factory {
    //实现工厂类的方法生成产品类A
    public Product createProduct()
    {
        return new ProductA();
    }

}
