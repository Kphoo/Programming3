public class DemoHorses {
    public static void main(String[] args) {
        RaceHorse one=new RaceHorse();
        one.setName("KwiKwi");
        one.setCompletedRaces(60);
        one.setBirthYear(1996);
        one.color = "White";
        System.out.println(one.name + " is " + one.completedRaces +" and birth year is "+ one.BirthYear);
        System.out.println("The color is "+ one.color);
    }
}
