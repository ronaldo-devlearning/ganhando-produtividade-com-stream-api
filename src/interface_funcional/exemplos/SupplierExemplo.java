package interface_funcional.exemplos;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExemplo {

    public static void main(String[] args) {

        Supplier<String> saudacao = () -> "Olá, seja bem vindo!";

        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .toList();

        listaSaudacoes.forEach(System.out::println);

    }

}
