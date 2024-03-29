package composition;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell",
                "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast",
                "Acer", 27,
                new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200",
                "ASUS", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();

        // Create a single room of a house using composition.
        // Think about the things that should be included in the room.
        // Maybe physical parts of the house but furniture as well
        // Add at least one method to access an object via a getter and
        // then that objects public method as you saw in the previous video
        // then add at least one method to hide the object e.g. not using a getter
        // but to access the object used in composition within the main class
        // like you saw in this video.

        Table table = new Table("Autonomous", "Table X", true);
        Chair chair = new Chair("Autonomous", "Chair X");
        Room room = new Room(table, thePC, chair);

        room.powerOnPC();


    }
}
