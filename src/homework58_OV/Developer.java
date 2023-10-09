package homework58_OV;

import java.util.List;

public class Developer {

    private String name;
    private String city;
    private List<Task> tasks;

    public Developer(String name, String city, List<Task> tasks) {
        this.name = name;
        this.city = city;
        this.tasks = tasks;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        return "Developer{" + "name='" + name + '\'' + ", city='" + city + '\'' + ", tasks=" + tasks + '}';
    }
}
