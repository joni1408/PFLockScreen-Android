package com.beautycoder.pflockscreen.actions;

import android.support.test.espresso.UiController;
import android.support.test.espresso.ViewAction;
import android.view.View;

import com.beautycoder.pflockscreen.views.PFCodeView;

import org.hamcrest.Matcher;

import static android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom;

/**
 * Created by Aleksandr Nikiforov on 2018/03/19.
 */
public class PFCodeViewActionDelete implements ViewAction {

    @Override
    public Matcher<View> getConstraints(){
        return isAssignableFrom(PFCodeView.class);
    }


    @Override
    public String getDescription(){
        return "Delete code";
    }

    @Override
    public void perform(UiController uiController, View view){
        PFCodeView codeView = (PFCodeView) view;
        codeView.delete();
    }

}