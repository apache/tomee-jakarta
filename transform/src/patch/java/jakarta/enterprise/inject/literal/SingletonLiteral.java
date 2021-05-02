package jakarta.enterprise.inject.literal;

import jakarta.enterprise.util.AnnotationLiteral;
import jakarta.inject.Singleton;

public final class SingletonLiteral extends AnnotationLiteral<Singleton> implements Singleton {

    public static final SingletonLiteral INSTANCE = new SingletonLiteral();

    private static final long serialVersionUID = 1L;

}
