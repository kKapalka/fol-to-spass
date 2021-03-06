/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fol_to_spass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.util.List;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
/**
 *
 * @author kkapa
 */
public class gui extends javax.swing.JFrame {

    String problem,author,status,description;
    //SettingsPanel newpanel;
    SettingsDialog dialog;
  
    ArrayList<String> constants,predicates,functions,axioms,conjectures;
    
    //Parser parser;
    /**
     * Creates new form gui
     */
    public gui() {
        initComponents();
        Timer timer;
        int delay = 3000; //milliseconds
         
            //Odnawia tekst w konsoli raz na jakiś czas
            
            ActionListener taskPerformer = (ActionEvent evt) -> {
            
                FolLexer lex = new FolLexer(new ANTLRInputStream(TempLogicText.getText()));
                CommonTokenStream tokens = new CommonTokenStream(lex);
                ParserErrorListener errList=new ParserErrorListener ();
                lex.removeErrorListeners();
                lex.addErrorListener(errList);
               
                FolParser parser = new FolParser(tokens);
                 parser.removeErrorListeners();   
                parser.addErrorListener(errList);
                ParseTree tree = parser.condition(); 
                
                //show AST in console
                ConsoleText.setText("");
                errList.getErrors().forEach((temp) -> {
                    ConsoleText.setText(ConsoleText.getText()+temp+"\n");
            });
                //SPASSText.setText("");
               List<Token> toks=tokens.getTokens(0,tokens.size()-1);
               
               constants=new ArrayList<>();
                predicates=new ArrayList<>();
                functions=new ArrayList<>();
                axioms=new ArrayList<>();
                conjectures=new ArrayList<>();
               checkStructure(toks);
               
            };
            
            new Timer(delay, taskPerformer).start();
            /************************************/
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        TempLogicText = new javax.swing.JTextPane();
        jToolBar1 = new javax.swing.JToolBar();
        ForAllButton = new javax.swing.JButton();
        ExistsButton = new javax.swing.JButton();
        Conjunction = new javax.swing.JButton();
        Disjunction = new javax.swing.JButton();
        Negation = new javax.swing.JButton();
        Implication = new javax.swing.JButton();
        Biconditional = new javax.swing.JButton();
        SyntaxHelp = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ConsoleText = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        SPASSText = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        SaveLogic = new javax.swing.JMenuItem();
        SaveSPASS = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Settings = new javax.swing.JMenuItem();
        Convert = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Konwerter FOL do SPASS (Kamil Kapałka, Radosław Lechowicz)");
        setAlwaysOnTop(true);

        TempLogicText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TempLogicText.setMinimumSize(new java.awt.Dimension(300, 400));
        TempLogicText.setPreferredSize(new java.awt.Dimension(300, 400));
        jScrollPane1.setViewportView(TempLogicText);

        jToolBar1.setRollover(true);

        ForAllButton.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        ForAllButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fol_to_spass/Images/forall-button.jpg"))); // NOI18N
        ForAllButton.setToolTipText("");
        ForAllButton.setFocusable(false);
        ForAllButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ForAllButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        ForAllButton.setMaximumSize(new java.awt.Dimension(21, 21));
        ForAllButton.setMinimumSize(new java.awt.Dimension(21, 21));
        ForAllButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ForAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForAllButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(ForAllButton);

        ExistsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fol_to_spass/Images/exists-button.jpg"))); // NOI18N
        ExistsButton.setFocusable(false);
        ExistsButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ExistsButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ExistsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExistsButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(ExistsButton);

        Conjunction.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fol_to_spass/Images/conj-button.jpg"))); // NOI18N
        Conjunction.setFocusable(false);
        Conjunction.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Conjunction.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Conjunction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConjunctionActionPerformed(evt);
            }
        });
        jToolBar1.add(Conjunction);

        Disjunction.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fol_to_spass/Images/disj-button.jpg"))); // NOI18N
        Disjunction.setFocusable(false);
        Disjunction.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Disjunction.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Disjunction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisjunctionActionPerformed(evt);
            }
        });
        jToolBar1.add(Disjunction);

        Negation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fol_to_spass/Images/neg-button.jpg"))); // NOI18N
        Negation.setFocusable(false);
        Negation.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Negation.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Negation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NegationActionPerformed(evt);
            }
        });
        jToolBar1.add(Negation);

        Implication.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fol_to_spass/Images/impl_button.jpg"))); // NOI18N
        Implication.setFocusable(false);
        Implication.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Implication.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Implication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImplicationActionPerformed(evt);
            }
        });
        jToolBar1.add(Implication);

        Biconditional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fol_to_spass/Images/bicond-button.jpg"))); // NOI18N
        Biconditional.setFocusable(false);
        Biconditional.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Biconditional.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Biconditional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BiconditionalActionPerformed(evt);
            }
        });
        jToolBar1.add(Biconditional);

        SyntaxHelp.setText("Syntaktyka-Pomoc");
        SyntaxHelp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SyntaxHelp.setFocusable(false);
        SyntaxHelp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SyntaxHelp.setOpaque(false);
        SyntaxHelp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        SyntaxHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SyntaxHelpActionPerformed(evt);
            }
        });
        jToolBar1.add(SyntaxHelp);

        ConsoleText.setEditable(false);
        ConsoleText.setColumns(20);
        ConsoleText.setLineWrap(true);
        ConsoleText.setRows(5);
        jScrollPane2.setViewportView(ConsoleText);

        SPASSText.setEditable(false);
        SPASSText.setBackground(new java.awt.Color(222, 222, 222));
        SPASSText.setMinimumSize(new java.awt.Dimension(300, 400));
        SPASSText.setName(""); // NOI18N
        SPASSText.setPreferredSize(new java.awt.Dimension(300, 400));
        jScrollPane3.setViewportView(SPASSText);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Logika predykatów");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("SPASS");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Konwersja do:");

        jMenu1.setText("Zapisz");

        SaveLogic.setText("Zapisz logikę:");
        jMenu1.add(SaveLogic);

        SaveSPASS.setText("Zapisz SPASS:");
        jMenu1.add(SaveSPASS);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Buduj Problem");

        Settings.setText("Opis problemu(Wymagany)");
        Settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingsActionPerformed(evt);
            }
        });
        jMenu2.add(Settings);

        Convert.setText("Konwertuj do SPASS");
        Convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertActionPerformed(evt);
            }
        });
        jMenu2.add(Convert);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Pomoc");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("O programie");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(81, 81, 81)
                                .addComponent(jLabel5)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel5))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
