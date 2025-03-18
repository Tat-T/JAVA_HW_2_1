package src;

public class Person {
    private String fullName;
    private String dateOfBirth;
    private String phoneNumber;
    private String city;
    private String country;
    private String homeAddress;

    // Конструкторы
    public Person() {
        // Конструктор по умолчанию
    }

    public Person(String fullName, String dateOfBirth, String phoneNumber) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public Person(String fullName, String dateOfBirth, String phoneNumber, String city, String country, String homeAddress) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.country = country;
        this.homeAddress = homeAddress;
    }

    // Геттеры и сеттеры
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    // Перегруженный метод вывода информации
    public void printInfo() {
        System.out.println("Имя: " + fullName);
        System.out.println("Дата рождения: " + dateOfBirth);
        System.out.println("Телефон: " + phoneNumber);
    }

    public void printInfo(boolean fullDetails) {
        printInfo();
        if (fullDetails) {
            System.out.println("Город: " + city);
            System.out.println("Страна: " + country);
            System.out.println("Домашний адрес: " + homeAddress);
        }
    }
}
