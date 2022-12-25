package Task2;

import java.security.InvalidParameterException;

public class Handler {
    private Handler nextH;
    private final int nominal;

    public Handler(int nominal) {
        this.nominal = nominal;
    }

    public void setNext(Handler next) {
        this.nextH = next;
    }

    public void process(int amount) {
        int quantity = amount / nominal;
        int change = amount % nominal;

        if (nextH == null && change != 0) {
            throw new InvalidParameterException("ATM can`t give such an amount");
        }

        System.out.println("Terminal gave " + quantity + " banknotes of " + nominal);

        if (change != 0) {
            nextH.process(change);
        }
    }
}