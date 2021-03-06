package com.my.alma.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name="hostel")
public class Hostel {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @Column(name="address")
    private String address;

    @OneToMany(mappedBy = "hostel", fetch = FetchType.EAGER)
    private Collection<Room> rooms;

    @Transient
    private Integer free;

    public Hostel(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Collection<Room> getRooms() {
        return rooms;
    }

    public void setRooms(Collection<Room> rooms) {
        this.rooms = rooms;
    }

    public Integer getFree() { return free; }

    public void setFree(Integer free) { this.free = free; }
}
