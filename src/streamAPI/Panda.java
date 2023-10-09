package streamAPI;

public class Panda {
    private String title;
    private double weight;

    public Panda(String title, double weight) {
        this.title = title;
        this.weight = weight;
    }

    public String getTitle() {
        return title;
    }

    public double getWeight() {
        return weight;
    }

    public void eatBamboo() {
        weight += 100;
    }

    @Override
    public String toString() {
        return "Panda{" + "title='" + title + '\'' + ", weight=" + weight + '}';
    }
}
