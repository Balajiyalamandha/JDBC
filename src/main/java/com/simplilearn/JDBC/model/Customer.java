package com.simplilearn.JDBC.model;

public class Customer {

    Integer cid;
    String name;
    String phone;
    String email;
    String birthDate;
    Integer age;
    String inDateTime;
    String outDateTime;
    Float temperature;

    public Customer() {}

    public Integer getCid() { return cid; }
    public void setCid(Integer cid) { this.cid = cid; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getBirthDate() { return birthDate; }
    public void setBirthDate(String birthDate) { this.birthDate = birthDate; }

    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }

    public String getInDateTime() { return inDateTime; }
    public void setInDateTime(String inDateTime) { this.inDateTime = inDateTime; }

    public String getOutDateTime() { return outDateTime; }
    public void setOutDateTime(String outDateTime) { this.outDateTime = outDateTime; }

    public Float getTemperature() { return temperature; }
    public void setTemperature(Float temperature) { this.temperature = temperature; }

    @Override
    public String toString() {
        return "Customer{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", age=" + age +
                ", inDateTime='" + inDateTime + '\'' +
                ", outDateTime='" + outDateTime + '\'' +
                ", temperature=" + temperature +
                '}';
    }
}