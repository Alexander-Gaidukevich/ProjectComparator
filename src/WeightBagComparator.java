import java.util.Comparator;

/**
 *
 */
public class WeightBagComparator implements Comparator<Bag> {
    @Override
    public int compare(Bag o1, Bag o2) {
        return o1.getWeight() - o2.getWeight();
    }
}
