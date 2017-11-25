package khangit96.tdmuteamfhome.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import khangit96.tdmuteamfhome.R;

public class MainAppAcivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_app_acivity);

        Button btnTimPhong, btnTraCuu, btnTuVan;

        btnTimPhong = (Button) findViewById(R.id.btnTimPhongTro);
        btnTraCuu = (Button) findViewById(R.id.btnTraCuuBHXH);
        btnTuVan = (Button) findViewById(R.id.btnTuVanPhapLuat);

        btnTimPhong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainAppAcivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnTraCuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainAppAcivity.this, SearchBHXHActivity.class);
                startActivity(intent);
            }
        });

        btnTuVan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainAppAcivity.this, LegalAdviceActivity.class);
                startActivity(intent);
            }
        });
    }


}
