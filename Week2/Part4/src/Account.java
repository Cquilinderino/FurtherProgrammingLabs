public class Account {
    private String name;
    private String ID;
    protected double balance;
    protected int count = 0;

    public Account(String name, String ID, double balance) {
        this.name = name;
        this.ID = ID;
        this.balance = balance;
    }
    public double getBalance() {
        return this.balance;
    }

    public String getName() {
        return this.name;
    }
    public Boolean withdraw(double amt) {
        count++;
        if (amt > this.balance) {
            return false;
        }
        System.out.println("Amount of withdrawals: " + count);
        this.balance -= amt;
        return true;
    }
    public void deposit(double amt) {
        this.balance += amt;
    }

    public void addInterest(double rate) {
        this.balance *= 1 + (rate / 100);
    }
}