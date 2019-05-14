public class UseDivision {
    public static void main(String[] args) {

        InternationalDivision Division1 = new InternationalDivision("YGn", 2342, "Yangon", "Myanmar");
        DomesticDivision Division2 = new DomesticDivision("MDY", 232, "Mandalay");
        System.out.println(Division1.display());
        System.out.println(Division2.display());
    }
}
