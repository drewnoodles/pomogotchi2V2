public class PomodoroTimer {

    private int secondsRemaining;




    public boolean isFinished() {
        return secondsRemaining <= 0;
    }

    public PomodoroTimer(int seconds) {
        this.secondsRemaining = seconds;
    }

    public int getSecondsRemaining() {
        return secondsRemaining;
    }

    public void tick() {
        if (secondsRemaining > 0) {
            secondsRemaining--;
        }
    }

    public String getFormattedTimeRemaining() {
        int minutes = secondsRemaining / 60;
        int seconds = secondsRemaining % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }
    
}
