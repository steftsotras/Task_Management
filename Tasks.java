//ASKHSH 2
//Tsotras Stefanos icsd13189
package todo;

import java.util.*;

/**
 *
 * @author Stefanos
 */
public class Tasks 
{
    //DHLWSH METAVLHTWN
    private GregorianCalendar date_time = new GregorianCalendar();
    private String priority, category, description;
    private int year, month, day, hour, min, sec;
    private boolean completion;
    
    
    //CONSTRUCTOR
    public Tasks(String priority, String category, String description, int year, int month, int day, int hour, int min, int sec)
    {
        this.priority = priority;
        this.category = category;
        this.description = description;
        this.year = year;  this.month = month;  this.day = day;
        this.hour = hour;  this.min = min;  this.sec = sec;
        
        date_time.set(year, month, day, hour, min, sec);
        
        
    }
    
    //SETS KAI GETS
    public void setCompletion(boolean comp)
    {
        completion = comp;
    }
    
    public boolean getCompletion()
    {
        return completion;
    }
    
    
    public String getPriority()
    {
        return priority;
    }
    
    public String getCategory()
    {
        return category;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public int getYear()
    {
        return year;
    }
    
    public int getMonth()
    {
        return month;
    }
    
    public int getDay()
    {
        return day;
    }
    
    public int getHour()
    {
        return hour;
    }
    
    public int getMin()
    {
        return min;
    }
    
    public int getSec()
    {
        return sec;
    }
    
    public GregorianCalendar getDate()
    {
        return date_time;
    }
    
    
}
