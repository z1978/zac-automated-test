package com.example.module

import com.example.page.YahooResultsPage;

import geb.Module

class YahooSearchModule extends Module {

    def elementName

    static content = {

        field { $("input", name: "p") }

        homeSrchbtn(to: YahooResultsPage) { $("#srchbtn") }

        moduleSbnClearBtn() {
            println moduleSbnClearBtnName
            $("input", id: "sbnClearBtn")
        }

        elementEachPart(){
            println elementName
            $(elementName).each{
                println "name: " + it.getAttribute("name") +
                        ", type: " + it.getAttribute("type") +
                        ", value: " + it.getAttribute("value")
            }
        }
    }
}