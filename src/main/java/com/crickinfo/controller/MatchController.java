package com.crickinfo.controller;

import com.crickinfo.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/match")
public class MatchController {
    @Autowired
    private MatchService matchService;
    @GetMapping("/live")
    public ResponseEntity<?> getLiveMatchScores() throws InterruptedException {
        System.out.println("getting live match");
        return new ResponseEntity<>(this.matchService.getLiveMatchScores(), HttpStatus.OK);
    }
    @GetMapping("/point-table")
    public ResponseEntity<?>getCwc2023PointsTable(){
        return new ResponseEntity<>(matchService.getCWC2023PointTable(),HttpStatus.OK);
    }
    @GetMapping("/getAll")
    public ResponseEntity<?>getAllMatches(){
       return new ResponseEntity<>(matchService.getAllMatches(),HttpStatus.OK);
    }

}
