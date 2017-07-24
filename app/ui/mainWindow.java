package ui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import handlers.AnBxHandler;

public class mainWindow extends JFrame {

	private JPanel contentPane;
	private JTextField openPath;
	private JTextField savePath;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainWindow frame = new mainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public mainWindow() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnOpenFile = new JButton("Select");
		btnOpenFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileOpenChooser = new JFileChooser();
				FileFilter filterAnBFiles = new FileNameExtensionFilter("AnB and AnBx files", "AnB", "AnBx");
				fileOpenChooser.setFileFilter(filterAnBFiles);
				fileOpenChooser.setAcceptAllFileFilterUsed(false);

				if (fileOpenChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
					openPath.setText(fileOpenChooser.getSelectedFile().toString());
				} else {
					if (openPath.getText() == null || openPath.getText() == "")
						openPath.setText("");
				}
			}
		});
		btnOpenFile.setBounds(358, 32, 103, 23);
		contentPane.add(btnOpenFile);

		JButton btnSaveFile = new JButton("Destination");
		btnSaveFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileOpenChooser = new JFileChooser();
				FileFilter filterAnBFiles = new FileNameExtensionFilter("vlsm files", "vlsm");
				fileOpenChooser.setFileFilter(filterAnBFiles);
				fileOpenChooser.setAcceptAllFileFilterUsed(false);

				if (fileOpenChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
					savePath.setText(fileOpenChooser.getSelectedFile().toString() + ".vlsm");
				} else {
					if (savePath.getText() == null || savePath.getText() == "")
						savePath.setText("");
				}
			}
		});
		btnSaveFile.setBounds(358, 76, 103, 23);
		contentPane.add(btnSaveFile);

		JButton btnAnalize = new JButton("Analize Input File");
		btnAnalize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!openPath.getText().equals(null) && !openPath.getText().equals("")) {
					String fileExtencion = openPath.getText().substring(openPath.getText().lastIndexOf('.') + 1);

					System.out.println("Analizing the file");
					try {
						if (fileExtencion.equalsIgnoreCase("anb")) {
							AnBxHandler anbHandlerObject = new AnBxHandler();
							String file = anbHandlerObject.openFile(openPath.getText().toString());
							anbHandlerObject.analizeFile(file);
						} else {
							AnBxHandler anbxHandlerObject = new AnBxHandler();
							String file = anbxHandlerObject.openFile(openPath.getText().toString());
							anbxHandlerObject.analizeFile(file);
						}
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			}
		});
		btnAnalize.setBounds(102, 158, 131, 23);
		contentPane.add(btnAnalize);

		JButton btnCreateFile = new JButton("Create Vlsm");
		btnCreateFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!openPath.getText().equals(null) && !openPath.getText().equals("")) {
					if (!savePath.getText().equals(null) && !savePath.getText().equals("")) {
						String fileExtencion = openPath.getText().substring(openPath.getText().lastIndexOf('.') + 1);
						String filepath = savePath.getText();
						String filename = savePath.getText().substring(savePath.getText().lastIndexOf('\\') + 1);
						String filecontent = "";

						try {
							if (fileExtencion.equalsIgnoreCase("anb")) {
								AnBxHandler anbHandlerObject = new AnBxHandler();
								String file = anbHandlerObject.openFile(openPath.getText().toString());
								filecontent = anbHandlerObject.writeFile(file);
								FileWriter save = new FileWriter(filepath);
								save.write(filecontent);
								save.close();
								JOptionPane.showMessageDialog(null, "The file" + filename + " was created successfully",
										"Created New File", JOptionPane.INFORMATION_MESSAGE);
							} else {
								AnBxHandler anbxHandlerObject = new AnBxHandler();
								String file = anbxHandlerObject.openFile(openPath.getText().toString());
								filecontent = anbxHandlerObject.writeFile(file);
								FileWriter save = new FileWriter(filepath);
								save.write(filecontent);
								save.close();
								JOptionPane.showMessageDialog(null, "The file" + filename + " was created successfully",
										"Created New File", JOptionPane.INFORMATION_MESSAGE);

							}
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					} else {
						JOptionPane.showMessageDialog(null, "Write the name of output file", "Alert",
								JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Select a AnB or Anbx file", "Alert",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnCreateFile.setBounds(309, 158, 89, 23);
		contentPane.add(btnCreateFile);

		openPath = new JTextField();
		openPath.setBackground(new Color(255, 255, 255));
		openPath.setEditable(false);
		openPath.setBounds(21, 33, 327, 20);
		contentPane.add(openPath);
		openPath.setColumns(10);

		savePath = new JTextField();
		savePath.setBackground(new Color(255, 255, 255));
		savePath.setEditable(false);
		savePath.setBounds(21, 77, 327, 20);
		contentPane.add(savePath);
		savePath.setColumns(10);

	}
}
