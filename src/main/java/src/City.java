package src;

import lombok.Data;

@Data
public class City {
    private String name;
    private String region;
    private String country;
    private int population;
    private String postCode;
    private String phoneCode;

    // Конструкторы
    public City() {}

    public City(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public City(String name, String region, String country, int population, String postCode, String phoneCode) {
        this.name = name;
        this.region = region;
        this.country = country;
        this.population = population;
        this.postCode = postCode;
        this.phoneCode = phoneCode;
    }

    // Перегруженный метод вывода информации
    public void printInfo() {
        System.out.println("Город: " + name);
        System.out.println("Страна: " + country);
    }

    public void printInfo(boolean fullDetails) {
        printInfo();
        if (fullDetails) {
            System.out.println("Регион: " + region);
            System.out.println("Население: " + population);
            System.out.println("Почтовый код: " + postCode);
            System.out.println("Телефонный код: " + phoneCode);
        }
    }
}
