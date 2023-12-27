package controllers;

import entities.SurgicalTeam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.SurgicalTeamService;

import java.util.List;

@RestController
@RequestMapping("/api/surgical-teams")
public class SurgicalTeamController {

    @Autowired
    private SurgicalTeamService surgicalTeamService;

    @GetMapping
    public List<SurgicalTeam> getAllSurgicalTeams() {
        return surgicalTeamService.getAllSurgicalTeams();
    }

    @GetMapping("/{id}")
    public SurgicalTeam getSurgicalTeamById(@PathVariable Long id) {
        return surgicalTeamService.getSurgicalTeamById(id);
    }

    @PostMapping
    public SurgicalTeam createSurgicalTeam(@RequestBody SurgicalTeam surgicalTeam) {
        return surgicalTeamService.createSurgicalTeam(surgicalTeam);
    }

    @PutMapping("/{id}")
    public SurgicalTeam updateSurgicalTeam(@PathVariable Long id, @RequestBody SurgicalTeam surgicalTeam) {
        return surgicalTeamService.updateSurgicalTeam(id, surgicalTeam);
    }

    @DeleteMapping("/{id}")
    public void deleteSurgicalTeam(@PathVariable Long id) {
        surgicalTeamService.deleteSurgicalTeam(id);
    }
}
