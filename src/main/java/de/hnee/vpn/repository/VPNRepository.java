package de.hnee.vpn.repository;

import de.hnee.vpn.enitiy.VPNEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VPNRepository extends JpaRepository<VPNEntry, Long>{
}
