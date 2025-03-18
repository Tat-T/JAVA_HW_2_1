package src;

import lombok.Getter;

@Getter
public class Fraction {
    // Геттеры и сеттеры
    private int numerator;   // Числитель
    private int denominator; // Знаменатель

    // Конструкторы
    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть нулем!");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify(); // Упрощаем дробь
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть нулем!");
        }
        this.denominator = denominator;
        simplify();
    }

    // Метод для упрощения дроби
    private void simplify() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    // Метод для нахождения наибольшего общего делителя (НОД)
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // Перегруженный метод сложения дробей
    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction add(int number) {
        return new Fraction(this.numerator + number * this.denominator, this.denominator);
    }

    // Перегруженный метод вывода дроби
    public void print() {
        System.out.println(numerator + "/" + denominator);
    }

    public void print(boolean asDecimal) {
        if (asDecimal) {
            System.out.println((double) numerator / denominator);
        } else {
            print();
        }
    }
}
