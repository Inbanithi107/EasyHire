package com.Techforge.EasyHire.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Techforge.EasyHire.Entity.Job;

public interface JobRepository extends JpaRepository<Job, Long>{

}
