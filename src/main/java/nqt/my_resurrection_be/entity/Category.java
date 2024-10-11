package nqt.my_resurrection_be.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nqt.my_resurrection_be.enums.CategoryType;

import java.util.UUID;

@Entity
@Table(name = "category")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "value")
    private String value;

    @Column(name = "label")
    private String label;

    @Column(name = "label_hrm")
    private String labelHRM;

    @Column(name = "color")
    private String color;

    @Column(name = "order_num")
    private int order;

    @Column(name = "order_by_saler")
    private int orderBySaler;

    @Transient
    private boolean isActive = true;

    @Enumerated(EnumType.STRING) // Lưu giá trị enum dưới dạng chuỗi
    @Column(name = "category_type")
    private CategoryType categoryType;
}
