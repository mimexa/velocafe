package paris.velocafe.velocafe.dao;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import paris.velocafe.velocafe.entity.ProduitDb;
import paris.velocafe.velocafe.rowmapper.ProduitDbRowMapper;

@SuppressWarnings("serial")
@Stateless
public class ProduitDaoImpl implements Serializable {

	private static final RowMapper<ProduitDb> rowMapper = new ProduitDbRowMapper();

	@Resource(mappedName = "jdbc/velocafeDB")
	private DataSource ds;

	public ProduitDb find(final Long id) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(ds);
		List<ProduitDb> produitsDb = jdbcTemplate.query("select * from produits", rowMapper);
		return produitsDb.get(0);
	}

	public List<ProduitDb> findAll() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(ds);
		List<ProduitDb> produitsDb = jdbcTemplate.query("select * from produits", rowMapper);
		return produitsDb;
	}

}
