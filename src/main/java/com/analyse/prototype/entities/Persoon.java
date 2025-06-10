package com.analyse.prototype.entities;

public class Persoon {
    private Integer id;
    private String naam;
    private Integer leefijd;
    private double balans;

    public Persoon(Integer id, String naam, Integer leefijd) {
        this.id = id;
        this.naam = naam;
        this.leefijd = leefijd;
    }

    public void bestelLaptop() {
        if (!(this.balans > 0)) {
            System.out.println("Je balans : " + this.balans);;
        }
        // buiten die if is het groter dan 0
        Double laptop = 1000.00;
        this.balans -= laptop;
        System.out.println("nieuwe balans : " + this.balans);

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Integer getLeefijd() {
        return leefijd;
    }

    public void setLeefijd(Integer leefijd) {
        this.leefijd = leefijd;
    }

    public double getBalans() {
        return balans;
    }

    public void setBalans(double balans) {
        this.balans = balans;
    }

    @Override
    public String toString() {
        return "Persoon{" +
                "id=" + id +
                ", naam='" + naam + '\'' +
                ", leefijd=" + leefijd +
                ", balans=" + balans +
                '}';
    }
}
