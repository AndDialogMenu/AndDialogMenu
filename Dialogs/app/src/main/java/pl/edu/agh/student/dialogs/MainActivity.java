package pl.edu.agh.student.dialogs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v4.app.FragmentManager;

public class MainActivity extends AppCompatActivity {
    FragmentManager fm = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void open(View view){
        DialogFragmentExtended dialogFragmentExtended = new DialogFragmentExtended();
        dialogFragmentExtended.show(fm, "Alert Dialog Fragment");
    }
}