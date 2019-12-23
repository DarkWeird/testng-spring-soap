package me.darkweird.testing.data;

import me.darkweird.testing.model.BLZ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.PreparedStatementCreatorFactory;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

@Service
public class BLZDao {

    @Autowired
    DataSource dataSource;

    private final String GET_ALL_BLZ = "SELECT * FROM BLZ";

    public List<BLZ> getBLZs() throws SQLException {
        PreparedStatement stmt = new PreparedStatementCreatorFactory(GET_ALL_BLZ)
                .newPreparedStatementCreator(new Object[]{})
                .createPreparedStatement(dataSource.getConnection());

        if (!stmt.execute()) {
            // ignore, we use only selects
        }
        List<BLZ> blzs = new LinkedList<>();
        ResultSet rs = stmt.getResultSet();
        while (rs.next()) {
            BLZ blz = new BLZ();
            blz.setName(rs.getString("name"));
            blz.setBlzCode(rs.getString("blzCode"));
            blz.setBic(rs.getString("bic"));
            blz.setOrt(rs.getString("ort"));
            blz.setPlz(rs.getString("plz"));
            blzs.add(blz);
        }
        return blzs;
    }
}
