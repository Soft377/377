public class ChineseRuralDog extends Animals{
    private boolean isVaccineInjected;

    public ChineseRuralDog(String name, int age, String gender, double sellPrice) {
        super(name, age, gender,sellPrice);
        this.price = 100;
    }

    @Override
    public String toString() {

        return "该宠物的品种是中华田园犬，它的名字是" + this.name
                + " 年龄是" + this.age + "岁 性别是" + this.gender;
    }
}
