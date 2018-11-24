package myitschool.com.timer;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView timerText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timerText = findViewById(R.id.timer);
    }

    public void startTime(View view) {

    }

    public void setTimer(View view) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        View timerView = getLayoutInflater().inflate(R.layout.timer_picker, null);
        dialog.setView(timerView);

        final AlertDialog timerDialog = dialog.create();
        timerDialog.setTitle("Сет таймер");
        Button button = timerView.findViewById(R.id.button);
        final EditText editText = timerView.findViewById(R.id.pickedTime);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timerText.setText(editText.getText());
                timerDialog.hide();
            }
        };

        button.setOnClickListener(listener);
        timerDialog.show();
    }


}
