import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        lista("Enjoy the rest of the day when finished");
    }
     public static void lista(String duties){

     
    ArrayList <String> toDoList = new ArrayList<>();

    toDoList.add("Wash Windows");
    toDoList.add ("Vacum clean the floor");
    toDoList.add("Walk the dog");
    toDoList.add("Buy milk and oatmeal");
    


    toDoList.remove("Walk the dog");
    toDoList.add(2, "Do laundry");

    System.out.println(toDoList + duties +  "!");

 

     }


}
