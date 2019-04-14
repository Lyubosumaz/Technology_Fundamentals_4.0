package softuni.bandregister.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import softuni.bandregister.bindingModels.BandBindingModel;
import softuni.bandregister.entities.Band;
import softuni.bandregister.repositories.BandRepository;

import java.util.List;

@Controller
public class BandController {
    private final BandRepository bandRepository;

    @Autowired
    public BandController(BandRepository bandRepository) {
        this.bandRepository = bandRepository;
    }


    @GetMapping("/")
    public ModelAndView index(ModelAndView modelAndView) {
      //TODO
        return null;
    }

    @GetMapping("/create")
    public ModelAndView create(ModelAndView modelAndView) {
     //TODO
        return null;
    }

    @PostMapping("/create")
    public String create(Band band) {
       //TODO
        return null;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(ModelAndView modelAndView,
                             @PathVariable(value = "id") Integer id) {
       //TODO
        return null;
    }

    @PostMapping("/edit/{id}")
    public String edit(@PathVariable(value = "id") Integer id, BandBindingModel bandBindingModel) {
        //TODO
        return null;
    }
    @GetMapping("/delete/{id}")
    public ModelAndView delete(ModelAndView modelAndView,
                             @PathVariable(value = "id") Integer id) {
      //TODO
        return null;
    }

    @PostMapping("/delete/{id}")
    public String delete(Band band) {
       //TODO
        return null;
    }
}
