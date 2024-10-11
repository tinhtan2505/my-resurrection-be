package nqt.my_resurrection_be.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "project")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "global_name")
    private String globalName;

    @Column(name = "path")
    private String path;

    @Column(name = "path_done")
    private String pathDone;

    @Column(name = "image_link")
    private String imageLink;

    @Column(name = "customer_key_rs")
    private String customerKeyRs;

    @Column(name = "image_count")
    private int imageCount;

    @Column(name = "price")
    private double price;

    @Column(name = "total_amount")
    private double totalAmount;

    @Column(name = "is_testing", columnDefinition = "boolean default false")
    private boolean isTesting = false;

    @Column(name = "deadline")
    private LocalDateTime deadline = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "creator_id", insertable = false, updatable = false)
    private User creator;

    @ManyToOne
    @JoinColumn(name = "saler_id", insertable = false, updatable = false)
    private User saler;

    @ManyToOne
    @JoinColumn(name = "customer_id", insertable = false, updatable = false)
    private User customer;

    @ManyToOne
    @JoinColumn(name = "status_id", insertable = false, updatable = false)
    private Category status;

    @ManyToOne
    @JoinColumn(name = "status_for_customer_id", insertable = false, updatable = false)
    private Category statusForCustomer;

    @JsonIgnore
    @OneToMany(mappedBy = "project")
    private List<ProjectFileType> fileTypes;

    @JsonIgnore
    @OneToMany(mappedBy = "project")
    private List<ProjectCard> cards;

    @OneToMany(mappedBy = "project")
    private List<ProjectSampleImage> sampleImages;

    @OneToMany(mappedBy = "project")
    private List<FilesUploadDropbox> filesUploadDropboxs;
}
