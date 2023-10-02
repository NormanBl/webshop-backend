package de.norman.webshop.repository;

import de.norman.webshop.model.ProductResponse;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductResponseRepository extends CrudRepository<ProductResponse, Long> {

    public List<ProductResponse> findAllById(long id);
    public List<ProductResponse> findAllByName(String name);
    public List<ProductResponse> findAllByPrice(double price);
    public List<ProductResponse> findAllByDescription(String description);
    public List<ProductResponse> findAllByTags(List<String> tags);

}
