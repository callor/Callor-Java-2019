package com.biz.pay.service;

public class PayServiceV3 extends PayServiceV2 {

	
	// array(int pay)
	// whilePay(int pay)
	
	// V2의 whilePay가 맘에 안들어 다시 정의 해서 사용할 예정
	@Override
	public void whilePay(int nPay) {
		
		this.headerView(nPay);
		
		int intSw = 1;
		
		// while(참인조건) {  }
		// 참인조건을 만족하는 동안 {  } 코드를 실행해라
		while(true) {
			
			if(nPay < 5) break; 
			
			int nCount = nPay / nPaper ; // 매수계산
			nPay -= nCount * nPaper; // nPay = nPay - nCount * nPaper
			System.out.printf("%8s 원권 %4d매\n",
					paperForm.format(nPaper),
					nCount);

			if(intSw == 1) {
				nPaper /= 5; // nPaper = nPaper / 5
			} else {
				nPaper /= 2; // nPaper = nPaper / 2
			}
			intSw = intSw * (-1);
		
		}
		System.out.println("=====================");
		
	}
	

}
