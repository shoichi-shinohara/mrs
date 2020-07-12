package mrs.app.reservation;

import java.io.Serializable;
import java.time.LocalTime;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class ReservationForm implements Serializable {

	@NotNull(message = "必須です")
	@DateTimeFormat(pattern = "HH:mm")
	private LocalTime startTime;

	@NotNull(message = "必須です")
	@DateTimeFormat(pattern = "HH:mm")
	private LocalTime endTime;
}
