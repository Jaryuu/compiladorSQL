import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.DefaultCaret;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.JButton;
import javax.swing.JTextPane;

import java.awt.FlowLayout;

import javax.swing.SwingConstants;
import javax.swing.BoxLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFileChooser;

import org.antlr.v4.runtime.tree.gui.TreeViewer;

import java.io.File;   
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JLabel;

//
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Element;
import javax.swing.JTable;

import java.awt.Scrollbar;
//

public class GUI extends JFrame {

	private JPanel contentPane;
	private JPanel panel_1;
	private JTextPane textPane;
	private JPanel panel_2;
	private JButton btnLoad;
	private JButton btnSave;
	private JButton btnCompile;
	private ANTLR antlr4;
	private JTextArea txtAreaError;	
	private JScrollPane jsp3;
	private JPanel tablePane;
	
	
	//
	private JTextArea lines;
	private JTable tableQuery;
	//

	public GUI() {		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 567);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Input", null, panel, null);
		panel.setLayout(new BorderLayout(0, 0));
		
		
		panel_1 = new JPanel();
		JScrollPane jsp2 = new JScrollPane(panel_1);
		tabbedPane.addTab("Parsing Tree", null, jsp2, null);
		
		textPane = new JTextPane();
		Font font1 = new Font("Arial",Font.ROMAN_BASELINE,12);
		textPane.setFont(font1);
		JScrollPane jsp = new JScrollPane(textPane);
		
		
		
		panel.add(jsp, BorderLayout.CENTER);
		
		panel_2 = new JPanel();
		panel_2.add(Box.createRigidArea(new Dimension(0,40)));
		panel.add(panel_2, BorderLayout.EAST);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.PAGE_AXIS));		
		btnLoad = new JButton("Load");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fileChooser = new JFileChooser();				
				fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
				int result = fileChooser.showOpenDialog(panel_2);
				if (result == JFileChooser.APPROVE_OPTION) {
				    File selectedFile = fileChooser.getSelectedFile();
				    System.out.println("Selected file: " + selectedFile.getAbsolutePath());
				    String content;
					try {
						content = readFile(selectedFile.getAbsolutePath(), StandardCharsets.UTF_8);
						textPane.setText(content);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		panel_2.add(btnLoad);
		
		panel_2.add(Box.createRigidArea(new Dimension(0,40)));
		
		btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setDialogTitle("Specify a file to save");   
				fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir"))); 
				int userSelection = fileChooser.showSaveDialog(panel_2);
				 
				if (userSelection == JFileChooser.APPROVE_OPTION) {
				    File fileToSave = fileChooser.getSelectedFile();
				    System.out.println("Save as file: " + fileToSave.getAbsolutePath());
				    PrintWriter writer;
					try {
						writer = new PrintWriter(fileToSave.getAbsolutePath(), "UTF-8");
						writer.println(textPane.getText());
					    writer.close();
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (UnsupportedEncodingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				    
				}
			}
		});
		panel_2.add(btnSave);		
		
		panel_2.add(Box.createRigidArea(new Dimension(0,40)));
		btnCompile = new JButton("Compile");
		btnCompile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.removeAll();
				antlr4 = new ANTLR(textPane.getText());				
				antlr4.createGUITree();
				if (antlr4.getError()){
					txtAreaError.setText("Error:\n" + antlr4.getErrorListener().getError());
					txtAreaError.setForeground(Color.RED);
				}else {
					if (! (antlr4.getError() || antlr4.isErrorST() || antlr4.isbWarning()) ) {
						
						updateTable(antlr4);
						txtAreaError.setText("PASS");
						txtAreaError.setForeground(Color.GREEN);
					}
				}
				
				
				panel_1.add(antlr4.getViewr());
			}
		});
		panel_2.add(btnCompile);
		
		
		txtAreaError = new JTextArea();	
		txtAreaError.setText("Console");
		txtAreaError.setEditable(false);
		Font font = new Font("Verdana", Font.BOLD, 14);
		txtAreaError.setFont(font);
		
		jsp3 = new JScrollPane(txtAreaError, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jsp3.setPreferredSize(new Dimension(panel.getWidth(), 80));
		jsp3.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		panel.add(jsp3, BorderLayout.SOUTH);
		
				
		DefaultTableModel model = new DefaultTableModel();
		tableQuery = new JTable(model);
		tablePane = new JPanel();
		tablePane.add(new JScrollPane(tableQuery));
		tabbedPane.addTab("Query result", null, tablePane, null);

	}

	public JPanel getPanel_1(){
		return panel_1;
	}
	public void setPanel_1(JPanel panel_1){
		this.panel_1 = panel_1;
	}
	public JTextPane getTextPane(){
		return textPane;
	}
	public String readFile(String path, Charset encoding) throws IOException {
	  byte[] encoded = Files.readAllBytes(Paths.get(path));
	  return new String(encoded, encoding);
	}
	
	
	public void updateTable(ANTLR antrl4){
		
		//Actualizar tabla
		String[] columnas = antlr4.getVisitor().getColumnas().toArray(new String[antlr4.getVisitor().getColumnas().size()]);
		Object data[][];
		if (antlr4.getVisitor().getData().size()>0){
			 data = new Object[antlr4.getVisitor().getData().size()][antlr4.getVisitor().getData().get(0).size()];
			 for (int i=0;i<antlr4.getVisitor().getData().size();i++){
				 for (int j=0;j<antlr4.getVisitor().getData().get(i).size();j++){
					 data[i][j] = antlr4.getVisitor().getData().get(i).get(j).toString();
					 
				 }
				 
			 }
			 
		}
		else{
			data = new Object[0][0];
		}
		tablePane.removeAll();
		tableQuery = new JTable(data,columnas);
		tablePane.add(new JScrollPane(tableQuery));
		
	}

}
