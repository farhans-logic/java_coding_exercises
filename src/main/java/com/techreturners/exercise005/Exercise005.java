package com.techreturners.exercise005;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise005 {

    public boolean isPangram(String input) {
        String lowerCaseInput = input.toLowerCase();

        Stream<Character> charStream = lowerCaseInput.chars()
                .filter(item -> ((item >= 'a' && item <= 'z')))
                .mapToObj(c -> (char) c);

        Map<Character, Boolean> alphabetMap =
                charStream.collect(
                        Collectors.toMap(
                                item -> item,
                                k -> Boolean.TRUE,
                                (p1, p2) -> p1));

        return alphabetMap.size() == 26;
    }

}
