public class UserApp {
    public static void main(String[] args) {
        UserViewModel userViewModel = new UserViewModel();
        UserView userView = new UserView();
        userView.RunFunc(userViewModel);
    }
}
