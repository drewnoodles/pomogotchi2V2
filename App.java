public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Pet myPet = new Pet();
        System.out.println("My current mood is: " + myPet.getFace());
        myPet.setMood(Mood.HAPPY);
        System.out.println("My current mood is: " + myPet.getFace());
        myPet.setMood(Mood.SAD);
        System.out.println("My current mood is: " + myPet.getFace());
        myPet.setMood(Mood.ANGRY);
        System.out.println("My current mood is: " + myPet.getFace());
    }
}