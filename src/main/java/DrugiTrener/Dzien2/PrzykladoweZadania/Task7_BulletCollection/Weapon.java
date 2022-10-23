package DrugiTrener.Dzien2.PrzykladoweZadania.Task7_BulletCollection;

import java.util.*;

public class Weapon {
    private Deque<String> bullets = new LinkedList<>();
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
        if (isLoaded()) {
            String bullet = bullets.pollLast();
            System.out.println(bullet);
        } else {
            System.out.println("Pusty magazynek");
        }
    }
    }


