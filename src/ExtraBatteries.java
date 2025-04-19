public class ExtraBatteries {
    int batteries;
    int device;

    public int schet(int batteries, int device) {
        this.batteries = batteries;
        this.device = device;
        return (batteries * 2) % device;
    }

    public static void main(String[] args) {
        ExtraBatteries d = new ExtraBatteries();
        System.out.println(d.schet(2,2));

    }
}
