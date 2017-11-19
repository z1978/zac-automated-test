package com.example.page

import com.example.module.YahooSearchModule;

import geb.Page

class YahooResultsPage extends Page {
    static at = { title.endsWith "Yahoo!検索" }
    static content = {
        YahooResultsPageModule{ module YahooSearchModule, elementName: "input"}
    }

    public void yahooResultsPageClear(){
        try {
            YahooResultsPageModule.elementEachPart()
        } catch (Exception e) {
            println "!!!!! ERROR START !!!!!"
            println e.toString()
            println "!!!!! ERROR END !!!!!"
        }
    }
}
