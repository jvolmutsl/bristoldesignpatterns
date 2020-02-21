package com.scottlogic.dp.state.ships;

public class FishingShip {

    private boolean isGoing = false;
    private boolean isAnchored = false;
    private boolean isFishing = false;

    public void stop() {
        if(isGoing) {
            System.out.println("Stopping");
            isGoing = false;
        }
        else {
            System.out.println("Already still like the wind in summer.");
        }
    }

    public void anchor() {
        if(isGoing) {
            System.out.println("Cannot anchor sailing boat!");
        } else {
            if(isAnchored) {
                System.out.println("Already anchored");
            } else {
                isAnchored = true;
                System.out.println("Lowering the anchor! And shields.");
            }
        }
    }

    public void raiseAnchor() {
        if(isAnchored) {
            if(isFishing) {
                System.out.println("Don't sail yet, this one is a biggie!");
                return;
            }
            System.out.println("Now raising anchor.");
            isAnchored = false;
        } else {
            System.out.println("The anchor is not set");
        }
    }

    public void startFishing() {
        if(!isGoing) {
            if(isAnchored) {
                System.out.println("Fishing 'em ol' fishies.");
                isFishing = true;
            } else {
                System.out.println("Have to anchor first!");
            }
        } else {
            System.out.println("Cannot fishing while sailing, ol' chum.");
        }
    }

    public void stopFishing() {
        if(isFishing) {
            System.out.println("Stop fishing");
            isFishing = false;
        } else {
            System.out.println("Haven't thrown that net yet, mate.");
        }
    }

    public void sail() {
        if(isAnchored || isFishing) {
            System.out.println("Me cannot move this barge 'til we raise the anchor");
            return;
        }
        System.out.println("Sailing!");
        isGoing = true;
    }
}
