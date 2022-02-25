package com.security.networkcapy.domain.repository;

import javax.sound.sampled.Port;
import java.util.List;
import java.util.Optional;

public interface PortRepository {
    List<Port> getAll();
    Optional<Port> getByPort(int port);
}
