package com.skyxairlines.libs.flightsdomain.events;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GateUpdatedEvent {
  private String flightId;
  private String origin;
  private String gate;
  private int terminal;
}
