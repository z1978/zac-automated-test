package com.example.page

import geb.Page
import com.example.module.LocalhostHomePageModule
class LocalhostHomePage extends Page {
	static url = "http://localhost/"
	static at = { title == "ajax" }
	static content = {
		search { module LocalhostHomePageModule, buttonValue: 'サンプル3' }
	}
}