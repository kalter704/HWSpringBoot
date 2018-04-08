package com.hw.sprngbt.demo.domain;

public class Owner {
    private Long id;
    private Long companyId;
    private String firstName;
    private String secondName;

    public Owner() {
    }

    public Owner(Long id, Long companyId, String firstName, String secondName) {
        this.id = id;
        this.companyId = companyId;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
