
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object contact_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

     object contact_Scope1 {
import helper._

class contact extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.Contact],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(contactForm: Form[models.Contact], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.62*/("""

"""),_display_(/*5.2*/main("Contact", user)/*5.23*/ {_display_(Seq[Any](format.raw/*5.25*/("""
    """),format.raw/*6.5*/("""<!--..CONTENT..-->
    <div class="container-fluid" id="content">
        <div class="container">
            <div class="row">
                <div class="col-md-8 col-md-offset-1">
                    """),_display_(/*11.22*/if(flash.containsKey("success"))/*11.54*/ {_display_(Seq[Any](format.raw/*11.56*/("""
                        """),format.raw/*12.25*/("""<div class="alert alert-success text-center">
                        """),_display_(/*13.26*/flash/*13.31*/.get("success")),format.raw/*13.46*/("""
                        """),format.raw/*14.25*/("""</div>
                    """)))}),format.raw/*15.22*/("""
                    """),format.raw/*16.21*/("""<h1 class = "text-center">Contact Us</h1>
                    <div class="col-lg-12" id="contactForm">
                    """),_display_(/*18.22*/form(action = routes.HomeController.addContactSubmit(), 'method -> "POST", 'class -> "form-horizontal", 'role -> "form")/*18.142*/ {_display_(Seq[Any](format.raw/*18.144*/("""
                        """),_display_(/*19.26*/inputText(contactForm("firstName"), '_label -> "First Name", 'class -> "form-control", 'maxlength -> "30")),format.raw/*19.132*/("""
                        """),_display_(/*20.26*/inputText(contactForm("lastName"), '_label -> "Last Name", 'class -> "form-control", 'maxlength -> "30")),format.raw/*20.130*/("""
                        """),_display_(/*21.26*/inputText(contactForm("email"), '_label -> "Email", 'type -> "email", 'class -> "form-control")),format.raw/*21.121*/("""
                        """),_display_(/*22.26*/inputText(contactForm("phone"), '_label -> "Phone", 'type -> "tel", 'pattern -> "[0-9]{10}", 'title -> "10 digit mobile number",
                            'class -> "form-control")),format.raw/*23.54*/("""
                        """),_display_(/*24.26*/inputText(contactForm("message"), '_label -> "Message", 'type -> "text", 'class -> "form-control", 'maxlength -> "140")),format.raw/*24.145*/("""

                        """),format.raw/*26.25*/("""<div class="actions">
                            <input type="submit" value="Submit" class="btn btn-success">
                            <a href=""""),_display_(/*28.39*/routes/*28.45*/.HomeController.contact()),format.raw/*28.70*/("""" class="btn btn-danger">Cancel</a>
                        </div>
                """)))}),format.raw/*30.18*/("""
                    """),format.raw/*31.21*/("""</div>
            </div>

        </div>


        <div class="row">
            <div class="col-md-12 text-center">
                <hr>
                <h4 class="text-center">See below for Social Sites</h4>
            </div>
        </div>

    </div>

    </div>

    </div>
    </div>
        <!--END CONTENT-->

""")))}))
      }
    }
  }

  def render(contactForm:Form[models.Contact],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(contactForm,user)

  def f:((Form[models.Contact],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (contactForm,user) => apply(contactForm,user)

  def ref: this.type = this

}


}
}

/**/
object contact extends contact_Scope0.contact_Scope1.contact
              /*
                  -- GENERATED --
                  DATE: Wed Apr 19 13:47:03 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/contact.scala.html
                  HASH: 9e8a0e16a8042e80350df3d2d5d4bbf1fb8018ad
                  MATRIX: 827->19|982->79|1010->82|1039->103|1078->105|1109->110|1340->314|1381->346|1421->348|1474->373|1572->444|1586->449|1622->464|1675->489|1734->517|1783->538|1934->662|2064->782|2105->784|2158->810|2286->916|2339->942|2465->1046|2518->1072|2635->1167|2688->1193|2891->1375|2944->1401|3085->1520|3139->1546|3315->1695|3330->1701|3376->1726|3491->1810|3540->1831
                  LINES: 30->3|35->3|37->5|37->5|37->5|38->6|43->11|43->11|43->11|44->12|45->13|45->13|45->13|46->14|47->15|48->16|50->18|50->18|50->18|51->19|51->19|52->20|52->20|53->21|53->21|54->22|55->23|56->24|56->24|58->26|60->28|60->28|60->28|62->30|63->31
                  -- GENERATED --
              */
          