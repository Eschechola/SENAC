package br.com.senac.pessoaapi.domain.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.*;

@Entity (name = "Pessoa")
public class Pessoa implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "Id")
    int _id;

    @Column(name = "FirstName")
    private String _firstName;

    @Column (name = "LastName")
    private String _lastName;

    @Column (name = "Email")
    private String _email;

    @Column (name = "Age")
    private int _age;

    @Column(name = "CreatedAt")
    LocalDateTime _createdAt;

    @Column(name = "IsActive")
    boolean _isActive;

    public Pessoa(){
        super();
    }

    public Pessoa(
            int id,
            String firstName,
            String lastName,
            String email,
            int age,
            LocalDateTime createdAt,
            boolean isActive) {
        super();
        this._id = id;
        this._firstName = firstName;
        this._lastName = lastName;
        this._email = email;
        this._age = age;
        this._createdAt = createdAt;
        this._isActive = isActive;
    }

    public void setFirstName(String firstName) {
        this._firstName = firstName;
    }

    public void setLastName(String lastName) {
        this._lastName = lastName;
    }

    public void setEmail(String email) {
        this._email = email;
    }

    public void setAge(int age) {
        this._age = age;
    }

    public String getFirstName() {
        return _firstName;
    }

    public String getLastName() {
        return _lastName;
    }

    public String getEmail() {
        return _email;
    }

    public int getAge() {
        return _age;
    }

    public LocalDateTime getCreatedAt() {
        return _createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this._createdAt = _createdAt;
    }

    public boolean isActive() {
        return _isActive;
    }

    public void setIsActive(boolean isActive) {
        this._isActive = _isActive;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + _id +
                ", firstName='" + _firstName + '\'' +
                ", lastName='" + _lastName + '\'' +
                ", email='" + _email + '\'' +
                ", age=" + _age +
                ", createdAt=" + _createdAt +
                ", isActive=" + _isActive +
                '}';
    }
}
