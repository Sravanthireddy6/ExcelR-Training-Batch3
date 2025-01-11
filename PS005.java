import java.util.*;
class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "Employee [Id=" + id + ", Name=" + name + ", Department=" + department + ", Salary=" + salary + "]";
    }
}
class CollectionMap {
    private Map<Integer, Employee> employeeMap;

    
    public CollectionMap() {
        this.employeeMap = new HashMap<>();
    }
    public Map<Integer, Employee> getEmployeeMap() {
        return employeeMap;
    }

    public void setEmployeeMap(Map<Integer, Employee> employeeMap) {
        this.employeeMap = employeeMap;
    }
    public int addEmployee(Employee emp) {
        if (emp == null) {
            return 1;
        }
        if (employeeMap.containsKey(emp.getId())) {
            return 2; 
        }
        employeeMap.put(emp.getId(), emp);
        return 0; 
    }
    public int removeEmployee(int employeeId) {
        if (employeeMap == null) {
            return 1; 
        }
        if (!employeeMap.containsKey(employeeId)) {
            return 2; 
        }
        employeeMap.remove(employeeId);
        return 0;
    }
    public Employee findEmployee(int employeeId) {
        return employeeMap.getOrDefault(employeeId, null);
    }
    public List<Employee> getEmployeeList() {
        if (employeeMap.isEmpty()) {
            return null;
        }
        return new ArrayList<>(employeeMap.values());
    }
}
public class PS005 {
    public static void main(String[] args) {
        CollectionMap collectionMap = new CollectionMap();
        Employee emp1 = new Employee(1, "Sravanthi", "HR", 50000);
        Employee emp2 = new Employee(2, "Bindhu", "IT", 70000);
        Employee emp3 = new Employee(3, "Bhargavi", "Finance", 60000);
        System.out.println("Add Employee 1: " + collectionMap.addEmployee(emp1));
        System.out.println("Add Employee 2: " + collectionMap.addEmployee(emp2)); 
        System.out.println("Add Employee 1 Again: " + collectionMap.addEmployee(emp1)); 
        System.out.println("Find Employee 2: " + collectionMap.findEmployee(2)); 
        System.out.println("Find Employee 4: " + collectionMap.findEmployee(4)); 
        System.out.println("Remove Employee 2: " + collectionMap.removeEmployee(2)); 
        System.out.println("Remove Employee 2 Again: " + collectionMap.removeEmployee(2)); 
        System.out.println("Employee List: " + collectionMap.getEmployeeList()); 
        collectionMap.removeEmployee(1);
        collectionMap.removeEmployee(3);
        System.out.println("Employee List (Empty): " + collectionMap.getEmployeeList()); 
    }
}