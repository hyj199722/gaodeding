package mju.hyj326.domain;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
/*
由于Lombok插件的原因只需要
@Data：生成所有，getter() setter() toString()等等方法
@Setter ：生成setter()方法
@Getter：生成getter()方法
*/
@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String sex;
    private Integer phone;
    private Integer status;
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", username='" + username + '\'' + ", password='" + password + '\'' + ", sex='" + sex + '\'' + ", phone=" + phone + ", status=" + status + '}';
    }
}
