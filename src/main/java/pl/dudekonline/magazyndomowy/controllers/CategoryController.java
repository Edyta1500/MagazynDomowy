package pl.dudekonline.magazyndomowy.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.dudekonline.magazyndomowy.services.categories.CategoryService;
import pl.dudekonline.magazyndomowy.services.products.ProductService;

@Controller
@RequestMapping("/categories")
class CategoryController {

    private static final String REDIRECT = "redirect:/category";

    private final CategoryService categoryService;
    private final ProductService productService;

    public CategoryController(CategoryService categoryService, ProductService productService) {
        this.categoryService = categoryService;
        this.productService = productService;
    }

    @GetMapping
        public String showCategories(Model model){
        var categories = categoryService.findAll();
        model.addAttribute("categories", categories);
        return "categories/categories";
    }

    @GetMapping("/{id}")
    public String showCategoryById(Model model, @PathVariable Integer id){
        var optionalCategory = categoryService.findById(id);
        if(optionalCategory.isPresent()){
            var category = optionalCategory.get();
            var products = productService.findProductByCategoryId(category.getId());
            model.addAttribute("category", category);
            model.addAttribute("products", products);
            return "categories/category";
        }
        return REDIRECT;

    }

    @GetMapping("/add-form")
    String showAddCategoryForm(){
        return "categories/addCategory";
    }

    @GetMapping("/edit-form/{categoryId}")
    String showEditedCategoryForm(@PathVariable Integer categoryId, Model model){
        categoryService.findById(categoryId).ifPresent(item -> model.addAttribute("category", item));
        return "categories/editedCategory";
    }
}
