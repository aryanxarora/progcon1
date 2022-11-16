/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author 2219549
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double [] studentAverage = new double[5];
        double [] quizAverage = new double[5];
        int temp, students, quizzes;
        double avg = 0;
        
        System.out.println("Enter number of students: ");
        students = sc.nextInt();
        System.out.println("Enter number of quizzes: ");
        quizzes = sc.nextInt();
        int[][] arr = new int[students][quizzes];

        for(int i = 0; i < students; i++){
            System.out.println("Enter grades for student " + (i+1) + ":");
            for(int j = 0; j < quizzes; j++){
                System.out.print("Quiz " + (j+1) + ": ");
                arr[i][j] = temp = sc.nextInt();
                avg += temp;
            }
            studentAverage[i] = avg/quizzes;
            avg = 0;
        }
        
        avg = 0;
        int ctr = 0;
        for(int j = 0; j < quizzes; j++){
            for(int i = 0; i < students; i++){
                avg += arr[i][j];
                if(i == (students - 1)){
                    quizAverage[ctr] = avg/students;
                    ctr++;
                }
            }
            avg = 0;
        }
        
        System.out.println();
        for(int i = 0; i < students; i++){
            for(int j = 0; j < quizzes; j++){
                System.out.print(arr[i][j] + "\t" );
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Student Averages: ");
        for(int i = 0; i < students; i++){
            System.out.printf("%.1f ", studentAverage[i]);
        }
        System.out.println();
        System.out.println("Quiz Averages: ");
        for(int i = 0; i < quizzes; i++){
            System.out.print(quizAverage[i] + "  ");
        }
        
        
        
    }
    
}
