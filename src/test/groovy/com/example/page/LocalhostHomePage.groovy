package com.example.page

import geb.Page

class LocalhostHomePage extends Page {

  static url = "http://localhost/"

  static at = { title == "ajax" }

  static content = {
  }

}