package com.itgreatq.studyspringboot.v1.controller;

import com.itgreatq.studyspringboot.v1.common.IPathTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/v1/file")
public class FileManagerController {

    @Autowired
    IPathTools iPathTools;

    @PostMapping("/upload")
    public Map<String, Object> upload(@RequestParam("file") MultipartFile[] uploadFile, Model model){
        try {
            String resourcesPathString = iPathTools.getSpringBootResourcesPath();
            String fileStoragePath = resourcesPathString + File.separator + "filestorage";
            File folder = new File(fileStoragePath);
            if(!folder.isDirectory()){
                folder.mkdirs();
            }
            uploadFile[0].transferTo(new File(folder, Objects.requireNonNull(uploadFile[0].getOriginalFilename())));

            return (Map<String, Object>) model.getAttribute("SuccessResult");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (Map<String, Object>) model.getAttribute("FailureResult");
    }


    @GetMapping("/list")
    public Map<String, Object> list(Model model){
        return (Map<String, Object>) model.getAttribute("SuccessResult");
    }
}
