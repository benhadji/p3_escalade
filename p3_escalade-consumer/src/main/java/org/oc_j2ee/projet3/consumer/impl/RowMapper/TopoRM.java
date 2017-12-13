package org.oc_j2ee.projet3.consumer.impl.RowMapper;

import org.oc_j2ee.projet3.model.Topo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TopoRM implements RowMapper<Topo> {

    @Override
    public Topo mapRow(ResultSet rs, int i) throws SQLException {

        Topo topo = new Topo();

        topo.setId(rs.getInt("id"));
        topo.setUtilisateurId(rs.getInt("utilisateur_id"));
        topo.setSiteId(rs.getInt("site_id"));
        topo.setNom(rs.getString("nom"));
        topo.setEmprunt(rs.getBoolean("emprunt"));

        return topo;

    }
}
