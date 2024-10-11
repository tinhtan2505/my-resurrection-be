package nqt.my_resurrection_be.seeder;

import nqt.my_resurrection_be.entity.Attachment;
import nqt.my_resurrection_be.repository.AttachmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class AttachmentSeeder implements CommandLineRunner {

    @Autowired
    private AttachmentRepository attachmentRepository;

    @Override
    public void run(String... args) throws Exception {
        if (attachmentRepository.count() == 0) {
            // Dữ liệu mẫu
            Attachment attachment1 = new Attachment(
                    UUID.randomUUID(),
                    "Sample Attachment 1",
                    "https://example.com/file1.png",
                    "https://example.com/thumbnail1.png",
                    "png",
                    2048L,
                    "image/png",
                    "done_image1.png",
                    "folder1/subfolder1"
            );

            Attachment attachment2 = new Attachment(
                    UUID.randomUUID(),
                    "Sample Attachment 2",
                    "https://example.com/file2.jpg",
                    "https://example.com/thumbnail2.jpg",
                    "jpg",
                    4096L,
                    "image/jpeg",
                    "done_image2.jpg",
                    "folder2/subfolder2"
            );

            // Lưu dữ liệu vào database
            attachmentRepository.save(attachment1);
            attachmentRepository.save(attachment2);

            System.out.println("Seeded data for Attachment entity.");
        }
    }
}
