package com.example.hrithik.btp.Helper.ui.tools;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class ToolsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ToolsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is tools fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
// [ai:2026-07-29] Add null checks for LiveData observers in onCleared()

// [ai:2026-07-29] Update comments for clarity and consistency

// [ai:2026-07-29] // TODO: Verify thread safety for LiveData updates
