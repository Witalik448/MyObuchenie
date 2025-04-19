public class ExtraСandy {
    public int ostat (int candy, int student){
        return candy % student;
    }

    public static void main(String[] args) {
        ExtraСandy c = new ExtraСandy();
        System.out.println(c.ostat(50,31));
    }
}
