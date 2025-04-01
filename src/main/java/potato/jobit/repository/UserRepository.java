package potato.jobit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import potato.jobit.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {}
