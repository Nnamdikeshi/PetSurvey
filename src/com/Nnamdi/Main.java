package com.Nnamdi;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PetSurvey survey = new PetSurvey();
        //Create a frame - the GUI window
        JFrame petSurveyFrame = new JFrame("Pet survey");
        //configure the JFrame / GUI window
        petSurveyFrame.setSize(350, 200);
        petSurveyFrame.setVisible(true);
        petSurveyFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Create an object from this class - it's a JPanel,  which is a GUI component
        PetSurvey surveyGUI = new PetSurvey();

        //And add it to the JFrame
        petSurveyFrame.add(surveyGUI);

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
    }

