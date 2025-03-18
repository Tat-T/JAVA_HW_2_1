package src;
public class Main {
    public static void main(String[] args){
        City city1 = new City();
        city1.setName("Москва");
        city1.setRegion("23");
        city1.setCountry("Россия");
        city1.setPopulation(1000000);
        city1.setPostCode("300000");
        city1.setPhoneCode("999");

        System.out.println(city1);
    }
}