package potato.jobit.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User_careers {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "User_careers_id")
  private Long id;

  @Column(nullable = false)
  private String company;

  @Column(nullable = false)
  private String position;

  @Column
  private String content;

  @Column(nullable = false)
  private LocalDate startAt;

  @Column(nullable = false)
  private LocalDate endAt;

}
