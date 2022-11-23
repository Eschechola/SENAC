package br.com.senac.schedule.domain.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.*;

@Entity (name = "Person")
public class Person implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    private String firstName;

    private String lastName;

    private String email;

    LocalDateTime createdAt;

    boolean isActive;

    public Person(){
        super();
    }

    public Person(
            String firstName,
            String lastName,
            String email,
            LocalDateTime createdAt,
            boolean isActive) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.createdAt = createdAt;
        this.isActive = isActive;
    }

    public Person(
            int id,
            String firstName,
            String lastName,
            String email,
            LocalDateTime createdAt,
            boolean isActive) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.createdAt = createdAt;
        this.isActive = isActive;
    }

    public int getId(){
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", createdAt=" + createdAt +
                ", isActive=" + isActive +
                '}';
    }
}
