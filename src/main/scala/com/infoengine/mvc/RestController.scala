package com.infoengine.mvc

import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.{ResponseBody, PathVariable, RequestMethod, RequestMapping}

/**
 * Created by Zhoupeiwen on 2016/6/22.
 */
@Controller
@RequestMapping(Array("/rest"))
class RestController {

  @RequestMapping(value = Array("/user/{id}"),method = Array(RequestMethod.GET))
  def get(@PathVariable("id")  id:Int):String = {

    println(s"id is $id")

    return "/hello"
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
