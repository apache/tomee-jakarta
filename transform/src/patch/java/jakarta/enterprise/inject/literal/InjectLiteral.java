package jakarta.enterprise.inject.literal;

import jakarta.enterprise.util.AnnotationLiteral;
import jakarta.inject.Inject;

public final class InjectLiteral extends AnnotationLiteral<Inject> implements Inject {

    public static final InjectLiteral INSTANCE = new InjectLiteral();

    private static final long serialVersionUID = 1L;

}
