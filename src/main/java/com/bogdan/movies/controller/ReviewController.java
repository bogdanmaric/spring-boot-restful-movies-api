package com.bogdan.movies.controller;

import com.bogdan.movies.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/movies")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;
}
