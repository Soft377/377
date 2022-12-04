import java.time.LocalDate;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ChineseRuralDog dog1 = new ChineseRuralDog("DD",3,"female",300);
        ChineseRuralDog dog2 = new ChineseRuralDog("TT",1,"male",200);
        Cat cat1 = new Cat("Gou",1,"male",1000);
        Cat cat2 = new Cat("Cookie",5,"male",2000);
        Rabbit rabbit1 = new Rabbit("Jenny",1,"female",80);
        Rabbit rabbit2 = new Rabbit("Jack",5,"male",99);
        Customer customer1 = new Customer("Tom",2, LocalDate.now(),dog2);
        Customer customer2 = new Customer("Mike",90,LocalDate.now(),cat2);
        MyAnimalShop myShop = new MyAnimalShop();
        myShop.money = 1000;
        myShop.animalsList.add(rabbit2);
        myShop.animalsList.add(dog2);
        myShop.animalsList.add(cat2);

        myShop.buy(dog1);
        myShop.buy(rabbit1);
        myShop.buy(cat1);
        myShop.treat(customer1);
        myShop.treat(customer2);
        myShop.close();
    }
}
