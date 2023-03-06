public class CAccount extends Account {
    private double overdrawLimit;
    private double overdrawnBy;

    public CAccount(String name, String ID, double balance, double overdrawLimit) {
        super(name, ID, balance);
        this.overdrawLimit = overdrawLimit;
    }

    public CAccount(String name, String ID, double balance, double overdrawLimit, double overdrawnBy) {
        super(name, ID, balance);
        this.overdrawLimit = overdrawLimit;
        this.overdrawnBy = overdrawnBy;
    }

    @Override
    public Boolean withdraw(double amt) {
        this.count++;
        if (amt > this.balance + this.overdrawLimit) {
            return false;
        } else if (amt > this.balance) {
            this.overdrawnBy = Math.abs(this.balance - amt);
            System.out.println("Overdrawn by " + this.overdrawnBy);
            return true;
        }
        this.balance -= amt;
        return true;

    }

    @Override
    public void deposit(double amt) {
        if(this.balance == 0) {
            this.balance = Math.abs(this.overdrawLimit - amt);
        } else {
            this.balance += amt;
        }
    }

}