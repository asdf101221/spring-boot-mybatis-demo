package mybatis.entity;

import java.io.Serializable;
import java.util.Date;

public class user_info implements Serializable {
    private Long id;

    private String loginid;

    private String password;

    private String type;

    private String status;

    private String phone;

    private String name;

    private String email;

    private String country;

    private String povince;

    private String city;

    private String address;

    private String pid;

    private String pidtype;

    private String belongsystem;

    private String lastuser;

    private Date lasttime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid == null ? null : loginid.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getPovince() {
        return povince;
    }

    public void setPovince(String povince) {
        this.povince = povince == null ? null : povince.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getPidtype() {
        return pidtype;
    }

    public void setPidtype(String pidtype) {
        this.pidtype = pidtype == null ? null : pidtype.trim();
    }

    public String getBelongsystem() {
        return belongsystem;
    }

    public void setBelongsystem(String belongsystem) {
        this.belongsystem = belongsystem == null ? null : belongsystem.trim();
    }

    public String getLastuser() {
        return lastuser;
    }

    public void setLastuser(String lastuser) {
        this.lastuser = lastuser == null ? null : lastuser.trim();
    }

    public Date getLasttime() {
        return lasttime;
    }

    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }
}