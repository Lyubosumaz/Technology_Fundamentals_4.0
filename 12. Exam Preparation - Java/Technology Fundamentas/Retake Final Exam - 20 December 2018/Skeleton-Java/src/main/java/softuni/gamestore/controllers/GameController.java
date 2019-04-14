package softuni.gamestore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import softuni.gamestore.entity.Game;
import softuni.gamestore.gameBindingModel.GameBindingModel;
import softuni.gamestore.repository.GameRepository;


@Controller
public class GameController {

    private final GameRepository gameRepository;

    public GameController(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
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
    public String create(Game game) {

        //TODO

        return null;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(ModelAndView modelAndView, @PathVariable int id) {

        //TODO

        return null;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(ModelAndView modelAndView, @PathVariable int id) {

        //TODO

        return null;
    }

    @PostMapping("/edit/{id}")
    public String delete(@PathVariable int id, GameBindingModel gameBindingModel) {

        //TODO

        return null;
    }


    @PostMapping("/delete/{id}")
    public String deleteProcess(@PathVariable int id) {

        //TODO

        return null;

    }


}
