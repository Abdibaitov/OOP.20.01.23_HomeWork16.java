public class Eagle extends Animal{

    private String name;

    public Eagle(String name) {
        this.name = name;
    }

    public Eagle() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void fly(){
        System.out.println("Eagle is flying ");
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "name='" + name + '\'' +
                '}';
    }
}
