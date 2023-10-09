package homework59;

import java.util.List;

public class ProductAppl {
    public static void main(String[] args) {
        /*
        Создайте класс товар Product с полями:
        название
        рейтинг
        цена
        категория
        Создайте лист из 10 товаров с разными значениями

        Задание 1
        Получите лист товаров, которые стоят дороже 200 евро.

        Задание 2
        Получите лист товаров, отсортированных по рейтингу

        Задание 3
        Проверьте есть ли в листе товаров, товар с названием: "Iphone XR"

        Задание 4 map
        Создайте новый лист товаров на основании старого, пусть в новом листе рейтинг будет увеличен на 1.
        Товары в исходном листе не должны измениться.

        Задание 5 forEach
        Измените цену товаров в исходном листе товаров: увеличьте ее на 20 евро.
        Товары в исходном листе должны измениться.

        Задание 6 reduce
        Посчитайте общую стоимость всех товаров в листе.
        */

        List<Product> smartphones = List.of(
                new Product("iPhone XR", "smartphones", 260.70, 4.0),
                new Product("iPhone 14 Pro", "smartphones", 1020.00, 4.5),
                new Product("Samsung Galaxy S23", "smartphones", 850.90, 4.2),
                new Product("Xiaomi 13T Pro", "smartphones", 890.99, 3.5),
                new Product("Samsung Galaxy A54", "smartphones", 450.0, 4.5),
                new Product("Xiaomi Redmi 10", "smartphones", 120.50, 4.5),
                new Product("Google Pixel 8", "smartphones", 799.0, 0),
                new Product("Motorola moto g14 ", "smartphones", 149.90, 4.1),
                new Product("Motorola edge40 neo", "smartphones", 399.99, 3.7),
                new Product("ZTE Smartphone Blade A32", "smartphones", 69.99, 3.5)
        );

//        1.
        List<Product> smartphonesSelected = smartphones.stream().filter(s -> s.getPrice() > 200).toList();
        System.out.println(smartphonesSelected);

        System.out.println("----------------------- 2 --------------------------");
//        2.
        List<Product> sphonesRateSorted = smartphones.stream().sorted((a, b) -> Double.compare(a.getRate(), b.getRate())).toList();
        System.out.println(sphonesRateSorted);

        System.out.println("----------------------- 3 --------------------------");
//        3.
        System.out.println(smartphones.stream().anyMatch(s -> s.getTitle().equalsIgnoreCase("Iphone XR")));

        System.out.println("----------------------- 4 --------------------------");
//        4.
        List<Double> listSmrtPhsModifiedRates = smartphones.stream().map(s -> s.getRate() + 0.5).toList();
        System.out.println(listSmrtPhsModifiedRates);
        smartphones.forEach(s -> System.out.print(s.getRate() + ", "));
        System.out.println();

        System.out.println("----------------------- 5 --------------------------");
//        5.
        smartphones.forEach(s -> s.setPrice(s.getPrice() + 20.0));
        System.out.println(smartphones);

        System.out.println("----------------------- 6 --------------------------");
//        6.
        Double pricesSum = smartphones.stream().map(Product::getPrice).reduce(0., Double::sum);
        System.out.println(pricesSum);

    }
}
