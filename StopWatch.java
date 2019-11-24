package CodingTest.Day1;

import java.util.concurrent.TimeUnit;

public class StopWatch {
	public static void main(String[] args) throws InterruptedException {
		long sTime = System.nanoTime();
		TimeUnit.SECONDS.sleep(10);
		long endTime = System.nanoTime();
		long timeElapsed = endTime - sTime;
		System.out.println("Elapsed time in nanoSecond :" +timeElapsed);
		System.out.println("Elapsed time in milli second :" + timeElapsed /1000000);
		
	}
	

}
