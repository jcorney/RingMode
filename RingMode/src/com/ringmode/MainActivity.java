package com.ringmode;


import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	int myMode = 0;
	String myString = "Hello World";
	AudioManager myAudio;
	

	private TextView myRingMode;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		myRingMode = (TextView) this
				.findViewById(R.id.text_RingMode);
		
		myAudio = (AudioManager) getSystemService(Context.AUDIO_SERVICE); 
		myMode = myAudio.getMode();
		
		
		String myString = String.valueOf(myMode);
		

		switch (myMode) {
		case 0:
			myRingMode.setText(myString + " - Normal audio mode: not ringing and no call established.");
			break;
			
		case 1:
			myRingMode.setText(myString + " - Ringing audio mode. An incoming is being signaled.");
			break;
		
		case 2:
			myRingMode.setText(myString + " - In call audio mode. A telephony call is established.");
			break;
		
		case 3:
			myRingMode.setText(myString + " - In communication audio mode. An audio/video chat or VoIP call is established.");
			break;
			
		default:
			break;
		}
		
		
	}

}
