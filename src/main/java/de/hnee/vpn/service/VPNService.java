package de.hnee.vpn.service;

import de.hnee.vpn.entity.VPNEntry;
import de.hnee.vpn.repository.VPNRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VPNService {

    @Autowired
    private VPNRepository vpnRepository;

    public void savePublicKey(String publicKey) {
        VPNEntry entry = new VPNEntry();
        entry.setName(publicKey);
        vpnRepository.save(entry);
    }

    public List<VPNEntry> getVPNList() {
        return vpnRepository.findAll();
    }

    public void deleteVPNEntry(Long id) {
        vpnRepository.deleteById(id);
    }
}
