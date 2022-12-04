import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class MyAnimalShop implements AnimalShop {
    public double money;
    public boolean isClosed;
//    public ArrayList animalsList;
//    public ArrayList customersList;
    ArrayList<Animals> animalsList = new ArrayList<>();
    ArrayList<Customer> customersList = new ArrayList<>();
    public MyAnimalShop() {

    }

    public MyAnimalShop(double money, ArrayList animalsList, ArrayList customersList, boolean isClosed) {
        this.money = money;
        this.animalsList = animalsList;
        this.customersList = customersList;
        this.isClosed = isClosed;
    }

    public void buy(Animals animals) throws InsufficientBalanceException {
        animalsList.add(animals);
        if (money - animals.price > 0) {
            money -= animals.price;
            System.out.println("买入一只宠物,它名字是：" + animals.name + ".花费" + animals.price + "元");
        } else {
            throw new InsufficientBalanceException("余额不足");
        }
    }

    public void treat(Customer customer) throws AnimalNotFoundExpection {
        customersList.add(customer);
        Animals aa = customer.pet;
        if (animalsList.contains(aa)) {
            System.out.println(customer.name + "买下一只宠物");
            System.out.println(aa.toString());

            animalsList.remove(aa);
            money += aa.sellPrice;
        } else {
            throw new InsufficientBalanceException("店里没有该宠物");
        }
    }

    public void close() {
        LocalDate localDate = LocalDate.now();
//        if (localDate.getHour() < 10 && localDate.getHour() > 21) {
//            isClosed = true;
//        } else {
//            isClosed = false;
//        }
        System.out.println("宠物店歇业，输出当天顾客信息:");
        for (int i = 0; i < customersList.size(); i++) {
            System.out.println(customersList.get(i));
        }
        System.out.println("计算并输出一天的利润:");
        System.out.println(money);
    }
}
