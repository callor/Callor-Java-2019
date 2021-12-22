package com.biz.pay.service;

public class PayServiceV5 extends PayServiceV2 {
	
	// array(int nPay)
	// whilePay(int nPay)
	
	// for를 이용한 코드
	public void forPay(int nPay) {

		this.headerView(nPay);
		for(int i = 0; nPay > 1 ;i++) {
			
			int nCount = nPay / nPaper;
			nPay -= nCount * nPaper;

			System.out.printf("%8s 원권 %4d매\n",
					paperForm.format(nPaper),
					nCount);
			
			if(i%2 == 0) {
				nPaper /= 5;
			} else {
				nPaper /= 2;
			}
			
		}
		System.out.println("============================");
		
	}

}
