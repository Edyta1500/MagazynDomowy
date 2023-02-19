package pl.dudekonline.magazyndomowy.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.dudekonline.magazyndomowy.services.products.ProductService;
@RequiredArgsConstructor
@Controller
@RequestMapping("/product")
class ProductController {

    private final ProductService productService;


    @GetMapping("/{id}")
    public String showProductPage(@PathVariable Integer id, Model model){
        var optionalProduct = productService.findById(id);
        if(optionalProduct.isPresent()){
            var product = optionalProduct.get();
            model.addAttribute("product", product);
            return "products/product";
        }
        return "redirect: /category";
    }
}
