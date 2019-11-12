package jdt.compiler.bug.bundle.impl;

import javax.xml.transform.Transformer;
import org.w3c.dom.Node;
import javax.naming.InitialContext;
import jdt.compiler.bug.bundle.api.CompileJavaxXmlTransformUsage;

// Copied from https://bugs.openjdk.java.net/browse/JDK-8215739
public class ExtendCompileJavaxXmlTransformUsage extends CompileJavaxXmlTransformUsage {
    Transformer transformer;
    Node node;
    InitialContext initialContext;

}
