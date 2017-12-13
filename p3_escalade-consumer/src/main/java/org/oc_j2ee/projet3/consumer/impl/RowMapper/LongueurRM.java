package org.oc_j2ee.projet3.consumer.impl.RowMapper;

import org.oc_j2ee.projet3.model.Longueur;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LongueurRM implements RowMapper<Longueur> {
    @Override
    public Longueur mapRow(ResultSet rs, int i) throws SQLException {

        Longueur longueur = new Longueur();

        longueur.setLongueur_id(rs.getInt("longueur_id"));
        longueur.setVoie_id(rs.getInt("voie_id"));
        longueur.setNom(rs.getString("nom"));
        longueur.setCotation(rs.getString("cotation"));

        return longueur;



    }
}
