package br.com.yolo.core.command;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Command {

    String[] names();

    String permission() default "";

    String permissionMessage() default "";

    String description() default "No descriptions provided for this command.";

    String usage() default "/<command>";

    boolean playerOnly() default false;

    boolean async() default false;
}
