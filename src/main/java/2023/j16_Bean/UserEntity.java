package j16_Bean;

// 정보를 담는 객체를 Entity Class라 한다.

/*
*  멤버변수 선언
* 생성자 정의
* Getters and setters 정의
* Equals and HashCode 정의
* toString 정의
*
* */
public class UserEntity {

    private String username;
    private String password;
    private String email;
    private String name;

    public String getUsername() {
        return username;
    }
    public UserEntity(){    } //기본 생성자
    public UserEntity(String username, String password, String email, String name) { //생성자
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "UserEntity{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}


