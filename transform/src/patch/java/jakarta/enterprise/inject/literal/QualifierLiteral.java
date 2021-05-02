package jakarta.enterprise.inject.literal;

import jakarta.enterprise.util.AnnotationLiteral;
import jakarta.inject.Qualifier;

public final class QualifierLiteral extends AnnotationLiteral<Qualifier> implements Qualifier {

    public static final QualifierLiteral INSTANCE = new QualifierLiteral();

    private static final long serialVersionUID = 1L;

}
