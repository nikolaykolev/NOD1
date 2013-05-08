package com.sirma.itt.javacourse.reflections;

import java.lang.annotation.Annotation;

public class SortClasses {

	public void sortClasses() {
		ParentClass[] classes = { new ClassTwo(), new ClassOne(), new ClassThree() };
		for (int i = 0; i < classes.length; i++) {
			Annotation[] ann = classes[i].getClass().getAnnotations();
			for (int j = 0; j < ann.length; j++) {
				ann[j].annotationType();
			}
		}
	}
}
