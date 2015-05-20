
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Task],Form[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tasks: List[Task], taskForm: Form[String]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.45*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Todo list")/*5.19*/ {_display_(Seq[Any](format.raw/*5.21*/("""

    """),format.raw/*7.5*/("""<h1>"""),_display_(/*7.10*/tasks/*7.15*/.size),format.raw/*7.20*/(""" """),format.raw/*7.21*/("""task(s)</h1>

    <ul>
    	"""),_display_(/*10.7*/tasks/*10.12*/.map/*10.16*/ { task =>_display_(Seq[Any](format.raw/*10.26*/("""
    		"""),format.raw/*11.7*/("""<li>
    			"""),_display_(/*12.9*/task/*12.13*/.label),format.raw/*12.19*/("""

    			"""),_display_(/*14.9*/form(routes.Application.deleteTask(task.id))/*14.53*/ {_display_(Seq[Any](format.raw/*14.55*/("""
    				"""),format.raw/*15.9*/("""<input type="submit" value = "Delete">
    			""")))}),format.raw/*16.9*/("""
    		"""),format.raw/*17.7*/("""</li>
    	""")))}),format.raw/*18.7*/("""
    """),format.raw/*19.5*/("""</ul>

    <h2>Add a new task</h2>

    """),_display_(/*23.6*/form(routes.Application.newTask)/*23.38*/ {_display_(Seq[Any](format.raw/*23.40*/("""
    	"""),_display_(/*24.7*/inputText(taskForm("label"))),format.raw/*24.35*/("""

    	"""),format.raw/*26.6*/("""<input type="submit" value="Create">
    """)))}),format.raw/*27.6*/("""

""")))}),format.raw/*29.2*/("""
"""))}
  }

  def render(tasks:List[Task],taskForm:Form[String]): play.twirl.api.HtmlFormat.Appendable = apply(tasks,taskForm)

  def f:((List[Task],Form[String]) => play.twirl.api.HtmlFormat.Appendable) = (tasks,taskForm) => apply(tasks,taskForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed May 20 11:37:48 EDT 2015
                  SOURCE: /Users/malexandert/Documents/playground/app/views/index.scala.html
                  HASH: 62ed883768b2fdcf5e91caa001d4ef71881d3d3c
                  MATRIX: 522->1|668->44|696->63|723->65|748->82|787->84|819->90|850->95|863->100|888->105|916->106|971->135|985->140|998->144|1046->154|1080->161|1119->174|1132->178|1159->184|1195->194|1248->238|1288->240|1324->249|1401->296|1435->303|1477->315|1509->320|1576->361|1617->393|1657->395|1690->402|1739->430|1773->437|1845->479|1878->482
                  LINES: 19->1|22->1|24->4|25->5|25->5|25->5|27->7|27->7|27->7|27->7|27->7|30->10|30->10|30->10|30->10|31->11|32->12|32->12|32->12|34->14|34->14|34->14|35->15|36->16|37->17|38->18|39->19|43->23|43->23|43->23|44->24|44->24|46->26|47->27|49->29
                  -- GENERATED --
              */
          