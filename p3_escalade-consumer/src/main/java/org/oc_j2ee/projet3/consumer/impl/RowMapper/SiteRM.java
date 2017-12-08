package org.oc_j2ee.projet3.consumer.impl.RowMapper;

import org.oc_j2ee.projet3.model.Site;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SiteRM extends AbstractRM implements RowMapper<Site>{
    @Override
    public Site mapRow(ResultSet rs, int i) throws SQLException {
        Site site = new Site();
        site.setId(rs.getInt("topo_id"));
        site.setNom(rs.getString("nom"));
        site.setLocalisation(rs.getString("localisation"));

        return site;
    }
}
