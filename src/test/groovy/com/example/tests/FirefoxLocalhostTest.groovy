package com.example.tests

import geb.spock.GebSpec
import com.example.page.LocalhostHomePage
import org.openqa.selenium.firefox.FirefoxDriver
import spock.lang.Unroll

class FirefoxLocalhostTest extends GebSpec {
	@Unroll
	def "go localhost"() {

		setup:
		driver = new FirefoxDriver()

		when:
		to LocalhostHomePage

		then:
		at LocalhostHomePage
	}

	def cleanup(){
		driver.quit()
	}
}