package homework58_OV;

import java.util.List;

public class DeveliperAppl {
    public static void main(String[] args) {
        List<Developer> developers = List.of(
                new Developer("John Smith", "Berlin", List.of(
                        new Task(1, "make header", Status.UNDONE),
                        new Task(2, "make footer", Status.DONE)
                )),
                new Developer("Bob Marley", "Paris", List.of(
                        new Task(3, "buy baguette", Status.UNDONE),
                        new Task(4, "eat croissant", Status.DONE)
                        ))
        );
        List<Task> undoneTaskList =
                developers
                        .stream()
                        .filter(d -> d.getCity().equals("Berlin"))
                        .flatMap(d -> d.getTasks().stream()
                                .filter(t -> !t.getStatus()
                                        .equals(Status.DONE))).toList();

        System.out.println(undoneTaskList);
    }
}
