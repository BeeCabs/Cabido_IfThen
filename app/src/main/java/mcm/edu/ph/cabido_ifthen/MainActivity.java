package mcm.edu.ph.cabido_ifthen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDecision1 = findViewById(R.id.btnDecision1);
        Button btnDecision2 = findViewById(R.id.btnDecision2);

        TextView txtLore = findViewById(R.id.txtLore);
        txtLore.setText("You find Xiao on Wangshu Inn's balcony, he seems lost in thought. You have almond tofu with you, will you give the almond tofu to Xiao?");

        btnDecision1.setOnClickListener(this);
        btnDecision2.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){


        TextView txtDecision = findViewById(R.id.txtDecision);





        switch(view.getId()) {
            case R.id.btnDecision1:
                txtDecision.setText("Xiao notices you and quietly accepts the almond tofu, with a rare smile on his face, he thanks you.");
                break;
            case R.id.btnDecision2:
                txtDecision.setText("Xiao looks at you with annoyance, he asks you to leave.");
                break;

        }



    }
}