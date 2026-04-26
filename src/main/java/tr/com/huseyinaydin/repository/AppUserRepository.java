package tr.com.huseyinaydin.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tr.com.huseyinaydin.model.AppUser;
import tr.com.huseyinaydin.model.AppRole;
import java.util.List;

@Mapper
public interface AppUserRepository {
    AppUser findByUserNameAndPassword(@Param("username") String username, @Param("password") String password);
    AppRole findRoleByUserId(@Param("userId") Integer userId);
    void createAppUser(AppUser appUser);
    void updateAppUser(AppUser appUser);
    AppUser findByUserId(@Param("userId") Integer userId);
    Integer getRoleIdByRoleName(@Param("roleName") String roleName);
    AppUser findByUserName(@Param("username") String username);
    List<AppUser> findAll();
    void deleteById(@Param("userId") Integer userId);
}
