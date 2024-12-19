package de.hnee.vpn.controller;

import de.hnee.vpn.enitiy.VPNEntry;
import de.hnee.vpn.service.VPNService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class VPNController {

    private final VPNService vpnService;

    @Autowired
    public VPNController(VPNService vpnService) {
        this.vpnService = vpnService;
    }

    @PostMapping("/public-key")
    public ResponseEntity<?> savePublicKey(@RequestBody Map<String, String> request) {
        String publicKey = request.get("publicKey");
        vpnService.savePublicKey(publicKey);
        return ResponseEntity.ok(Map.of("message", "Public key saved successfully"));
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/vpn-list")
    public ResponseEntity<List<VPNEntry>> getVPNList() {
        List<VPNEntry> vpnList = vpnService.getVPNList();
        return ResponseEntity.ok(vpnList);
    }

    @DeleteMapping("/vpn/{id}")
    public ResponseEntity<?> deleteVPNEntry(@PathVariable Long id) {
        vpnService.deleteVPNEntry(id);
        return ResponseEntity.ok(Map.of("message", "VPN entry deleted successfully"));
    }
}
