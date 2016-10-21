package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

/**
 * Created by user on 22.06.2016.
 */
public class Hippodrome
{
   private ArrayList<Horse> horses = new ArrayList<Horse>();


   public ArrayList<Horse> getHorses()
   {
       return horses;
   }

    public static Hippodrome game;

    public static void main(String[] args) throws InterruptedException
    {
        game = new Hippodrome();

        Horse horse1 = new Horse("Marysja",3,0);
        Horse horse2 = new Horse("Manya",3,0);
        Horse horse3 = new Horse("Eleonor",3,0);

        game.getHorses().add(horse1);
        game.getHorses().add(horse2);
        game.getHorses().add(horse3);
        game.run();
        game.printWinner();



    }
    public void run() throws InterruptedException
    {
for (int i=0; i<100;i++)
{
    move();
    print();
    Thread.sleep(200);

}
    }
    public void move()
    {
        for (Horse currentHorse : horses)
            currentHorse.move();

    }
    public void print()
    {
        for (Horse currentHorse : horses)
            currentHorse.print();
        System.out.println();


    }
    public Horse getWinner()
    {
        double max = 0;
        Horse winner = null;
        for (Horse horse : horses) {
            if (horse.getDistance() > max) {
                max = horse.getDistance();
                winner = horse;
            }
        }
        return winner;
    }
    public void printWinner()
    {
        Horse winner = getWinner();
        System.out.println("Winner is " + winner.getName() + "!");

    }

}