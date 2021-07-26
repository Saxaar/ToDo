package todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import todo.model.Section;
import todo.repository.SectionRepository;

@Service
public class SectionService {
    @Autowired
    private SectionRepository sectionRepository;

    public void addSection(Section section) {
        sectionRepository.save(section);
    }
}
