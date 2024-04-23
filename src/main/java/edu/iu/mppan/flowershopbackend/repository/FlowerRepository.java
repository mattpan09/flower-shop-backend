package edu.iu.mppan.flowershopbackend.repository;

import edu.iu.mppan.flowershopbackend.model.Flower;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowerRepository extends CrudRepository<Flower, String> {
}
