package com.techreturners.exercise001;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return  firstName.substring(0, 1).toUpperCase() +
                "." +
                lastName.substring(0, 1).toUpperCase();
    }

    public double addVat(double originalPrice, double vatRate) {
        double priceWithVat = originalPrice + (originalPrice * vatRate/100);
        BigDecimal bd = new BigDecimal(priceWithVat).setScale(2, RoundingMode.HALF_UP);
        return  bd.doubleValue();
    }

    public String reverse(String sentence) {
        StringBuilder reverseString = new StringBuilder(sentence);
        return reverseString.reverse().toString();
    }

    public int countLinuxUsers(List<User> users) {
        return (int) users.stream()
                .filter(u -> u.getType().equals("Linux"))
                .count();
    }
}
