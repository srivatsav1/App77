package com.example.android.app77;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txtStart =(TextView) findViewById(R.id.txtStart);
        Button btnLoop=(Button) findViewById(R.id.btnLoop);
        final TextView txtI=(TextView) findViewById(R.id.txtI);
        final TextView txtSwitch=(TextView) findViewById(R.id.txtSwitch);
        Button btnSwitch=(Button) findViewById(R.id.btnSwitch);

        btnLoop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i=0;i<=10;i++){
                    txtStart.setText(i + "");
                    txtI.setText(i + "");
                }
            }
        });

btnSwitch.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String nameString="Anima Name";
        switch(nameString){

            case "Animal Name":
                txtSwitch.setText("our animal name is animal");
                break;

            default:
                txtSwitch.setText("The name of our animal is something else");
        }
    }
});
    }
}
