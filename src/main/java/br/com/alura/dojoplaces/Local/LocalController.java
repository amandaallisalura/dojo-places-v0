package br.com.alura.dojoplaces.Local;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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

    @PostMapping("/update")
    public String update(@Valid LocalDTO localDTO, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()) {
            return newLocal(localDTO, model);
        }

        localService.save(localDTO);
        return "redirect:/list";
    }
 }
