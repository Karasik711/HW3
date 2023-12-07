package drugs;

public class Component implements Comparable<Component> {
    private String name;
    private String weight;
    private int power;

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public String getWeight() {
        return weight;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", power=" + power +
                '}';
    }

    @Override
    public int compareTo(Component o) {
        int comparisonRes = getName().compareToIgnoreCase(o.getName());
        return Integer.compare(comparisonRes, 0);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Component component = (Component) obj;
        return this.name.equals(component.getName())
                && this.weight.equals(component.getWeight())
                && this.power == component.getPower();
    }

    @Override
    public int hashCode() {
        int res = name == null ? 0 : name.hashCode();
        res += weight == null ? 0 : weight.hashCode();
        res += power;
        return res;
    }
}
