package design_model.Observer_model;

/**
 * @Author Zhouwx
 * @Date : Created in 20:53 2019/3/26
 */

public class User implements Observer{

    private String name;
    private String message;

    public User(String name) {
        this.name = name;
    }

    public void read(){
        System.out.println(name + " 收到推送消息： " + message);
    }

    @Override
    public void update(String message) {
        this.message = message;
        read();
    }
}
