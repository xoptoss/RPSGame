package mainPackage;

import java.util.Random;

public class randomNumber {
    Random random = new Random();
    public int cpuChoice;
    public void GetANumber()
    {
        cpuChoice = random.nextInt(3)+1;
        return;
    }
}
