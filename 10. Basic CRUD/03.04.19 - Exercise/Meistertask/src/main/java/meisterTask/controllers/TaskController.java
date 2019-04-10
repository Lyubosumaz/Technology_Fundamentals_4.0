package meisterTask.controllers;

import meisterTask.bindingModel.TaskBindingModel;
import meisterTask.entities.Task;
import meisterTask.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class TaskController {
    private final TaskRepository taskRepository;

    @Autowired
    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

//    @GetMapping("/")
//    public ModelAndView index(ModelAndView modelAndView) {
//
////        List<Task> openTasks = this.taskRepository.findAll().stream().
////                filter(e -> e.getStatus().equals("Open")).collect(Collectors.toList());
////
////        List<Task> inProgressTasks = this.taskRepository.findAll().stream().
////                filter(e -> e.getStatus().equals("In Progress")).collect(Collectors.toList());
////
////        List<Task> finishedTasks = this.taskRepository.findAll().stream().
////                filter(e -> e.getStatus().equals("Finished")).collect(Collectors.toList());
//
//        List<Task> openTasks = this.taskRepository.findAllByStatus("Open");
//        List<Task> inProgressTasks = this.taskRepository.findAllByStatus("In Progress");
//        List<Task> finishedTasks = this.taskRepository.findAllByStatus("Finished");
//
//        modelAndView.setViewName("base-layout");
//        modelAndView.addObject("view", "task/index");
//
//        modelAndView.addObject("openTasks", openTasks);
//        modelAndView.addObject("inProgressTasks", inProgressTasks);
//        modelAndView.addObject("finishedTasks", finishedTasks);
//
//        return modelAndView;
//    }

    @GetMapping("/")
    public String index(Model model) {

        List<Task> openTasks = this.taskRepository.findAllByStatus("Open");
        List<Task> inProgressTasks = this.taskRepository.findAllByStatus("In Progress");
        List<Task> finishedTasks = this.taskRepository.findAllByStatus("Finished");

        model.addAttribute("view", "task/index");
        model.addAttribute("openTasks", openTasks);
        model.addAttribute("inProgressTasks", inProgressTasks);
        model.addAttribute("finishedTasks", finishedTasks);

        return "base-layout";
    }

    @GetMapping("/create")
    public ModelAndView create(ModelAndView modelAndView) {
        modelAndView.setViewName("base-layout");
        modelAndView.addObject("view", "task/create");
        return modelAndView;
    }

    @PostMapping("/create")
    public String create(Task task) {
        this.taskRepository.saveAndFlush(task);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(ModelAndView modelAndView, @PathVariable(value = "id") Integer id) {

        Task task = this.taskRepository.findById(id).get();

        modelAndView.setViewName("base-layout");
        modelAndView.addObject("view", "task/edit");
        modelAndView.addObject("task", task);
        return modelAndView;
    }

    @PostMapping("/edit/{id}")
    public String edit(TaskBindingModel taskBindingModel, @PathVariable(value = "id") Integer id) {

        Task taskToEdit = this.taskRepository.findById(id).get();

        taskToEdit.setTitle(taskBindingModel.getTitle());
        taskToEdit.setStatus(taskBindingModel.getStatus());

        this.taskRepository.saveAndFlush(taskToEdit);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(ModelAndView modelAndView, @PathVariable(value = "id") Integer id) {

        Task task = this.taskRepository.findById(id).get();

        modelAndView.setViewName("base-layout");
        modelAndView.addObject("view", "task/delete");
        modelAndView.addObject("task", task);

        return modelAndView;
    }

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable(value = "id") Integer id) {
        this.taskRepository.deleteById(id);

        return "redirect:/";
    }
}