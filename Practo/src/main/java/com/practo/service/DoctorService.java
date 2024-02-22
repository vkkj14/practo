package com.practo.service;

import com.practo.entity.Doctor;
import com.practo.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public Doctor addDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    public List<Doctor> searchDoctorsByNameOrSpecialization(String search){
        return doctorRepository.searchByNameOrSpecialization(search);
    }


}

