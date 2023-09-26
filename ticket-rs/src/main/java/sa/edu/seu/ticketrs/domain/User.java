package sa.edu.seu.ticketrs.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User implements Serializable {
    
    @Id
    @GeneratedValue
    @Column(name="user_id")
    private int id;

    @Column(name="first_name",length = 50)
    private String firstName;

    @Column(name="last_name",length = 50)
    private String lastName;

    @Column(name="user_email", length = 50, unique = true)
    private String email;

    @Column(name="user_pass", length = 200)
    private String password;

    @Column(name="pass_salt", length = 500)
    private String passwordSalt;
    
    @Column(name="user_role")
    private int userRoleId;

    @ManyToOne
    @JoinColumn(name="user_role", insertable = false,updatable = false)
    private UserRole userRole;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordSalt() {
        return passwordSalt;
    }

    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt;
    }

    public int getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(int userRoleId) {
        this.userRoleId = userRoleId;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }


    
    
}
