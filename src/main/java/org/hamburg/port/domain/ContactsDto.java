package org.hamburg.port.domain;

import java.util.Objects;

public class ContactsDto {
    private String name;
    private String position;
    private String email;
    private String company_id;

    public ContactsDto(String name, String position, String email, String company_id) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.company_id = company_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactsDto that = (ContactsDto) o;
        return Objects.equals(name, that.name) && Objects.equals(position, that.position) && Objects.equals(email, that.email) && Objects.equals(company_id, that.company_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position, email, company_id);
    }

    @Override
    public String toString() {
        return "CompanyContactsDto{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", company_id='" + company_id + '\'' +
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }
}
