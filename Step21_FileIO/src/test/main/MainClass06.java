package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass06 {
	public static void main(String[] args) {
		File file = new File("c:/myFolder/myMemo.txt");
		FileReader fr = null;//finally �ȿ��� close() �޼ҵ带 ����ϱ� ���� ���� ����!
		BufferedReader br = null;
		
		try {
			//FileReader ��ü ����
			fr = new FileReader(file);
			//BufferedReader ��ü ����
			br = new BufferedReader(fr);
			//�ݺ��� ���鼭 ���پ� �о� ���δ�.
			while(true) {
				String line = br.readLine();
				//���̻� ���� ���ڿ��� ������ null �� ���ϵȴ�.
				if(line == null) {
					break; //�ݺ��� Ż��
				}
				//���� ���� �ֿܼ� ����غ���
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//������ �۾�
			try{
				//null �� �ƴ� ��쿡 �޼ҵ带 ȣ���ϴ� ����
				//�ٸ� �߿��� ������ �۾��� �����ϱ� ���ؼ��� null �� �ƴ� if ���ǰ� else ������ �־���� �Ѵ�.
				if(fr!=null)fr.close();//Exception �߻��� ������� close �ϱ� ���ؼ��� finally ���� ������ �Ѵ�. 
				if(br!=null)br.close();//try �ȿ� ���� ���������� ������ �Ұ����ϹǷ�, �ۿ��� ������ �ʱⰪ null�� �����Ѵ�.
				/*
				 * �ٸ� �߿��� ������ �۾�.
				 * .
				 * .
				 * .
				 * 
				 */
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
