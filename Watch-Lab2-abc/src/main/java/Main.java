public class Main {
    public static void main(String[] args) {
        Watch watch = new Watch();
        String input;
        /* Test switch from time -> date */

        input = "a";
        // Print Initial States
        System.out.println("Initial outer state: " + watch.getState());
        System.out.println("Initial inner state: " + watch.getState1());

        watch.switchState(input);

        // Print Final States
        System.out.println("Final outer state: " + watch.getState());
        System.out.println("Final inner state: " + watch.getState1());

        /* Test switch from NORMAL -> ALARM and vice versa */

        input = "b";
        // Print Initial States(NORMAL -> ALARM)
        System.out.println("Initial outer state: " + watch.getState());
        System.out.println("Initial inner state: " + watch.getState1());

        watch.switchState(input);

        // Print Final States(NORMAL -> ALARM)
        System.out.println("Final outer state: " + watch.getState());
        System.out.println("Final inner state: " + watch.getState1());

        input = "d";
        // Print Initial States(ALARM -> NORMAL)
        System.out.println("Initial outer state: " + watch.getState());
        System.out.println("Initial inner state: " + watch.getState1());

        watch.switchState(input);

        // Print Final States(ALARM -> NORMAL)
        System.out.println("Final outer state: " + watch.getState());
        System.out.println("Final inner state: " + watch.getState1());

    }
}
