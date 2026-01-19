public class Sport {
    private String name;
    private int teamSize;

    public Sport(String name, int teamSize) {
        this.name = name;
        this.teamSize = teamSize;
    }

    public String getName() { return name; }

    @Override
    public String toString() {
        return name + " (Team size: " + teamSize + ")";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sport)) return false;
        Sport s = (Sport) o;
        return name.equals(s.name);
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
