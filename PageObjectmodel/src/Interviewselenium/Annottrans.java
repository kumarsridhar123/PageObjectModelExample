package Interviewselenium;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.text.Annotation;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import com.sun.jdi.Method;



public abstract class Annottrans implements IAnnotationTransformer{

	public abstract void transform(ITestAnnotation annotation, Class testClass,Constructor testConstructor, Method testMethod);
	 
	

}
