package design_model.Proxy_Model.static_model;

public class UserDao implements IUserDao {
    public void save() {
        System.out.println("----已经保存数据!----");
    }
}