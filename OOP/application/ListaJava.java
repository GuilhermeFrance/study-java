
import java.util.*;
import OOP.entities.EmployeeEntity;

public class ListaJava {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<EmployeeEntity> list = new ArrayList<>();
        System.out.print("How many employee will be registered?");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Employee #" + (i + 1) + ":");

            System.out.println("Id: ");
            Integer id = sc.nextInt();
            while(hasId(list, id)){
                System.out.println("This id alread exists, try again: ");
            }

            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.println("Salary: ");
            Double salary = sc.nextDouble();

            EmployeeEntity emp = new EmployeeEntity(id, name, salary);

            list.add(emp);

        }

        System.out.print("Enter the employee id that will have salary increased: ");
        int id_salary = sc.nextInt();
        EmployeeEntity emp = list.stream().filter(x -> x.getId() == id_salary).findFirst().orElse(null);
        // Integer pos = position(list, id_salary);
        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println("List of employees: ");

        for (EmployeeEntity e : list) {
            System.out.println(e);
        }

        sc.close();
    }

    public static Integer position(List<EmployeeEntity> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<EmployeeEntity> list, int id){
        EmployeeEntity emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
