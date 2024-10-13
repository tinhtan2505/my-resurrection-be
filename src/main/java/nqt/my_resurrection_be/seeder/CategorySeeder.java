package nqt.my_resurrection_be.seeder;

import nqt.my_resurrection_be.entity.Category;
import nqt.my_resurrection_be.enums.CategoryType;
import nqt.my_resurrection_be.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Order(2)
public class CategorySeeder implements CommandLineRunner {

    @Value("${seeder.enabled}")
    private boolean isSeederEnabled;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        if (!isSeederEnabled) {
            return;
        }
        if (categoryRepository.count() == 0) {
            // Dữ liệu mẫu
            Category category1 = new Category();
            category1.setId(UUID.fromString("86bede1e-81dc-414f-8485-143041a1bf0c"));
            category1.setValue("CTG1");
            category1.setLabel("Priority Category");
            category1.setLabelHRM("High Priority");
            category1.setColor("#FF5733");
            category1.setOrder(1);
            category1.setOrderBySaler(10);
            category1.setCategoryType(CategoryType.PROJECT_PRIORITY);  // Sử dụng enum

            Category category2 = new Category();
            category2.setId(UUID.fromString("40271b60-e408-4055-be31-4608bb5f556c"));
            category2.setValue("CTG2");
            category2.setLabel("Type Category");
            category2.setLabelHRM("Type A");
            category2.setColor("#33FF57");
            category2.setOrder(2);
            category2.setOrderBySaler(20);
            category2.setCategoryType(CategoryType.PROJECT_TYPE);  // Sử dụng enum

            // Lưu dữ liệu vào database
            categoryRepository.save(category1);
            categoryRepository.save(category2);

            System.out.println("Seeded data for Category entity.");
        }
    }
}


