import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDropEvent;
import java.io.File;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class MainFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static MainFrame instance;
	public static final Container startPage = createStartPage();
	
	public static void main(String[] args) {
		instance = new MainFrame();
		instance.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		instance.setTitle("Bot de Hannah");
		instance.setVisible(true);
		navigateTo(startPage);
	}
	
	static void navigateTo(Container page) {
		instance.setContentPane(page);
		instance.setSize(page.getSize());
	}
	
	static Container createStartPage() {
		JPanel result = new JPanel(null);
		result.setSize(800,600);
		
		JLabel olaHannah = new JLabel("Olá Hannah :-)");
		olaHannah.setBounds(30, 20, 300, 20);
		result.add(olaHannah);
		
		JLabel tituloArea = new JLabel("Arraste o arquivo aqui:");
		tituloArea.setBounds(30, 50, 300, 80);
		result.add(tituloArea);
		
		JTextArea myPanel = new JTextArea();
		myPanel.setBounds(30, 130, 720, 400);
		myPanel.setBackground(Color.lightGray);
		myPanel.setDropTarget(new DropTarget() {
		    /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@SuppressWarnings("unchecked")
			public synchronized void drop(DropTargetDropEvent evt) {
		        try {
		            evt.acceptDrop(DnDConstants.ACTION_COPY);
					List<File> droppedFiles = (List<File>)
		                evt.getTransferable().getTransferData(DataFlavor.javaFileListFlavor);
		            for (File file : droppedFiles) {
		                final JDialog dlg = new JDialog(instance, true);
		                JProgressBar dpb = new JProgressBar(0, 500);
		                dlg.add(BorderLayout.CENTER, dpb);
		                dlg.add(BorderLayout.NORTH, new JLabel("Carregando..."));
		                dlg.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		                dlg.setSize(300, 75);
		                dlg.setLocationRelativeTo(result);

		                Thread t = new Thread(new Runnable() {
		                  public void run() {
		                    dlg.setVisible(true);
		                    Main main = new Main();
		                    if(main.main(file.getPath())) {
		                    	JOptionPane.showMessageDialog(instance, 
		                    			"Arquivo feito com sucesso localizado em /BotDeHannah/ArquivoModificado.csv",
		                    			"SUCESSO",JOptionPane.INFORMATION_MESSAGE);
		                    	dlg.setVisible(false);
		                    	System.exit(0);
		                    }else {
		                    	JOptionPane.showMessageDialog(instance, 
		                    			"Deu algum erro na geração do arquivo, por favor verifique o arquivo de entrada.",
		                    			"ERRO!",JOptionPane.ERROR_MESSAGE);
		                    }
		                  }
		                });
		                t.start();
		                dlg.setVisible(true);
		            }
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
		    }
		});
		
		result.add(myPanel);
		return result;
	}
}
