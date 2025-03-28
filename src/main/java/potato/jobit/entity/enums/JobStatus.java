package potato.jobit.entity.enums;

import lombok.Getter;

@Getter
public enum JobStatus {

  EMPLOYED(1, "취업자"),
  JOB_SEEKER(2, "취준생");

  private final int id;
  private final String role;

  JobStatus(int id, String role) {
    this.id = id;
    this.role = role;
  }
}
