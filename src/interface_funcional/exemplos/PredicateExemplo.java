package interface_funcional.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExemplo {

    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("Java", "Kotlin", "Python", "Javascript", "Go", "C", "Ruby");

        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        palavras.stream()
                .filter(maisDeCincoCaracteres)
                .forEach(System.out::println);

    }

}
