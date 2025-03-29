package ex_07_Array;

public class Lab058_Array_Iterate {
    public static void main(String[] args) {
        int[][] num = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
//
//        for(int i=0;i<num.length;i++) //-> for getting row elements
//        {
//          for(int j=0;j<num[i].length;j++)  //  ->for getting column elements
//            {
//                System.out.print(" "+num[i][j]); //->printing in same line
//            }
//            System.out.println(); //-> print in tabluler form or matrix structure
//        }




//        for(int i=0;i<num.length;i++) //-> for getting row elements
//        {
//            for(int j=0;j<num[i].length;j++)  //  ->for getting column elements
//            {
//                System.out.print(num[i][j]+"|"); //->printing in same line
//            }
//            System.out.println(" "); //-> print in tabluler form or matrix structure
//        }

        for (int i = 0; i < num.length ; i++) { // 0 to 2  matrix.length - r
            for (int j = 0; j < num[i].length ; j++) { // matrix[i].length -> c
               System.out.print(num[i][j]+"  ");
               // System.out.print("*"+"  ");
            }
            System.out.println();
        }


//        for(int i=0;i<num.length;i++) //-> for getting row elements
//        {
//            for(int j=0;j<num[i].length;j++)  //  ->for getting column elements
//            {
//                System.out.print("*"); //->printing in same line
//            }
//            System.out.println(" "); //-> print in tabluler form or matrix structure
//        }
    }

}
