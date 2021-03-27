package src.baekjoon.string;

import java.io.IOException;
import java.io.InputStream;

public class 다이얼_5622 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        int readByte;
        int result = 0;
        while ( (readByte = inputStream.read()) != -1 && readByte != 10) {
            if ((char) readByte == 'A' || (char) readByte == 'B' || (char) readByte == 'C') {
                result += 3;
            } else if ((char) readByte == 'D' || (char) readByte == 'E' || (char) readByte == 'F') {
                result += 4;
            } else if ((char) readByte == 'G' || (char) readByte == 'H' || (char) readByte == 'I') {
                result += 5;
            } else if ((char) readByte == 'J' || (char) readByte == 'K' || (char) readByte == 'L') {
                result += 6;
            } else if ((char) readByte == 'M' || (char) readByte == 'N' || (char) readByte == 'O') {
                result += 7;
            } else if ((char) readByte == 'P' || (char) readByte == 'Q' || (char) readByte == 'R' || (char) readByte == 'S') {
                result += 8;
            } else if ((char) readByte == 'T' || (char) readByte == 'U' || (char) readByte == 'V') {
                result += 9;
            } else if ((char) readByte == 'W' || (char) readByte == 'X' || (char) readByte == 'Y' || (char) readByte == 'Z') {
                result += 10;
            }
        }
        System.out.println(result);
    }
}
