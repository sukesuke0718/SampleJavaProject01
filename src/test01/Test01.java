package test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01 {

	public static void main(String[] args) throws IOException {

		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		
        System.out.print("���O����͂��Ăˁ�");
        
        String Name = buf.readLine();
		System.out.println("����ɂ��́B" + Name + "����");

	}

}