package com.company;
import java.math.BigDecimal;
import java.math.BigInteger;
public class Main {

    public static void main(String[] args) {
	    BigInteger letters;
	    letters = BigInteger.valueOf(5726398);
	    letters = letters.multiply(BigInteger.valueOf(38041430));
	    letters = letters.multiply(BigInteger.valueOf(26059203));
        BigDecimal cost = BigDecimal.valueOf(3.23);
        BigDecimal let = new BigDecimal(letters);
        cost = cost.multiply(let);
        System.out.printf("Letters: " +letters+"\n");
        System.out.printf("Cost: $" + cost);
    }
}
