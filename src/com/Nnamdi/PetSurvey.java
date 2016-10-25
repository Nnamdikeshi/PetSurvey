package com.Nnamdi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by nc0614dn on 10/25/2016.
 */
public class PetSurvey extends JPanel {
    private JPanel rootPanel;
    private JCheckBox catCheckBox;
    private JCheckBox fishCheckBox;
    private JCheckBox dogCheckBox;
    private JButton quitButton;
    private JLabel instructionsLabel;
    private JLabel surveyResultsLabel;

    private boolean fish, cat, dog;

    //Configure your GUI components in the constructor
    PetSurvey() {

        //Set up GUI components here
        instructionsLabel = new JLabel("Select the pets you have");

        catCheckBox = new JCheckBox("Cat");
        fishCheckBox = new JCheckBox("Fish");
        dogCheckBox = new JCheckBox("Dog");

        surveyResultsLabel = new JLabel("Results here");

        quitButton = new JButton("Quit");

        //and then add the components to your GUI
        add(instructionsLabel);
        add(catCheckBox);
        add(dogCheckBox);
        add(fishCheckBox);

        add(surveyResultsLabel);
        add(quitButton);

        //And, add listeners to all components that need to respond to user events
        catCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                cat = catCheckBox.isSelected();
                updateResults();
            }
        });

        dogCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                dog = dogCheckBox.isSelected();
                updateResults();
            }
        });

        fishCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                fish = fishCheckBox.isSelected();
                updateResults();
            }
        });
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Show 'are you sure' dialog box

                int quit = JOptionPane.showConfirmDialog(PetSurvey.this,
                        "Are you sure you want to quit?", "Quit?",
                        JOptionPane.OK_CANCEL_OPTION);

                //Check which option user selected, quit if user clicked ok
                if (quit == JOptionPane.OK_OPTION) {
                    System.exit(0);
                }
            }
        });


    }

    private void updateResults() {

        String hasDog = dog ? "a dog" : "no dogs";
        String hasCat = cat ? "a cat" : "no cats";

        String hasFish;
        if (fish == true) {
            hasFish = "a fish";
        } else {
            hasFish = "no fish";
        }

        String results = "You have " + hasCat + ", " + hasDog + " and " + hasFish;
        surveyResultsLabel.setText(results);

    }

}


