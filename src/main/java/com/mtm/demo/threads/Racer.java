package com.mtm.demo.threads;

public class Racer implements Runnable {

    public static String winner;

    public void race() {
        for (int distance = 1; distance <= 100; distance++) {
            System.out.println(
                    "Distance covered by " + Thread.currentThread().getName() + " is " + distance + " meters.");

            boolean isRaceWon = this.isRaceWon(distance);
            if (isRaceWon) {
                break;
            }
        }
    }

    private boolean isRaceWon(int distance) {
        boolean isRaceWon = false;

        if (Racer.winner == null && distance == 100) {
            String winner = Thread.currentThread().getName();
            Racer.winner = winner;
            System.out.println("Winner is: " + Racer.winner);
            isRaceWon = true;
        } else if (Racer.winner == null) {
            isRaceWon = false;
        } else if (Racer.winner != null) {
            isRaceWon = true;
        }

        return isRaceWon;
    }

    @Override
    public void run() {
        this.race();
    }

}
