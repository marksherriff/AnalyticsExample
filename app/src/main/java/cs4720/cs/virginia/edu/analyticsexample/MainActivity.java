package cs4720.cs.virginia.edu.analyticsexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.analytics.FirebaseAnalytics;

public class MainActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
    }

    public void selectFeature1(View view) {
        Toast.makeText(this, "Tychonievich is very smart.  He likes Feature 1.  So you are smart too!", Toast.LENGTH_LONG).show();
        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, "Feature 1");
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "Feature 1");
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
    }

    public void selectFeature2(View view) {
        Toast.makeText(this, "Bloomfield thinks Feature 2 is awesome, so y'all are besties now!", Toast.LENGTH_LONG).show();
        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, "Feature 2");
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "Feature 2");
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
    }

    public void selectFeature3(View view) {
        Toast.makeText(this, "You looked into Floryan's mind and saw that Feature 3 was the best!", Toast.LENGTH_LONG).show();
        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, "Feature 3");
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "Feature 3");
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
    }

    public void selectFeature4(View view) {
        Toast.makeText(this, "Horton hears that Feature 4 rocks!", Toast.LENGTH_LONG).show();
        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, "Feature 4");
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "Feature 4");
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
    }
}
