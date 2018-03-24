package gitupload;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

public class MousePointer {
	@Test
	public void f() throws AWTException, InterruptedException {

		//		first way is prefered

		PointerInfo p = MouseInfo.getPointerInfo();
		Point c =p.getLocation();

		int x = (int) c.getX();
		int y = (int) c.getY();

		System.out.println("x axis:"+x);
		System.out.println("y axis:"+y);

		// 		second way is prefered

		double mouseX = MouseInfo.getPointerInfo().getLocation().getX();
		double mouseY = MouseInfo.getPointerInfo().getLocation().getY();
		System.out.println("X:" + mouseX);
		System.out.println("Y:" + mouseY);



		//Implementation 

		Robot r = new Robot();
		Thread.sleep(5000);
		r.mouseMove(741, 150);



		//	to click on the element using robot/highlight an element

		r.mousePress(InputEvent.BUTTON2_MASK);
		r.mouseRelease(InputEvent.BUTTON2_MASK);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);





		//		Source : http://stackoverflow.com/questions/1439022/get-mouse-position




	}

}
