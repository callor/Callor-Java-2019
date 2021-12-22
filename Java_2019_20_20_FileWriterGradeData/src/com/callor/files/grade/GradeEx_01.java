package com.callor.files.grade;

import com.callor.files.service.GradeService;
import com.callor.files.service.GradeServiceV1;

public class GradeEx_01 {

	public static void main(String[] args) {

		GradeService gs = new GradeServiceV1();
		
		String fileName = "src/com/callor/files/성적일람표.txt";
		
		try {
			gs.makeScoreFile(fileName, 30);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("프로세스 완료!!");
		
	}

}
