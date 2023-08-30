package HW_Sem2_Exception;
/*
Задача 2:
Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление. 
Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо". 
В противном случае, программа должна выводить результат деления.
*/

import java.util.Scanner;

public class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String string) {
    }
    public static void main(String[] args) {
        Scanner scannerOne = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int inputNumOne = scannerOne.nextInt();

        Scanner scannerTwo = new Scanner(System.in);
        System.out.println("Введите второе число: ");
        int inputNumTwo = scannerTwo.nextInt();

        try {
            numChecking(inputNumOne, inputNumTwo);
            System.out.println("Все верно");
        } catch (DivisionByZeroException exception) {
            System.out.println(exception.getMessage());
        }
    }
    public static void numChecking(int numOne, int numTwo) throws DivisionByZeroException {
        double result = numOne / numTwo;
        if (numTwo == 0) {
            throw new DivisionByZeroException("Некорректное число");
        } else System.out.println(result);
    }  

}
