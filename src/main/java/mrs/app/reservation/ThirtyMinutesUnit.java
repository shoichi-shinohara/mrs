package mrs.app.reservation;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = {ThirtyMinutesUnitValidator.class})
@Retention(RUNTIME)
@Target({ TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR })
public @interface ThirtyMinutesUnit {

	String message() default "{mrs.app.reservation.ThirtyMinutesUnit.message}";
	
	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default{};
	
	@Target({ TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR })
	@Retention(RUNTIME)
	@Documented
	public @interface List {
		ThirtyMinutesUnit[]value();
	}
}
