package com.myproject.firstspringproject.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "tb_order")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant moment;

    //associações
    @ManyToOne
    @JoinColumn(name = "/client_id")
    private User client;



    public Order() {}

    public Order(Long id, Instant moment) {
        this.id = id;
        this.moment = moment;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {}

    public Instant getMoment() {
        return moment;
    }
    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }



    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", moment=" + moment +
                '}';
    }
}
