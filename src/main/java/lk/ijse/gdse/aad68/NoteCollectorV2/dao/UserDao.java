package lk.ijse.gdse.aad68.NoteCollectorV2.dao;

import lk.ijse.gdse.aad68.NoteCollectorV2.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<UserEntity,String> {
    UserEntity getUserEntityByUserId(String userId);
}
