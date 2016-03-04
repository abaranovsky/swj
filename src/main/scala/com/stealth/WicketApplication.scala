package com.stealth

import org.apache.wicket.protocol.http.WebApplication;

class WicketApplication extends WebApplication {
  override def getHomePage = classOf[HomePage]

  override def init() = super.init()
}
