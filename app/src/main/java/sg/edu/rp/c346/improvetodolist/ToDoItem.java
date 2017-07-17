package sg.edu.rp.c346.improvetodolist;

import java.util.Calendar;

import static android.R.attr.data;

/**
 * Created by 15039608 on 17/7/2017.
 */

public class ToDoItem {

    //Define the data items in the row
    private String title;
    private Calendar date;

    public ToDoItem(String title, Calendar date) {
        this.title = title;
        this.date = date;
    }

    //Getter & setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }


    public  String getDateString(){
        String atr = date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)+"/"+date.get(Calendar.YEAR);
        return atr;
    }
    @Override
    public String toString(){
        return "ToDoItem("+
                "title='"+getTitle()+ "\'"+
                ",date="+getDateString()+
                '}';
    }




}
