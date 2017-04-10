
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

class contact extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.Contact],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(contactForm: Form[models.Contact],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.61*/("""

"""),_display_(/*3.2*/main("Welcome to Play",user)/*3.30*/ {_display_(Seq[Any](format.raw/*3.32*/("""
"""),format.raw/*4.1*/("""<!--..CONTENT..-->
<div class="container-fluid" id="content">
	<div class="container">
    <div class="row">
        <div class="col-md-8 col-md-offset-1">
            """),_display_(/*9.14*/if(flash.containsKey("success"))/*9.46*/{_display_(Seq[Any](format.raw/*9.47*/("""
                """),format.raw/*10.17*/("""<div class="alert alert-success">
                """),_display_(/*11.18*/flash/*11.23*/.get("success")),format.raw/*11.38*/("""
            """),format.raw/*12.13*/("""</div>
            """)))}),format.raw/*13.14*/("""
                """),format.raw/*14.17*/("""<form class="form-horizontal" action=""""),_display_(/*14.56*/routes/*14.62*/.HomeController.addContactSubmit),format.raw/*14.94*/("""" name="contactForm" method="post">
                    <fieldset>
                        <legend class="text-center header">Contact us</legend>


                            <div class="input-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
                            <div class="col-md-8">
                                <input id="fname" name="firstName" type="text" placeholder="First Name" class="form-control">
                            </div>
                            </div>


                            <div class="input-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
                            <div class="col-md-8">
                                <input id="lname" name="lastName" type="text" placeholder="Last Name" class="form-control">
                            </div>
                            </div>



                            <div class="input-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-envelope-o bigicon"></i></span>
                            <div class="col-md-8">
                                <input id="email" name="email" type="text" placeholder="Email Address" class="form-control">
                            </div>
                            </div>



                            <div class="input-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-phone-square bigicon"></i></span>
                            <div class="col-md-8">
                                <input id="phone" name="phone" type="text" placeholder="Phone" class="form-control">
                            </div>
                            </div>



                            <div class="input-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-pencil-square-o bigicon"></i></span>
                            <div class="col-md-8">
                                <textarea class="form-control" id="message" name="message" placeholder="Enter your massage for us here. We will get back to you within 2 business days." rows="7"></textarea>
                            </div>
                            </div>

                        <div class="form-group">
                            <div class="col-md-12 text-center">
                                <button type="submit" class="btn btn-success btn-lg">Submit</button>
                            </div>
                        </div>
				
                    </fieldset>
                </form>
			   <hr>
			  
			<div class="row">
				<div class="col-md-12 text-center">
                  <h3>See below for Social Sites</h3> 
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

/**/
object contact extends contact_Scope0.contact
              /*
                  -- GENERATED --
                  DATE: Mon Apr 10 11:16:20 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/contact.scala.html
                  HASH: 6be12892a1f9c20919c51318c430c0e72c66bcc9
                  MATRIX: 781->1|935->60|963->63|999->91|1038->93|1065->94|1260->263|1300->295|1338->296|1383->313|1461->364|1475->369|1511->384|1552->397|1603->417|1648->434|1714->473|1729->479|1782->511
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|40->9|40->9|40->9|41->10|42->11|42->11|42->11|43->12|44->13|45->14|45->14|45->14|45->14
                  -- GENERATED --
              */
          