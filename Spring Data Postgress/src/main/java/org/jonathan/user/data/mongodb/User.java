package org.jonathan.user.data.mongodb;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
    @Id
    private String id;
    private String nombre;

    private String correo;

    private String source;

    public User() {
    }

    public User(String name, String email) {
        this.nombre = name;
        this.correo = email;
        this.source = "mongodb";
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + nombre + '\'' +
                ", email='" + correo + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}



