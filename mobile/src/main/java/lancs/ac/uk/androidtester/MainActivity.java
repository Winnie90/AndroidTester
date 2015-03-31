package lancs.ac.uk.androidtester;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import lancs.ac.uk.androidtester.view.LoginActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startLogin();
    }

    private void startLogin() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
