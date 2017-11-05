package com.example.tests

import com.example.test.common.FirefoxTestBase

class DebugTest extends FirefoxTestBase {

  def "output debug log"() {
    when:
    go "http://www.yahoo.co.jp"

    then:
    waitFor{ title == "Yahoo! JAPAN"}
    $("input").each{
      println "name: " + it.getAttribute("name") +
          ", type: " + it.getAttribute("type") +
          ", value: " + it.getAttribute("value")
    }
  }
}