package com.ucbcba.taller.services;

import com.ucbcba.taller.entities.UserProfile;

public interface UserProfileService {
    Iterable<UserProfile> listAllUsersProfiles();

    void saveUserProfile(UserProfile userProfile);

    UserProfile getUserProfile(Integer id);

    void deleteUserProfile(Integer id);
}
