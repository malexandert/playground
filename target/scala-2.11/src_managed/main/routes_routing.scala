// @SOURCE:/Users/malexandert/Documents/playground/conf/routes
// @HASH:91a108d5f43020f3c6fad8cca74db51f7002974b
// @DATE:Wed May 20 10:28:57 EDT 2015


import scala.language.reflectiveCalls
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:9
private[this] lazy val controllers_Application_tasks1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tasks"))))
private[this] lazy val controllers_Application_tasks1_invoker = createInvoker(
controllers.Application.tasks,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "tasks", Nil,"GET", """ Tasks""", Routes.prefix + """tasks"""))
        

// @LINE:10
private[this] lazy val controllers_Application_newTask2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tasks"))))
private[this] lazy val controllers_Application_newTask2_invoker = createInvoker(
controllers.Application.newTask,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "newTask", Nil,"POST", """""", Routes.prefix + """tasks"""))
        

// @LINE:11
private[this] lazy val controllers_Application_deleteTask3_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tasks/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
private[this] lazy val controllers_Application_deleteTask3_invoker = createInvoker(
controllers.Application.deleteTask(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteTask", Seq(classOf[Long]),"POST", """""", Routes.prefix + """tasks/$id<[^/]+>/delete"""))
        

// @LINE:14
private[this] lazy val controllers_Assets_at4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at4_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tasks""","""controllers.Application.tasks"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tasks""","""controllers.Application.newTask"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tasks/$id<[^/]+>/delete""","""controllers.Application.deleteTask(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index)
   }
}
        

// @LINE:9
case controllers_Application_tasks1_route(params) => {
   call { 
        controllers_Application_tasks1_invoker.call(controllers.Application.tasks)
   }
}
        

// @LINE:10
case controllers_Application_newTask2_route(params) => {
   call { 
        controllers_Application_newTask2_invoker.call(controllers.Application.newTask)
   }
}
        

// @LINE:11
case controllers_Application_deleteTask3_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_deleteTask3_invoker.call(controllers.Application.deleteTask(id))
   }
}
        

// @LINE:14
case controllers_Assets_at4_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at4_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     