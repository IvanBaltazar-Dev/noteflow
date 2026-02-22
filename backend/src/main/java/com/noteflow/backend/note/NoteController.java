package com.noteflow.backend.note;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {

    private final NoteRepository repository;

    public NoteController(NoteRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Note> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Note create(@RequestBody Note note) {
        return repository.save(note);
    }
}
