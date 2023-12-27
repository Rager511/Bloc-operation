package services;

import entities.File;
import entities.Patient;
import repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class FileService {

    @Autowired
    private FileRepository fileRepository;

    public List<File> getAllFiles() {
        return fileRepository.findAll();
    }

    public File getFileById(int id) {
        return fileRepository.findById(id).orElse(null);
    }

    public File createFile(File file) {
        return fileRepository.save(file);
    }

    public File updateFile(int id, File file) {
        if (fileRepository.existsById(id)) {
            file.setId(id);
            return fileRepository.save(file);
        }
        return null;
    }

    public void deleteFile(int id) {
        fileRepository.deleteById(id);
    }

    public List<File> getFilesByPatient(Patient patient) {
        return fileRepository.findByPatient(patient);
    }

    public List<File> getFilesUploadedAfter(LocalDateTime uploadDateTime) {
        return fileRepository.findByUploadDateTimeAfter(uploadDateTime);
    }
}
