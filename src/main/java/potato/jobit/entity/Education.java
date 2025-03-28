package potato.jobit.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import potato.jobit.entity.enums.StudentStatus;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Education {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "Education_id")
  private Long id;

  @Column(nullable = false) // null 불가
  private String school;

  @Column(nullable = false) // null 불가
  private String major;

  @Column(nullable = false) // null 불가
  private int grade;

  @Enumerated(EnumType.STRING)
  @Column(nullable = false) // null 불가
  private StudentStatus studentStatus;


  // 상태 변환 메서드
  public void changeStatus(StudentStatus newStatus) { //dto로 바꿔도 됨
    this.studentStatus = newStatus;
  }

}
