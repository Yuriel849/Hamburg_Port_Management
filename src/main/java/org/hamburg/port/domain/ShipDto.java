package org.hamburg.port.domain;

import java.util.Date;
import java.util.Objects;

public class ShipDto {
    private String id;
    private String name;
    private String flag;
    private Integer tonnage;
    private Integer capacity;
    private Integer number_of_call;
    private String purpose_of_call;
    private String last_port_of_call;
    private Date arrival_date;
    private Date departure_date;
    private String company_id;

    public ShipDto(String id, String name, String flag, Integer tonnage, Integer capacity, Integer number_of_call, String purpose_of_call, String last_port_of_call, Date arrival_date, Date departure_date, String company_id) {
        this.id = id;
        this.name = name;
        this.flag = flag;
        this.tonnage = tonnage;
        this.capacity = capacity;
        this.number_of_call = number_of_call;
        this.purpose_of_call = purpose_of_call;
        this.last_port_of_call = last_port_of_call;
        this.arrival_date = arrival_date;
        this.departure_date = departure_date;
        this.company_id = company_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShipDto shipDto = (ShipDto) o;
        return Objects.equals(id, shipDto.id) && Objects.equals(name, shipDto.name) && Objects.equals(flag, shipDto.flag) && Objects.equals(tonnage, shipDto.tonnage) && Objects.equals(capacity, shipDto.capacity) && Objects.equals(number_of_call, shipDto.number_of_call) && Objects.equals(purpose_of_call, shipDto.purpose_of_call) && Objects.equals(last_port_of_call, shipDto.last_port_of_call) && Objects.equals(arrival_date, shipDto.arrival_date) && Objects.equals(departure_date, shipDto.departure_date) && Objects.equals(company_id, shipDto.company_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, flag, tonnage, capacity, number_of_call, purpose_of_call, last_port_of_call, arrival_date, departure_date, company_id);
    }

    @Override
    public String toString() {
        return "ShipDto{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", flag='" + flag + '\'' +
                ", tonnage=" + tonnage +
                ", capacity=" + capacity +
                ", number_of_call=" + number_of_call +
                ", purpose_of_call='" + purpose_of_call + '\'' +
                ", last_port_of_call='" + last_port_of_call + '\'' +
                ", arrival_date=" + arrival_date +
                ", departure_date=" + departure_date +
                ", company_id='" + company_id + '\'' +
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

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Integer getTonnage() {
        return tonnage;
    }

    public void setTonnage(Integer tonnage) {
        this.tonnage = tonnage;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getNumber_of_call() {
        return number_of_call;
    }

    public void setNumber_of_call(Integer number_of_call) {
        this.number_of_call = number_of_call;
    }

    public String getPurpose_of_call() {
        return purpose_of_call;
    }

    public void setPurpose_of_call(String purpose_of_call) {
        this.purpose_of_call = purpose_of_call;
    }

    public String getLast_port_of_call() {
        return last_port_of_call;
    }

    public void setLast_port_of_call(String last_port_of_call) {
        this.last_port_of_call = last_port_of_call;
    }

    public Date getArrival_date() {
        return arrival_date;
    }

    public void setArrival_date(Date arrival_date) {
        this.arrival_date = arrival_date;
    }

    public Date getDeparture_date() {
        return departure_date;
    }

    public void setDeparture_date(Date departure_date) {
        this.departure_date = departure_date;
    }

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }
}
