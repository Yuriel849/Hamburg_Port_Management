package org.hamburg.port.domain;

import java.util.Objects;

public class CargoDto {
    private String id;
    private String name;
    private Integer quantity;
    private Double value;
    private String status;
    private String sender;
    private String receiver;
    private String origin;
    private String destination;
    private String ship_id;

    public CargoDto(String id, String name, Integer quantity, Double value, String status, String sender, String receiver, String origin, String destination, String ship_id) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.value = value;
        this.status = status;
        this.sender = sender;
        this.receiver = receiver;
        this.origin = origin;
        this.destination = destination;
        this.ship_id = ship_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CargoDto cargoDto = (CargoDto) o;
        return Objects.equals(id, cargoDto.id) && Objects.equals(name, cargoDto.name) && Objects.equals(quantity, cargoDto.quantity) && Objects.equals(value, cargoDto.value) && Objects.equals(status, cargoDto.status) && Objects.equals(sender, cargoDto.sender) && Objects.equals(receiver, cargoDto.receiver) && Objects.equals(origin, cargoDto.origin) && Objects.equals(destination, cargoDto.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, quantity, value, status, sender, receiver, origin, destination);
    }

    @Override
    public String toString() {
        return "CargoDto{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", value=" + value +
                ", status='" + status + '\'' +
                ", sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", ship_id='" + ship_id + '\'' +
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getShip_id() {
        return ship_id;
    }

    public void setShip_id(String ship_id) {
        this.ship_id = ship_id;
    }
}
