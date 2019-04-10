public class StudentSubjectAverage {
    //STUDENT GRADES FOR THE SEMESTER/QUARTER

//       "student NAMES" ex. 0= Jeff | 1= Mary

//          0   1   2   3   4

//MATH   0  98  62  85  26  74

//ENG    1  61  74  79  82  90

//ART    2  91  90  86  79  81

//SCI    3  78  83  87  98  63


    /**
     * method for looping through a single row  2D array to return average.
     *
     * @param student (index of the student in an array)
     */

    public double studentSubjectAverage(int[][] grades, int student) {
        int subjects = grades.length;
        int total = 0;

        for (int i = 0; i < subjects; i++) {
            total = total + grades[1][student];//assume users input determines which student to call
        }
        double average = total / (double) subjects; //cast int ==> double
        return average;
    }
}
