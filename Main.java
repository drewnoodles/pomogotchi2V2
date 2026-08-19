public class Main {
    public static void main(String[] args) throws InterruptedException {
       //initialize pet and timer
        Pet myPet = new Pet();
        PomodoroTimer timer = new PomodoroTimer(10);



        boolean focused = false;
        int focusScore = 0;
        int distractScore = 0;
        

        while (!timer.isFinished()) {
            System.out.println("Time remaining: " + timer.getFormattedTimeRemaining());
            timer.tick();
            if (focused) {
            focusScore++;
            distractScore = 0;

            if (focusScore >= 5) {
                myPet.setMood(Mood.EXCITED);
            }
            else {
                myPet.setMood(Mood.HAPPY);
            }
        }
        else {
            distractScore++;
            focusScore = 0;


            if (distractScore >= 5) {
                myPet.setMood(Mood.ANGRY);
            }
            else {
                myPet.setMood(Mood.SAD);
            }
        }
        if (timer.isFinished()) {
            System.out.println("Time is up.");
            myPet.setMood(Mood.IDLE);

        }

        System.out.println("My pet's mood is: " + myPet.getMood());
            Thread.sleep(1000);
        }


       
    }

    }

