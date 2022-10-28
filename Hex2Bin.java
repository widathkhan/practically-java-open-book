package Practicecodes.Java.Partiallyopenbook;

import java.util.Scanner;

public class Hex2Bin {
    public static void main(String[] args) {
        final String[] HEX_BITS = {"0000", "0001", "0010", "0011", 
            "0100", "0101", "0110", "0111", 
            "1000", "1001", "1010", "1011", 
            "1100", "1101", "1110", "1111"}; 
        String str;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the hexadecimal string");
        str=scan.next().toLowerCase();
        scan.close();
        char ch;
        boolean isvalid=true;
        for(int get=0;get<str.length();get++){
            ch=str.charAt(get);
            switch(ch){
                case '0':
                System.out.print(HEX_BITS[0]+" ");
                break;
                case '1':
                System.out.print(HEX_BITS[1]+" ");
                break;
                case '2':
                System.out.print(HEX_BITS[2]+" ");
                break;
                case '3':
                System.out.print(HEX_BITS[3]+" ");
                break;
                case '4':
                System.out.print(HEX_BITS[4]+" ");
                break;
                case '5':
                System.out.print(HEX_BITS[5]+" ");
                break;
                case '6':
                System.out.print(HEX_BITS[6]+" ");
                break;
                case '7':
                System.out.print(HEX_BITS[7]+" ");
                break;
                case '8':
                System.out.println(HEX_BITS[8]+" ");
                break;
                case '9':
                System.out.println(HEX_BITS[9]+" ");
                break;
                case 'a':
                System.out.print(HEX_BITS[10]+" ");
                break;
                case 'b':
                System.out.print(HEX_BITS[11]+" ");
                break;
                case 'c':
                System.out.print(HEX_BITS[12]+" ");
                break;
                case 'd':
                System.out.print(HEX_BITS[13]+" ");
                break;
                case 'e':
                System.out.print(HEX_BITS[14]+" ");
                break;
                case 'f':
                System.out.print(HEX_BITS[15]+" ");
                break;
                default:
                System.out.print("The Hexdigit is not valid");
                isvalid=false;
                break;
            }
            if(!isvalid){
                break;
            }
        }

    }
}
