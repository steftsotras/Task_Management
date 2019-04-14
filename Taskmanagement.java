//ASKHSH 2
//Tsotras Stefanos icsd13189
package todo;

import java.util.*;

/**
 *
 * @author Stefanos
 */
public class Taskmanagement 
{
    
    //DHLWSH METAVLHTWN
    private ArrayList<Tasks> taskmanager;
    Scanner sc = new Scanner(System.in);
    private GregorianCalendar date_time;
    private Calendar current_time;
    
    //CONSTRUCTOR
    public Taskmanagement()
    {
        taskmanager = new ArrayList<Tasks>();
        CreateTasksManually();
        
    }
    
    //METHODOS EISAGWGHS EKKREMOTHTWN STH LISTA AUTOMATWS
    public void CreateTasksManually(){
        
        taskmanager.add(new Tasks("A", "work", "Make a to do list", 2016, 11, 13, 23, 59, 59));
        taskmanager.add(new Tasks("C", "personal", "Learn Asturias on guitar", 2016, 10, 1, 6, 20, 00));
        taskmanager.add(new Tasks("B", "family", "Go to Athens for Christmas", 2016, 12, 13, 4, 20, 00));
        taskmanager.add(new Tasks("B", "personal", "Meet with girlfriend", 2016, 11, 13, 21, 30, 00));
        taskmanager.add(new Tasks("A", "work", "Get a degree", 2030, 12, 24, 20, 30, 00));
    }
    
    //METHODOS EMFANISHS OLWN TWN EKKREMOTHTWN
    public void showTasks()
    {
        for (int i = 0; i < taskmanager.size(); i++)
        {
            showTask(i);   
        }
    }
    
    //METHODOS EMFANISHS SYGKEKRIMENHS EKKREMOTHTAS
    private void showTask(int i)
    {
        System.out.println("Task " + (i+1) + "\nPriority level: " + taskmanager.get(i).getPriority() + "\nCategory: " + taskmanager.get(i).getCategory() 
        + "\nTask Description: " + taskmanager.get(i).getDescription() + "\nDate(format m/d/y): " + taskmanager.get(i).getDay() + "/" + taskmanager.get(i).getMonth() 
        + "/" + taskmanager.get(i).getYear() + "\nTime(format h/m/s): " + taskmanager.get(i).getHour() + ":" + taskmanager.get(i).getMin() + ":"
        + taskmanager.get(i).getSec() + "\n");    
    }
    
    //METHODOS EISAGWGHS NEAS EKKREMOTHTAS APTON XRHSTH
    public void newTask()
    {
        System.out.println("Please enter the following:\nPriority level (A,B,C)");
        String priority = sc.nextLine();
        System.out.println("Category (work/family/personal)");
        String category = sc.nextLine();
        System.out.println("Task's Description");
        String desc = sc.nextLine();
        System.out.println("Year");
        int year = sc.nextInt();
        System.out.println("Month");
        int month = sc.nextInt();
        System.out.println("Day");
        int day = sc.nextInt();
        System.out.println("Hour");
        int hour = sc.nextInt();
        System.out.println("Minute");
        int min = sc.nextInt();
        System.out.println("Second");
        int sec = sc.nextInt();
            
        taskmanager.add(new Tasks(priority, category, desc, year, month, day, hour, min, sec));
            
        
        
    }
    
    //METHODOS MARKARIMATOS SYGKEKRIMENHS EKKREMOTHTAS WS OLOKLHRWMENH
    public void completionCheck(int i)
    {
        //EISAGWGH WRAS KAI HMEROMHNIAS THS EKKREMOTHTAS SE METAVLHTH
        date_time = taskmanager.get(i).getDate();
        
        //EISAGWGH TWRINHS WRAS KAI HMEROMHNIAS SE METAVLHTH
        current_time = Calendar.getInstance();
        
        //AN H EKKREMOTHTA EXEI KSEPERASEI THN TWRINH WRA
        //KAI HMEROMHNIA TOTE
        if (current_time.after(date_time))
        {
            //THN MARKARW WS OLOKLHRWMENH
            taskmanager.get(i).setCompletion(true);
        }
        //ALLIWS
        else if(current_time.before(date_time))
        {
            //ALLIWS EKKREMEI
            taskmanager.get(i).setCompletion(false);
        }
        
    }
    
