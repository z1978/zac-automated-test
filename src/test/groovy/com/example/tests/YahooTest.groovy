package com.example.tests

import com.example.page.YahooHomePage;
import com.example.page.YahooResultsPage;
import com.example.test.common.FirefoxTestBase

/**
 *
 * @author zac
 *
 */

class YahooTest extends FirefoxTestBase {

    def "output yahoo"() {
        when:
        to YahooHomePage

        then:
        waitFor{ at YahooHomePage}


        when:
        yahooHomePageSearch("Wikipedia")

        //        $("form").p = "sample"
        //        $("input",value:"検索").click()

        then:
        waitFor{ at YahooResultsPage}

        yahooResultsPageClear()
        //clearBtn()


        println "Game over"
        //        cookieUtil.printCookies()
        //        assert cookieUtil.getCookieVal("JV") != null
    }

    //  @Unroll
    //  def "first result for wikipedia search should be wikipedia"() {
    //
    //    setup:
    //    println "===== setup ====="
    //
    //    when:
    //    to GoogleHomePage
    //
    //    then:
    //    at GoogleHomePage
    //
    //    when:
    //    search("Wikipedia")
    //
    //    then:
    //    waitFor { at GoogleResultsPage }
    //
    //    when:
    //    firstResultLinkClick()
    //
    //    then:
    //    waitFor { at WikipediaPage }
    //
    //
    //  }

    //  def cleanup(){
    //    driver.quit()
    //  }
}