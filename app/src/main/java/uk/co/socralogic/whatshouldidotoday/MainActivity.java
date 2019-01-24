package uk.co.socralogic.whatshouldidotoday;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static final String SUNNY = "sunny";
    public static final String WINDY = "windy";
    public static final String CLOUDY = "cloudy";
    public static final String THUNDER = "thunder";
    public static final String SNOWY = "snowy";
    public static final String RAINY = "rainy";

    private final List<Suggestion> sunnySuggestions = new ArrayList<Suggestion>(){{
        add(new Suggestion("Sunny", "Sun Suggestion", R.drawable.sunny));
    }};

    private final List<Suggestion> windySuggestions = new ArrayList<Suggestion>(){{
        add(new Suggestion("Windy", "Wind Suggestion", R.drawable.windy));
    }};

    private final List<Suggestion> cloudySuggestions = new ArrayList<Suggestion>(){{
        add(new Suggestion("Cloudy", "Cloudy Suggestion", R.drawable.cloudy));
    }};

    private final List<Suggestion> thunderSuggestions = new ArrayList<Suggestion>(){{
        add(new Suggestion("Thunder", "Thunder Suggestion", R.drawable.thunder));
    }};

    private final List<Suggestion> snowySuggestions = new ArrayList<Suggestion>(){{
        add(new Suggestion("Snowy", "Snowy Suggestion", R.drawable.snowy));
    }};

    private final List<Suggestion> rainySuggestions = new ArrayList<Suggestion>(){{
        add(new Suggestion("Rainy", "Rainy Suggestion", R.drawable.rain));
    }};

    private final Map<String, List<Suggestion>> suggestions = new HashMap<String, List<Suggestion>>(){{
        put(SUNNY, sunnySuggestions);
        put(WINDY, windySuggestions);
        put(CLOUDY, cloudySuggestions);
        put(THUNDER, thunderSuggestions);
        put(SNOWY, snowySuggestions);
        put(RAINY, rainySuggestions);
    }};

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed() {
        setContentView(R.layout.activity_main);
    }

    public void loadSunny(View view){
        loadSuggestion(SUNNY);
    }
    public void loadWindy(View view){
        loadSuggestion(WINDY);
    }
    public void loadSnowy(View view){
        loadSuggestion(SNOWY);
    }
    public void loadRainy(View view){
        loadSuggestion(RAINY);
    }
    public void loadThunder(View view){
        loadSuggestion(THUNDER);
    }
    public void loadCloudy(View view){
        loadSuggestion(CLOUDY);
    }

    private void loadSuggestion(String weather){
        List<Suggestion> weatherSuggestions = this.suggestions.get(weather);
        if(weatherSuggestions == null || weatherSuggestions.isEmpty()){
            return;
        }
        int size = weatherSuggestions.size() - 1;
        int index = (size > 0) ? new Random().nextInt(size) : 0;
        if(index >= 0 ) {
            setContentView(R.layout.activity_suggestion);
            Suggestion suggestion = weatherSuggestions.get(index);
            TextView suggestionText = findViewById(R.id.suggestionText);
            TextView weatherText = findViewById(R.id.weatherText);
            ImageView weatherImage = findViewById(R.id.weatherImage);
            weatherImage.setImageResource(suggestion.getImageResourceId());
            suggestionText.setText(suggestion.getSuggestion());
            weatherText.setText(suggestion.getWeather());
            mAdView = findViewById(R.id.adView);
            AdRequest adRequest = new AdRequest.Builder().build();
            mAdView.loadAd(adRequest);
        }
    }
}
