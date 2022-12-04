import java.time.LocalDate;
import java.time.LocalDateTime;

public class Customer {
    public String name;
    public int chance;
    public LocalDate lastTime;
    public Animals pet;

    public Customer(String name, int chance, LocalDate lastTime, Animals pet) {
        this.name = name;
        this.chance = chance;
        this.lastTime = lastTime;
        this.pet = pet;
    }



    @Override
    public String toString() {
        return "顾客名字：" + name +
                " 到店次数：" + chance +
                " 最新到店时间：" + lastTime ;

    }
}
