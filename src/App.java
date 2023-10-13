import java.text.SimpleDateFormat;


import model.entities.Department;


public class App {
    public static void main(String[] args) {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Department department = new Department(1, "Juridico");        

        System.out.println(department);
    }
}
