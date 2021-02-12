package TermProject;
/**
 * Carl Borillo, Justin Miller, Chaz Arvizu, Jereme Howell, Yoosuf Batliwala
 * December 7, 2020
 * Purpose: It's our main class and tester to test functionality of all our classes. Everything
 * hard coded and is a simulation of our Roach-Motel.
 * Inputs: N/A
 * Output: Sample output to show functionaility of our Roach-Motel named "The Ritz Roach"
 */

public class TermMain {
    public static void main(String[] args) {

        System.out.println("Create a new Roach Motel with 5 rooms");
        System.out.println();

        RoachMotel TheRitzRoach = RoachMotel.getInstance();

        TheRitzRoach.createRooms(5);
        System.out.println(TheRitzRoach);
        System.out.println();

        System.out.println();
        System.out.println("Create 6 roach colonies and try to check them in");
        System.out.println();

        RoachColony r1 = new RoachColony("Carl", 2, 1.0, TheRitzRoach);
        RoachColony r2 = new RoachColony("Justin", 3, 1.2, TheRitzRoach);
        RoachColony r3 = new RoachColony("Yoosuf", 4, 1.3, TheRitzRoach);
        RoachColony r4 = new RoachColony("Jeremy", 2, 2.0, TheRitzRoach);
        RoachColony r5 = new RoachColony("Chaz", 10, 0.8, TheRitzRoach);
        RoachColony r6 = new RoachColony("Mimi", 5, 1.0, TheRitzRoach);

        TheRitzRoach.notifyObserver();

        TheRitzRoach.checkIn(r1, "deluxe", true, false, true, true);
        System.out.println();
        TheRitzRoach.checkIn(r2, "regular", false, false, false, false);
        System.out.println();
        TheRitzRoach.checkIn(r3, "suite", true, true, false, false);
        System.out.println();
        TheRitzRoach.checkIn(r4, "deluxe", false, true, true, true);
        System.out.println();
        TheRitzRoach.checkIn(r5, "suite", false, false, false, true);
        System.out.println();
        TheRitzRoach.checkIn(r6, "regular", true, true, true, true);

        try {
            System.out.println();

            System.out.println(TheRitzRoach);

            System.out.println();
            System.out.println("Time to check out!");
            TheRitzRoach.checkOut(r1, 3);

            System.out.println();
            System.out.println(TheRitzRoach);
            System.out.println();

            TheRitzRoach.checkIn(r6, "suite", true, false, true, false);
            System.out.println();

            System.out.println(TheRitzRoach);
            System.out.println();

            RoachColony r7 = new RoachColony("Andersen", 2, 4.0, TheRitzRoach);
            System.out.println(r7);
            TheRitzRoach.checkIn(r7, "deluxe", true, true, false, false);
            System.out.println();

            RoachColony r8 = new RoachColony("The Olympic Roach Team", 15, 3.6, TheRitzRoach);
            System.out.println(r8);
            TheRitzRoach.checkIn(r8, "suite", true, true, true, true);
            System.out.println();

            RoachColony r9 = new RoachColony("Rock 'n' Roach Punk Band", 5, 0.2, TheRitzRoach);
            System.out.println(r9);
            TheRitzRoach.checkIn(r9, "suite", true, false, true, false);
            System.out.println();

            System.out.println(TheRitzRoach);
            System.out.println();

            TheRitzRoach.checkOut(r6, 3);
            System.out.println();
        }
        catch (NullPointerException e) {

        }
            r2.throwParty();
            System.out.println();
            r5.throwParty();
            System.out.println();
    }
}
