/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

/**
 * CENTRO FEDERAL DE EDUCACAO TECNOLOGICA DE MINAS GERAIS (CEFET-MG).
 * DISCIPLICA: 2ECOM.017 - LABORATORIO DE SISTEMAS DIGITAIS PARA COMPUTACAO - T01 (2021.1 - 5T34).
 *
 * @author Lucas Siqueira Ribeiro - https://github.com/lucasdot
 * @author Pedro Costa Calazans - https://github.com/pedrocostacalazans
 *
 * Matriculas: 20203018919, 20203018697.
 *
 * @version 1.0
 */


import dominio.Jogo;
import java.math.BigDecimal;
import static java.math.BigDecimal.ROUND_UP;
import java.math.RoundingMode;
//import java.util.Random;

public class MainWindow extends javax.swing.JFrame {

    private final Jogo jogo;
    private String chuteTmp = "";
    
    public MainWindow() {
        initComponents();
        jogo = new Jogo();
        atualizaValores();
    }
    
    private void atualizaValores() {
        operador1.setText(jogo.getOperador1().toString());
        operador2.setText(jogo.getOperador2().toString());
        jogo.initOpt();
        operacao.setText(jogo.getOperacao());
    }
    
    private void reInit() {
        atualizaValores();
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        operador1 = new javax.swing.JLabel();
        operacao = new javax.swing.JLabel();
        operador2 = new javax.swing.JLabel();
        resultado = new javax.swing.JLabel();
        chuteTexto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        botao1 = new javax.swing.JButton();
        botao2 = new javax.swing.JButton();
        botao3 = new javax.swing.JButton();
        botao4 = new javax.swing.JButton();
        botao5 = new javax.swing.JButton();
        botao6 = new javax.swing.JButton();
        botao7 = new javax.swing.JButton();
        botao8 = new javax.swing.JButton();
        botao9 = new javax.swing.JButton();
        botao0 = new javax.swing.JButton();
        botaoTentar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        botaoPassar = new javax.swing.JButton();
        botaoReiniciar = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        pontuacao = new javax.swing.JLabel();
        valorPontuacao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Adivinhe o resultado da operação"));
        jPanel1.setName(""); // NOI18N

        operador1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        operacao.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N

        operador2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        resultado.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        chuteTexto.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setText("=");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chuteTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(operador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(operacao, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(operador2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(operador1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(operacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(operador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chuteTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))))
        );

        botao1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botao1.setText("1");
        botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao0ActionPerformed(evt);
            }
        });

        botao2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botao2.setText("2");
        botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao0ActionPerformed(evt);
            }
        });

        botao3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botao3.setText("3");
        botao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao0ActionPerformed(evt);
            }
        });

        botao4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botao4.setText("4");
        botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao0ActionPerformed(evt);
            }
        });

        botao5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botao5.setText("5");
        botao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao0ActionPerformed(evt);
            }
        });

        botao6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botao6.setText("6");
        botao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao0ActionPerformed(evt);
            }
        });

        botao7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botao7.setText("7");
        botao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao0ActionPerformed(evt);
            }
        });

        botao8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botao8.setText("8");
        botao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao0ActionPerformed(evt);
            }
        });

        botao9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botao9.setText("9");
        botao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao0ActionPerformed(evt);
            }
        });

        botao0.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botao0.setText("0");
        botao0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao0ActionPerformed(evt);
            }
        });

        botaoTentar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botaoTentar.setText("Tentar");
        botaoTentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTentarActionPerformed(evt);
            }
        });

        botaoPassar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botaoPassar.setText("Passar");
        botaoPassar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPassarActionPerformed(evt);
            }
        });

        botaoReiniciar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botaoReiniciar.setText("Reiniciar");
        botaoReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoReiniciarActionPerformed(evt);
            }
        });

        botaoSair.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botaoSair.setText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        pontuacao.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        pontuacao.setText("      Pontuação:");

        valorPontuacao.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        valorPontuacao.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(110, 110, 110)
                                        .addComponent(botao0, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(botaoTentar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valorPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoPassar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoTentar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botao9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botao8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botao4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botao5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botao3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botao1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao0, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valorPontuacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botaoReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botaoPassar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoTentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTentarActionPerformed
        // TODO add your handling code here:
        validaChute();
    }//GEN-LAST:event_botaoTentarActionPerformed

    private void botaoReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoReiniciarActionPerformed
        // TODO add your handling code here:
        if (this.chuteTexto.getText() != "" || this.chuteTexto.getText()!= null) {
            this.chuteTmp = "";
            this.chuteTexto.setText(chuteTmp);
            
        }
    }//GEN-LAST:event_botaoReiniciarActionPerformed

    private void botaoPassarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPassarActionPerformed
        // TODO add your handling code here:
       jogo.initOps();
       jogo.initOpt();
        operacao.setText(jogo.getOperacao().toString());
       operador1.setText(jogo.getOperador1().toString());
       operador2.setText(jogo.getOperador2().toString());
