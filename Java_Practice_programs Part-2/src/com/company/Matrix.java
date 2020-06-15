package com.company;

class Matrix {
    int[][] a;
    int rowNum;
    int colNum;

    public Matrix(int r, int c) {
        rowNum = r;
        colNum = c;
        a = new int[rowNum][colNum];
    }

    public int getRowNum() {
        return rowNum;
    }

    public int getColNum() {
        return colNum;
    }
    public void setElement(int r, int c, int element){
        a[r][c] = element;
    }
    public int getElement(int r, int c) {
        return a[r][c];
    }
    public void printMatrix(){
        System.out.println("Matrix is:");
        for(int i=0;i< rowNum; i++) {
            for(int j=0; j<colNum; j++) {
                System.out.println(a[i][j] + "\t");
            }
            System.out.println("");
        }
    }

}

class Ans{
    public static void main(String[] args) {
        Matrix m = new Matrix(3,3);
        Matrix n = new Matrix(3,3);
        int element=0;
        for(int i=0;i<=3;i++){
            for(int j=0;j<=3;j++){
                m.setElement(i,j,element);
                element++;
                n.setElement(i,j,element);
                element++;
            }
        }
        m.printMatrix();
        n.printMatrix();
    }
}