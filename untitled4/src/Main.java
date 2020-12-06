public class Main {
    public static void main(String[] args){
        int balance = 150;
        int transfer = 500;
        int onebonus = 100;
        int total;

        if (transfer <= 1000) {
            total = transfer + balance;

        } else {
            total = transfer / onebonus + transfer + balance;
        }
        System.out.println(total);
    }

}
