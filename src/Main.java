//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyTime soat = new MyTime(23, 59, 59);
        System.out.println(soat);
        soat.nextHour();
        System.out.println(soat);
        soat.nextMinute();
        System.out.println(soat);
        soat.nextSecond();
        System.out.println(soat);
        MyTime vaqt = new MyTime(0, 1, 0);
        System.out.println(vaqt);
        vaqt.previousHour();
        System.out.println(vaqt);
        vaqt.previousMinute();
        System.out.println(vaqt);
        vaqt.previousSecond();
        System.out.println(vaqt);
//        vaqt.setHour(24);
//        vaqt.setMinute(60);
        vaqt.setSecond(60);
    }
}