package br.com.alura.dojoplaces.Local;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class LocalController {
    private final LocalService localService;

    public LocalController(LocalService localService) {
        this.localService = localService;
    }

    @PostMapping("/create")
    public String create(@Valid LocalDTO localDTO, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()) {
            return newLocal(localDTO, model);
        }

        localService.save(localDTO);
        return "redirect:/list";
    }

    @GetMapping("/create")
    public String newLocal(LocalDTO localDTO, Model model) {
        model.addAttribute("localDTO", localDTO);
        return "newLocal";
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<LocalWithLastUpdateDTO> local = localService.findAll();
        model.addAttribute("localDTO", local);
        return "listLocal";
    }

    @GetMapping("/update")
    public String updateLocal(@RequestParam("id") Long id, Model model) {
        LocalWithLastUpdateDTO localToUpdate = localService.findById(id);
        model.addAttribute("localDTO", localToUpdate);

        return "updateLocal";
    }

    @PostMapping("/update")
    public String update(@RequestParam("id") Long id, @Valid LocalDTO localDTO, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()) {
            return newLocal(localDTO, model);
        }

        localService.update(id, localDTO);
        return "redirect:/list";
    }


    @PostMapping("/remove")
    public String remove(@RequestParam("id") Long id) {
        localService.remove(id);
        return "redirect:/list";
    }
 }
