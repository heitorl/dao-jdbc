import java.text.SimpleDateFormat;
import java.util.Date;

import model.entities.Department;
import model.entities.Seller;


public class App {
    public static void main(String[] args) {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Department department = new Department(1, "Juridico");        

        Seller seller = new Seller(21, "Fulano", "Fulano@email.com", new Date(), 3000.0, department);

        System.out.println(seller);
    }
}
