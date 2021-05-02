package jakarta.ejb;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.*;

@Target(METHOD)
@Retention(RUNTIME)
@Repeatable(Schedules.class)
public @interface Schedule {

    String second() default "0";

    String minute() default "0";

    String hour() default "0";

    String dayOfMonth() default "*";

    String month() default "*";

    String dayOfWeek() default "*";

    String year() default "*";

    String timezone() default "";

    String info() default "";

    boolean persistent() default true;
}
