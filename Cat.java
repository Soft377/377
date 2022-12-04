public class Cat extends Animals{

    public Cat(String name, int age, String gender,double sellPrice) {
        super(name, age, gender,sellPrice);
        this.price = 200;
    }

    @Override
    public String toString() {

        return "该宠物的品种是猫，它的名字是" + this.name
                + " 年龄是" + this.age + "岁 性别是" + this.gender;
    }
}