//obsluga guzikow z kwantyfikatorami
    private void ForAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ForAllButtonActionPerformed
        TempLogicText.setText(TempLogicText.getText()+"\u2200");
    }//GEN-LAST:event_ForAllButtonActionPerformed

    private void ExistsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExistsButtonActionPerformed
        TempLogicText.setText(TempLogicText.getText()+"\u2203");
    }//GEN-LAST:event_ExistsButtonActionPerformed

    private void ConjunctionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConjunctionActionPerformed
        TempLogicText.setText(TempLogicText.getText()+"\u2227");
    }//GEN-LAST:event_ConjunctionActionPerformed

    private void DisjunctionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisjunctionActionPerformed
        TempLogicText.setText(TempLogicText.getText()+"\u2228");
    }//GEN-LAST:event_DisjunctionActionPerformed

    private void NegationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NegationActionPerformed
        TempLogicText.setText(TempLogicText.getText()+"\u00ac");
    }//GEN-LAST:event_NegationActionPerformed

    private void ImplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImplicationActionPerformed
        TempLogicText.setText(TempLogicText.getText()+"\u2192");
    }//GEN-LAST:event_ImplicationActionPerformed

    private void BiconditionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BiconditionalActionPerformed
        TempLogicText.setText(TempLogicText.getText()+"\u2194");
    }//GEN-LAST:event_BiconditionalActionPerformed
/***************************************************************************/
    
