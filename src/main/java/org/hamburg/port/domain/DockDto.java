package org.hamburg.port.domain;

import java.util.Date;
import java.util.Objects;

public class DockDto {
    private Integer number;
    private Date docking_date;
    private Date leaving_date;
    private String ship_id;

    public DockDto(Integer number, Date docking_date, Date leaving_date, String ship_id) {
        this.number = number;
        this.docking_date = docking_date;
        this.leaving_date = leaving_date;
        this.ship_id = ship_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DockDto dockDto = (DockDto) o;
        return Objects.equals(number, dockDto.number) && Objects.equals(docking_date, dockDto.docking_date) && Objects.equals(leaving_date, dockDto.leaving_date) && Objects.equals(ship_id, dockDto.ship_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, docking_date, leaving_date, ship_id);
    }

    @Override
    public String toString() {
        return "DockDto{" +
                "number=" + number +
                ", docking_date=" + docking_date +
                ", leading_date=" + leaving_date +
                ", ship_id='" + ship_id + '\'' +
                '}';
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getDocking_date() {
        return docking_date;
    }

    public void setDocking_date(Date docking_date) {
        this.docking_date = docking_date;
    }

    public Date getLeaving_date() {
        return leaving_date;
    }

    public void setLeaving_date(Date leaving_date) {
        this.leaving_date = leaving_date;
    }

    public String getShip_id() {
        return ship_id;
    }

    public void setShip_id(String ship_id) {
        this.ship_id = ship_id;
    }
}
