package potato.jobit.entity.enums;

public enum StudentStatus {
    ENROLLED(1, "재학 중"),
    ON_LEAVE(2, "휴학 중"),
    GRADUATED(3, "졸업"),
    DROPPED_OUT(4, "자퇴");

    private final int id;
    private final String role;

    StudentStatus(int id, String role) {
        this.id = id;
        this.role = role;
    }
}
