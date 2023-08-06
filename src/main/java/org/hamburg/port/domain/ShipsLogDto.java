package org.hamburg.port.domain;

import java.util.Date;
import java.util.Objects;

public class ShipsLogDto {
    private Integer index = 0; // 0 is placeholder, auto-incremented DB column
    private String id;
    private Date arrival_date;
    private Date departure_date;

    public ShipsLogDto(String id, Date arrival_date, Date departure_date) {
        this.id = id;
        this.arrival_date = arrival_date;
        this.departure_date = departure_date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShipsLogDto that = (ShipsLogDto) o;
        return Objects.equals(index, that.index) && Objects.equals(id, that.id) && Objects.equals(arrival_date, that.arrival_date) && Objects.equals(departure_date, that.departure_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, id, arrival_date, departure_date);
    }

    @Override
    public String toString() {
        return "ShipsLogDto{" +
                "index=" + index +
                ", id='" + id + '\'' +
                ", arrival_date=" + arrival_date +
                ", departure_date=" + departure_date +
                '}';
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
}
