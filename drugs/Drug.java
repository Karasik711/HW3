package drugs;
import java.lang.Iterable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class Drug implements Iterable<Component>, Comparable<Drug> {
    private List<Component> components;
    int index;

    public Drug(List<Component> components) {
        Collections.sort(components);
        this.components = components;
        this.index = 0;
    }

    @Override
    public int compareTo(Drug o) {
        int power = getDrugPower();
        int comparison1 = Integer.compare(power, o.getDrugPower());

        return comparison1 == 0 ? compareComponents(o.components) : comparison1;
    }

    public int compareComponents(List<Component> componentsToCompare) {
        int comparedLess = 0;
        int comparedMore = 0;
        for (Component c: this.components) {
            for (Component c1: componentsToCompare) {
                if (c.compareTo(c1) < 0) comparedLess++;
                else if (c.compareTo(c1) > 0) comparedMore++;
            }
        }
        return Integer.compare(comparedMore, comparedLess);
    }

    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() {
            public boolean hasNext() {
                return index < components.size();
            }
            public Component next() {
                return components.get(index++);
            }
        };
    }

    public int getDrugPower(){
        int power = 0;
        for (Component component: components) {
            power += component.getPower();
        }
        return power;
    }

    @Override
    public String toString() {
        return String.format(
                "%s {components: %s, power: %s}%n", this.getClass().getSimpleName(), components, getDrugPower()
        );
    }
}
