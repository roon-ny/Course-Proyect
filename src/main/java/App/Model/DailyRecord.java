package App.Model;

public class DailyRecord {

    private String emotion;
    private String sleepHours;
    private String food;
    private String journaly;
    private int foodScore;
    private int emotionScore;
    private int sleepScore;
    private int totalScore;

    public DailyRecord() {
        this.emotion = "";
        this.sleepHours = "";
        this.food = "";
        this.foodScore = 0;
        this.emotionScore = 0;
        this.sleepScore = 0;
        this.totalScore = 0;
    }

    public void setJournaly(String journaly){
    this.journaly = journaly;
    }
    public String getJournaly(){
        return journaly;
    }
    public void setEmotion(String emotion) {
        this.emotion = emotion;
    }
    public String getEmotion() {
        return emotion;
    }
    public void setEmotionScore(int emotionScore) {
        this.emotionScore = emotionScore;
        actualizarTotal();
    }
    public int getEmotionScore() {
        return emotionScore;
    }


    public void setSleepHours(String sleepHours) {
        this.sleepHours = sleepHours;
    }
    public String getSleepHours() {
        return sleepHours;
    }
    public void setSleepScore(int sleepScore) {
        this.sleepScore = sleepScore;
        actualizarTotal();
    }
    public int getSleepScore() {
        return sleepScore;
    }

    public void setFood(String food) {
        this.food = food;
        actualizarTotal();
    }
    public String getFood() {
        return food;
    }
    public void setFoodScore(int foodScore) {
        this.foodScore = foodScore;
        actualizarTotal();
    }
    public int getFoodScore() {
        return foodScore;
    }
    public void actualizarTotal() {
        this.totalScore = emotionScore + sleepScore + foodScore;
    }
    public int getTotalScore() {
        return totalScore;
    }
}






