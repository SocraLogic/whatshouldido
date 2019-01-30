package uk.co.socralogic.whatshouldidotoday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private AdView mAdView;
    private ScreenState state = ScreenState.HOME;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MobileAds.initialize(this, "ca-app-pub-2704150661150067~1970231025");
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed() {
        if(state == ScreenState.HOME){
            finish();
            super.onBackPressed();
        } else if(state == ScreenState.SUGGESTION){
            state = ScreenState.HOME;
            setContentView(R.layout.activity_main);
        }
    }

    public void loadSunny(View view){
        loadSuggestion(SuggestionsData.SUNNY);
    }
    public void loadWindy(View view){
        loadSuggestion(SuggestionsData.WINDY);
    }
    public void loadSnowy(View view){
        loadSuggestion(SuggestionsData.SNOWY);
    }
    public void loadRainy(View view){
        loadSuggestion(SuggestionsData.RAINY);
    }
    public void loadThunder(View view){
        loadSuggestion(SuggestionsData.THUNDER);
    }
    public void loadCloudy(View view){
        loadSuggestion(SuggestionsData.CLOUDY);
    }

    private void loadSuggestion(String weather){
        List<Suggestion> weatherSuggestions = SuggestionsData.suggestions.get(weather);
        if(weatherSuggestions == null || weatherSuggestions.isEmpty()){
            return;
        }
        int size = weatherSuggestions.size() - 1;
        int index = (size > 0) ? new Random().nextInt(size) : 0;
        if(index >= 0 ) {
            setContentView(R.layout.activity_suggestion);
            TextView suggestionText = findViewById(R.id.suggestionText);
            TextView weatherText = findViewById(R.id.weatherText);
            ImageView weatherImage = findViewById(R.id.weatherImage);

            Suggestion suggestion = weatherSuggestions.get(index);
            weatherImage.setImageResource(suggestion.getImageResourceId());
            suggestionText.setText(suggestion.getSuggestion());
            weatherText.setText(suggestion.getWeather());
            state = ScreenState.SUGGESTION;

            mAdView = findViewById(R.id.adView);
            AdRequest adRequest = new AdRequest.Builder().build();
            mAdView.loadAd(adRequest);
        }
    }
}
