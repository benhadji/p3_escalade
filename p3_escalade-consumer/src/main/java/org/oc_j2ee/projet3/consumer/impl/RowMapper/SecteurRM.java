package org.oc_j2ee.projet3.consumer.impl.RowMapper;

import org.oc_j2ee.projet3.model.Secteur;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SecteurRM implements RowMapper<Secteur> {

    @Override
    public Secteur mapRow(ResultSet rs, int i) throws SQLException {

        Secteur secteur = new Secteur();

        secteur.setSecteur_id(rs.getInt("secteur_id"));
        secteur.setSite_id(rs.getInt("site_id"));
        secteur.setNom(rs.getString("nom"));

        return secteur;

    }
}
