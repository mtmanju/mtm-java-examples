package com.mtm.examples.interviews.pingame;

import java.util.Scanner;

public class Pingame2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] roll1 = new String[10];
        String[] roll2 = new String[10];
        int[] framescore  = new int[10];

        int MAXPINS = 10;


        String bonusball1 = "";
        int pinsleft = 0;
        int runtotal = 0;


        for (int i = 0; i < framescore.length; i++)
        {
            if (i < 9) // if frame is 1 - 9
            {
                System.out.printf("%n---Frame %d---", i+1); // will print frame 1 - 10
                System.out.print("\nEnter score for first  bowl: ");
                roll1[i] = input.next().toUpperCase(); // takes string input for first bowl

                if (roll1[i].equals("X") || Integer.parseInt(roll1[i]) == 10) // if first bowl is strike
                    System.out.println("\tStrike!"); // print

                else
                {
                    pinsleft = MAXPINS - Integer.parseInt(roll1[i]); // calculating pins still standing after first bowl
                    System.out.println("   " + pinsleft + " pins still standing");
                    System.out.print("Enter score for second bowl: ");
                    roll2[i] = input.next().toUpperCase();
                    if (roll2[i].equals("/") || Integer.parseInt(roll1[i]) + Integer.parseInt(roll2[i]) == 10) // if bowler types / or bowl 1 + bowl 2 = 10
                        System.out.println("\tSpare!"); // print
                }
            }

            if (i != 9)
                continue;


            else
            {
                System.out.printf("%n---Frame %d---", i+1);
                System.out.print("\nEnter score for first  bowl: ");
                roll1[i] = input.next().toUpperCase();

                if (roll1[i].equals("X") || Integer.parseInt(roll1[i]) == 10)
                {
                    System.out.println("\tNice Strike!");
                    System.out.print("Enter score for second bowl: ");
                    roll2[i] = input.next().toUpperCase();

                    if (roll2[i].equals("X") || Integer.parseInt(roll2[i]) == 10)
                    {
                        System.out.println("\tNice Strike!");
                        System.out.print("Enter score for  third bowl: ");
                        bonusball1 = input.next().toUpperCase();
                    } // end statement if second bowl in frame 10 is a strike
                    else
                    { // if second bowl in frame 10 is NOT a strike
                        System.out.print("Enter score for  third bowl: ");
                        bonusball1 = input.next().toUpperCase();
                    }

                } // end if statement if first bowl in frame 10 is a strike
                else // if first bowl in frame 10 is NOT a strike
                {
                    pinsleft = MAXPINS - Integer.parseInt(roll1[i]);
                    System.out.println("   " + pinsleft + " pins still standing");
                    System.out.print("Enter score for second bowl: ");
                    roll2[i] = input.next().toUpperCase();
                    if (roll2[i].equals("/") || Integer.parseInt(roll1[i]) + Integer.parseInt(roll2[i]) == 10) // if second bowl in frame 10 is a spare
                    {
                        System.out.println("\tNice Spare!"); // print
                        System.out.print("Enter score for  third bowl: ");
                        bonusball1 = input.next().toUpperCase();
                    } // end if statement if second bowl in frame 10 is a spare
                    else
                        break;
                }

            }

        }
        input.close();


        for (int i = 0; i < framescore.length; i++){
            int score = 0; // initializing score to 0 for each frame

            if (i < 8)// calculating frame 1 - 8
            {
                if (roll1[i].equals("X") || Integer.parseInt(roll1[i]) == 10) // if first roll is a strike, assign 10 points
                {
                    score += 10;
                    if (roll1[i+1].equals("X") || Integer.parseInt(roll1[i+1]) == 10) // if first roll in next frame is a strike, assign 10 more points to current frame
                    {
                        score += 10;
                        if (roll1[i+2].equals("X") || Integer.parseInt(roll1[i+2]) == 10) // if first roll in third frame is a strike, assign 10 more points to current frame
                            score += 10;
                        else
                            score += Integer.parseInt(roll1[i+2]);
                    } // end if statement for third strike roll
                    else // if after first strike, next bowl is not a strike
                        if (roll2[i+1].equals("/") || Integer.parseInt(roll2[i+1]) == 10) // if second bowl after strike is a spare, assign 10 points to current frame
                            score += 10;
                        else // else add integer value of roll 1 and roll 2 to current frame
                            score += (Integer.parseInt(roll1[i+1]) + Integer.parseInt(roll2[i+1]));
                }
                else // else if first roll is NOT a strike

                    if (roll2[i].equals("/") || Integer.parseInt(roll2[i]) == 10)// if second roll is a spare, add 10 points
                    {
                        score += 10;
                        if (roll1[i+1].equals("X") || Integer.parseInt(roll1[i+1]) == 10) // if first roll in next frame is a strike, add 10 points
                            score += 10;
                        else if (!roll1[i+1].equals("X") || Integer.parseInt(roll1[i+1]) != 10)
                            score += Integer.parseInt(roll1[i+1]);
                        else
                            continue;
                    }
                    else
                        score += Integer.parseInt(roll1[i]) + Integer.parseInt(roll2[i]);

            } // end if statement for if i < 8
            //
            // Next is calculating the 9th and 10th frame with potential bonus ball
            //
            //
            else
            if (i == 8) // calculating 9th frame
            {
                if (roll1[i].equals("X") || Integer.parseInt(roll1[i]) == 10) // if first bowl in 9th frame is a strike, add 10 points
                {
                    score += 10;
                    if (roll1[i+1].equals("X") || Integer.parseInt(roll1[i+1]) == 10) // if first bowl in 10th frame is a strike, add 10 points
                        score += 10;
                    if (roll2[i+1].equals("X") || Integer.parseInt(roll2[i+1]) == 10) // if second bowl in 10th frame is a strike, add 10 more points
                        score += 10;
                    if (!roll1[i+1].equals("X") || Integer.parseInt(roll1[i+1]) == 10) // if first bowl in 10th frame is NOT a strike
                    {
                        if (roll2[i+1].equals("/") || Integer.parseInt(roll1[i+1]) + Integer.parseInt(roll2[i+1]) == 10) // if second bowl in 10th frame is a spare
                            score += 10;
                        else
                            score += Integer.parseInt(roll1[i+1]) + Integer.parseInt(roll2[i+1]);
                    }

                }
                else // if first bowl in 9th frame is NOT a strike
                    if (roll2[i].equals("/") || Integer.parseInt(roll1[i]) + Integer.parseInt(roll2[i]) == 10) // if roll 2 in 9th frame is a spare, add 10 points
                    {
                        score += 10;
                        if (roll1[i+1].equals("X") || Integer.parseInt(roll1[i+1]) == 10) // if roll 1 in 10th frame is a strike, add 10 more points
                            score += 10;
                        else // else add integer value of roll 1 in frame 10
                            score += Integer.parseInt(roll1[i+1]);
                    }
                    else // else if roll 1 and roll 2 in frame 9 are not strikes or spare
                        score = Integer.parseInt(roll1[i]) + Integer.parseInt(roll2[i]);
            } // end calculations for frame 9

            else  // Calculating 10th frame
            {
                if (roll1[i].equals("X") || Integer.parseInt(roll1[i]) == 10)// if first throw on frame 10 is a strike, add 10 points
                {
                    score += 10;
                    if (roll2[i].equals("X") || Integer.parseInt(roll2[i]) == 10) // if second throw on frame 10 is a strike, add 10 more points
                        score += 10;
                    if (bonusball1.equals("X") || Integer.parseInt(bonusball1) == 10) // if bonus ball on frame 10 is a strike, add 10 more points
                        score += 10;
                    if (!roll2[i].equals("X") || Integer.parseInt(roll2[i]) == 10) // if second throw on frame 10 is NOT a strike
                    {
                        if (bonusball1.equals("/") || Integer.parseInt(roll2[i]) + Integer.parseInt(bonusball1) == 10) // if bonus ball = spare or roll 2 + bonus ball = 10, add 10 points
                            score += 10;
                        else // else if first throw = strike, second throw != strike, and bonus ball != spare
                            score += Integer.parseInt(roll2[i]) + Integer.parseInt(bonusball1);
                    }

                } // end if statement if first throw on frame 10 is a strike

                else // if first throw on frame 10 is NOT a strike
                    if (roll2[i].equals("/") || Integer.parseInt(roll1[i]) + Integer.parseInt(roll2[i]) == 10) // if roll 2 is a spare, score is 10
                    {
                        score += 10;
                        if (bonusball1.equals("X") || Integer.parseInt(bonusball1) == 10) // if bonus ball is a strike, add 10 points
                            score += 10;
                        else
                            score += Integer.parseInt(bonusball1);
                    }
                    else
                        score = Integer.parseInt(roll1[i]) + Integer.parseInt(roll2[i]);

            }
            framescore[i] = score; // assigning the score to framescore[i] to print out in score card
        }


        // SCORECARD OUTPUT
        // Output of Frames, Results of each frame (what was bowled), Score of each frame, and running total is next
        String frameprint = "Frame:";
        String resultprint = "Result:";
        String framescoreprint = "Frame Score:";
        String runtotalprint = "Running Total:";
        char STRIKE = 'X'; // char value to print X for results output if bowler enters X or 10 as their value
        char SPARE = '/'; // char value to print / for results output if bowler enters / or roll1 + roll2 = 10

        System.out.println("\n\n\t\t\t\t ***** SCORE CARD *****");
        System.out.println("\n_______________________________________________________________________________________");
        System.out.printf("%-18s", frameprint);
        for (int i = 0; i < framescore.length; i++){ // printing out frames 1 - 10 on score card
            System.out.printf("%-7d", i+1);}
        System.out.println("\n_______________________________________________________________________________________");
        System.out.printf("%-18s", resultprint);
        for (int i = 0; i < framescore.length; i++){
            if (i < 9)
            {
                if (roll1[i].equals("X") || Integer.parseInt(roll1[i]) == 10) // if first bowl was a strike, print X
                    System.out.printf("%-7c", STRIKE); // print an X
                else  if (!roll1[i].equals("X") || Integer.parseInt(roll1[i]) == 10) // if first bowl was NOT a strike
                {
                    System.out.printf("%-1s ", roll1[i]); // print first bowl
                    if (roll2[i].equals("/") || Integer.parseInt(roll1[i]) + Integer.parseInt(roll2[i]) == 10) // if second bowl was a spare
                        System.out.printf("%-5c", SPARE); // print a /
                    else
                        System.out.printf("%-5s", roll2[i]); // else if second bowl is not a spare, print second bowl
                } // end else if statement for if first bowl was NOT a strike
            } // end if statement for if i < 9
            if (i != 9)
                continue;
            else
            if (roll1[i].equals("X") || Integer.parseInt(roll1[i]) == 10) // if first bowl in frame 10 is a strike
            {
                System.out.printf("%-2c", STRIKE);
                if (roll2[i].equals("X") || Integer.parseInt(roll2[i]) == 10) // if second bowl in frame 10 is a strike
                {
                    System.out.printf("%-2c", STRIKE);
                    if (bonusball1.equals("X") || Integer.parseInt(bonusball1) == 10) // if third bowl in frame 10 is a strike
                        System.out.printf("%-2c", STRIKE);
                    else // else if third bowl in frame 10 is NOT a strike, print the value of bonus ball
                        System.out.printf("%-2s", bonusball1);
                } // end if statement if second bowl in frame 10 is a strike
                else if (!roll2[i].equals("X") || Integer.parseInt(roll2[i]) == 10) // else if roll 2 in frame 10 is NOT a strike
                {
                    System.out.printf("%-2s", roll2[i]);
                    if (roll2[i].equals("/") || Integer.parseInt(roll2[i]) + Integer.parseInt(bonusball1) == 10) // if roll 2 and bonus ball equal spare
                        System.out.printf("%-2c", SPARE);
                    else // else if second roll + bonus ball is not a spare
                        System.out.printf("%-2s", bonusball1);
                }
            }
            else // else if first roll in frame 10 is NOT a strike
                System.out.printf("%-2s", roll1[i]);
            if (roll2[i].equals("/") || Integer.parseInt(roll1[i]) + Integer.parseInt(roll2[i]) == 10) // if roll 1 + roll 2 = 10 in frame 10
            {
                System.out.printf("%-2c", SPARE);
                System.out.printf("%-2s", bonusball1);
            }
            else
                System.out.printf("%-2s", roll2[i]);


        } // end of for loop for printing each frames bowling results

        System.out.println("\n_______________________________________________________________________________________");
        System.out.printf("%-18s", framescoreprint);
        //Next is printing of the score results per frame
        for (int i = 0; i < framescore.length; i++){
            System.out.printf("%-7d", framescore[i]);
        }

        System.out.println("\n_______________________________________________________________________________________");
        System.out.printf("%-18s", runtotalprint);
        // Next is printing of the running total per frame
        for (int i = 0; i < framescore.length; i++){

            runtotal += framescore[i];
            System.out.printf("%-7d", runtotal);
        }

        System.out.println("\n_______________________________________________________________________________________");

    }
}
