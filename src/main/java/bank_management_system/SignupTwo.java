package bank_management_system;

import java.awt.*; 
import javax.swing.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
	
	JTextField  aadhar,pan; 
	JButton next;
	JRadioButton eayes,eano,scyes,scno;
	JComboBox religion, category, income, occupation, education;
	String formno;
	
	SignupTwo(String formno){
		this.formno=formno;
		setLayout(null);
		
		setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
		
		
		JLabel additionalDetails = new JLabel("Page 2: Additional Details");
		additionalDetails.setFont(new Font("Raleway",Font.BOLD, 22));
		additionalDetails.setBounds(290, 80, 400, 30);
		add(additionalDetails);
		
		JLabel jlabelReligion = new JLabel("Religion:");
		jlabelReligion.setFont(new Font("Raleway",Font.BOLD, 20));
		jlabelReligion.setBounds(100, 140, 100, 30);
		add(jlabelReligion);
		
		String valReligion[]= {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
		religion = new JComboBox(valReligion);
		religion.setBounds(300, 140, 400, 30);
		religion.setBackground(Color.WHITE);
		add(religion);
		
		JLabel jlabelCategory = new JLabel("Category:");
		jlabelCategory.setFont(new Font("Raleway",Font.BOLD, 20));
		jlabelCategory.setBounds(100, 190, 200, 30);
		add(jlabelCategory);
		
		String valCategory[]= {"General", "OBC", "SC", "ST", "Other"};
		category = new JComboBox(valCategory);
		category.setBounds(300, 190, 400, 30);
		category.setBackground(Color.WHITE);
		add(category);
		
		JLabel jlabelIncome = new JLabel("Income:");
		jlabelIncome.setFont(new Font("Raleway",Font.BOLD, 20));
		jlabelIncome.setBounds(100, 240, 200, 30);
		add(jlabelIncome);
		
		String incomeCategory[]= {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000"};
		income = new JComboBox(incomeCategory);
		income.setBounds(300, 240, 400, 30);
		income.setBackground(Color.WHITE);
		add(income);
		
		JLabel jlabelEducational = new JLabel("Educational");
		jlabelEducational.setFont(new Font("Raleway",Font.BOLD, 20));
		jlabelEducational.setBounds(100, 290, 200, 30);
		add(jlabelEducational);
		
		JLabel jlabelQualification = new JLabel("Qualification:");
		jlabelQualification.setFont(new Font("Raleway",Font.BOLD, 20));
		jlabelQualification.setBounds(100, 315, 200, 30);
		add(jlabelQualification);
		
		String educationValues[]= {"Non-Graduation", "Graduate", "Post-Graduation", "Doctrate", "Others"};
		education = new JComboBox(educationValues);
		education.setBounds(300, 315, 400, 30);
		education.setBackground(Color.WHITE);
		add(education);
		
		JLabel jlabelOccupation = new JLabel("Occupation:");
		jlabelOccupation.setFont(new Font("Raleway",Font.BOLD, 20));
		jlabelOccupation.setBounds(100, 390, 200, 30);
		add(jlabelOccupation);
		
		String occupationValues[]= {"Salaried", "Self-Employed", "Bussiness", "Student", "Retired", "Others"};
		occupation = new JComboBox(occupationValues);
		occupation.setBounds(300, 390, 400, 30);
		occupation.setBackground(Color.WHITE);
		add(occupation);
		
		
		JLabel jlabelPan = new JLabel("Pan Number:");
		jlabelPan.setFont(new Font("Raleway",Font.BOLD, 20));
		jlabelPan.setBounds(100, 440, 200, 30);
		add(jlabelPan);
		
		pan = new JTextField();
		pan.setFont(new Font("Raleway", Font.BOLD, 20));
		pan.setBounds(300, 440, 400, 30);
		add(pan);
		
		JLabel jlabelAadhar = new JLabel("Aadhar Number:");
		jlabelAadhar.setFont(new Font("Raleway",Font.BOLD, 20));                           
		jlabelAadhar.setBounds(100, 490, 200, 30);
		add(jlabelAadhar);
		
		aadhar = new JTextField();
		aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
		aadhar.setBounds(300, 490, 400, 30);
		add(aadhar);
		
		JLabel sCitizen = new JLabel("Senior Citizen:");
		sCitizen.setFont(new Font("Raleway",Font.BOLD, 20));
		sCitizen.setBounds(100, 540, 200, 30);
		add(sCitizen);
		
		scyes = new JRadioButton("Yes");
		scyes.setBounds(300, 540, 100, 30);
		scyes.setBackground(Color.WHITE);
		add(scyes);
		
		scno = new JRadioButton("No");
		scno.setBounds(450, 540, 100, 30);
		scno.setBackground(Color.WHITE);
		add(scno);
		
		ButtonGroup maritalgroup = new ButtonGroup();
		maritalgroup.add(scyes);
		maritalgroup.add(scno);
		
		JLabel eAccount = new JLabel("Existing Account:");
		eAccount.setFont(new Font("Raleway",Font.BOLD, 20));                
		eAccount.setBounds(100, 590, 200, 30);
		add(eAccount);
		
		eayes = new JRadioButton("Yes");
		eayes.setBounds(300, 590, 100, 30);
		eayes.setBackground(Color.WHITE);
		add(eayes);
		
		eano = new JRadioButton("No");
		eano.setBounds(450, 590, 100, 30);
		eano.setBackground(Color.WHITE);
		add(eano);
		
		ButtonGroup emaritalgroup = new ButtonGroup();
		emaritalgroup.add(eayes);
		emaritalgroup.add(eano);
		
		next = new JButton("Next");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway", Font.BOLD, 14));
		next.setBounds(650, 650, 80, 30);
		next.addActionListener(this);
		add(next);
		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(850, 820);
		setVisible(true);
		setLocation(350, 0);
	}
	
	public void actionPerformed(ActionEvent ae) {
		String sreligion = (String) religion.getSelectedItem();
		String scategory =(String) category.getSelectedItem();
		String sincome = (String) income.getSelectedItem();
		String seducation = (String) education.getSelectedItem();
		String soccupation = (String) occupation.getSelectedItem();
		String seniorcitizen = null;
		if(scyes.isSelected()) {
			seniorcitizen = "Yes";
		}else if(scno.isSelected()) {
			seniorcitizen = "No";
		}
		String existingaccounting = null;
		if(eayes.isSelected()) {
			existingaccounting = "Yes";
		}else if(eano.isSelected()) {
			existingaccounting = "No";
		}
		
		String span=pan.getText();
		String saadhar=aadhar.getText();
		
		try {
				Conn c=new Conn();
				String query="insert into signuptwo values ('"+formno+"', '"+sreligion+"' , '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"', '"+saadhar+"', '"+seniorcitizen+"', '"+existingaccounting+"')";
			    c.s.executeUpdate(query);
			    
			    //Signup 3 object for formno
			    setVisible(false);
			    new SignupThree(formno).setVisible(true);
			    
			    
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		new SignupTwo("");
	}

}
