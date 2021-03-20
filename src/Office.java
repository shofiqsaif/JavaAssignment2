import java.util.ArrayList;

public class Office {
    String address;
    ArrayList<Department> departments = new ArrayList<>();

    Office(String address)
    {
        this.address = address;
    }

    public void assignDepartment(Department department)
    {
        departments.add(department);
    }
    public void releaseDepartment(int idx)  // By index
    {
        departments.remove(idx);
    }
}
