package com.quipux.colegio.dao;

import com.quipux.colegio.models.MagoEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MagoDaoImpl {

    @PersistenceContext
    private EntityManager entityManager;

    public void guardar(MagoEntity mago) {
        entityManager.persist(mago);
    }

    public MagoEntity buscarPorNombre(String nombre) {
        Query query = entityManager.createQuery("SELECT m FROM MagoEntity m WHERE m.nombre = :nombre");
        query.setParameter("nombre", nombre);
        List<?> results = query.getResultList();
        return results.isEmpty() ? null : (MagoEntity) results.get(0);
    }
}
