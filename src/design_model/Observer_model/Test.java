package design_model.Observer_model;

/**
 * @Author Zhouwx
 * @Date : Created in 20:54 2019/3/26
 */

public class Test {

    public static void main(String[] args) {
        WechatServer server = new WechatServer();
        Observer userA = new User("Alice");
        Observer userB = new User("Bob");
        Observer userC = new User("Cindy");
        server.registerObserver(userA);
        server.registerObserver(userB);
        server.registerObserver(userC);
        server.setInfomation("今天放假啦！");
        System.out.println("=================");
        server.removeObserver(userB);
        server.setInfomation("取消放假啦！");
    }

}
