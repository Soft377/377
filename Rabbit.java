public class Rabbit extends Animals {

    public Rabbit(String name, int age, String gender, double sellPrice) {
        super(name, age, gender,sellPrice);
        this.price = 30;
    }

    @Override
    public String toString() {


        return "该宠物的品种是兔子 ，它的名字是" + this.name
                + " 年龄是" + this.age + "岁 性别是" + this.gender;
    }

}
