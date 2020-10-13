package com.khien.max_arr2;

public class MaxArr2 {
    public static void main(String[] args) {
//        int[][] arrLogic = new int[3][];
//        arrLogic[0] = new int[5];
//        arrLogic[1] = new int[5];
//        arrLogic[2] = new int[5];
//
//        arrLogic[0][0] = 13;
//        arrLogic[0][1] = 1;
//        arrLogic[0][2] = 17;
//        arrLogic[0][3] = 35;
//        arrLogic[0][4] = 86;
//
//        arrLogic[1][0] = 12;
//        arrLogic[1][1] = 34;
//        arrLogic[1][2] = 150;
//        arrLogic[1][3] = 143;
//        arrLogic[1][4] = 13;
//
//        arrLogic[2][0] = 313;
//        arrLogic[2][1] = 145;
//        arrLogic[2][2] = 155;
//        arrLogic[2][3] = 615;
//        arrLogic[2][4] = 415;

        int[][] arrLogic = {
                {123,324,675,322,333},
                {4123,3244,6745,3242,3433}
        };

        int max = arrLogic[0][0];

        for (int i = 0; i <arrLogic.length ; i++) {
            for (int j = 0; j <arrLogic[i].length ; j++) {
                if (max < arrLogic[i][j]){
                    max = arrLogic[i][j];
                }
            }
        }
        System.out.println("Max is: "+max);

    }
}
