package com.biz.pay;

import com.biz.pay.service.PayService;
import com.biz.pay.service.PayServiceV2;

public class PayMent_02 {

	public static void main(String[] args) {

		PayService ps = new PayServiceV2();
		int pay = 3849290;
		ps.array(pay);
		ps.whilePay(pay);
		
		
	}

}
