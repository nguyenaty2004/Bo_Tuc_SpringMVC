package org.codegym.crud_computer.model;

public class Computer {
    private int id;
    private String name;
    private String details;
    private int price;
    private String CPU;
    private String GUP;
    private String Ram;

    public Computer(int id, String name, String details, int price, String CPU, String GUP, String ram) {
        this.id = id;
        this.name = name;
        this.details = details;
        this.price = price;
        this.CPU = CPU;
        this.GUP = GUP;
        Ram = ram;
    }

    public Computer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getGUP() {
        return GUP;
    }

    public void setGUP(String GUP) {
        this.GUP = GUP;
    }

    public String getRam() {
        return Ram;
    }

    public void setRam(String ram) {
        Ram = ram;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", details='" + details + '\'' +
                ", price=" + price +
                ", CPU='" + CPU + '\'' +
                ", GUP='" + GUP + '\'' +
                ", Ram='" + Ram + '\'' +
                '}';
    }
}
