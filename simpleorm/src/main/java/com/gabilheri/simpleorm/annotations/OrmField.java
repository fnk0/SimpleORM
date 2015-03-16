package com.gabilheri.simpleorm.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 12/5/14.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface OrmField {

    boolean foreignKey() default false;
    String referenceTable() default "";
    String name() default "";
    String refKey() default "_ID";

}
