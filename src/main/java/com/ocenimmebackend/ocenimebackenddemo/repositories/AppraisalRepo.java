package com.ocenimmebackend.ocenimebackenddemo.repositories;

import com.ocenimmebackend.ocenimebackenddemo.models.Appraisal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppraisalRepo extends JpaRepository<Appraisal,Long> {
}
