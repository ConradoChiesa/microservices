package com.konrad.testconnectmysql;

public class UserService {
    public User getById(){
        return new User(1L, "John", "Doe", "+57 311 222 3344", "john@sinbugs.com");
    }
}
