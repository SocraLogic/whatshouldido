package uk.co.socralogic.whatshouldidotoday;

class Suggestion {

    private final String weather;
    private final String suggestion;
    private final int imageResourceId;

    Suggestion(String weather, String suggestion, int imageResourceId) {
        this.weather = weather;
        this.suggestion = suggestion;
        this.imageResourceId = imageResourceId;
    }

    public String getWeather() {
        return weather;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
