package guru.springframework.controllers;

import guru.springframework.domain.Category;
import guru.springframework.domain.UnitOfMeasure;
import guru.springframework.reposotories.CategoryRepository;
import guru.springframework.reposotories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    CategoryRepository categoryRepository;
    UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(guru.springframework.reposotories.CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","index","index.html"})
    public String getIndexPage(Model model) {
        Optional<Category> category =  categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasure =  unitOfMeasureRepository.findByDescription("Once");
        System.out.println("Cateroy "+ category.get());
        System.out.println("UnitOfMeasure "+unitOfMeasure.get());
        return "index";
    }
}
