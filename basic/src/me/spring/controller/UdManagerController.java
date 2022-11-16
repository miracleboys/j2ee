package me.spring.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import me.spring.utils.RequestEntity;
@Controller
@RequestMapping("/lesson")
public class UdManagerController {
    @RequestMapping(value = "/index", produces = "text/html")
    public String index() throws Exception {       
        return "udload/index";
    }
    
    @RequestMapping(value = "/upload", produces = "text/html")
    public String upload(HttpServletRequest request,Model model) throws Exception {
        model.addAllAttributes(RequestEntity.resolve(request));
        return "udload/upload";
    }
    

@RequestMapping(value = "/indexs", produces = "text/html")
public String indexs() {
    return "udload/indexs";
}

@RequestMapping(value = "/uploadSingle", produces = "text/html")
public String uploadSingle(@RequestParam("file1") CommonsMultipartFile file, HttpServletRequest request,
        Model model) {
    model.addAllAttributes(RequestEntity.saveSingleFile(request, file));
    return "udload/uploadSingle";
}


@RequestMapping(value = "/download")
public ResponseEntity download(@RequestParam String filename,HttpServletRequest request) {
    String savingFolder = request.getServletContext().getRealPath("/WEB-INF/savedFiles");
    String savingFilename = savingFolder + "/" + filename;
    return RequestEntity.download(savingFilename,filename);
}

}