    //METHODOS ANAZHTHSHS ERGASIWN POU EKKREMOUN ME VASH THN PROTERAIOTHTA
    public void prioritySearch()
    {
        //EISAGWGH PROTERAIOTHTAS APTON XRHSTH
        System.out.println("Choose priority: A > B > C ");
        String scanner_flush = sc.nextLine();
        String pr = sc.nextLine();
        pr = pr.toLowerCase();
        
        //PSAKSIMO STH LISTA
        for (int i = 0; i < taskmanager.size(); i++)
        {
            //AN H PROTERAIOTHTA TOU TWRINOU STOIXEIOU ISOUTE ME THN EISODO TOU XRHSTH
            if (taskmanager.get(i).getPriority().toLowerCase().equals(pr))
            {
                //TSEKAREI AN EKKREMEI
                completionCheck(i);
                //KAI AN EKKREMEI TO EMFANIZEI
                if(!taskmanager.get(i).getCompletion())
                    { 
                        showTask(i); 
                    }
            }
        }   
         
    } 
    
    //METHODOS ANAZHTHSHS ERGASIWN POU EKKREMOUN ME VASH THN KATHGORIA
    public void categorySearch()
    {
        //EISAGWGH KATHGORIAS APTON XRHSTH
        System.out.println("Select a Category (work/family/personal)");
        String c = sc.nextLine();
        c = sc.nextLine();
        c = c.toLowerCase();
        
        //PSAKSIMO STH LISTA
        for (int i = 0; i < taskmanager.size(); i++)
        {
            //AN H KATHGORIA TOU TWRINOU STOIXEIOU ISOUTE ME THN EISODO TOU XRHSTH
            if(taskmanager.get(i).getCategory().equals(c))
            {
                //TSEKAREI AN EKKREMEI
                completionCheck(i);
                //KAI AN EKKREMEI TO EMFANIZEI
                if(!taskmanager.get(i).getCompletion())
                { 
                    showTask(i); 
                }
            }
        } 
    }
    
    //METHODOS ANAZHTHSHS ERGASIWN GIA SYGKEKRIMENH MERA
    public void daySearch()
    {
        //EISAGWGH HMEROMHNIAS APTON XRHSTH
        System.out.println("Enter Year");
        int y = sc.nextInt();
        System.out.println("Enter Month");
        int m = sc.nextInt();
        System.out.println("Enter Day");
        int d = sc.nextInt();
        
        //AN VREI EKKREMOTHTA STH LISTA ME TH SYGKEKRIMENH HMEROMHNIA THN EMFANIZEI
        for(int i = 0; i < taskmanager.size(); i++)
        {
            if(taskmanager.get(i).getYear() == y)
            {
                if(taskmanager.get(i).getMonth() == m)
                {
                    if(taskmanager.get(i).getDay() == d)
                    {
                        showTask(i);
                    }
                }
            } 
        }
    }
    
    
    //METHODOS ANAZHTHSHS ERGASIWN POU EKKREMOUN MEXRI MIA SYGKEKRIMENH HMEROMHNIA
    public void pendingSearch()
    {
        //EISAGWGH HMEROMHNIAS KAI WRAS APTON XRHSTH
        System.out.println("Enter a date and time. The tasks pending until that time will be shown.\nYear");
        int y = sc.nextInt();
        System.out.println("Month");
        int m = sc.nextInt();
        System.out.println("Day");
        int d = sc.nextInt();
        System.out.println("Hour");
        int h = sc.nextInt();
        System.out.println("Minute");
        int mnt = sc.nextInt();
        System.out.println("Second");
        int s = sc.nextInt();
        
        //PSAKSIMO STH LISTA
        for (int i = 0; i < taskmanager.size(); i++)
        {
            //DHLWSH THS METAVLHTHS WS GREGORIAN CALENDAR
            //GIA NA MPOREI NA SYGKRITHEI ME THN BEFORE
            date_time = new GregorianCalendar();
            //EISAGWGH TWN STOIXEIWN POU EDWSE O XRHSTHS
            //STHN METAVLHTH
            date_time.set(y, m, d, h, mnt, s);
            
            //SYGKRISH HMEROMHNIAS KAI WRAS ME THN METHODO BEFORE
            if(taskmanager.get(i).getDate().before(date_time))
            {
                //TSEKAREI AN EKKREMEI
                completionCheck(i);
                //KAI EMFANIZEI AN EKKREMEI
                if(!taskmanager.get(i).getCompletion()) 
                { 
                    showTask(i); 
                }
            }
        }
        
        
    }
    
    //METHODOS EMFANISHS ISTORIKOU ME OLES TIS OLOKLHRWMENES ERGASIES
    public void completionSearch()
    {
        //PSAKSIMO STH LISTA
        for(int i = 0; i < taskmanager.size(); i++)
        {
            //TSEKAREI AN EKKREMEI
            completionCheck(i);
            //KAI EMFANIZEI AN DEN EKKREMEI
            if(taskmanager.get(i).getCompletion())
            { 
                showTask(i); 
            }

        }
        
    }
    
    
    
}
