package com.hw.sprngbt.demo.domain;

public class Account {
    private Long id;
    private Long ownerId;
    private String name;
    private Double rate;

    public Account() {
    }

    public Account(Long id, Long ownerId, String name, Double rate) {
        this.id = id;
        this.ownerId = ownerId;
        this.name = name;
        this.rate = rate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }
}
