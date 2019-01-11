import java.util.Scanner;

public class StudentMarks {
    public static String student(){
        Scanner in = new Scanner(System.in);
      //  System.out.println("Enter a number of students:");
        int numOfStudents = in.nextInt();
        int i=0,index=0,gradeValue,flag=0;
        int[] stuGrades=new int[numOfStudents];
        while(i<numOfStudents)
        {
        //    System.out.println("Enter "+i+" grade:");
            gradeValue=in.nextInt();
            boolean val=gradeValidate(gradeValue);
            if(val){
                stuGrades[index++]=gradeValue;
            }
            else{
                flag=1;
            //    System.out.println("Invalid grade");
                break;
            }
            i++;
        }
        if(flag==1){
            return "Failure";
        }
        return "Success";
    }
    public static boolean gradeValidate(int gradevalue){
        if((gradevalue>=0)&& (gradevalue<=100))
        return true;

        return false;
    }
}
