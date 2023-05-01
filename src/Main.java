import java.util.ArrayList;
import java.util.List;

public class Main {
       public static List<Person>personList=new ArrayList<>();
    public static void main(String[] args) {
        while (true){
            System.out.println("Menu" +
                    "\n\t1 - Create" +
                    "\n\t2 - Read All" +
                    "\n\t3 - Read by Id" +
                    "\n\t4 - Update By Id" +
                    "\n\t5 - Delete By id" +
                    "\n\t0 - Exit");
        }
    }
}