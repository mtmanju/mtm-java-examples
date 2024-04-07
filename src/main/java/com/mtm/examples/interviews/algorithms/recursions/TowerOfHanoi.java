package com.mtm.examples.interviews.algorithms.recursions;

public class TowerOfHanoi {

    public void tower(int numOfDisks,char sourcePole, char destPole, char auxPole){
        if(numOfDisks==1){
            System.out.println("Moving disk 1 from "+sourcePole+" to "+destPole);
            return;
        }

        tower(numOfDisks-1,sourcePole,auxPole,destPole);
        System.out.println("Move disk "+numOfDisks+" from "+sourcePole+" to "+destPole);
        tower(numOfDisks-1,auxPole,destPole,sourcePole);

    }

    public static void main(String[] args) {
        TowerOfHanoi towerOfHanoi=new TowerOfHanoi();
        towerOfHanoi.tower(5,'A','B','C');
    }
}
