package org.adligo.gwt_node_hw.shared;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import jsinterop.annotations.JsType;
/**
 * This is the simplest possible test of running
 *  Java on Node.js server side.  This would really only be useful
 *  for dependency libraries where support of multiple languages
 *  would be desiered, ie Java, JavaScript and TypeScript.
 */
@JsType (name="HelloNode", namespace="foo")
public class HelloNode {
  public static void  println(String s) {
    GWT.log(s);
  }

  public  HelloNode() {
    println("In HelloWorld default constructor");
  }

  public HelloNode then(boolean b) {
    println("then boolean " + b);
    return this;
  }

  public  HelloNode then(int i) {
    println("then int " + i);
    return this;
  }

  public  HelloNode then(double d) {
    println("then double " + d);
    return this;
  }

  public  HelloNode then(float f) {
    println("then flaot " + f);
    return this;
  }

  public  HelloNode then(String s) {
    println("then string " + s);
    return this;
  }

  public  HelloNode then(JavaScriptObject jso) {
    println("then JavaScriptObject " + jso);
    return this;
  }
}
