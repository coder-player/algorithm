package com.fqh.java.structure.array;

/**
 * @author 海盗狗
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        int[][] arr = {
                {0, 0, 0, 1, 0},
                {0, 0, 2, 0, 0},
                {0, 0, 0, 0 ,1},
                {0, 1, 0, 0, 0}
        };

    }

    public static void m(int[][] arr) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] != 0) {
                    num++;
                }
            }
        }
        int[][] nums = new int[num + 1][2];
    }
}

class chessboard {
    public static void main(String[] args) {

        int chessArr[][] = new int[11][11];
        chessArr[1][1] = 1;
        chessArr[2][4] = 2;
        chessArr[4][5] = 4;
        chessArr[5][6] = 9;
        System.out.println("原始的二维数组=============================");
        for (int[] row : chessArr) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }

//        将二维数组 转 稀疏数组的思路
//        1. 先遍历二维数组 得到非零数据的个数
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArr[i][j] != 0) {
                    sum++;
                }
            }
        }
//        2. 创建对应的稀疏数组
        int sparseArr[][] = new int[sum + 1][3];
//           给稀疏数组赋值
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;
//           遍历二维数组 , 将非零的值传入数组 sparseArr 中
        int count = 0;//count 记录是第几个非零数据
        System.out.println(sum + 1);
//        遍历二维数组干嘛还加一层
//        for (int[] row1 : chessArr){
//            for (int i = 0; i < 11; i++){
//                for (int j = 0; j <11; j ++){
//                    if (chessArr[i][j] != 0){
//                        count++;
//                        sparseArr[count][0] = i;
//                        sparseArr[count][1] = j;
//                        sparseArr[count][2] = chessArr[i][j];
//
//                    }
//                }
//            }
        for (int m = 0; m < 11; m++) {
            for (int j = 0; j < 11; j++) {
                if (chessArr[m][j] != 0) {
                    count++;
                    sparseArr[count][0] = m;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = chessArr[m][j];
                }
            }
//            输出稀疏数组的格式
            System.out.println();
            System.out.println("得到的稀疏数组为====================================");
            for (int i = 0; i < sparseArr.length; i++) {
                System.out.printf("%d\t%d\t%d\t\n", sparseArr[i][0], sparseArr[i][1], sparseArr[i][2]);
            }
            System.out.println();
        }

//        将稀疏数组转换成原数组
/*          1. 先读取稀疏数组的第一行 , 根据第一行的数据 , 创建原始的二维数组 , 比如上面的 chessArr2 = int[11][11]
            2. 再读取稀疏数组后几行的数据 , 并赋给 原始的二维数组 即可.
 */
        int[][] chessArr2;
        chessArr2 = new int[sparseArr[0][0]][sparseArr[0][1]];
        for (int[] row : chessArr2) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }

        for (int i = 1; i < sparseArr.length; i++) {
            chessArr2[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }
//        转化后再输出.......
        System.out.println("*********************************");
        for (int[] link : chessArr2) {
            for (int i : link) {
                System.out.printf("%d\t", i);
            }
            System.out.println();
        }

    }
}