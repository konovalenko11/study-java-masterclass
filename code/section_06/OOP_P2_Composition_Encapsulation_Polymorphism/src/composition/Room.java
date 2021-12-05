package composition;

public class Room {
    private Table table;
    private PC pc;
    private Chair chair;

    public Room(Table table, PC pc, Chair chair) {
        this.table = table;
        this.pc = pc;
        this.chair = chair;
    }

    public void powerOnPC(){
        System.out.println("Powering On PC...");
        pc.powerUp();
    }
}
