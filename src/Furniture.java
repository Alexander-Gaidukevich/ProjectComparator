/**
 *
 */
public class Furniture implements Comparable<Furniture> {
    private String name;
    private String wood;
    private int cost;

    public Furniture(String name, String wood, int cost) {
        this.name = name;
        this.wood = wood;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWood() {
        return wood;
    }

    public void setWood(String wood) {
        this.wood = wood;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Furniture furniture = (Furniture) o;

        if (cost != furniture.cost) return false;
        if (!name.equals(furniture.name)) return false;
        return wood.equals(furniture.wood);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + wood.hashCode();
        result = 31 * result + cost;
        return result;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "name='" + name + '\'' +
                ", wood='" + wood + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public int compareTo(Furniture o) {
        return cost - o.getCost();
    }
}
