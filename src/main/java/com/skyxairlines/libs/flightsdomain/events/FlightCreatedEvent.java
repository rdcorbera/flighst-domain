package com.skyxairlines.libs.flightsdomain.events;

import com.skyxairlines.libs.flightsdomain.domain.FlightKey;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FlightCreatedEvent {
  private FlightKey key;
}