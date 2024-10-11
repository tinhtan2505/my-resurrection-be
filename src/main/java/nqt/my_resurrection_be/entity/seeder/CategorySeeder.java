package nqt.my_resurrection_be.entity.seeder;

import nqt.my_resurrection_be.entity.Category;
import nqt.my_resurrection_be.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class CategorySeeder {

    @Autowired
    private CategoryRepository categoryRepository;

    public void seed() {
        if (categoryRepository.count() == 0) {
            Category category1 = new Category();
            Category category2 = new Category();
            categoryRepository.saveAll(Arrays.asList(category1, category2));
        }
    }
}

