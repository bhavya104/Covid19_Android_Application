package com.example.covid_9;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    private int positionCountry;

    TextView tvCountry,tvCases,tvtodayCases,tvDeaths,tvtodayDeaths,tvRecovered,tvActive,tvCritical;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        positionCountry = intent.getIntExtra("position",0);

        getSupportActionBar().setTitle("Details of "+AffectedCountries.countryModelList.get(positionCountry).getCountry());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        tvCountry = findViewById(R.id.tvCountry);
        tvCases = findViewById(R.id.tvCases);
        tvtodayCases = findViewById(R.id.tvtodayCases);
        tvDeaths = findViewById(R.id.tvDeaths);
        tvtodayDeaths = findViewById(R.id.tvtodayDeaths);
        tvRecovered = findViewById(R.id.tvRecovered);
        tvActive = findViewById(R.id.tvActive);
        tvCritical = findViewById(R.id.tvCritical);

        tvCountry.setText(AffectedCountries.countryModelList.get(positionCountry).getCountry());
        tvCases.setText(AffectedCountries.countryModelList.get(positionCountry).getCases());
        tvtodayCases.setText(AffectedCountries.countryModelList.get(positionCountry).getTodaycases());
        tvDeaths.setText(AffectedCountries.countryModelList.get(positionCountry).getDeaths());
        tvtodayDeaths.setText(AffectedCountries.countryModelList.get(positionCountry).getTodaydeaths());
        tvRecovered.setText(AffectedCountries.countryModelList.get(positionCountry).getRecovered());
        tvActive.setText(AffectedCountries.countryModelList.get(positionCountry).getActivecases());
        tvCritical.setText(AffectedCountries.countryModelList.get(positionCountry).getCriticalcases());

    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }


}
