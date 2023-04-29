package com.example.firebase.testviewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TestViewModel extends ViewModel {

    private MutableLiveData<Integer> liveData = new MutableLiveData<>(0);

    public LiveData<Integer> getLiveData() {
        return liveData;
    }

    public void addValue() {
        int value = liveData.getValue();
        liveData.setValue(value + 1);
    }

    public void decreaseValue() {
        int value = liveData.getValue();
        if(value > 0)
        liveData.setValue(value - 1);
    }

    public void zeroValue(){
        liveData.setValue(0);
    }
}