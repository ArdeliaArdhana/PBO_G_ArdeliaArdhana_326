import java.util.Scanner;
// Kelas Admin
class Admin {
    private String username = "Admin326";
    private String password = "Password326";


    public boolean login(String inputUsername, String inputPassword) {
        return inputUsername.equals(username) && inputPassword.equals(password);
    }

    void test () {
        return //
    }
}