import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dorm extends JFrame{
   String[] dorms = {"Allen Hall", "Pike Hall", "Farthing Hall", "University Suites"};
   String[] mealPlans = {"7 Meals Per Week", "14 Meals per week", "Unlimited Meals"};
   private JPanel panel;
   private JPanel mealPanel;
   private JButton calculate;
   private JComboBox dormsBox;
   private JComboBox mealPlansBox;
   private JLabel dormMessage;
   private JLabel mealMessage;


   public Dorm(){
      //set the title
      setTitle("Dorm and Meal Plan Calculator");
      
      //set the default close operation
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      //set the layout
      setLayout(new GridLayout(2,1));
      
      //build the panels and add them to the content frame
      buildPanel();
      mealPanel();
      add(panel);
      add(mealPanel);
      
      //pack and set visible
      pack();
      setVisible(true);
   }   
   
   public void buildPanel(){

      dormsBox = new JComboBox(dorms);
      dormMessage = new JLabel("Select your dorm");
      panel = new JPanel();
      
      dormsBox.addActionListener(new DormsBoxListener());
      
      panel.add(dormMessage);
      panel.add(dormsBox);    
   }
   
   public void mealPanel(){
       mealPlansBox = new JComboBox(mealPlans);
       mealMessage = new JLabel("select your mealPlan");
       mealPanel = new JPanel();
       calculate = new JButton("Calculate");
       
       mealPlansBox.addActionListener(new MealPlansBoxListener());
       calculate.addActionListener(new CalculateButtonListener());
       
       mealPanel.add(mealMessage);
       mealPanel.add(mealPlansBox);
       mealPanel.add(calculate);
   }
   
   private class DormsBoxListener implements ActionListener{
      public void actionPerformed(ActionEvent e){
         }
      }

   
   private class MealPlansBoxListener implements ActionListener{
      public void actionPerformed(ActionEvent e){

      }
   }
   
   private class CalculateButtonListener implements ActionListener{
      public void actionPerformed(ActionEvent e){
         int cost = 0; 
         String dormInput = (String) dormsBox.getSelectedItem();
         String mealPlanInput = (String) mealPlansBox.getSelectedItem();
         if(mealPlanInput.equals("7 Meals Per Week") && dormInput.equals("Allen Hall")){
            cost = 1500 + 560;
         } // else if()
         
         JOptionPane.showMessageDialog(null, cost);
      }
   }
   
   public static void main(String[] args){
      new Dorm();
   }
}

