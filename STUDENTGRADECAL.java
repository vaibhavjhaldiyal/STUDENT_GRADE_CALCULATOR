import java.util.Scanner;
public class STUDENT_GRADE_CALCULATOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO STUDENT GRADE CALCULATOR");
        System.out.println("ENTER YOUR MARKS OUT OF 100");
        System.out.println("ENTER YOUR ENGLISH MARKS");
        float eng = sc.nextInt();
        System.out.println("ENTER YOUR PHYSICS MARKS");
        float psy = sc.nextInt();
        System.out.println("ENTER YOUR CHEMISTRY MARKS");
        float chem = sc.nextInt();
        System.out.println("ENTER YOUR MATHS/BIOLOGY MARKS");
        float mb = sc.nextInt();
        System.out.println("ENTER YOUR HINDI/COMPUTER SCIENCE MARKS");
        float hcs = sc.nextInt();
        float total =eng +psy+chem+mb+hcs;
        float average = total/500*100;
        System.out.println("TOTAL MARKS OUT OF 500:" +total);
        System.out.println("AVERAGE PERCENTAGE:" +average);
        if (average>95) {
            System.out.println("GRADE:A+");
            
        }
        else if(average>90 && average<95){
            System.out.println("GRADE:A");
        }
        else if (average>75 && average<90){
            System.out.println("GRADE:B");
        }
        else if(average>50 && average <75){
            System.out.println("GRADE:C");
        }
        else if(average>33 && average <50){
            System.out.println("GRADE:D");
        }
        else{
            System.out.println("FAIL");
        }
        
    }
    
}
