package Task2;

public class ATM {
    public static void process(int amount) {
        Handler handler5 = new Handler5();
        Handler handler17 = new Handler17();
        Handler handler50 = new Handler50();
        handler50.setNext(handler17);
        handler17.setNext(handler5);
        handler50.process(amount);
    }
    public static void main(String[] args) {
        ATM.process(144);
    }
}
