import java.util.Scanner;

public class User {
    private String account;
    private String password;
    private double money;
    public void introduce(){
        System.out.printf("%S's account has a balance of %f dollar", account, money);
    }
    public void expense(double value, Scanner fetch){
        double updatedMoney = money;
        if(money < value){
            System.out.printf("Plan to expense %f dollar but no sufficient funds",value);
        } else {
            System.out.printf("Plan to expense %f dollar \n", value);
            System.out.println("Please input your password: ");
            String inputPassword;
            for (int timeRemains = 3; timeRemains >0; timeRemains--) {
                if(timeRemains>1){
                    inputPassword = fetch.nextLine();
                    if(inputPassword.equals(password)==true){
                        updatedMoney = money - value;
                        System.out.printf("Expense %f dollar and balance %f dollar",value, updatedMoney);
                        break;
                    } else {
                        System.out.printf("password error, there are %d times left to try");
                    }
                }
            }
        }
    }
}
