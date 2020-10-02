package com.cbl.celebration_holdings.DTO;

import java.io.Serializable;

public class UserDTO implements Serializable {

    private int user_Id;
    private String user_name;
    private String address;
    private String tele;
    private String nic;
    private String created_date;
    private String password;
    private String cof_password;
    private String user_type;
    private int status;

    public UserDTO() {
    }

    public UserDTO(int user_Id, String user_name, String address, String tele, String nic, String created_date, String password, String cof_password, String user_type, int status) {
        this.setUser_Id(user_Id);
        this.setUser_name(user_name);
        this.setAddress(address);
        this.setTele(tele);
        this.setNic(nic);
        this.setCreated_date(created_date);
        this.setPassword(password);
        this.setCof_password(cof_password);
        this.setUser_type(user_type);
        this.setStatus(status);
    }

    public UserDTO(String user_name, String address, String tele, String nic, String created_date, String password, String cof_password, String user_type, int status) {
        this.setUser_name(user_name);
        this.setAddress(address);
        this.setTele(tele);
        this.setNic(nic);
        this.setCreated_date(created_date);
        this.setPassword(password);
        this.setCof_password(cof_password);
        this.setUser_type(user_type);
        this.setStatus(status);
    }


    public int getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(int user_Id) {
        this.user_Id = user_Id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCof_password() {
        return cof_password;
    }

    public void setCof_password(String cof_password) {
        this.cof_password = cof_password;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "user_Id=" + user_Id +
                ", user_name='" + user_name + '\'' +
                ", address='" + address + '\'' +
                ", tele='" + tele + '\'' +
                ", nic='" + nic + '\'' +
                ", created_date='" + created_date + '\'' +
                ", password='" + password + '\'' +
                ", cof_password='" + cof_password + '\'' +
                ", user_type='" + user_type + '\'' +
                ", status=" + status +
                '}';
    }
}
