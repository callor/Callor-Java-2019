package com.callor.pay.service;

import java.util.List;

import com.callor.pay.domain.PaperVO;

public class PaperPrintServiceV1 {

	PaperReadServiceV1 pr = null;
	PaperMakeServiceV2 pm = null;
	List<String> payStrList;
	
	public void setPayStrList(List<String> payStrList) {
		this.payStrList = payStrList;
		this.pm = new PaperMakeServiceV2();
		this.pr = new PaperReadServiceV1();
	}
	
	public void print(List<PaperVO> paperList) {
		for(PaperVO vo : paperList) {
			System.out.println(vo.getPaper() + "\t" + vo.getCount());
		}
	}
	
	public void print() {
		
		
		// pay.txt에 읽은 문자열 들이 payStrList에 담겨있다.
		for(String pay : payStrList) {
			String[] pays = pay.split(":");
			// pays[0] : 사번
			// pays[1] : 급여
			
			System.out.println("=======================================");
			System.out.printf("사번 : %s, 급여 : %s\n",pays[0], pays[1]);
			System.out.println("---------------------------------------");
			
			// 각 사원에 대한 급여 화폐 내역 생성
			int intPay = Integer.valueOf(pays[1]);
			pm.make(intPay);
			List<PaperVO> paperList = pm.getPaperList();

			for(PaperVO vo : paperList) {
				System.out.println(vo.getPaper() + "\t" + vo.getCount());
			}
		
		}
		
		
		
		
	}

}
