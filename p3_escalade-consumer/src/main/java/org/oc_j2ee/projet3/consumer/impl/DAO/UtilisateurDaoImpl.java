package org.oc_j2ee.projet3.consumer.impl.DAO;

import org.oc_j2ee.projet3.consumer.contract.DAO.UtilisateurDAO;
import org.oc_j2ee.projet3.consumer.impl.RowMapper.UtilisateurRM;
import org.oc_j2ee.projet3.model.Utilisateur;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.inject.Inject;
import java.sql.Types;
import java.util.List;

public class UtilisateurDaoImpl extends AbstractDaoImpl implements UtilisateurDAO {

    @Inject
    private UtilisateurRM utilisateurRM;


    @Override
    public void create(Utilisateur utilisateur) {

        String vSQL = "INSERT INTO public.UTILISATEUR (nom, prenom, email, role) " +
                "VALUES(:nom, :prenom, :email, :role)";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("nom", utilisateur.getNom(), Types.VARCHAR);
        vParams.addValue("prenom", utilisateur.getPrenom(), Types.VARCHAR);
        vParams.addValue("email", utilisateur.getEmail(), Types.VARCHAR);
        vParams.addValue("role", utilisateur.getRole(), Types.VARCHAR);

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);

    }

    @Override
    public void update(Utilisateur utilisateur) {

        String vSQL = "UPDATE public.UTILISATEUR " +
                "SET nom=:nom, prenom=:prenom, email=:email, role=:role, " +
                "WHERE id=:id";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("id", utilisateur.getId(), Types.INTEGER);
        vParams.addValue("nom", utilisateur.getNom(), Types.VARCHAR);
        vParams.addValue("prenom", utilisateur.getPrenom(), Types.VARCHAR);
        vParams.addValue("email", utilisateur.getEmail(), Types.VARCHAR);
        vParams.addValue("role", utilisateur.getRole(), Types.VARCHAR);

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);

    }

    @Override
    public void delete(Utilisateur utilisateur) {

        String vSQL = "DELETE FROM public.UTILISATEUR WHERE id=:id";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("id", utilisateur.getId(), Types.INTEGER);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);


    }

    @Override
    public Utilisateur getById(int id) {

        String vSQL = "SELECT * FROM public.UTILISATEUR WHERE id=:id";
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource vParams = new MapSqlParameterSource("id", id);
        try {
            Utilisateur utilisateur = vJdbcTemplate.queryForObject(vSQL, vParams, utilisateurRM);
            return utilisateur;
        } catch (EmptyResultDataAccessException vEx) {
            return null;
        }


    }

    @Override
    public List<Utilisateur> getAllUsers() {

        String vSQL= "SELECT * FROM public.UTILISATEUR";

        try{
            JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
            List<Utilisateur> vList = vJdbcTemplate.query(vSQL,utilisateurRM);
            return vList;
        }catch (EmptyResultDataAccessException e){
            return null;
        }



    }

}
