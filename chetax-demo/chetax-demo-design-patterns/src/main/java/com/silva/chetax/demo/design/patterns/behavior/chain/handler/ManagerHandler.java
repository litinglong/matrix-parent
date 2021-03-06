package com.silva.chetax.demo.design.patterns.behavior.chain.handler;

import java.math.BigDecimal;

import com.silva.chetax.demo.design.patterns.behavior.chain.Handler;
import com.silva.chetax.demo.design.patterns.behavior.chain.Request;

public class ManagerHandler implements Handler {
	public Boolean process(Request request) {
		System.out.println("ManagerHandler process");
		// 如果超过1000元，处理不了，交下一个处理:
		if (request.getAmount().compareTo(BigDecimal.valueOf(100)) > 0) {
			return null;
		}
		// 对Bob有偏见:
		return !request.getName().equalsIgnoreCase("bob");
	}
}
