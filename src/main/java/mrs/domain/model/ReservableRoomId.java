package mrs.domain.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public final class ReservableRoomId implements Serializable {

	private final Integer roomId;

	private final LocalDate reservedDate;

}
