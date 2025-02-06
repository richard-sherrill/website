package com.richardsherrill.website.repository;

import com.richardsherrill.website.model.PersonalInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainRepository extends JpaRepository<PersonalInfo, Long> {
}
