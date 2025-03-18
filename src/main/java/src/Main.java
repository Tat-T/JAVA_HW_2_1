package src;

public class Main { //    public static void main(String[] args) {
    //        System.out.println("Hello, world");
    public static void main(String[] args) {

//        City city1 = new City();
//        city1.setName("Москва");
//        city1.setRegion("23");
//        city1.setCountry("Россия");
//        city1.setPopulation(1000000);
//        city1.setPostCode("300000");
//        city1.setPhoneCode("999");
//        System.out.println(city1);

        // Создаем объект Person
        Person person1 = new Person("Иван Иванов", "01.01.1990", "+7 900 123-45-67");
        Person person2 = new Person("Мария Петрова", "15.06.1985", "+7 901 654-32-10", "Москва", "Россия", "ул. Ленина, 10");

        System.out.println("Информация о человеке:");
        person1.printInfo();
        System.out.println();
        person2.printInfo(true);

        // Создаем объект City
        City city1 = new City("Москва", "Центральный", "Россия", 12500000, "101000", "+7");
        City city2 = new City("Лондон", "Великобритания");

        System.out.println("\nИнформация о городах:");
        city1.printInfo(true);
        System.out.println();
        city2.printInfo();

        // Тестирование класса Country
        Country country1 = new Country("Россия", "Москва", 144000000, 17098242, "Русский");
        Country country2 = new Country("Франция", "Париж");

        System.out.println("Информация о странах:");
        country1.printInfo(true);
        System.out.println();
        country2.printInfo();

        // Тестирование класса Fraction
        Fraction fraction1 = new Fraction(3, 4);
        Fraction fraction2 = new Fraction(1, 2);

        System.out.println("\nСложение дробей:");
        Fraction sum = fraction1.add(fraction2);
        sum.print();

        System.out.println("\nСложение дроби и числа:");
        Fraction sumWithNumber = fraction1.add(2);
        sumWithNumber.print();

        System.out.println("\nВывод дроби в десятичном виде:");
        fraction1.print(true);
    }
}
