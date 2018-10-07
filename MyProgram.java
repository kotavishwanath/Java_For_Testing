
/**
 * Write a description of class MyProgram here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import javax.swing.JOptionPane;

public class MyProgram
{
    public void runMyProgram()
    {
        //Write your code here
        int mark ;
	   mark = 65;

        if (mark>50)
        {
            System.out.println("PASS");
        }
        else 
        {
            System.out.println("FAIL");
        }  
	   System.out.println("Thank you");             
    }

    public void rightAngleTriangle(){
        for (int i = 0; i < 4; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("X");
            }
            System.out.print("\n");
        }
    }

    public void invertRightAngledTriangle(){
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                if(i<=j){
                    System.out.print("X");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
    
    public void diagonalPrinting(){
        for (int i = 1 ; i <= 4; i++){
            for (int j = 1; j <= 4; j++){
                if (i == j){
                    System.out.print("X");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public void reverseDiagnolPrinting(){
        for (int i = 1; i <= 4; i++){
            for (int j = 4; j >= 1; j--){
                if (i == j){
                    System.out.print("X");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public void bothDiagnolPrinting(){
        for (int i = 1; i <= 5 ; i++){
            for (int j = 1; j <= 5; j++){
                if (i == j || j == (6-i)){
                    System.out.print("X");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

      /*  int length = 5;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (j == i || j == (4 - i)) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/
    }

    public void diagonalWithSquare(){
        for (int i = 1; i <= 4; i++){
            for (int j = 1; j <= 4; j++){
                if (i == j || j == (5-i)){
                    System.out.print("X");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args)
    { 
        String msg = JOptionPane.showInputDialog("Enter your message");
        if (msg == null){
            System.out.print("Havent seen your message");
            return;
        }else{
            System.out.println(msg);
        }
       
        MyProgram prog = new MyProgram();
        // prog.runMyProgram();
        // prog.diagonalPrinting();
        // prog.reverseDiagnolPrinting();
        // prog.bothDiagnolPrinting();
        // prog.diagonalWithSquare();
        // prog.rightAngleTriangle();
        prog.invertRightAngledTriangle();
    }
}
