package com.example.home;
import java.io.IOException;

import com.neovisionaries.ws.client.WebSocketException;
import com.zerodhatech.kiteconnect.KiteConnect;
import com.zerodhatech.kiteconnect.kitehttp.exceptions.KiteException;
import com.zerodhatech.models.Profile;

public class Run {
	public void getProfile(KiteConnect kiteConnect) throws IOException, KiteException {
        Profile profile = kiteConnect.getProfile();
        System.out.println(profile.userName);
    }
	public static void main(String[] args ) {
		KiteConnect kiteconnect = new KiteConnect("abcd");
		Run first_run= new Run();
		try {
			first_run.getProfile(kiteconnect);
		} catch (IOException | KiteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
