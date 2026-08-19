public class Pet {

    public Mood mood;

    public Pet() {
        this.mood = Mood.IDLE;
    }

    public Mood getMood() {
        return mood;
    }
    public void setMood(Mood mood) {
        this.mood = mood;
    }

    public String getFace() {
            switch (mood) {
                case HAPPY:
                    return "=^.w.^=";
                case SAD:
                    return "(ó﹏ò｡)";
                case IDLE:
                    return "( •ᴗ• )";
                case ANGRY:
                    return "( ｡ •̀ ᴖ •́ ｡)💢";
                case EXCITED:
                    return "(⁄ ⁄•⁄ω⁄•⁄ ⁄)";
                case DEPRESSED:
                    return "(っ◞‸◟ c)";
            }
            return "";
        }

    }



