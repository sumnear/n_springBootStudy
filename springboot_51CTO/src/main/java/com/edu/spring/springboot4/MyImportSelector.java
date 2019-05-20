package com.edu.spring.springboot4;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        System.out.println(annotationMetadata.getAnnotationAttributes(EnableLog.class.getName()));
        return new String[]{"com.edu.spring.springboot4.User",Role.class.getName()};
    }
}
