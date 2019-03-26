package design_model.Proxy_Model.static_model;

public class App {
    public static void main(String[] args) {
        UserDao target = new UserDao(); //目标对象
        //IUserDao target = new UserDao();
        UserDaoProxy proxy = new UserDaoProxy(target);//代理对象,把目标对象传给代理对象,建立代理关系
        proxy.save();//执行的是代理的方法
    }
}
