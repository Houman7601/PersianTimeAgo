package ir.houmansanati.persiantimeago;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ir.houmansanati.perisantimeago.PersianTimeAgo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String timeago = PersianTimeAgo.Companion.getTimeAgo("2019-01-25 02:32:58");
    }
}
