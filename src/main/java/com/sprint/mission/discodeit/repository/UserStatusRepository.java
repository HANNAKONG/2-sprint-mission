package com.sprint.mission.discodeit.repository;

import com.sprint.mission.discodeit.domain.UserStatus;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserStatusRepository extends JpaRepository<UserStatus, UUID> {
  
  Optional<UserStatus> findByUserId(UUID userId);

}
