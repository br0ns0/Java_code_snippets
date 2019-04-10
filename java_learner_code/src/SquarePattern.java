public class SquarePattern {

    public void setSquarePattern() {


        int k = 3; //number of rows
        int l = 6;// number of columns

        // OR you could use one variable for rows and columns:
        //int a = 5; meaning 5 by 5

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//  output:
//          ******
//          ******
//          ******

