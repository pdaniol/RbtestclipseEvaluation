package pl.edu.agh.student.daniol.shop.profile;

public class Customer {
    private int id;
    private String mail;
    private Country country;
    private int loyaltyPoints;
    private int age;

    public Customer() {
    }

    public Customer(int id, String mail, Country country, int loyaltyPoints, int age) {
        this.id = id;
        this.mail = mail;
        this.country = country;
        this.loyaltyPoints = loyaltyPoints;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
