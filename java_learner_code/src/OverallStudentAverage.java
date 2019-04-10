public class OverallStudentAverage {

    //STUDENT GRADES FOR THE SEMESTER/QUARTER

//       "student NAMES" ex. 0= Jeff | 1= Mary

//          0   1   2   3   4

//MATH   0  98  62  85  26  74

//ENG    1  61  74  79  82  90

//ART    2  91  90  86  79  81

//SCI    3  78  83  87  98  63


    /**
     * prints out the average students competency for an entire semester/quarter.
     * Similar to a GPA.
     */

    public void setStudentAverage(double[][] grades) {
        int sizeofClass = grades.length;
        int subjects = 4;
        int total = 0;
        for (int i = 0; i < sizeofClass; i++) { //columns of students by name
            for (int j = 0; j < subjects; j++) { // rows of subjects
                total += grades[i][j];    //calculates the total of all the students grades in ALL subjects
            }
            double average = total / (double) sizeofClass;
            System.out.println(average);

        }

    }
}
