
package calcuconfunciones;

import javax.swing.JOptionPane;

public class Vista extends javax.swing.JFrame {

    public Vista() {
        initComponents();
           residu.setEnabled(false);
           re.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calcu = new javax.swing.JButton();
        tex1 = new javax.swing.JTextField();
        ver = new javax.swing.JTextField();
        tex2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ope = new javax.swing.JComboBox<>();
        re = new javax.swing.JLabel();
        residu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        calcu.setText("Calcular");
        calcu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcuActionPerformed(evt);
            }
        });

        ver.setEditable(false);
        ver.setBackground(new java.awt.Color(0, 153, 0));
        ver.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ver.setForeground(new java.awt.Color(240, 240, 240));
        ver.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verActionPerformed(evt);
            }
        });

        tex2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tex2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Operacion");

        ope.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-", "*", "/", "n!", "y^x", "e^x", "10^x", "sen", "cos" }));
        ope.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opeMouseClicked(evt);
            }
        });
        ope.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opeActionPerformed(evt);
            }
        });

        re.setText("residuo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(tex1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tex2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ope, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcu, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(ver, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(re, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(residu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(re)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ver, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(residu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(tex1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(ope, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(tex2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(calcu)
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verActionPerformed

    private void tex2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tex2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tex2ActionPerformed

    private void calcuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcuActionPerformed

           residu.setText(" ");
        String sx=tex1.getText(), sy=tex2.getText();
        if (sx.matches("[0-9]+")&& sy.matches("[0-9]+")) {
            
        int x=Integer.parseInt(sx); 
        int y=Integer.parseInt(sy);
        
        switch (ope.getSelectedIndex()) {
            case 0:
                    ver.setText(Integer.toString(sum(x,y)));
                    break;
            case 1:
                   ver.setText(Integer.toString(res(x,y)));
                    break;  
            case 2:
                    ver.setText(Integer.toString(mult(x,y)));
                    break;
            case 3:
                    ver.setText(Integer.toString(div(x,y)));
                    residu.setText(Integer.toString(residuo(x,y)));
                    
                    break;
            case 5:
                    ver.setText(Integer.toString(poten(x,y)));
                    break;

        }
 
        }else JOptionPane.showMessageDialog(null, "Digito datos correctos");
           residu.setEnabled(false);
           re.setEnabled(false);
    }//GEN-LAST:event_calcuActionPerformed

    private void opeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opeMouseClicked


    }//GEN-LAST:event_opeMouseClicked

    private void opeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opeActionPerformed
      int sx=Integer.parseInt(tex1.getText());
    
        switch (ope.getSelectedIndex()) {
        case 4: 
            ver.setText(Integer.toString(fact(sx)));
            break;
        
        case 6: 
            ver.setText(String.valueOf(euler(sx)));
            break;
            case 7: 
            ver.setText(Integer.toString(diezalax(sx)));
              break;
              
        case 3:
             residu.setEnabled(true);
              re.setEnabled(true);
              break;
              
        case 8: 
            ver.setText(String.valueOf(senx(sx)));
              break;   
        case 9: 
            ver.setText(String.valueOf(cos(sx)));
              break;         
        }
    }//GEN-LAST:event_opeActionPerformed

  
    int sum(int x, int y){
    
        int result;
        result= x+y;
        return result;
    
    }
    
    int res(int x, int y){
        int complement = 10, counter = 0, result;
        while(y > complement)
            complement = mult(complement, 10);
        for (int i = y; i < complement; i++) {
            counter++;  
        }
        while(String.valueOf(x).length() > String.valueOf(counter).length())
            counter = Integer.parseInt("9"+counter);
        
        result = Integer.parseInt(String.valueOf(sum(counter,x)).substring(1));
        return result;
    }
    
    int mult(int x, int y){
    
        int result=0;
        
        for (int i = 0; i < y; i++) {
            
            result=sum(result, x);
            
        }
   
    return result;
    }
    
    int div(int x, int y){
     int resi=x, result=0;
        if (y!=0) {
          
            while(resi>=y){
            resi=res(resi, y);
            result++;
            }
        }else result=0000;

            return result;
    }
    
    int residuo(int x, int y){
         int resi=x, result=0;
      
            while(resi>=y){
            resi=res(resi, y);
            result++;
            }
     return resi;
    }
    
    int fact(int x){
    
        int result=1;
        
        for (int i = 0; i < x; i++) {
            result=mult(result, i+1);
        }
      
     return result;
    }
    
    int poten(int x, int y){
       
        int result=x;
        
        for (int i = 1; i < y; i++) {
            result=mult(result, x);
             
        }
    return result;
    }
    
    double sume(double x, double y){

        double result;
        result= x+y;
        return result;
    
    }
        double rese(double x, double y){
        int complement = 10, counter = 0, result;
        while(y > complement)
            complement = mult(complement, 10);
        for (double i = y; i < complement; i++) {
            counter++;  
        }
        while(String.valueOf(x).length() > String.valueOf(counter).length())
            counter = Integer.parseInt("9"+counter);
        
        result = Integer.parseInt(String.valueOf(sume(counter,x)).substring(1));
        return result;
    }
    double multe(double x, double y){
    
        double result=0;
        
        for (int i = 0; i < y; i++) {
            
            result=sume(result, x);
            
        }
        
    return result;
    }
    
    double dive(int x, int y){
     double resi=x, result=0;
        if (y!=0) {
          
            while(resi>=y){
            resi=rese(resi, y);
            result++;
            }
        }else result=0000;

            return result;
    }
    
    double potee(double x, int y){
       
        double result=x;
        
        for (int i = 1; i < y; i++) {
            result=multe(result, x);
            
        }
    return result;
    }
    
    double euler(int x){
        double e=2.7182818284590;
        double result;
        
        result=potee(e,x);

    
    return result;
    }
    
    int diezalax(int x){
    
        int result; 
        result=poten(10,x);
    
        
     return result;
    }
    
    double sen(int x){
     int nm, den;
     double  senx=0;
     int n=10, signo;
        for (int i = 0; i < n; i++) {
            nm=poten(x, sum(mult(2,i), 1));
            den=fact(sum(mult(2,i), 1));
            signo=poten(-1, i);
            
            senx=sume(senx, multe(dive(nm, den), signo));
            
        }
     
    return senx;
    }
    double senx(int x){
        int senx=0; 
        for (int i = 0; i < x; i=i+2) {
            
            senx=sum(senx, div(poten(x,i),fact(i)));
            if (i>0) {
                i=i*-1;
            }else i=i*-1;
        }
              
    
    
        return senx;
    }
    
    double cos(int x){
        double cos=0;
        int n=10, nm, den, signo;
            for (int i = 0; i < n; i++) {
            nm=poten(x, mult(2,i));
            den=fact(mult(2,i));
            signo=poten(-1, i);
            
            cos=sume(cos, multe(dive(nm, den), signo));
            
        }
    
        return cos;
    }
    
    double cosx(int x){
        double cos=0;
        int n=3;
        double nm, den=1, si;
        for (int i = 0; i < n; i++) {
            nm=Math.pow(x, (2*i));
            for (int j = 0; j < 2*i; j++) {
                den=den*i;
            }
            si=Math.pow(-1, i);
            
            cos=cos+(nm/den)*si;
        }
    
        return cos;
    }
    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> ope;
    private javax.swing.JLabel re;
    private javax.swing.JLabel residu;
    private javax.swing.JTextField tex1;
    private javax.swing.JTextField tex2;
    private javax.swing.JTextField ver;
    // End of variables declaration//GEN-END:variables
}
