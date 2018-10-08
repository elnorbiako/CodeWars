package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Plugboard {

    List<String> pairs = new ArrayList<>();

    public Plugboard(String wires) throws InvalidPlugboardWiresException {

        if (wires.length() % 2 != 0) {
            throw new InvalidPlugboardWiresException("Incorrect number of wires");
        } else if (wires.length() > 19) {
            throw new InvalidPlugboardWiresException("Repetitions!");
        } else if (verifyRepetitions(wires) > 0) {
            throw new InvalidPlugboardWiresException("Repetitions!");}
        pairs = Arrays.asList(wires.split("(?<=\\G.{2})"));
    }

    public String process(String wire) {

        for (String pair: pairs) {
            if (pair.contains(wire)) {
                return String.valueOf(pair.charAt(1-pair.indexOf(wire)));
            }
        }
        return wire;
    }

    public int verifyRepetitions (String wires) {
        int count = 0;
        for (int i = 0; i < wires.length() - 1; i++) {
            for (int j = i + 1; j < wires.length(); j++) {

                if(wires.charAt(i)==wires.charAt(j)){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        try {
            Plugboard plugboard = new Plugboard("ABCD");

            System.out.println(plugboard.process("A"));

        } catch (InvalidPlugboardWiresException e) {
            e.printStackTrace();
        }

    }
}
