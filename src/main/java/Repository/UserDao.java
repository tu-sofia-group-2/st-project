package Repository;

import EntityPackage.Contact;
import EntityPackage.Role;
import EntityPackage.User;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;


@Repository
public class UserDao {

    private static final String ADD_USER = "INSERT INTO users (id, first_name, middle_name, last_name, faculty_id, gender, programmes, contacts, role)"+
            "VALUES (:id, :first_name, :middle_name, :last_name, :faculty_id, :gender, :programmes, :contacts, :role)";
    private static final String REMOVE_USER = "DELETE  FROM users WHERE id=:id";
    private static final String FIND_USER_BY_ID = "SELECT first_name, middle_name, last_name, faculty_id, gender, programmes, contacts, role FROM users WHERE id=:id";
    private String UPDATE_USER = "UPDATE users SET first_name=:first_name, middle_name=:middle_name, last_name=:last_name, faculty_id=:faculty_id, gender=:gender, programmes=:programmes, contacts=:contacts, role=:role" +
            "WHERE id=:id";
    private RowMapper<User> USER_ROW_MAPPER = ((rs, rowNum) -> User.builder()
            .ID(rs.getLong("id"))
            .gender(rs.getBoolean("gender"))
            .role((Role) rs.getObject("role"))
            .facultyID(rs.getLong("faculty_id"))
            .contacts((List<Contact>) rs.getObject("contacts"))
            .firstName(rs.getString("first_name"))
            .middleName(rs.getString("middle_name"))
            .lastName(rs.getString("last_name"))
            .build());
    final NamedParameterJdbcTemplate jdbcTemplate;

    public UserDao(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public User saveUser(User user) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        int rows = jdbcTemplate.update(ADD_USER,
                new MapSqlParameterSource("id", user.getID())
                        .addValue("first_name", user.getFirstName())
                        .addValue("middle_name", user.getMiddleName())
                        .addValue("last_name", user.getLastName())
                        .addValue("faculty_id", user.getFacultyID())
                        .addValue("gender", user.getGender())
                        .addValue("programmes", user.getProgrammes())
                        .addValue("contacts", user.getContacts())
                        .addValue("role", user.getRole())
                , keyHolder, new String[]{"id"});

        if (rows > 0) {
            Long id = Long.valueOf(Objects.requireNonNull(keyHolder
                            .getKey())
                    .intValue());
            user.setID(id);
        }
        return user;
    }

    public User getUserByID(Long id) {
        try {
            User user = jdbcTemplate.queryForObject(FIND_USER_BY_ID,
                    new MapSqlParameterSource("id", id),
                    USER_ROW_MAPPER);

            return user;
        }
        catch (EmptyResultDataAccessException e){
            return null;
        }
    }

    public User updateUser(User user) {
        jdbcTemplate.update(UPDATE_USER,
                new MapSqlParameterSource("id", user.getID())
                .addValue("first_name", user.getFirstName())
                .addValue("middle_name", user.getMiddleName())
                .addValue("last_name", user.getLastName())
                .addValue("faculty_id", user.getFacultyID())
                .addValue("gender", user.getGender())
                .addValue("programmes", user.getProgrammes())
                .addValue("contacts", user.getContacts())
                .addValue("role", user.getRole()));
        return user;
    }

    public void deleteById(Long userId) {

        jdbcTemplate.update(REMOVE_USER,
                new MapSqlParameterSource("id", userId));
    }
}
