public abstract class Animals {
    protected String name;
    protected int age;
    protected String gender;
    protected double price;
    protected double sellPrice;

    public Animals(String name , int age , String gender , double sellPrice){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.sellPrice = sellPrice;
    }
    public Animals(){

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public abstract String toString();
}
