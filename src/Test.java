import java.io.PrintStream;

public class Test {


    public static void main(String[] args) {
        var out = System.out;
        String name1 = "Google";
        Company c1 = new Company(name1);


        c1.openOffice("London");
        c1.openOffice("New York");

        c1.openDepartment("IT");
        c1.openDepartment("HR");
        c1.openDepartment("ADMIN");


        /*c1.offices.get(0).assignDepartment(c1.departments.get(0));*/


        /*Department Recruiting People*/
        //DEPARTMENT IT
        c1.departmentRecruitEmployee(0,"Kamal","Employee");
        c1.departmentRecruitEmployee(0,"Jamal","Employee");
        c1.departmentRecruitEmployee(0,"Hashem","Employee");
        c1.departmentAssignManager(0,1);

        //Department HR
        c1.departmentRecruitEmployee(1,"John","Employee");
        c1.departmentRecruitEmployee(1,"Joshim","Employee");
        c1.departmentAssignManager(1,0);

        //Department ADMIN
        c1.departmentRecruitEmployee(2,"Sakib","Employee");
        c1.departmentRecruitEmployee(2,"Shamin","Employee");
        c1.departmentRecruitEmployee(2,"Sajan","Employee");
        c1.departmentAssignManager(2,2);


        //Assigning Department 0,1 to Office 0("London")
        c1.assignDepartmentToOffice(0,0);
        c1.assignDepartmentToOffice(1,0);
        c1.assignDepartmentToOffice(2,1);

        c1.assignHeadquarter(1);



        //Showing Relations...
        //Print CompanyName and Basic Info
        out.println("Company Name : " + c1.name);
        out.println("Company Headquarter : " + c1.headquarter.address);
        out.println("Has " + c1.departments.size() + " departments.");
        out.println("Has " + c1.offices.size() + " offices.");


        out.print("\n");

        //Showing Officess with it's departments
        for (var o: c1.offices)
        {
            out.print("Office of " + o.address + " has following Departments : ");
            for (var d : o.departments)
            {
                out.print(d.name + "  ");
            }
            out.println();
        }


        //Dertail info about office,department toward employee
        out.println("\nLet's look at the indivisual office...");
        for(var o: c1.offices)
        {
            out.println("OFFICE OF " + (o.address).toUpperCase() + " :");
            for(var d: o.departments)
            {
                out.println("In Department " + d.name + "  we have following people: ");
                for(var e: d.employees)
                {
                    out.println(e.getName() + " works as " + e.getTitle());
                }
                out.println();
            }
            out.println();
        }


    }
}
