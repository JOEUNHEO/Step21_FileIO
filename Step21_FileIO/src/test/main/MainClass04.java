package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass04 {
	public static void main(String[] args) {
		String path = "c:/myFolder/myMemo.txt";
		File file = new File(path);
		try {
			FileWriter fw = new FileWriter(file);
			fw.write("�ϳ�\r\n");
			fw.write("�ο�\r\n");
			fw.write("��¼��\r\n");
			fw.write("��¼��\r\n");
			fw.flush();
			fw.close();
			System.out.println("mymemo.txt �� ���ڿ� �����!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
