package com.example.tests

import com.example.test.common.FirefoxTestBase
import org.openqa.selenium.Alert

class OnbeforeunloadDebugTest extends FirefoxTestBase {

	def "Onbeforeunload Debug"() {
		when:
		go "http://localhost/onbeforeunload.html"

		//	at "http://localhost/onbeforeunload.html"
		println title


		try {
			$("a").click()

		} catch (Exception e) {
			e.cause ==null
			println e.message
		}
		//	if (driver != null) {
		//		println driver.getClass().name
		//		def windowHandles = driver.getWindowHandles()
		//		for (String window : windowHandles) {
		//			println window
		////		  driver.switchTo().window(window)
		////		  driver.close()
		//		}
		//	}
		//	close()
		//	val alert = driver.switchTo.alert
		//	val text = alert.getText
		//	println text
		//	driver.switchTo().activeElement()
		//
		//	withNewWindow({ button.click() }, close: false, wait: true) {
		//		//Other things
		//		withConfirm { driver.close() }
		//	}
		//	driver.navigate().back()
		then:
		try {
			Alert alert = driver.switchTo().alert()
			println alert.getText()
			alert.accept()
//			alert.dismiss()
//			alert.sendKeys(Keys.ENTER)
		} catch (Exception e) {
			e.cause ==null
			println "<<<<<" +e.message + ">>>>>"
		}
		//	thrown(EmptyStackException)

		//	EmptyStackException e = thrown()
		//	e.cause ==null
		//	println e.message
		println title
		println "Game over"
		//    at "http://localhost/onbeforeunload.html"

	}
}