package lancs.ac.uk.androidtester.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import lancs.ac.uk.androidtester.R;
import lancs.ac.uk.androidtester.objects.Survey;

public class SurveyListViewActivity extends ActionBarActivity {
    Survey[] surveys={
        new Survey("Survey1"),
        new Survey("Survey2"),
        new Survey("Survey3")
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_list_view_layout);

        ArrayAdapter<Survey> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, surveys
        );

        ListView surveyList = (ListView) findViewById(R.id.listView);
        surveyList.setAdapter(adapter);

        surveyList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1,int pos, long arg3) {
                Intent i= new Intent(SurveyListViewActivity.this, SurveyViewActivity.class);
                i.putExtra("survey_id", surveys[pos].toString());
                startActivity(i);
            }
        });
    }

    public void getSurveyData() {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
