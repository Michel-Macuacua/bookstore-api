package mz.gov.cedsif.datavalidapi.service;

import mz.gov.cedsif.datavalidapi.domain.Categoria;
import mz.gov.cedsif.datavalidapi.domain.Fae;
import mz.gov.cedsif.datavalidapi.repositories.FaeRepository;
import mz.gov.cedsif.datavalidapi.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FaeService {

    @Autowired
    private FaeRepository repository;

    public Fae findById(Integer id) {
        Optional<Fae> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Fae nao encontrado! Id: " + id + ", Tipo: " + Fae.class.getName()));
    }

    public List<Fae> findAll() {

        return repository.findAll();
    }

//    public Fae update(Integer id, Fae obj) {
//        Fae newObj = findById(id);
//        updateData(newObj, obj);
//        return repository.save(newObj);
//    }

//    public void updateData(Fae newObj, Fae obj) {
//        newObj.setTitulo(obj.getTitulo());
//        newObj.setNome_autor(obj.getNome_autor());
//        newObj.setTexto(obj.getTexto());
//    }

    public Fae create(Fae obj) {
        obj.setId(null);
        return repository.save(obj);
    }

    public void delete(Integer id){
        Fae obj = findById(id);
        repository.delete(obj);
    }

}
