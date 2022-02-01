import com.sun.xml.internal.ws.server.DefaultResourceInjector;

import java.util.Scanner;

public class Arena {

    public static  Robot fight(Robot r1,Robot r2) {
        Robot survivant , perdant = null;
        while(!r1.isDead() && !r2.isDead()){
            r1.fire(r2);
            r2.fire(r1);
        }
        //je check les robots vivant et mort
        survivant = r1.isDead()?r2:r1;
        perdant = r1.isDead()?r1:r2;
        System.out.println("Le robot "+perdant.getNom() + " a ete touche par le robot  "+survivant.getNom());
        return survivant;
    }

    public  static  void main(String[] args) {

        // je declare et  j'initialise mes robots
        Robot D2R2, Data = null;
        System.out.println("\n ------------------ PROJET SUR LES ROBOT -------------------------\n");
        System.out.println("----- creation des robots par default ----- ");
        D2R2 = new Robot("D2R2");
        Data = new Robot("Data");
        //je declare mon arena
        System.out.println(D2R2);
        // je Vise le Robot data
        D2R2.fire(Data);
        Arena.fight(D2R2 ,Data);
        //j'affiche le spoints de vies finaux de mes robots
        System.out.println("\n-------------------------------- POINTS DE VIE FINAL -----------------------\n");
        System.out.println(" 1)  Robot D2D2 : "+D2R2.getVie() +" points de vie ");
        System.out.println(" 2)  Robot Data: "+Data.getVie() +" points de vie ");

    }
}
