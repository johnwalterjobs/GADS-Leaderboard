package com.johnmbiya.gads.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.johnmbiya.gads.models.LeaderHour;
import com.johnmbiya.gads.repository.LearderRepository;

import java.util.List;

public class HourViewModel extends ViewModel {

    private MutableLiveData<List<LeaderHour>> mutableLiveDatas;

    public void init(){
        LearderRepository learderRepository = LearderRepository.getInstance();
        mutableLiveDatas = learderRepository.getLeaderHours();
    }

    public LiveData<List<LeaderHour>> getHours() {
        return mutableLiveDatas;
    }
}
