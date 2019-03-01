
package DataTypes;

import java.util.HashMap;
import javafx.util.Pair;

public class Data {
    private HashMap<String, User> users;
    private Pair<Boolean, String> active;
    
    private boolean error_data;
    
    private static Data instance = null;

    public Data() {
        users = new HashMap<>();
        error_data = false;
    }
    
    public static Data getInstance(){
        if(instance == null){
            instance = new Data();
        }
        
        return instance;
    }
    
    public static void removeInstance(){
        instance = null;
    }
    
    
    //GETTERS AND SETTERS
    public HashMap<String, User> getUsers() {
        return users;
    }

    public void setUsers(HashMap<String, User> users) {
        this.users = users;
    }

    public Pair<Boolean, String> getActive() {
        return active;
    }

    public void setActive(Pair<Boolean, String> active) {
        this.active = active;
    }

    public boolean isError_data() {
        return error_data;
    }

    public void setError_data(boolean error_data) {
        this.error_data = error_data;
    }
    
    
    
}
