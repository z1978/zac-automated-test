package com.example.tests

import com.example.test.common.FirefoxTestBase
import com.example.page.LocalhostHomePage
import spock.lang.Unroll

@Unroll
class LocalhostTest extends FirefoxTestBase {
	def "go localhost"() {

		when:
		to LocalhostHomePage

		then:
		at LocalhostHomePage
		search.button.click()
	}
}