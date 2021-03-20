import java.util.ArrayList;

public class Department {
    String name;
    ArrayList<Employee> employees = new ArrayList<>();
    Employee manager;

    Department(String name)
    {
        this.name = name;
    }


    public void recruitEmployee(String name,String title)
    {
        /*
        * Recruit Employee by name and title
        * */
        Employee e = new Employee(name,title);
        employees.add(e);
    }
    public void releaseEmployee(int idx)
    {
        //Release Employee by Index
        employees.remove(idx);
    }

    //Assign Manager by Employee index
    public void assignManager(int idx)
    {
        manager = employees.get(idx);
        manager.setTitle("Manager");
    }

}
