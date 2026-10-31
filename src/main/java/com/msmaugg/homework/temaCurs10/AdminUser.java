package com.msmaugg.homework.temaCurs10;

public class AdminUser extends User {

    private String permissionLevel;

    public AdminUser(String username, int age, String permissionLevel) {
        super(username, age);
        this.permissionLevel = permissionLevel;
    }

    public String getPermissionLevel() {
        return permissionLevel;
    }

    public void setPermissionLevel(String permissionLevel) {
        this.permissionLevel = permissionLevel;
    }

    @Override
    public String toString() {
        return "AdminUser{username='" + getUsername() + "', age=" + getAge()
                + ", permissionLevel='" + permissionLevel + "'}";
    }
}
