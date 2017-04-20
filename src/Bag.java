/**
 *
 */
public class Bag {
    private String producer;
    private String color;
    private int weight;

    public Bag(String producer, String color, int weight) {
        this.producer = producer;
        this.color = color;
        this.weight = weight;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bag bag = (Bag) o;

        if (weight != bag.weight) return false;
        if (!producer.equals(bag.producer)) return false;
        return color.equals(bag.color);
    }

    @Override
    public int hashCode() {
        int result = producer.hashCode();
        result = 31 * result + color.hashCode();
        result = 31 * result + weight;
        return result;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "producer='" + producer + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
