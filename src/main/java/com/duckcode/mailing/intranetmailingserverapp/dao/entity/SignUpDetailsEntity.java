package com.duckcode.mailing.intranetmailingserverapp.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class SignUpDetailsEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String password;
    private int age;
    private String gender;
    private String city;
    private String state;
    private String pin;
    private String country;

    public SignUpDetailsEntity() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SignUpDetailsEntity user = (SignUpDetailsEntity) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(username, user.username) &&
                Objects.equals(password, user.password) &&
                Objects.equals(age, user.age) &&
                Objects.equals(gender, user.gender) &&
                Objects.equals(city, user.city) &&
                Objects.equals(state, user.state) &&
                Objects.equals(pin, user.pin) &&
                Objects.equals(country, user.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, age, gender, city, state, pin, country);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", userName=" + username + '\'' +
                ", age=" + age + '\'' +
                ", gender=" + gender + '\'' +
                ", city=" + city + '\'' +
                ", state=" + state + '\'' +
                ", pin=" + pin + '\'' +
                ", country=" + country + '\'' +
                '}';

    }
}
