package design_model.Observer_model;

/**
 * @Author Zhouwx
 * @Date : Created in 20:42 2019/3/26
 *  抽象观察者
 *  定义了一个update()方法，
 *  当被观察者调用notifyObservers()方法时，
 *  观察者的update()方法会被回调。
 *
 */

public interface Observer {

    public void update(String message);

}
