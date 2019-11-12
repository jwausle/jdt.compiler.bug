package jdt.compiler.bug.bundle.api;

import javax.xml.transform.Transformer;
import org.w3c.dom.Node;
import javax.naming.InitialContext;

// Copied from https://bugs.openjdk.java.net/browse/JDK-8215739
public class CompileJavaxXmlTransformUsage {
  Transformer transformer;
  Node node;
  InitialContext initialContext;
}
