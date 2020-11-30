public class Mane {
    public static void main(String[] args){
        int balance = 150;
        int transfer = 500;
        int onebonus = 100;

        if (transfer <= 1000) {
            int total = transfer + balance;
            System.out.println(total);

        } else {
            int total = transfer / onebonus + transfer + balance;
            System.out.println(total);
        }


    }

}
