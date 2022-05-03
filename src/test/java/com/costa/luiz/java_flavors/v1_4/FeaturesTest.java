package com.costa.luiz.java_flavors.v1_4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Java 1.4 Features")
class FeaturesTest {

    @Test
    void assertVariable() {
        String user = "Rock Balboa";
        assert 5 < user.length();
    }

    @Test
    void regex() {
        Pattern pattern =
                Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
                        Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("bill.gates@microsoft.com");
        boolean isValidEmail = matcher.matches();
        assertTrue(isValidEmail);
        Matcher otherMatcher = pattern.matcher("bill.gatesmicrosoft.com");
        isValidEmail = otherMatcher.matches();
        assertFalse(isValidEmail);
    }
}
