package CosminPetrea.en.libraries.classes;

import CosminPetrea.en.libraries.enums.Periodicity;
import CosminPetrea.en.libraries.superclass.Library;
import com.github.javafaker.Faker;

import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.function.Supplier;

public class GenerateItem {
    protected static Periodicity randomizePeriodicity() {
        Periodicity[] values = Periodicity.values();
        int randomize = new Random().nextInt(values.length);
        return values[randomize];
    }

    public static void generateItem(int numberOfBooks, int numberOfMagazines, List<Library> myList) {


        Faker faker = new Faker(Locale.ITALY);
        long random = new Random().nextLong();

        Supplier<Books> booksSupplier = () -> new Books(
                random,
                faker.book().title(),
                faker.number().numberBetween(1990, 2024),
                faker.number().numberBetween(100, 1800),
                faker.book().author(),
                faker.book().genre());

        Supplier<Magazine> magazineSupplier = () -> new Magazine(
                random,
                faker.book().title(),
                faker.number().numberBetween(2005, 2024),
                faker.number().numberBetween(20, 300),
                randomizePeriodicity()
        );

        for (int i = 0; i < numberOfBooks; i++) {
            myList.add(booksSupplier.get());
        }

        for (int i = 0; i < numberOfMagazines; i++) {
            myList.add(magazineSupplier.get());
        }

    }
}
