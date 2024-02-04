package src;

import dk.brics.automaton.*;

import java.util.Set;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner ObjRegex = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Regex");
        String Reg = ObjRegex.nextLine();  // Read user input

        Scanner ObjString = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter testString");
        String testString = ObjString.nextLine();  // Read user input

        RegExp r = new RegExp(Reg);
        Automaton A = r.toAutomaton(false);
        A.setDeterministic(false);
        //State start = A.getInitialState();
        long begin = System.nanoTime();
        A.run(testString);

        long finish = System.nanoTime();
        long timeElapsed = finish - begin;
        long timeElapsedseconds = timeElapsed;
        //test regex: ^(a+)+$
        //test regex 2:
        //Set goodStates=A.getAcceptStates();

        Set states = A.getLiveStates();

        //boolean nfa = A.isDeterministic();
        //Integer numStates = A.getNumberOfStates();
        //Integer numTransitions = A.getNumberOfTransitions();
        //SET ACCEPT BELOW
        //Set accept = A.getAcceptStates();
        //System.out.println("TRANSITION NUMBER");
        //System.out.println(numTransitions);
        //System.out.println("STATES NUMBER");
        //System.out.println(numStates);
        //System.out.println("STATES");
        //System.out.println(states);
        //System.out.println("FIRST STATE");
        //System.out.println(start);
        //System.out.println(goodStates);

        System.out.println(states);
        System.out.println("nanoseconds");
        System.out.println(timeElapsedseconds);

        //System.out.println(nfa);

        System.out.println("Program ended");
    }
}
