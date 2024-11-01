import java.util.ArrayList;
import java.util.List;

public class UserViewModel {

    public List<UserModel> users;

    public UserViewModel(){
        users = new ArrayList<>();
    }

    public void addUser(String name){
        users.add(new UserModel(name));
    }

    public List<String> getUserNames() {
        List<String> userNames = new ArrayList<>();
        for (UserModel user : users) {
            userNames.add(user.getName());
        }
        return userNames;
    }




    // add user calls UserModel
    // get user Names calls UserModel to create Arraylist of users
}