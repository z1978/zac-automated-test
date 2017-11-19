package com.example.page

import com.example.module.YahooSearchModule;

import geb.Page

class YahooHomePage extends Page {

    static url = "http://www.yahoo.co.jp"

    static at = { title == "Yahoo! JAPAN" }

    static content = {
        yahooHomePageModule{ module YahooSearchModule, elementName: "input"}
    }

    public void yahooHomePageSearch(String keyword){
        println keyword
        try {
            yahooHomePageModule.elementEachPart()
            yahooHomePageModule.field.value(keyword)
            yahooHomePageModule.homeSrchbtn.click()
        } catch (Exception e) {
            println "!!!!! ERROR START !!!!!"
            println e.toString()
            println "!!!!! ERROR END !!!!!"
        }
    }
}