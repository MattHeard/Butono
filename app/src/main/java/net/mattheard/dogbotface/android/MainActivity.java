package net.mattheard.dogbotface.android;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import net.mattheard.dogbotface.R;
import net.mattheard.dogbotface.core.Logger;
import net.mattheard.dogbotface.core.Torso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpDanceButton();
    }

    private void setUpDanceButton() {
        addClickListener(getButton());
    }

    private void addClickListener(final Button button) {
        button.setOnClickListener(getClickListener());
    }

    private View.OnClickListener getClickListener() {
        return new ClickListener(getTorso());
    }

    private Torso getTorso() {
        return new Torso(getLogger());
    }

    private Logger getLogger() {
        return new SnackbarLogger(getMainLayout());
    }

    private View getMainLayout() {
        return findViewById(R.id.layout);
    }

    private Button getButton() {
        return (Button) findViewById(R.id.button);
    }

}
