package todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import todo.model.Section;
import todo.service.SectionService;

@RestController
@RequestMapping("/api")
public class SectionController {

    @Autowired
    private SectionService sectionService;

    @PostMapping("/section")
    @ResponseBody
    public ResponseEntity<String> addSection(@RequestBody Section section){
       sectionService.addSection(section);
        return new ResponseEntity<String>("new data is created", HttpStatus.CREATED);
    }
}
