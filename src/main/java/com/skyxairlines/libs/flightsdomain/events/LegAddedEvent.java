package com.skyxairlines.libs.flightsdomain.events;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class LegAddedEvent {
  private String flightId;
  private String origin;
  private String destination;
  private LocalDateTime departureDateTime;
  private LocalDateTime arrivalDateTime;
}
