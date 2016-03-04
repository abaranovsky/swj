package com.stealth


import org.apache.wicket.markup.html.WebPage
import org.apache.wicket.markup.html.basic.Label
import org.apache.wicket.model.Model
import org.apache.wicket.request.mapper.parameter.PageParameters;

class HomePage(pageParameters: PageParameters) extends WebPage(pageParameters) {

  add(new Label("label", Model.of("Hello, World!")))

}
