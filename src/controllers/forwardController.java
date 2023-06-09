/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import beanBHM.listBean;
import view.CustomersPanel;
import view.RoomsPanel;
import view.StatisticalPanel;
import view.TransactionPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.List;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author PC
 */
public class forwardController {
    private JPanel root;
    private String kindSelected = "";
    
    private List<listBean> listItem = null;

    public forwardController(JPanel root) {
        this.root = root;
    }
    
    public void setView(JPanel jpnItem, JLabel jlbItem) throws ClassNotFoundException, SQLException{
        kindSelected = "Room";
        jpnItem.setBackground( new Color(242,242,242));
        jlbItem.setBackground( new Color(242,242,242));
                
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new RoomsPanel());
        root.validate();
        root.repaint();
    }
    
    /**
     *
     * @param listItem
     */
    public void setEvent(List<listBean> listItem){
        this.listItem = listItem;
//        
        for(listBean item : listItem){
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(),item.getJlb()));
        }
    }
    class LabelEvent implements MouseListener{
        private JPanel node;
        private String kind;
        
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }

        
        @Override
        public void mouseClicked(MouseEvent e) {
            try {
                switch(kind){
                case "Statistical":
                {
                
                    node = new StatisticalPanel();
                    break;
                }
                case "Transaction":
                {
                    node = new TransactionPanel();
                    break;
                }
                case "Customer":
                {
                    node = new CustomersPanel();
                    break;
                }
                case "Room":
                {
                    node = new RoomsPanel();
                    break;
                }
                default: 
                {
                    node = new RoomsPanel();
                }
                    break;

            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(forwardController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(forwardController.class.getName()).log(Level.SEVERE, null, ex);
        }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind;
            jpnItem.setBackground( new Color(180,180,180));
                jlbItem.setBackground( new Color(180,180,180));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            jpnItem.setBackground( new Color(180,180,180));
                jlbItem.setBackground( new Color(180,180,180));
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground( new Color(180,180,180));
                jlbItem.setBackground( new Color(180,180,180));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if(!kindSelected.equalsIgnoreCase(kind)){
                jpnItem.setBackground( new Color(242,242,242));
                jlbItem.setBackground( new Color(242,242,242));
            }
        }  
    }
    
    private void setChangeBackground(String kind ){
        for(listBean item: listItem ){
            if(item.getKind().equalsIgnoreCase(kind)){
                item.getJpn().setBackground(new Color(180,180,180));
                item.getJlb().setBackground(new Color(180,180,180));
            } else{
                item.getJpn().setBackground(new Color(242,242,242));
                item.getJlb().setBackground(new Color(242,242,242));
            }
        }
    }
}
