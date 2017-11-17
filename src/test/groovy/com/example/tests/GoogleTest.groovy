package com.example.tests

import spock.lang.Unroll

import com.example.page.GoogleHomePage
import com.example.page.GoogleResultsPage
import com.example.page.WikipediaPage
import com.example.test.common.FirefoxTestBase

/**
 *
 * @author zac
 *
 */

class GoogleTest extends FirefoxTestBase {
  @Unroll
  def "first result for wikipedia search should be wikipedia"() {

    setup:
    println "===== setup ====="

    when:
    to GoogleHomePage

    then:
    at GoogleHomePage

    when:
    search("Wikipedia")

    then:
    waitFor { at GoogleResultsPage }

    when:
    firstResultLinkClick()

    then:
    waitFor { at WikipediaPage }


  }

  def cleanup(){
    driver.quit()
  }
}