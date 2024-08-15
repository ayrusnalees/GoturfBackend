package com.example.myproject.turf.partner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/partnerships")
@CrossOrigin(origins = "http://localhost:3000")
public class PartnerController {
	@Autowired
    private PartnerService partnershipService;

    @GetMapping
    public List<PartnerEntity> getAllPartnerships() {
        return partnershipService.getAllPartnerships();
    }

    @GetMapping("/{id}")
    public PartnerEntity getPartnershipById(@PathVariable Long id) {
        return partnershipService.getPartnershipById(id);
    }

    @PostMapping
    public PartnerEntity createPartnership(@RequestBody PartnerEntity partnershipEntity) {
        return partnershipService.savePartnership(partnershipEntity);
    }

    @PutMapping("/{id}")
    public PartnerEntity updatePartnership(@PathVariable Long id, @RequestBody PartnerEntity partnershipEntity) {
        partnershipEntity.setId(id);
        return partnershipService.savePartnership(partnershipEntity);
    }

    @DeleteMapping("/{id}")
    public void deletePartnership(@PathVariable Long id) {
        partnershipService.deletePartnership(id);
    }
}
