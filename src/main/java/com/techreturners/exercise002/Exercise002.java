package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person person) {
        final String MANCHESTER = "Manchester";
        return person.getCity().equals(MANCHESTER);
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
        return person.getAge() >= ageLimit;
    }
    
}
