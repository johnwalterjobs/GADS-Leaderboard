package com.johnmbiya.gads.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.johnmbiya.gads.models.LeaderSkill;
import com.johnmbiya.gads.repository.LearderRepository;

import java.util.List;

public class SkillViewModel extends ViewModel {

    private MutableLiveData<List<LeaderSkill>> mutableLiveDatas;

    public void init(){
        LearderRepository learderRepository = LearderRepository.getInstance();
        mutableLiveDatas = learderRepository.getLeaderSkills();
    }

    public LiveData<List<LeaderSkill>> getSkills() {
        return mutableLiveDatas;
    }
}
