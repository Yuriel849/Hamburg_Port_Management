package org.hamburg.port.domain;

import java.util.Arrays;
import java.util.Objects;

public class CompanyDto {
    private String id;
    private String name;

    private CompanyAddrsDto[] addrs = null;
    private ContactsDto[] contacts = null;

    public CompanyDto(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public CompanyDto(String id, String name, CompanyAddrsDto[] addrs, ContactsDto[] contacts) {
        this.id = id;
        this.name = name;
        this.addrs = addrs;
        this.contacts = contacts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompanyDto that = (CompanyDto) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Arrays.equals(addrs, that.addrs) && Arrays.equals(contacts, that.contacts);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, name);
        result = 31 * result + Arrays.hashCode(addrs);
        result = 31 * result + Arrays.hashCode(contacts);
        return result;
    }

    @Override
    public String toString() {
        return "CompanyDto{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", addrs=" + Arrays.toString(addrs) +
                ", contacts=" + Arrays.toString(contacts) +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CompanyAddrsDto[] getAddrs() {
        return addrs;
    }

    public void setAddrs(CompanyAddrsDto[] addrs) {
        this.addrs = addrs;
    }

    public ContactsDto[] getContacts() {
        return contacts;
    }

    public void setContacts(ContactsDto[] contacts) {
        this.contacts = contacts;
    }
}
