package com.mtm.examples.interviews.pingame;


import org.apache.commons.math3.util.Pair;

public class PinBall {

    public static void main(String[] args) {

        String []attempts ={ "10"
                ,"7"
                ,"3"
                ,"9"
                ,"0"
                ,"10"
                ,"0"
                ,"8"
                ,"8"
                ,"2"
                ,"F"
                ,"6"
                ,"10"
                ,"10"
                ,"10"
                ,"8"
                ,"1"};
        
        int [] score = scoreCollector(attempts);

    }

    private static int[] scoreCollector(String[] attempts) {
        
        int frame =1;
        int scoreCount=0;
        int score []=new int[10];
        
        for(int i=0;i<attempts.length-1;i++){
            if(attempts[i]=="10"){
                frame +=1;
              //  if(checkNextFrame(frame,attempts,i).getValue0()=="perfect")
                {


                }
                
            }
            
        }
        
        return null;
    }

    private static Pair<String,Integer> checkNextFrame(int frame, java.lang.String[] attempts, int i) {
        return null;
    }


}
