package com.crickinfo.service;

import com.crickinfo.entity.Match;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface MatchService {
    //Get Live matches from CrickBuzz website
    List<Match> getLiveMatchScores();
    //Get All Matches from Db
    public List<Match> getAllMatches();
    //Get Cwc 2023 Points Table
    public List<List<String>> getCWC2023PointTable();
}
