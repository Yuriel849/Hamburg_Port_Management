package org.hamburg.port.domain;

import java.util.Date;
import java.util.Objects;

public class CrewDto {
    private String name;
    private String position;
    private Date birthday;
    private String nationality;
    private String passport_no;
    private String address;
    private char gender;
    private String ship_id;

    public CrewDto(String name, String position, Date birthday, String nationality, String passport_no, String address, char gender, String ship_id) {
        this.name = name;
        this.position = position;
        this.birthday = birthday;
        this.nationality = nationality;
        this.passport_no = passport_no;
        this.address = address;
        this.gender = gender;
        this.ship_id = ship_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CrewDto crewDto = (CrewDto) o;
        return gender == crewDto.gender && Objects.equals(name, crewDto.name) && Objects.equals(birthday, crewDto.birthday) && Objects.equals(nationality, crewDto.nationality) && Objects.equals(passport_no, crewDto.passport_no);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday, nationality, passport_no, gender);
    }

    @Override
    public String toString() {
        return "CrewDto{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", birthday=" + birthday +
                ", nationality='" + nationality + '\'' +
                ", passport_no='" + passport_no + '\'' +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                ", ship_id='" + ship_id + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPassport_no() {
        return passport_no;
    }

    public void setPassport_no(String passport_no) {
        this.passport_no = passport_no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getShip_id() {
        return ship_id;
    }

    public void setShip_id(String ship_id) {
        this.ship_id = ship_id;
    }
}
