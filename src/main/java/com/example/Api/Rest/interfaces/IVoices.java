package com.example.Api.Rest.interfaces;

import com.example.Api.Rest.model.CVoices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVoices extends CrudRepository<CVoices, Long> {
}
