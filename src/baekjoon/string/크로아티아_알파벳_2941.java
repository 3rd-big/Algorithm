package src.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 크로아티아_알파벳_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String rawData = bufferedReader.readLine();
        System.out.println(rawData.replace("c=", ".")
                                    .replace("c-", ".")
                                    .replace("dz=", ".")
                                    .replace("d-", ".")
                                    .replace("lj", ".")
                                    .replace("nj", ".")
                                    .replace("s=", ".")
                                    .replace("z=", ".").length());
    }
}
