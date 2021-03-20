import java.util.ArrayList;

public class Company {
    String name;
    Office headquarter ;
    ArrayList<Office> offices;
    ArrayList<Department> departments;

    Company(String name)
    {
        this.name = name;
        offices= new ArrayList<>();
        departments = new ArrayList<>();
    }

    public void openDepartment(String departmentName)
    {
        /*Helo*/
        Department temp = new Department(departmentName);
        departments.add(temp);
    }

    public void openOffice(String address)
    {
        Office temp = new Office(address);
        offices.add(temp);
    }

    public void assignHeadquarter(int idxOffice)
    {
        headquarter=offices.get(idxOffice);
    }

    public void assignDepartmentToOffice(int idxDep,int idxOffice)
    {
        offices.get(idxOffice).assignDepartment(departments.get(idxDep));
    }
    public void departmentRecruitEmployee(int idx,String name,String title)
    {
        departments.get(idx).recruitEmployee(name,title);
    }
    public  void departmentAssignManager(int idxDep,int idxEmp)
    {
        departments.get(idxDep).assignManager(idxEmp);
    }


}
