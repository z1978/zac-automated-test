package com.example.test.common

import geb.spock.GebSpec
import com.example.page.LocalhostHomePage
import org.openqa.selenium.firefox.FirefoxDriver
import spock.lang.Unroll

class FirefoxTestBase extends GebSpec {
	def setup() {
		driver = new FirefoxDriver()
	  }
	def cleanup(){
		driver.quit()
	}
}