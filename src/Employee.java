public class Employee {
    private String name;
    private String title;

    Employee(String name)
    {
        this.name = name;
        title = "None";
    }
    Employee(String name,String title)
    {
        this.name = name;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getName() {


        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}

