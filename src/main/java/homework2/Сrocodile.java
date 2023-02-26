package homework2;

public class Сrocodile extends Predator implements Swimable{
    public Сrocodile(String nickname) {
        super(nickname);
    }
    public String toString(){
        return "I'm crocodile. " + super.toString() + ". My speed is " + speedOfSwim();
    }

    public String say(){
        return "Hrum-hrum";
    }
    @Override
    public int speedOfSwim() {
        return 5;
    }
}
