package streamAPI;

import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

//        forEach (для него не надо открывать stream)
//        method reference

        List<Panda> pandas = List.of(
                new Panda("Po", 60_000),
                new Panda("Boo", 65_000),
                new Panda("Small Jay", 40_000)
        );

//        Если надо изменить исходные значения - мутировать их.
//        Method ref: ClassName :: methodName

//      Операции бывают:
//      - intermediate - промежуточные
//      - terminal - конечные, после которых продолжение операций невозможно

//        - terminal

        pandas.forEach(Panda::eatBamboo);
        System.out.println(pandas);

//        reduce - сведение к какому-то значению

        double totalWeight = pandas.stream()
                .map(Panda::getWeight)
                .reduce(0., Double::sum); // (a, b) -> a + b

//        findFirst
        Optional<Panda> panda =
        pandas.stream().filter(a -> a.getTitle().equals("Po")).findFirst();

//        anyMatch использует predicate, т.е. проверяет есть ли элемент, удовлетворяющий условию

        boolean poExists = panda.stream().anyMatch(p -> p.getTitle().equals("Po"));
        System.out.println(poExists);

//        allMatch использует predicate, т.е. проверяет все ли элементы, удовлетворяют условию

        boolean allPandasArePo = panda.stream().allMatch(p -> p.getTitle().equals("Po"));
        System.out.println(allPandasArePo);

//        - intermediate

//        limit - возвращает указанное кол-во элементов, начиная с первого

        List<String> animals = List.of("Panda", "Lion", "Giraffe", "Monkey", "Rat");
        List<String> listLimit = animals.stream().limit(2).toList();
        System.out.println(listLimit);

//        skip - пропускает указанное количество элементов

        List<String> skippedAnimals = animals.stream().skip(2).toList();
        System.out.println(skippedAnimals);

//        distinct - оставляет только уникальные элементы

        animals = List.of("Panda", "Lion", "Monkey", "Giraffe", "Monkey", "Rat");
        List<String> uniqueAnimals = animals.stream().distinct().toList();
        System.out.println(uniqueAnimals);

//        sorted
//        сортируем по количеству букв в словах
        List<String> sortedAnimals = animals.stream().sorted((a, b) -> Integer.compare(a.length(), b.length())) //  a.length() - b.length()
                                                                     // Comparator.compareInt(String :: length)

                .toList();
        System.out.println(sortedAnimals);
    }
}
