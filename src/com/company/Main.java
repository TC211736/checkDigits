package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the barcode number");
        String barcode = input.next();
        char[] digits = barcode.toCharArray();
        int firstAdd = digits[1] + digits[3] + digits[5] + digits[7] + digits[9] + digits[11];
        int numMult = firstAdd * 3;
        int secondAdd = digits[0] + digits[2] + digits[4] + digits[6] + digits[8] + digits[10];
        int firstTotal = numMult + secondAdd;
        int total = firstTotal + digits[12];
        if (total % 10 == 0) {
            System.out.println("This is a valid barcode");
        }else{
            System.out.println("This is an invalid barcode");
        }


        }
    }

