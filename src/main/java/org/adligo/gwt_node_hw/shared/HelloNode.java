package org.adligo.gwt_node_hw.shared;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * This is the simplest possible test of running
 *  Java on Node.js server side.  This would really only be useful
 *  for dependency libraries where support of multiple languages
 *  would be desiered, ie Java, JavaScript and TypeScript.
 */
public class HelloNode {
  public static void  println(String s) {
    System.out.println(s);
  }

  public  HelloNode() {
    println("In HelloWorld default constructor");
  }

  public  HelloNode(boolean b) {
    println("In HelloWorld default constructor with boolean " + b);
  }

  public  HelloNode(int i) {
    println("In HelloWorld default constructor with int " + i);
  }

  public  HelloNode(double d) {
    println("In HelloWorld default constructor with double " + d);
  }

  public  HelloNode(float f) {
    println("In HelloWorld default constructor with flaot " + f);
  }

  public  HelloNode(String s) {
    println("In HelloWorld default constructor with string " + s);
  }

  public  HelloNode(JavaScriptObject jso) {
    println("In HelloWorld default constructor with JavaScriptObject " + jso);
  }
}
