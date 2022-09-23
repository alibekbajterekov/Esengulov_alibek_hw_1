import java.util.Random;

public class Medic extends Hero{

    Random healthPoints = new Random();
    double healPoints= healthPoints.nextInt(5,10);

    public double increaseExperience() {
        System.out.println(healPoints);
        healPoints *= 1.1;
        return healPoints;

    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic used a super ability to HEAL");

    }
}
