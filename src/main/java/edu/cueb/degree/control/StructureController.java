package edu.cueb.degree.control;

import edu.cueb.degree.model.School;
import edu.cueb.degree.model.Structure;
import edu.cueb.degree.model.StructureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("structure")
public class StructureController {
    @Autowired
    private StructureRepository structureRepository;

    @RequestMapping(method = RequestMethod.GET,value = "/add")
    Structure add (Structure structure){return this.structureRepository.save(structure);}

    @RequestMapping(method=RequestMethod.GET,value = "/query/{structureId}")
    Structure get(@PathVariable String structureId){
        Structure rs=this.structureRepository.findById(structureId).get();
        return rs;
    }
}