package Inter;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class FrmcAd {

	public JFrame frmFarmaciaAdmin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmcAd window = new FrmcAd();
					window.frmFarmaciaAdmin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrmcAd() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFarmaciaAdmin = new JFrame();
		frmFarmaciaAdmin.setTitle("Farmacia Admin");
		frmFarmaciaAdmin.setBounds(100, 100, 450, 300);
		frmFarmaciaAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
