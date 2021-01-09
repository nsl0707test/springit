package com.vega.springit.controller;

import com.vega.springit.domain.Link;
import com.vega.springit.repository.LinkRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/links")
public class LinkController {

    private LinkRepository linkRepository;

    public LinkController(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    @GetMapping("/ ")
    public List<Link> list(){
        return linkRepository.findAll();
    }

    @PostMapping("/create")
    public Link create(@RequestBody Link link){
        return linkRepository.save(link);
    }

    @GetMapping("/{id}")
    public Link read(@PathVariable long id){
        return linkRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    @PutMapping("/{id}")
    public Link update(@PathVariable long id, @RequestBody Link link){
        return linkRepository.save(link);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        linkRepository.deleteById(id);
    }
}
