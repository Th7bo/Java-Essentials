package oefeningen.oefening2;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class BingoKaart {

    private String name;
    private ArrayList<Integer> numbers = new ArrayList<>();

    public BingoKaart(String name) {
        this.name = name;
    }

    public void addNumber(int number) {
        numbers.add(number);
    }

    public boolean hasNumber(int number) {
        return numbers.contains(number);
    }

    public String toString() {
        return String.format("%s: %s", name, numbers.toString());
    }
}
