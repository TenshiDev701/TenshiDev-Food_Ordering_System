package com.example.hrithik.btp.Helper.ui.send;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class SendViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SendViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is send fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
// [ai:2026-07-29] Add null checks before accessing user preferences

// [ai:2026-07-29] // TODO: Refactor network calls to use coroutines
