package DrugiTrener.Dzien2.PrzykladoweZadania.Task7_Bullet;

import java.util.ArrayList;
import java.util.List;

public class Weapon {
    private List<String> bullets = new ArrayList<>();
    private int size;

    public Weapon(int size) {
        this.size = size;
    }

    public void add(String bullet){
        if(bullets.size() < size){
            bullets.add(bullet);
        } else
        System.out.println("Magazynek pełny - nie dodano naboju");
    }

    public boolean isLoaded(){
       // return bullets.size() > 0;
        return  !bullets.isEmpty();
        }
    public void shot(){
        int lastIndex = bullets.size() - 1;
        if (isLoaded()) {
            String bullet = bullets.get(lastIndex);
            System.out.println(bullet);
            bullets.remove(lastIndex);
        } else {
            System.out.println("Pusty magazynek");
        }
    }
    }


