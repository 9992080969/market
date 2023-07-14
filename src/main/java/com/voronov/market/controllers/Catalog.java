package com.voronov.market.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Alexey Voronov on 12.07.2023
 */
@Controller
@RequestMapping("/catalog")
public class Catalog {
    @GetMapping()
    public String index() {
    return "catalog/index";
    }
}