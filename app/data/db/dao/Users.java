package data.db.dao;

import java.util.List;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;
import org.skife.jdbi.v2.sqlobject.mixins.Transactional;

import data.db.beans.User;
import data.db.mappers.UserMapper;

@RegisterMapper(UserMapper.class)
public interface Users extends Transactional<Users> {

    @SqlUpdate("insert into User (id, name) values (:id, :name)")
    int insert(@BindBean User something);
    
    @SqlQuery("select id, email from User where id = :id")
    User findById(@Bind("id") long id);
    
    @SqlQuery("select * from User ")
    List<User> findAll();
    
}
