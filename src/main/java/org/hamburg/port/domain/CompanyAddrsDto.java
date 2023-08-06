package org.hamburg.port.domain;

import java.util.Objects;

public class CompanyAddrsDto {
    private String company_id;
    private String address;

    public CompanyAddrsDto(String company_id, String address) {
        this.company_id = company_id;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompanyAddrsDto that = (CompanyAddrsDto) o;
        return Objects.equals(company_id, that.company_id) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(company_id, address);
    }

    @Override
    public String toString() {
        return "CompanyAddrsDto{" +
                "company_id='" + company_id + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
