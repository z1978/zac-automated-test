package com.example.module

import com.example.page.GoogleResultsPage;

import geb.Module

class GoogleSearchModule extends Module {

  def buttonName

  static content = {
    field { $("input", name: "q") }
    button(to: GoogleResultsPage) {
        println buttonName
      $("button", name: buttonName)
    }
  }
}