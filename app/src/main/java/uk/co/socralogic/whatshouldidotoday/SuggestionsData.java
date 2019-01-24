package uk.co.socralogic.whatshouldidotoday;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SuggestionsData {
    static final String SUNNY = "sunny";
    static final String WINDY = "windy";
    static final String CLOUDY = "cloudy";
    static final String THUNDER = "thunder";
    static final String SNOWY = "snowy";
    static final String RAINY = "rainy";

    private final static List<Suggestion> sunnySuggestions= new ArrayList<Suggestion>() {{
        add(new Suggestion("Sunny", "As it's sunny out, why not take a walk", R.drawable.sunny));
        add(new Suggestion("Sunny", "Now could be a good time to do some gardening", R.drawable.sunny));
        add(new Suggestion("Sunny", "How about going for a picnic in the park", R.drawable.sunny));
        add(new Suggestion("Sunny", "Is it time for a BBQ", R.drawable.sunny));
        add(new Suggestion("Sunny", "Take a walk around your town and see what's new", R.drawable.sunny));
        add(new Suggestion("Sunny", "Take a trip to the countryside and get some fresh air in the sun", R.drawable.sunny));
        add(new Suggestion("Sunny", "How about a beach trip", R.drawable.sunny));
        add(new Suggestion("Sunny", "Time to work on the tan", R.drawable.sunny));
    }};

    private final static List<Suggestion> windySuggestions = new ArrayList<Suggestion>() {{
        add(new Suggestion("Windy", "How about flying a kite", R.drawable.windy));
        add(new Suggestion("Windy", "Clear out the cobwebs with a walk, just wrap up warm", R.drawable.windy));
        add(new Suggestion("Windy", "Take a look at the house to do list", R.drawable.windy));
        add(new Suggestion("Windy", "How about a meal out, just sit inside", R.drawable.windy));
        add(new Suggestion("Windy", "Work on the garden, just have a nice brew ready and waiting", R.drawable.windy));
        add(new Suggestion("Windy", "How about making and sailing a small paper sail boat", R.drawable.windy));
        add(new Suggestion("Windy", "Take some artistic wind swept photos", R.drawable.windy));
    }};

    private final static List<Suggestion> cloudySuggestions = new ArrayList<Suggestion>() {{
        add(new Suggestion("Cloudy", "A bike ride could be good while it's not too sunny", R.drawable.cloudy));
        add(new Suggestion("Cloudy", "The garden could probably use some attention", R.drawable.cloudy));
        add(new Suggestion("Cloudy", "How about some board games inside", R.drawable.cloudy));
        add(new Suggestion("Cloudy", "Take a walk while it's not too sunny", R.drawable.cloudy));
        add(new Suggestion("Cloudy", "How about a hike in the hills", R.drawable.cloudy));
        add(new Suggestion("Cloudy", "Take a trip to a nearby city and see the sights", R.drawable.cloudy));
        add(new Suggestion("Cloudy", "How about some retail therapy", R.drawable.cloudy));
    }};

    private final static List<Suggestion> thunderSuggestions = new ArrayList<Suggestion>() {{
        add(new Suggestion("Thunder", "Get the headphones on and play something soothing", R.drawable.thunder));
        add(new Suggestion("Thunder", "Time to catch some amazing photos", R.drawable.thunder));
        add(new Suggestion("Thunder", "Time to play some board games", R.drawable.thunder));
        add(new Suggestion("Thunder", "Sit back and watch a film", R.drawable.thunder));
        add(new Suggestion("Thunder", "Get comfy and read a book", R.drawable.thunder));
        add(new Suggestion("Thunder", "How about taking a nap", R.drawable.thunder));
        add(new Suggestion("Thunder", "Let's get a bit of DIY done and dusted", R.drawable.thunder));
    }};

    private final static List<Suggestion> snowySuggestions = new ArrayList<Suggestion>() {{
        add(new Suggestion("Snowy", "Wrap up and take a walk in the snow!", R.drawable.snowy));
        add(new Suggestion("Snowy", "Build a snowman", R.drawable.snowy));
        add(new Suggestion("Snowy", "Take some artistic wintery photo's", R.drawable.snowy));
        add(new Suggestion("Snowy", "Wrap up in front of the TV and watch a film", R.drawable.snowy));
        add(new Suggestion("Snowy", "Get snug with a mug of coco and read a book", R.drawable.snowy));
        add(new Suggestion("Snowy", "Time for some hearty soup to warm the soul", R.drawable.snowy));
        add(new Suggestion("Snowy", "How about getting snug in bed with a book", R.drawable.snowy));
    }};

    private final static List<Suggestion> rainySuggestions = new ArrayList<Suggestion>() {{
        add(new Suggestion("Rainy", "Definitely a good time to catch up on the chores", R.drawable.rain));
        add(new Suggestion("Rainy", "Plan some days away for when it's sunny", R.drawable.rain));
        add(new Suggestion("Rainy", "Take a walk in the rain, just take some towels", R.drawable.rain));
        add(new Suggestion("Rainy", "Let's get to work on the house project list", R.drawable.rain));
        add(new Suggestion("Rainy", "How about learning something new", R.drawable.rain));
        add(new Suggestion("Rainy", "Time to settle down with a book", R.drawable.rain));
        add(new Suggestion("Rainy", "How about some gaming time", R.drawable.rain));
    }};

    final static Map<String, List<Suggestion>> suggestions = new HashMap<String, List<Suggestion>>() {{
        put(SUNNY, sunnySuggestions);
        put(WINDY, windySuggestions);
        put(CLOUDY, cloudySuggestions);
        put(THUNDER, thunderSuggestions);
        put(SNOWY, snowySuggestions);
        put(RAINY, rainySuggestions);
    }};
}