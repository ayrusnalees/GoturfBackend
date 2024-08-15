package com.example.myproject.turf.partner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartnerService {
	@Autowired
    private PartnerRepo partnershipRepository;

    public List<PartnerEntity> getAllPartnerships() {
        return partnershipRepository.findAll();
    }

    public PartnerEntity getPartnershipById(Long id) {
        return partnershipRepository.findById(id).orElse(null);
    }

    public PartnerEntity savePartnership(PartnerEntity partnershipEntity) {
        return partnershipRepository.save(partnershipEntity);
    }

    public void deletePartnership(Long id) {
        partnershipRepository.deleteById(id);
    }
}
