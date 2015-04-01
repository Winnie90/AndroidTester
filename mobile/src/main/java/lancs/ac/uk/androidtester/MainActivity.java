package lancs.ac.uk.androidtester;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import lancs.ac.uk.androidtester.view.LoginViewActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataStoreManager.getInstance();
        startLogin();
    }

    private void startLogin() {
        Intent intent = new Intent(this, LoginViewActivity.class);
        startActivity(intent);
        finish();
    }
}
