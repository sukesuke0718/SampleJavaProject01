package test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01 {

	public static void main(String[] args) throws IOException {

		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		
        System.out.print("名前を入力してね＞");
        
        String Name = buf.readLine();
		System.out.println("こんにちは。" + Name + "さん");

	}

}