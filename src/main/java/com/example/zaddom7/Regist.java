package com.example.zaddom7;

public class Regist {
    private int ID;
    private String status;
    private String user;
    private String employee;

    public Regist(int ID, String status, String user, String employee) {
        this.ID = ID;
        this.status = status;
        this.user = user;
        this.employee = employee;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ID=" + ID +
                ", status='" + status + '\'' +
                ", user='" + user + '\'' +
                ", employee='" + employee + '\'' +
                "}\n";
    }
}
