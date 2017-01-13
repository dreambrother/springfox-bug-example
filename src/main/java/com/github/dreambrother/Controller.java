package com.github.dreambrother;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(path = "/files/{fileId}", method = RequestMethod.GET)
    public File file(@PathVariable String fileId) {
        return new File().id(fileId);
    }

    @RequestMapping(path = "/files1/{fileId}", method = RequestMethod.GET)
    public File1 file1(@PathVariable String fileId) {
        return new File1().id(fileId);
    }
}
