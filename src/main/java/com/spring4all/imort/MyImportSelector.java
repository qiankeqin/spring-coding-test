package com.spring4all.imort;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @program: spring-annotation
 * @description:
 * @author: qiankeqin
 * @create: 2018-09-19 20:41
 **/
public class MyImportSelector implements ImportSelector {
    //返回值，就是导入到容器中的组件的全类名
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //编写需要导入的组件的逻辑
        //不能返回null，会报NPE
//        return new String[0];
        return new String[]{"com.spring4all.pojo.Blue","com.spring4all.pojo.Yellow"};
    }
}
