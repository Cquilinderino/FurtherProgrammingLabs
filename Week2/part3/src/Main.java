public class Main {
    public static void main(String args[]) {
        Account a1 = new Account("Tan A K", "S123", 24.5);
        Account a2 = new Account("Smith T", "S124", 1200.0);
        a1.deposit(100);
        a1.withdraw(2000);
        a2.deposit(120);
        a2.withdraw(80);
        System.out.println("Balance for " + a1.getName() + " is " + a1.getBalance());
        System.out.println("Balance for " + a2.getName() + " is " + a2.getBalance());
        a2.addInterest(5.4);
        System.out.println(a2.getBalance());
    }
}