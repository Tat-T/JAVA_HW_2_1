package src;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Country {
    // Геттеры и сеттеры
    private String name;
    private String capital;
    private long population;
    private double area;
    private String officialLanguage;

    public Country() {}

    public Country(String name, String capital) {
        this.name = name;
        this.capital = capital;
    }

    public Country(String name, String capital, long population, double area, String officialLanguage) {
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.area = area;
        this.officialLanguage = officialLanguage;
    }

    // Перегруженный метод вывода информации
    public void printInfo() {
        System.out.println("Страна: " + name);
        System.out.println("Столица: " + capital);
    }

    public void printInfo(boolean fullDetails) {
        printInfo();
        if (fullDetails) {
            System.out.println("Население: " + population);
            System.out.println("Площадь: " + area + " км²");
            System.out.println("Официальный язык: " + officialLanguage);
        }
    }
}
