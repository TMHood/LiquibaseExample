package sparrows.ucd.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sparrows.ucd.entities.PropertyEntity;
import sparrows.ucd.repositories.PropertyRepository;

@Service
@RequiredArgsConstructor
public class TestService {
    private final PropertyRepository repository;

    public void Insert() {
        repository.deleteAll();

        PropertyEntity property = new PropertyEntity();
        property.setId(null);
        property.setShortName("sh");
        property.setLongName("long");
        repository.save(property);
        property.setId(null);
        property.setShortName("sh2");
        property.setLongName("long2");
        repository.save(property);
        property.setId(null);
        property.setShortName("sh3");
        property.setLongName("long3");
        repository.save(property);
    }
}
