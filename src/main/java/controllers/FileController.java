package controllers;

import entities.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.FileService;

import java.util.List;

@RestController
@RequestMapping("/api/files")
public class FileController {

    @Autowired
    private FileService fileService;

    @GetMapping
    public List<File> getAllFiles() {
        return fileService.getAllFiles();
    }

    @GetMapping("/{id}")
    public File getFileById(@PathVariable Integer id) {
        return fileService.getFileById(id);
    }

    @PostMapping
    public File createFile(@RequestBody File file) {
        return fileService.createFile(file);
    }

    @PutMapping("/{id}")
    public File updateFile(@PathVariable Integer id, @RequestBody File file) {
        return fileService.updateFile(id, file);
    }

    @DeleteMapping("/{id}")
    public void deleteFile(@PathVariable Integer id) {
        fileService.deleteFile(id);
    }
}
