package k12md02converter.firstyearforums;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;

import k12md02converter.firstyearforums.CheckingIn.CheckInMain;
import k12md02converter.firstyearforums.ForumInfo.Info1;

public class FirstScreen extends Activity{

    /**
     *
     * This is the main screen and activity of the forums app. It is organized into 3
     * different parts
     *  1.Forum check in: a button that will direct the user to the forum check-in activity
     *  2. Forum information: A button that will lead to a series of pop-up explaining
     *      to the user what a forum is and how many they need to go to
     *  3. Forum shcedule: This also doubles as the title of the app. This portion consists o
     *      of the title, and 5 speech bubble shaped buttons, each button will direct the user to
     *      the according group and display that groups forum schedule
     *
     * @author Melany Diaz
     * @date November 2015
     * %this is an app build for Mobile Computing 490, Professor Pam Cutter%
     *
     *
     */

    Button checkInBtn;
    Button forumInfoBtn;
    ImageButton group1;
    ImageButton group2;
    ImageButton group3;
    ImageButton group4;
    ImageButton group5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);


        /**
         * The following lines of code will get and declare the 7 buttons that
         * are in this activity
         */
        //Check-in
        checkInBtn= (Button) findViewById(R.id.checkInButton);

        //Forum Information
        forumInfoBtn = (Button) findViewById(R.id.forumButton);


        //Each group button
        group1 = (ImageButton) findViewById(R.id.group1);
        group2 = (ImageButton) findViewById(R.id.group2);
        group3 = (ImageButton) findViewById(R.id.group3);
        group4 = (ImageButton) findViewById(R.id.group4);
        group5 = (ImageButton) findViewById(R.id.group5);


        /**
         * The following will implement the listeners for each of the seven buttons
         * each listener directs the user to the according following activity
         */

        //Check-In
        checkInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Opening check in activity
                Intent i = new Intent(getApplicationContext(), CheckInMain.class);
                startActivity(i);
            }
        });


        //Forum Information
        forumInfoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Opening forum popuips
                Intent i = new Intent(getApplicationContext(), Info1.class);
                startActivity(i);
            }
        });

        //Group1
        group1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Group1.class);
                startActivity(i);
            }
        });

        //Group2
        group2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Group2.class);
                startActivity(i);
            }
        });

        //Group3
        group3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Group3.class);
                startActivity(i);
            }
        });

        //Group4
        group4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Group4.class);
                startActivity(i);
            }
        });

        //Group5
        group5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Group5.class);
                startActivity(i);
            }
        });


    }

}
