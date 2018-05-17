package com.company;

public class Zad3 {

    //3. Tworzymy klasê Runner, która bêdzie mia³a pola distance oraz speed.
    // Konstruktor ustawi wartoæ pola distance na 0, a speed zgodnie z przekazanym parametrem.
    // Klasa bêdzie mia³a metodê run, która przyjmie za parametr liczbê sekund, a która powiêkszy dystans zgodnie z jego prêdkoci¹.
    // Do tego bêdziemy mieli metodê getDistance, która pos³u¿y do tego, ¿eby sprawdziæ ile biegacz przebieg³.

    private static class Runner
    {
        private double distance;
        private double speed;

        public Runner(double speed) {
            this.speed = speed;
            this.distance = 0;
        }

        public void run(double time) {
            distance = speed*time;
        }

        public double getDistance() {
            return distance;
        }
    }


    public static void main(String[] args) {

        Runner runner = new Runner(10);
        runner.run(30);
        System.out.println(runner.getDistance());


    }



}


