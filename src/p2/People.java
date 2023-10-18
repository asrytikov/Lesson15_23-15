package p2;

public class People implements Comparable<People>{

    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public People(int id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(People o) {
        return this.name.compareTo(o.getName()) ;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
