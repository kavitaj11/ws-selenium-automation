package com.williamssonoma.automationCore.util.verificationServices;

import java.util.List;

/**

 * Buffer to hold test method verification errors till the completion of test method execution.

 */
/* package access only */
class TestMethodErrorBuffer {
	// thread safe while running tests in parallel
	private static ThreadLocal<List<Throwable>> testErrorBuffer = new ThreadLocal<List<Throwable>>();

	static List<Throwable> get(){
		return testErrorBuffer.get();
	}

	static void set(List<Throwable> errorBuffer){
		testErrorBuffer.set(errorBuffer);
	}

	static void remove(){
		testErrorBuffer.remove();
	}
}