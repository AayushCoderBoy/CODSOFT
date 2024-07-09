import java.util.Scanner;

class ATM {
    private int amount;
    private int withdraw;
    private int money;

    public void setDeposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the deposit amount: ");
        money = sc.nextInt();
        amount = amount + money;
        System.out.println("Rupeess " + amount + " Deposited Susscessfully !");
    }

    public void setWithdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the withdrawal amount: ");
        withdraw = sc.nextInt();
        if (withdraw > amount) {
            System.out.println("Low Balance");
        }
        amount = amount - withdraw;
        System.out.println("Rupeess " + withdraw + " Withdraw Successfully ");
    }

    public int getBalance() {
        return amount;
    }
}

public class Task3 {
    public static void main(String[] args) {
        ATM obj = new ATM();
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Press 1 to Deposite money");
            System.out.println("Press 2 to Withdraw money");
            System.out.println("Press 3 to Check Balance");
            System.out.print("Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    obj.setDeposit();
                    break;
                case 2:
                    obj.setWithdraw();
                    break;
                case 3:
                    System.out.println("Current balance = " + obj.getBalance());
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        }
    }
}
