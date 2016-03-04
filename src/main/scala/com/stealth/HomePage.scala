package com.stealth


import org.apache.wicket.markup.html.WebPage
import org.apache.wicket.markup.html.basic.Label
import org.apache.wicket.markup.html.form.{TextField, PasswordTextField, Form}
import org.apache.wicket.model.{CompoundPropertyModel, Model}
import org.apache.wicket.request.mapper.parameter.PageParameters;

class HomePage(pageParameters: PageParameters) extends WebPage(pageParameters) {

  val username: String = ""
  val password: String = ""

  add(new Label("label", Model.of("Hello, World!")))
  val form = new Form[HomePage]("form") {
    override def onSubmit(): Unit = {
      println("Submitted!")
    }
  }
  form.setDefaultModel(new CompoundPropertyModel(this))
  form.add(new TextField("username"))
  form.add(new PasswordTextField("password"))
  add(form)
}
