// @SOURCE:/Users/malexandert/Documents/playground/conf/routes
// @HASH:91a108d5f43020f3c6fad8cca74db51f7002974b
// @DATE:Wed May 20 10:28:57 EDT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:14
class ReverseAssets {


// @LINE:14
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {


// @LINE:9
def tasks(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "tasks")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:10
def newTask(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "tasks")
}
                        

// @LINE:11
def deleteTask(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "tasks/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                        

}
                          
}
                  


// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:14
class ReverseAssets {


// @LINE:14
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {


// @LINE:9
def tasks : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.tasks",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tasks"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:10
def newTask : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.newTask",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tasks"})
      }
   """
)
                        

// @LINE:11
def deleteTask : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteTask",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tasks/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

}
              
}
        


// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:14
class ReverseAssets {


// @LINE:14
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {


// @LINE:9
def tasks(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.tasks(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "tasks", Seq(), "GET", """ Tasks""", _prefix + """tasks""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:10
def newTask(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.newTask(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "newTask", Seq(), "POST", """""", _prefix + """tasks""")
)
                      

// @LINE:11
def deleteTask(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteTask(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteTask", Seq(classOf[Long]), "POST", """""", _prefix + """tasks/$id<[^/]+>/delete""")
)
                      

}
                          
}
        
    