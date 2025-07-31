package serialization;

import java.io.Serializable;

public class UserProfile implements Serializable {
    private static final long serialVersionUID = 1L; // Good practice for version control

    private String username;
    private String email;
    private transient String password; // Won’t be serialized

    public UserProfile(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    
	public String toString() {
        return "UserProfile [username=" + username + ", email=" + email + ", password=" + password + "]";
    }
}
