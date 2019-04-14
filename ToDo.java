//ASKHSH 2
//Tsotras Stefanos icsd13189
package todo;

import java.util.*;

/**
 *
 * @author Stefanos
 */
public class ToDo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        Taskmanagement admin = new Taskmanagement();
        Scanner sc = new Scanner(System.in);

        int action;
        String cont = "y";
        
        //MENU EPILOGWN
        while(cont.equals("y"))
        {
            System.out.println("  Main Menu \nPress 1 to 7 to select one of the following \n1.Insert a task \n2.Show the To Do list"
            + "\n3.Search by Priority \n4.Search by Category \n5.Search by Day \n6.Pending tasks \n7.Check which tasks are completed");
            action = sc.nextInt();
            
            switch(action)
            {
                case 1:
                    admin.newTask();
                    break;
                case 2:
                    admin.showTasks();
                    break;
                case 3:
                    admin.prioritySearch();
                    break;
                case 4:
                    admin.categorySearch();
                    break;
                case 5:
                    admin.daySearch();
                    break;
                case 6:
                    admin.pendingSearch();
                    break;
                case 7:
                    admin.completionSearch();
                    break;
                default:
                    System.out.println("Choose a number between 1 and 7");
                    break;
            }
            
            String scanner_flush = sc.nextLine();
            
            System.out.println("Press any character to quit, or 'y' to continue");
            cont = sc.nextLine();
        }
    } 
}
