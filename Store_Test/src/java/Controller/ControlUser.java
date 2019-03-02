
package Controller;

import Data_Structure.User;
import java.util.HashMap;

public class ControlUser {
    
    private static ControlUser instance;
    
    private HashMap<String, User> users;
    private boolean error;
    
    public static ControlUser getInstance(){
        if(instance == null){
            instance = new ControlUser();
        }
        return instance;
    }

    public ControlUser() {
        this.error = false;
        users = new HashMap<>();
    }

    public HashMap<String, User> getUsers() {
        return users;
    }

    public void setUsers(HashMap<String, User> users) {
        this.users = users;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }
    
    
}
