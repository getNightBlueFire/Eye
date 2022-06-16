public class Contract {
    private String name;

    @Override
    public String toString() {
        return "Contract{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }


    public Contract(String name) {
        this.name = name;
    }
}
