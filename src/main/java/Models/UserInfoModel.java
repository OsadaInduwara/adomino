
package Models;


public class UserInfoModel {
    String userName;
    int userAge;
    public UserInfoModel(String userName, int userAge) {
        this.userName = userName;
        this.userAge = userAge;
    }
    public String getuserName() {
        return userName;
    }
    public int getuserAge() {
        return userAge;
    }
    public void setName(String userName) {
        this.userName = userName;
    }
    public void setAge(int userAge) {
        this.userAge = userAge;
    }
}
