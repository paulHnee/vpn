package de.hnee.vpn.repository;

import de.hnee.vpn.entity.VPNEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VPNRepository extends JpaRepository<VPNEntry, Long>{
}
