package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        removeWhiteSpaces("Hello and welcome!");
        removeElementDividedByThree();
    }
    public static void removeWhiteSpaces(String str){
        String removedWhiteSpaceStr = str.chars().filter(c -> !Character.isWhitespace(c)).mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
        System.out.println(removedWhiteSpaceStr);
        Optional<String> first = Stream.of(str).map(c->c.replaceAll(" ","")).findFirst();
        first.ifPresent(System.out::println);
    }
    public static void removeElementDividedByThree(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream().filter(i->i%3==0).collect(Collectors.toList());
        System.out.println(list);
    }
}
