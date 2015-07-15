package com.tmaklabs.smart.cacsaffs;



import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.suredigit.inappfeedback.FeedbackDialog;
import com.suredigit.inappfeedback.FeedbackSettings;


public class FeedBack extends ActionBarActivity {

    private FeedbackDialog feedBackDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        feedBackDialog = new FeedbackDialog(this, "AF-6F8C94B31507-CA");
        feedBackDialog.show();
        FeedbackSettings feedbackSettings = new FeedbackSettings();

//SUBMIT-CANCEL BUTTONS
        feedbackSettings.setCancelButtonText("No");
        feedbackSettings.setSendButtonText("Send");

//DIALOG TEXT
        feedbackSettings.setText("Hey, would you like to give us some feedback so that we can improve your experience?");
        feedbackSettings.setYourComments("Type your question here...");
        feedbackSettings.setTitle("Feedback Dialog Title");

//TOAST MESSAGE
        feedbackSettings.setToast("Thank you so much!");
        feedbackSettings.setToastDuration(Toast.LENGTH_SHORT);  // Default
        feedbackSettings.setToastDuration(Toast.LENGTH_LONG);

//RADIO BUTTONS
        feedbackSettings.setRadioButtons(false); // Disables radio buttons
        feedbackSettings.setBugLabel("Bug");
        feedbackSettings.setIdeaLabel("Idea");
        feedbackSettings.setQuestionLabel("Question");

//RADIO BUTTONS ORIENTATION AND GRAVITY
        feedbackSettings.setOrientation(LinearLayout.HORIZONTAL); // Default
        feedbackSettings.setOrientation(LinearLayout.VERTICAL);
        feedbackSettings.setGravity(Gravity.RIGHT); // Default
        feedbackSettings.setGravity(Gravity.LEFT);
        feedbackSettings.setGravity(Gravity.CENTER);

//SET DIALOG MODAL
        feedbackSettings.setModal(true); //Default is false

//DEVELOPER REPLIES
        feedbackSettings.setReplyTitle("Message from the Developer");
        feedbackSettings.setReplyCloseButtonText("Close");
        feedbackSettings.setReplyRateButtonText("RATE!");

//DEVELOPER CUSTOM MESSAGE (NOT SEEN BY THE END USER)
        feedbackSettings.setDeveloperMessage("This is a custom message that will only be seen by the developer!");

        feedBackDialog = new FeedbackDialog(this, "AF-6F8C94B31507-CA", feedbackSettings);


    }
    @Override
    protected void onPause() {
        super.onPause();
        feedBackDialog.dismiss();
    }







}
