package com.ucbcba.taller.services;

import com.ucbcba.taller.entities.UserProfile;
import com.ucbcba.taller.repositories.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserProfileServiceImpl implements UserProfileService{
    private UserProfileRepository userProfileRepository;

    @Autowired
    @Qualifier(value = "userProfileRepository")
    public void setUserProfileRepository(UserProfileRepository userProfileRepository) {
        this.userProfileRepository = userProfileRepository;
    }

    @Override
    public Iterable<UserProfile> listAllUsersProfiles(){ return userProfileRepository.findAll();};

    @Override
    public void saveUserProfile(UserProfile userProfile){userProfileRepository.save(userProfile);};

    @Override
    public UserProfile getUserProfile(Integer id){return userProfileRepository.findOne(id);};

    @Override
    public void deleteUserProfile(Integer id){userProfileRepository.delete(id);};
}
