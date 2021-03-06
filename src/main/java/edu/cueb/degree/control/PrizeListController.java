package edu.cueb.degree.control;

import edu.cueb.degree.model.PrizeList;
import edu.cueb.degree.repository.PrizeListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("prizelist")
public class PrizeListController {

    @Autowired
    private PrizeListRepository prizeListRepository;
    @RequestMapping(method = RequestMethod.POST,value = "/add")
    PrizeList add(PrizeList prizeList0){
        return this.prizeListRepository.save(prizeList0);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/delete")
    void delete(PrizeList prizeList1){
         this.prizeListRepository.delete(prizeList1);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/update")
    PrizeList update(PrizeList prizeList2){
        return this.prizeListRepository.save(prizeList2);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/query/{prizeListId}")
    PrizeList query(@PathVariable String prizeListId){
         return this.prizeListRepository.findById(prizeListId).get();
    }
}
