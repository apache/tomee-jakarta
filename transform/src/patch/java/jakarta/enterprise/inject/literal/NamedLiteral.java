package jakarta.enterprise.inject.literal;

import jakarta.enterprise.util.AnnotationLiteral;
import jakarta.inject.Named;

public final class NamedLiteral extends AnnotationLiteral<Named> implements Named {

    public static final Named INSTANCE = of("");

    private static final long serialVersionUID = 1L;

    private final String value;

    public static NamedLiteral of(String value) {
        return new NamedLiteral(value);
    }

    public String value() {
        return value;
    }

    private NamedLiteral(String value) {
        this.value = value;
    }

}
