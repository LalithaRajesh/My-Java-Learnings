package com.company;

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {

        return this.firstNumber;
    }
    public double getSecondNumber() {

        return secondNumber;
    }
    public void setFirstNumber(double firstNumber) {

        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber) {

        this.secondNumber = secondNumber;
    }
    public double getAdditionResult() {

        return firstNumber + secondNumber;
    }
    public double getSubtractionResult() {

        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult() {

        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {
        if(secondNumber != 0) {
            return firstNumber / secondNumber;
        } else {
            return 0;
        }

    }
    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.setFirstNumber(5.0);
        simpleCalculator.setSecondNumber(4);
        System.out.println(simpleCalculator.getAdditionResult());
        System.out.println(simpleCalculator.getDivisionResult());
        System.out.println(simpleCalculator.getSubtractionResult());
        System.out.println(simpleCalculator.getMultiplicationResult());
    }

}
