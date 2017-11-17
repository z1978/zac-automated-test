package com.example.page

import com.example.module.GoogleSearchModule;

import geb.Page

class GoogleHomePage extends Page {

    static url = "http://google.com/ncr"

    static at = { title == "Google" }

    static content = {
        search{ module GoogleSearchModule, buttonName: "btnG" }
    }

    public void search(String keyword){
        try {
            search.field.value(keyword)
            search.button.click()
        } catch (Exception e) {
            println "!!!!! ERROR START !!!!!"
            println e.toString()
            println "!!!!! ERROR END !!!!!"
        }
    }
}