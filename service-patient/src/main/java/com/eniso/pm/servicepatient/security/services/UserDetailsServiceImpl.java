package com.eniso.pm.servicepatient.security.services;




import org.springframework.beans.factory.annotation.*;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eniso.pm.servicepatient.entity.Patient;
import com.eniso.pm.servicepatient.repository.PatientRepository;
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    PatientRepository patientRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Patient patient = patientRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));

        return UserDetailsImpl.build(patient);
    }

}
