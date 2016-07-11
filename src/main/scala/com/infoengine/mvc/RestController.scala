package com.infoengine.mvc

import com.infoengine.mvc.module.User
import com.infoengine.service.interfaces.TestService
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation._

/**
 * Created by Zhoupeiwen on 2016/6/22.
 */
@Controller
@RequestMapping(Array("/rest"))
class RestController {

  private[this] val logger = LoggerFactory.getLogger(classOf[RestController])

  @Autowired
  var testService: TestService = _

  @RequestMapping(value = Array("/user/{id}"),method = Array(RequestMethod.GET))
  def get(@PathVariable("id")  id:Int):String = {

    println(s"id is $id")
    logger.info("this is the log for RestController")
    return "/hello"
  }

  @RequestMapping(value = Array("/input"))
  def newUser():String = {
    "forms"
  }

  @RequestMapping(value = Array("/user/new"))
  def newUserInput(user:User,mod: ModelMap):String = {
    println(s"id:${user.getId}")
    mod.addAttribute("message",s"welcome:${user.getName}" )
    "hello"
  }

  @RequestMapping(value = Array("/user/add"))
  def addUser():String = {
    testService.addInfo()
    "hello"
  }

  @ResponseBody
  @RequestMapping(value = Array("/json/{id}"),method = Array(RequestMethod.GET))
  def getJson(@PathVariable("id")  id:Int):String = {

    println(s"id is $id")

    return s"{id:$id}"
  }



    @RequestMapping(value = Array("/redirect"))
    def redirect(mod: ModelMap):String = {
      mod.addAttribute("message", "redirect")
      "hello"
    }

}
