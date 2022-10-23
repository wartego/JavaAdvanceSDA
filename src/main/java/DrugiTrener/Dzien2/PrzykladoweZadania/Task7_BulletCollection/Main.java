package DrugiTrener.Dzien2.PrzykladoweZadania.Task7_BulletCollection;

public class Main {
    public static void main(String[] args) {
        Weapon weapon = new Weapon(3);
        System.out.println(weapon.isLoaded());
        weapon.add("pif");
        System.out.println(weapon.isLoaded());
        weapon.add("paf");
        weapon.add("trrr");
        weapon.add("buum");

        weapon.shot();
        weapon.shot();
        weapon.shot();
        weapon.shot();
        weapon.shot();
    }
}
