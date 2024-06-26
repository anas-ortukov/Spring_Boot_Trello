package uz.anas.trello.service;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import uz.anas.trello.entity.Attachment;
import uz.anas.trello.entity.Task;

import java.util.List;
import java.util.UUID;

@Service
public interface AttachmentService {


    void removeById(UUID attachmentId);

    void saveAttachment(MultipartFile fileUpload, Task taskById);

    List<Attachment> findAllByTaskId(UUID taskId);

    void sendFileToResponse(UUID attachmentId, HttpServletResponse response);
}
