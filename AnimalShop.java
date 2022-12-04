public interface AnimalShop {
    void buy(Animals animals) throws InsufficientBalanceException;
    void treat(Customer customer);
    void close();
}