/*USTAWIENIA - opis problemu i takie tam*/   
    private void SettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingsActionPerformed
            dialog= new SettingsDialog (this,true);
            dialog.pack();
            dialog.setVisible (true);
    }//GEN-LAST:event_SettingsActionPerformed

    private void ConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertActionPerformed
        while(problem==null||author==null||status==null||description==null){
            JOptionPane.showMessageDialog(this,
            "Musisz poprawnie ustawić opis zanim uruchomisz konwersję.",
            "DESCR_WARNING",
            JOptionPane.WARNING_MESSAGE);
            dialog= new SettingsDialog (this,true);
            dialog.pack();
            dialog.setVisible (true);
        }
        String stat_en="";
        switch(status){
                case "Rozstrzygalny":
                    stat_en="satisfiable";
                    break;
                case "Nierozstrzygalny":
                    stat_en="unsatisfiable";
                    break;
                case "Nieznany":
                    stat_en="unknown";
                    break;
        }
        String functionText="";
        for(String temp:constants){
            functionText+="("+temp+",0)";
        }
        for(String temp:functions){
            functionText+="("+temp+")";
        }
        String predicateText="";
        for(int i=0;i<predicates.size();i++){
            if(i!=0) predicateText+=",";
            predicateText+="("+predicates.get(i)+")";
        }
        String axiomText="",conjectureText="";
        int i=0;
        while(i<axioms.size()+conjectures.size()){
            for(String temp:axioms){
            axiomText+="formula("+temp+","+(i+1)+").\n";
            i++;
            }
            for(String temp:conjectures){
            conjectureText+="formula("+temp+","+(i+1)+").\n";
            i++;
            }
            i++;
        }
        this.SPASSText.setText("begin_problem("+problem+").\n" +
                                "list_of_descriptions.\n" +
                                "name({*"+problem+"*}).\n" +
                                "author({*"+author+"*}).\n" +
                                "status("+stat_en+").\n" +
                                "description({*"+description+"*}).\n" +
                                "end_of_list.\n" +
                                "list_of_symbols.\n" +
                                " functions["+functionText+"].\n" +
                                " predicates["+predicateText+"].\n" +
                                "end_of_list.\n" +
                                "list_of_formulae(axioms).\n" +
                                axiomText+
                                "end_of_list.\n" +
                                "list_of_formulae(conjectures).\n" +
                                conjectureText+
                                "end_of_list.\n" +
                                "end_problem.");
    }//GEN-LAST:event_ConvertActionPerformed

    private void SyntaxHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SyntaxHelpActionPerformed
        JOptionPane.showMessageDialog(this,
            "Wszystkie zmienne i stałe powinny być wewnątrz nawiasów.\n"
                    + "Zapis predykatu: _Predykat\n"
                    + "Zapis stałej: #Stała\n"
                    + "Zapis zmiennej: ?Zmienna\n"
                    + "Zapis funkcji: .Funkcja",
            "SYNTAX_HELP",
            JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_SyntaxHelpActionPerformed
/**
     * @param value*************************************************************************/
/*Komunikacja gui-dialog*/
    public void setProblem(String value){
        this.problem=value;
    }
    public void setAuthor(String value){
        this.author=value;
    }
    public void setStatus(String value){
        this.status=value;
    }
    public void setDescription(String value){
        this.description=value;
    }
/***************************************************************************/
    public void checkStructure(List<Token> tok){
       
        int info=0;
        int sentencecount=1;
        ArrayList<Integer> separations=new ArrayList<>();
        separations.add(0);
        //First check - Constants - will be here
        for(int i=0;i<tok.size();i++){
            if(tok.get(i).getType()==4){
                if(!constants.contains(tok.get(i+1).getText())){
                    constants.add(tok.get(i+1).getText());
                    }
            }
            if(tok.get(i).getType()==17){sentencecount++;
            separations.add(tok.get(i).getTokenIndex());
            }
        }
        if(separations.size()>1){
        //Second Check - Predicates & Functions + arity
        for(int i=0;i<sentencecount-1;i++){
            for(int j=separations.get(i);j<separations.get(i+1);j++){
                if(tok.get(j).getType()==3){
                    int rparen=FindRParen(tok,j);
                    CheckPredicateFunction(tok,j,rparen,false);
                }
                if(tok.get(j).getType()==5){
                    int rparen=FindRParen(tok,j);
                    CheckPredicateFunction(tok,j,rparen,true);
                }
            }
        }
        //Third Check - Axioms and Conjectures
        for(int i=0;i<sentencecount-1;i++){
            CheckAxiomConjecture(tok,separations.get(i),separations.get(i+1));     
        }
        }
    }
    public int FindRParen(List<Token> tok, int begin){
        for (Token t:tok) if(t.getType()==8 &&t.getTokenIndex()>begin) return t.getTokenIndex();
        return -1;
    }
    
    //Funkcja do poszukiwania predykatu
    public void CheckPredicateFunction(List<Token> tok, int begin, int end, Boolean function){
        int arity=0;
        String temp=tok.get(begin+1).getText();
        for(int i=begin+2;i<end;i++){
            if(tok.get(i).getType()==2 || tok.get(i).getType()==4)arity++;
        }
        temp=temp+","+Integer.toString(arity);
        if(function==true){
            if(functions.contains(temp)) return;
            functions.add(temp);
        }
        else{
            if (predicates.contains(temp)) return;
            predicates.add(temp);
        }
    }
    public void CheckAxiomConjecture(List<Token> tok, int begin, int end){
        String temp="";
        Boolean flag=true;
        ArrayList<Integer> pending=new ArrayList<>(Arrays.asList(10,13,14,15,16));
        ArrayList<Integer> s=new ArrayList<>();
        ArrayList<Integer> pos=new ArrayList<>();
        for(int i=begin;i<end;i++){
                        if("?".equals(tok.get(i).getText()) && flag && i!=end-1)return;
            if(tok.get(i).getType()==11||tok.get(i).getType()==12) flag=false;
            if(tok.get(i).getType()>5 && tok.get(i).getType()<9){
                if(tok.get(i).getType()==6){
                    if(i>2 && (tok.get(i-3).getType()==11 || tok.get(i-3).getType()==12)){
                        temp=temp+"["+tok.get(i).getText()+"]";
                    }
                    else temp=temp+tok.get(i).getText();
                }
                else temp=temp+tok.get(i).getText();
            }
            if(tok.get(i).getType()==10) temp=temp+"not(";
            if(tok.get(i).getType()==11) temp=temp+"forall";
            if(tok.get(i).getType()==12) temp=temp+"exists";
            if(tok.get(i).getType()==13) temp=temp+"and";
            if(tok.get(i).getType()==14) temp=temp+"or";
            if(tok.get(i).getType()==15) temp=temp+"implies";
            if(tok.get(i).getType()==16) temp=temp+"equiv";
            
            if(pending.contains(tok.get(i).getType())){
                s.add(tok.get(i).getType());
                pos.add(temp.length()-1);
            }
        }
        for(int i=0;i<s.size();i++){
            temp=Modify(temp,s.get(i),pos.get(i));
        }
        if("?".equals(tok.get(end-1).getText())) conjectures.add(temp);
        else axioms.add(temp);
    }
    //GOTOWA
    private String Modify(String sentence, int type, int position){
        int brackets=0;
        int begin=0,end=0;
        Boolean flag=false;
        String modified="";
        switch(type){
            case 10:
                for(int i=position;i<sentence.length();i++){
                    if (sentence.charAt(i)=='('){
                        brackets++;
                        flag=true;
                    }
                    else if (sentence.charAt(i)==')') brackets--;
                    if(brackets==1 && flag){
                        modified=sentence+')';
                        break;
                    }
                }
                break;
            case 13:case 14:case 15:case 16:
                for(int i=position;i>0;i--){
                    if (sentence.charAt(i)=='('){
                        brackets++;
                        
                    }
                    else if (sentence.charAt(i)==')'){
                        flag=true;
                        brackets--;
                    }
                    if(brackets==1 && flag){
                        begin=i;
                        break;
                    }
                }
                for(int i=position;i<sentence.length();i++){
                    if (sentence.charAt(i)=='('){
                        brackets++;
                        flag=true;
                    }
                    else if (sentence.charAt(i)==')'){
                        brackets--;
                    }
                    if(brackets==0 && flag){
                        end=i;
                        break;
                    }
                }
                String tempSentence=sentence.substring(begin,end);
                String []stypes={"and","or","implies","equiv"};
                int buffer=position-begin-stypes[type-13].length();
                String newSentence=","+stypes[type-13];
                for (int i=0;i<buffer+1;i++)newSentence+=tempSentence.charAt(i);
                newSentence+=',';
                for(int i=position-begin+1;i<tempSentence.length();i++) newSentence+=tempSentence.charAt(i);
                modified=sentence.replace(tempSentence, newSentence);
        }
        return modified;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new gui().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Biconditional;
    private javax.swing.JButton Conjunction;
    private javax.swing.JTextArea ConsoleText;
    private javax.swing.JMenuItem Convert;
    private javax.swing.JButton Disjunction;
    private javax.swing.JButton ExistsButton;
    private javax.swing.JButton ForAllButton;
    private javax.swing.JButton Implication;
    private javax.swing.JButton Negation;
    private javax.swing.JTextPane SPASSText;
    private javax.swing.JMenuItem SaveLogic;
    private javax.swing.JMenuItem SaveSPASS;
    private javax.swing.JMenuItem Settings;
    private javax.swing.JButton SyntaxHelp;
    private javax.swing.JTextPane TempLogicText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
