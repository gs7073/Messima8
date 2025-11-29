package com.example.messima8.Q1;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class LibraryManager {

    public static void main(String[] args) {

        Map<UUID, LibraryItem> inventory = new HashMap<>();

        Book b1 = new Book("Split Cherry Tree", 1939, "Jesse Stuart", 180);

        Book b2 = new Book("Mr Know All", 1925, "W. Somerset Maugham", 90);
        Book b3 = new Book("The Road Not Taken", 1916, "Robert Frost", 0);

        Magazine m1 = new Magazine("Vogue Magazine", 1892, 1, "Anna Wintour");
        Magazine m2 = new Magazine("W Magazine", 1972, 2, "Sara Moon");

        inventory.put(b1.getItemId(), b1);
        inventory.put(b2.getItemId(), b2);
        inventory.put(b3.getItemId(), b3);

        inventory.put(m1.getItemId(), m1);
        inventory.put(m2.getItemId(), m2);

        UUID savedId = b1.getItemId();

        LibraryItem foundItem = inventory.get(savedId);
        System.out.println("Found item: " );

        System.out.println(foundItem);

        UUID otherId = UUID.randomUUID();

        LibraryItem otherItem = inventory.get(otherId);

        if (otherItem == null) {
            System.out.println("No item for this UUID ");
        }

        b1.borrow();
        m2.borrow();

        System.out.println("Late fees :");
        for (LibraryItem item : inventory.values()) {

            if (item.isBorrowed() == true) {

                double fee = item.calculateLateFee(10);
                System.out.println(item);
                System.out.println("Fee is " + fee);
            }
        }

        String searchText = "Cherry";

        System.out.println("Search results : " + searchText);

        for (LibraryItem item : inventory.values()) {

            if (item instanceof Searchable) {
                Searchable s = (Searchable) item;
                if (s.matches(searchText)) {

                    System.out.println(item);
                }
            }
        }
    }
}
