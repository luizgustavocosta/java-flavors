package com.costa.luiz.java_flavors.v5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Java 5")
class TigerShould {

    @Test
    void generics() {
        List names = Arrays.asList("Ronaldo", "Messi", "Messi", "Ronaldinho", false);

        Set<String> uniqueNames = new HashSet<String>(names);
        assertEquals(3, uniqueNames.size());
    }

    @Test
    void boxingAutoboxing() {
        long score = 2;
        Long scoreToBeSaved = score;
        Boolean javaRocks = true;
        boolean isJavaTheBest = javaRocks;
    }
}

class Merlin {
    @Deprecated
    public void execute() {
        System.out.println("Merlin");
    }
}

class Tiger extends Merlin {
    @Override
    public void execute() {
        System.out.println("Tiger");
    }
}