//       operacao.setText(jogo.getOperacao().toString());
    }//GEN-LAST:event_botaoPassarActionPerformed

    private void botao0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao0ActionPerformed
        // TODO add your handling code here:
        
        if (evt.getSource() == this.botao0) {
            chuteTmp = chuteTmp + "0";
        } else if (evt.getSource() == this.botao1) {
            chuteTmp = chuteTmp + "1";
        } else if (evt.getSource() == this.botao2) {
            chuteTmp = chuteTmp + "2";
        } else if (evt.getSource() == this.botao3) {
            chuteTmp = chuteTmp + "3";
        } else if (evt.getSource() == this.botao4) {
            chuteTmp = chuteTmp + "4";
        } else if (evt.getSource() == this.botao5) {
            chuteTmp = chuteTmp + "5";
        } else if (evt.getSource() == this.botao6) { 
            chuteTmp = chuteTmp + "6";
        } else if (evt.getSource() == this.botao7) {
            chuteTmp = chuteTmp + "7";
        } else if (evt.getSource() == this.botao8) {
            chuteTmp = chuteTmp + "8";
        } else if (evt.getSource() == this.botao9) {
            chuteTmp = chuteTmp + "9";
        }
        this.chuteTexto.setText(chuteTmp);
    }//GEN-LAST:event_botao0ActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_botaoSairActionPerformed

    public void validaChute() {
        BigDecimal bdTmp1 = new BigDecimal(jogo.getOperador1().longValueExact());
        BigDecimal bdTmp2 = new BigDecimal(jogo.getOperador2().longValueExact());
        
        if (jogo.getOperacao().equals("*")) {
            jogo.setResultado(bdTmp1.multiply(bdTmp2));
            if (this.chuteTexto.getText().equals(jogo.getResultado().toString())) {
                this.chuteTexto.setText("Belo chute! A resposta está correta.".toUpperCase());
                Jogo.pontos += 1;
                this.valorPontuacao.setText(String.valueOf(Jogo.pontos));
            } else {
                 this.chuteTexto.setText("Chutou errado! A resposta está incorreta.".toUpperCase());
            }
        } else if (this.operacao.getText().equals("/")) {
            String aux1 = bdTmp1.toString();
            String aux2 = bdTmp2.toString();
            double aux3 = Double.parseDouble(aux1);
            double aux4 = Double.parseDouble(aux2);
            double aux5 = aux3 / aux4;
            String resultado = String.valueOf(aux5);
            
//            String strDouble = String.format("%.2f", 1.23456);
            
            
            Jogo.resultado2 = resultado;
            
            if (this.chuteTexto.getText().equals( String.valueOf(Jogo.resultado2))) {
                this.chuteTexto.setText("Belo chute! A resposta está correta.".toUpperCase());
                Jogo.pontos += 1;
                this.valorPontuacao.setText(String.valueOf(Jogo.pontos));
            } else {
                this.chuteTexto.setText("Chutou errado! A resposta está incorreta.".toUpperCase());
            }
            
             
        } else if (jogo.getOperacao().equals("+")) {
            jogo.setResultado(bdTmp1.add(bdTmp2));
             if (this.chuteTexto.getText().equals(jogo.getResultado().toString())) {
                this.chuteTexto.setText("Belo chute! A resposta está correta.".toUpperCase());
                Jogo.pontos += 1;
                this.valorPontuacao.setText(String.valueOf(Jogo.pontos));
            } else {
                 this.chuteTexto.setText("Chutou errado! A resposta está incorreta.".toUpperCase());
            }
        } else if (jogo.getOperacao().equals("-")) {
            jogo.setResultado(bdTmp1.subtract(bdTmp2));
             if (this.chuteTexto.getText().equals(jogo.getResultado().toString())) {
                this.chuteTexto.setText("Belo chute! A resposta está correta.".toUpperCase());
                Jogo.pontos += 1;
                this.valorPontuacao.setText(String.valueOf(Jogo.pontos));
            } else {
                 this.chuteTexto.setText("Chutou errado! A resposta está incorreta.".toUpperCase());
            }
        }
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao0;
    private javax.swing.JButton botao1;
    private javax.swing.JButton botao2;
    private javax.swing.JButton botao3;
    private javax.swing.JButton botao4;
    private javax.swing.JButton botao5;
    private javax.swing.JButton botao6;
    private javax.swing.JButton botao7;
    private javax.swing.JButton botao8;
    private javax.swing.JButton botao9;
    private javax.swing.JButton botaoPassar;
    private javax.swing.JButton botaoReiniciar;
    private javax.swing.JButton botaoSair;
    private javax.swing.JButton botaoTentar;
    private javax.swing.JTextField chuteTexto;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel operacao;
    private javax.swing.JLabel operador1;
    private javax.swing.JLabel operador2;
    private javax.swing.JLabel pontuacao;
    private javax.swing.JLabel resultado;
    private javax.swing.JLabel valorPontuacao;
    // End of variables declaration//GEN-END:variables
   
    //private String guess = guessText.getText(); 
    
}