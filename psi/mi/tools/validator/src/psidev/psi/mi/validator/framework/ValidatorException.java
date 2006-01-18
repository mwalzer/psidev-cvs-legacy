package psidev.psi.mi.validator.framework;

/**
 * <b> Exception specific to the validator framework. </b>.
 *
 * @author Matthias Oesterheld
 * @version $Id$
 * @since 2006-01-04
 */
public class ValidatorException extends Exception {

    public ValidatorException( String message ) {
        super( message );
    }

    public ValidatorException( String message, Throwable cause ) {
        super( message, cause );
    }
}