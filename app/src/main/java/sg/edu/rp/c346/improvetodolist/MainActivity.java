package sg.edu.rp.c346.improvetodolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ListView lvToDo;
    ArrayList<ToDoItem> toDoIist;
    CustomAdapter caToDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo=(ListView)findViewById(R.id.lvToDo);
        toDoIist = new ArrayList<ToDoItem>();

        caToDo = new CustomAdapter(this, R.layout.todoitem_row,toDoIist);
        lvToDo.setAdapter(caToDo);

        Calendar d1 = Calendar.getInstance(); //create a calendar object with current date/time
        d1.set(2016,10,1); // set it to a new date
        ToDoItem item1 = new ToDoItem("MSA",d1);//create a ToDoItem object named item1
        toDoIist.add(item1);// add the ToDoitem object to the todolist arraylist

        Calendar d2 = Calendar.getInstance();
        d1.set(2016,9,20);
        ToDoItem item2 = new ToDoItem("Go for haircut",d2);
        toDoIist.add(item2);
    }
}
