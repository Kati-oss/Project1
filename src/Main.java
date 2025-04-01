//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double tiketPrice = 20000;
        int rublesFormila = 15;

        int bonusMiles = (int) (tiketPrice / rublesFormila);

        System.out.println(bonusMiles);
    }
}