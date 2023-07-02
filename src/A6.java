import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class A6 {
	public static void main(String[] args){
		GUI g = new GUI();
		
	}
	
}

class GUI {
	
	boolean fever = false;
	boolean sweating = false;
	boolean headache = false;
	boolean nausea = false;
	boolean vomiting = false;
	boolean diarrhea = false;
	boolean dryCough = false;
	boolean wetCough = false;
	boolean shortnessOfBreath = false;
	boolean runnyNose = false;
	boolean sneezing = false;
	boolean soreThroat = false;
	boolean chills = false;
	boolean muscleAches = false;
	boolean tiredness = false;
	boolean chestPain = false;
	boolean wheezing = false;
	boolean persistentCough = false;
	boolean diseaseFound = false;
	
	
	public GUI() {
		Border border = BorderFactory.createLineBorder(Color.green,3);
		
		JPanel panel = new JPanel(new GridLayout(3,3));
		
		JLabel label = new JLabel();
		label.setText("Waiting for Diagnosis report...");
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(50,350,400,50);
		
		JLabel labelDiseases = new JLabel();
		labelDiseases.setText("Covid, Malaria, Cold, Flu, Bronchitis, Tuberculosis");
		labelDiseases.setBorder(border);
		labelDiseases.setVerticalAlignment(JLabel.CENTER);
		labelDiseases.setHorizontalAlignment(JLabel.CENTER);
		labelDiseases.setBounds(50,100,400,50);
		
		JLabel labelDescription = new JLabel();
		labelDescription.setText("Diseases Included in Program:");
		labelDescription.setVerticalAlignment(JLabel.CENTER);
		labelDescription.setHorizontalAlignment(JLabel.CENTER);
		labelDescription.setBounds(50,50,400,50);
		
		JButton startButton = new JButton("Start Diagnosis");
		startButton.setBounds(100,250,300,50);
		startButton.setBorder(border);
		startButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				fever = false;
				sweating = false;
				headache = false;
				nausea = false;
				vomiting = false;
				diarrhea = false;
				dryCough = false;
				wetCough = false;
				shortnessOfBreath = false;
				runnyNose = false;
				sneezing = false;
				soreThroat = false;
				chills = false;
				muscleAches = false;
				tiredness = false;
				chestPain = false;
				wheezing = false;
				persistentCough = false;
				diseaseFound = false;
				
				/*
				 * covid symptoms = fever && dryCough && shortnessOfBreath && tiredness
				 * malaria symptoms = fever && sweating && headache && nausea && vomiting && diarrhea
				 * cold symptoms = headache && runnyNose && sneezing && soreThroat
				 * flu symptoms = fever && tiredness && muscleAches && wetCough && chestPain 
				 * Tuberculosis symptoms = fever && tiredness && chestPain && sweating && persistentCough
				 * Bronchitis symptoms = wetCough && chestPain && shortnessOfBreath && wheezing
				 */
				
				//note only cold and bronchitis don't have fever as a symptom
				
				int yesNo = JOptionPane.showConfirmDialog(startButton, "Do you have a fever?", "Confirm", JOptionPane.YES_NO_OPTION);
				
				if(yesNo == JOptionPane.YES_OPTION) {
					fever = true;
				}
				
				if(fever) {
					//confirmation for covid
					yesNo = JOptionPane.showConfirmDialog(startButton, "Do you have a dry cough?", "Covid?", JOptionPane.YES_NO_OPTION);
					
					if(yesNo == JOptionPane.YES_OPTION) {
						dryCough = true;
						yesNo = JOptionPane.showConfirmDialog(startButton, "Do you have a hard time breathing?", "Covid?", JOptionPane.YES_NO_OPTION);
						
						if(yesNo == JOptionPane.YES_OPTION) {
							shortnessOfBreath = true;
							yesNo = JOptionPane.showConfirmDialog(startButton, "Have you been feeling tired?", "Covid?", JOptionPane.YES_NO_OPTION);
							
							if(yesNo == JOptionPane.YES_OPTION) {
								tiredness = true;
								label.setText("Patient has Covid");
								diseaseFound = true;
							}
						}
					}
					//confirmations for malaria
					if(diseaseFound == false) {
						yesNo = JOptionPane.showConfirmDialog(startButton, "have you been getting headaches?", "Malaria?", JOptionPane.YES_NO_OPTION);
						
						if(yesNo == JOptionPane.YES_OPTION) {
							headache = true;
							yesNo = JOptionPane.showConfirmDialog(startButton, "Have you been sweating more often recently?", "Malaria?", JOptionPane.YES_NO_OPTION);
							
							if(yesNo == JOptionPane.YES_OPTION) {
								sweating = true;
								yesNo = JOptionPane.showConfirmDialog(startButton, "Do you feel nauseous?", "Malaria?", JOptionPane.YES_NO_OPTION);
								
								if(yesNo == JOptionPane.YES_OPTION) {
									nausea = true;
									yesNo = JOptionPane.showConfirmDialog(startButton, "Have you vomited recently?", "Malaria?", JOptionPane.YES_NO_OPTION);
									
									if(yesNo == JOptionPane.YES_OPTION) {
										vomiting = true;
										yesNo = JOptionPane.showConfirmDialog(startButton, "Do you have diarrhea?", "Malaria?", JOptionPane.YES_NO_OPTION);
										
										if(yesNo == JOptionPane.YES_OPTION) {
											diarrhea = true;
											label.setText("Patient has Malaria");
											diseaseFound = true;
										}
									}
								}
							}
						}
					}
					//confirmation for Tuberculosis
					if(diseaseFound == false) {
						yesNo = JOptionPane.showConfirmDialog(startButton, "have you been feeling tired?", "Tuberculosis?", JOptionPane.YES_NO_OPTION);
						
						if(yesNo == JOptionPane.YES_OPTION) {
							tiredness = true;
							yesNo = JOptionPane.showConfirmDialog(startButton, "Does your chest hurt?", "Tuberculosis?", JOptionPane.YES_NO_OPTION);
							
							if(yesNo == JOptionPane.YES_OPTION) {
								chestPain = true;
								yesNo = JOptionPane.showConfirmDialog(startButton, "Have you been sweating alot?", "Tuberculosis?", JOptionPane.YES_NO_OPTION);
								
								if(yesNo == JOptionPane.YES_OPTION) {
									sweating = true;
									yesNo = JOptionPane.showConfirmDialog(startButton, "is your cough persistent?", "Tuberculosis?", JOptionPane.YES_NO_OPTION);
									
									if(yesNo == JOptionPane.YES_OPTION) {
										persistentCough = true;
										label.setText("Patient has Tuberculosis");
										diseaseFound = true;
									}
								}
								
								//confirmation of flu (only different from tuberculosis is muscleAches && wetCough)
								if(diseaseFound == false) {
									yesNo = JOptionPane.showConfirmDialog(startButton, "Do your muscles ache?", "Flu?", JOptionPane.YES_NO_OPTION);
									
									if(yesNo == JOptionPane.YES_OPTION) {
										muscleAches = true;
										yesNo = JOptionPane.showConfirmDialog(startButton, "is your cough wet?", "Flu?", JOptionPane.YES_NO_OPTION);
										
										if(yesNo == JOptionPane.YES_OPTION) {
											wetCough = true;
											label.setText("Patient has a flu");
											diseaseFound = true;
										}
									}
								}
							}
						}
					}
				}
				if(diseaseFound == false) {
					//confirmation for cold
					yesNo = JOptionPane.showConfirmDialog(startButton, "do you have a runny nose?", "Cold?", JOptionPane.YES_NO_OPTION);
					
					if(yesNo == JOptionPane.YES_OPTION) {
						runnyNose = true;
						yesNo = JOptionPane.showConfirmDialog(startButton, "have you been sneeze often?", "Cold?", JOptionPane.YES_NO_OPTION);
						
						if(yesNo == JOptionPane.YES_OPTION) {
							sneezing = true;
							yesNo = JOptionPane.showConfirmDialog(startButton, "do you have a sore throat?", "Cold?", JOptionPane.YES_NO_OPTION);
							
							if(yesNo == JOptionPane.YES_OPTION) {
								soreThroat = true;
								yesNo = JOptionPane.showConfirmDialog(startButton, "have you been getting headaches?", "Cold?", JOptionPane.YES_NO_OPTION);
								
								if(yesNo == JOptionPane.YES_OPTION) {
									headache = true;
									label.setText("Patient has a cold");
									diseaseFound = true;
								}
							}
						}
					}
					//confirmation for bronchitis
					if(diseaseFound == false) {
						yesNo = JOptionPane.showConfirmDialog(startButton, "Do your coughs feel wet?", "Bronchitis?", JOptionPane.YES_NO_OPTION);
						
						if(yesNo == JOptionPane.YES_OPTION) {
							wetCough = true;
							yesNo = JOptionPane.showConfirmDialog(startButton, "Do you feel chest pain?", "Bronchitis?", JOptionPane.YES_NO_OPTION);
							
							if(yesNo == JOptionPane.YES_OPTION) {
								chestPain = true;
								yesNo = JOptionPane.showConfirmDialog(startButton, "Is it hard to breath?", "Bronchitis?", JOptionPane.YES_NO_OPTION);
								
								if(yesNo == JOptionPane.YES_OPTION) {
									shortnessOfBreath = true;
									yesNo = JOptionPane.showConfirmDialog(startButton, "Have you been wheezing?", "Bronchitis?", JOptionPane.YES_NO_OPTION);
									
									if(yesNo == JOptionPane.YES_OPTION) {
										wheezing = true;
										label.setText("Patient has bronchitis");
										diseaseFound = true;
									}
								}
							}
						}
					}
				}
				if(diseaseFound == false) {
					label.setText("Patient has no identified illness...");
				}
				
				
				    
			}
		});
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(panel);
		frame.add(label);
		frame.add(labelDiseases);
		frame.add(labelDescription);
		frame.add(startButton);
	}
}