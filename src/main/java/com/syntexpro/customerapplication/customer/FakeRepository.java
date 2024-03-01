package com.syntexpro.customerapplication.customer;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component("value = FakeDatabase")
public class FakeRepository implements Repository {
    @Override
    public List<Customer> customerRepository() {
        return Arrays.asList(new Customer("John", "Doe", "JD_01", "john.doe@example.com", 1980_01_01, 123_456_7890L),
                new Customer("Jane", "Smith", "JS_02", "jane.smith@example.com", 1985_02_02, 234_567_8901L),
                new Customer("Bob", "Johnson", "BJ_03", "bob.johnson@example.com", 1990_03_03, 345_678_9012L),
                new Customer("Alice", "Williams", "AW_04", "alice.williams@example.com", 1995_04_04, 456_789_0123L),
                new Customer("Charlie", "Brown", "CB_05", "charlie.brown@example.com", 2000_06_06, 567_890_1234L),
                new Customer("David", "Davis", "DD_06", "david.davis@example.com", 1982_06_06, 678_901_2345L),
                new Customer("Eva", "Evans", "EE_07", "eva.evans@example.com", 1987_07_07, 789_012_3456L),
                new Customer("Frank", "Franklin", "FF_08", "frank.franklin@example.com", 1992_08_08, 890_123_4567L),
                new Customer("Grace", "Griffin", "GG_09", "grace.griffin@example.com", 1997_09_09, 901_234_5678L),
                new Customer("Harry", "Harrison", "HH_10", "harry.harrison@example.com", 2002_10_10, 101_234_5678L));
    }
}
