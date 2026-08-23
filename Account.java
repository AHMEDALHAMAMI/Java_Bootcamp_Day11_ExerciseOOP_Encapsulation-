public class Account {
    private String id;
    private String name;
    private int balance =0;

    public Account (){

    }

    public Account(String id, String name, int balance){
        this.id=id;
        this.name=name;
        this.balance=balance;

    }

    //setters
    public void setId(String id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setBalance(int balance){
        this.balance=balance;
    }

    //getters
    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getBalance(){
        return balance;
    }

    public int credit(int amount){
        if (amount > 0){
            balance += amount;
            return balance;
        }
        return amount;
    }

    public int debit(int amount){
        balance -= amount;
        return balance;
    }

    public int transferTo(Account another, int amount){
        if (amount <= 0) {
            System.out.println("Amount must be greater than zero");
        }
        if (another == null) {
            System.out.println("Target account cannot be null");
        }
        if (this.balance < amount) {
            System.out.println("Not enough balance");
        }

        this.debit(amount);
        another.credit(amount);

        return balance;
    }






    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
