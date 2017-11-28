package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass06 {
	public static void main(String[] args) {
		File file = new File("c:/myFolder/myMemo.txt");
		FileReader fr = null;//finally 안에서 close() 메소드를 사용하기 위해 변수 선언!
		BufferedReader br = null;
		
		try {
			//FileReader 객체 생성
			fr = new FileReader(file);
			//BufferedReader 객체 생성
			br = new BufferedReader(fr);
			//반복문 돌면서 한줄씩 읽어 들인다.
			while(true) {
				String line = br.readLine();
				//더이상 읽을 문자열이 없으면 null 이 리턴된다.
				if(line == null) {
					break; //반복문 탈출
				}
				//읽은 내용 콘솔에 출력해보기
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//마무리 작업
			try{
				//null 이 아닌 경우에 메소드를 호출하는 구조
				//다른 중요한 마무리 작업을 이행하기 위해서는 null 이 아닌 if 조건과 else 조건을 넣어줘야 한다.
				if(fr!=null)fr.close();//Exception 발생에 상관없이 close 하기 위해서는 finally 에서 쓰여야 한다. 
				if(br!=null)br.close();//try 안에 사용된 지역변수에 접근이 불가능하므로, 밖에서 변수를 초기값 null로 선언한다.
				/*
				 * 다른 중요한 마무리 작업.
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
