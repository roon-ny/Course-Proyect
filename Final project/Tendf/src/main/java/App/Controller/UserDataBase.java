package App.Controller;

import App.Model.User;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class UserDataBase {

    private static final String FILE_PATH = "users.json";

    private static ArrayList<User> userList = new ArrayList<>();
    public static String diaSeleccionado;


    public static void loadUsers() {
        try (FileReader reader = new FileReader(FILE_PATH)) {

            Type listType = new TypeToken<ArrayList<User>>() {}.getType();
            userList = new Gson().fromJson(reader, listType);

            if (userList == null) {
                userList = new ArrayList<>();
            }

        } catch (Exception e) {
            userList = new ArrayList<>();
        }
    }

    public static void saveUsers() {
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            new Gson().toJson(userList, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addUser(User user) {
        userList.add(user);
        saveUsers();
    }

    public static boolean userExists(String username) {
        loadUsers();

        for (User u : userList) {
            if (u.getUsername().equalsIgnoreCase(username)) {
                return true;
            }
        }
        return false;
    }

    public static boolean findUser(String username, String password) {
        loadUsers();
        for (User u : userList) {
            if (u.getUsername().equals(username) &&
                    u.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
