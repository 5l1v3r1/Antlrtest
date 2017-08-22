package ui;

import handlers.AnBxHandler;

public class GenerateFile {
	public static void main(String[] args) throws Exception {

		String[] filenames = { "Amended_NSCK", "AnBx_BlindForwarding", "AnBx_Fresh_from_A_with_DH", "AnBx_Fresh_from_A",
				"AnBx_from_A", "AnBx_from_A_Secret", "AnBx_From_A_secret_for_B_C_honest", "AndrewSecureRPCSecrecy",
				"Bilateral_Key_Exchange", "Carlsen", "DenningSaccoCorr", "dh", "dh_auth", "dh_hmac", "emv-visa-k3",
				"EPMO", "Fresh_From_A", "Fresh_From_A_Secret", "fresh_from_A_with_DH", "Fresh_PublicKey", "From_A",
				"From_A_Secret", "h530fix", "ISOCCFOnePassUnilateralAuthProt", "ISOCCFThreePassMutual",
				"ISOCCFTwoPassMutualAuthProt_Corr", "ISOpubKeyOnePassUnilateralAuthProt",
				"ISOpubKeyTwoPassMutualAuthProtCorr", "NonReversible", "NSL", "NSL_KeyServer", "NSPK", "orig_1kp",
				"orig_1kp_fixed", "orig_2kp", "orig_2kp_fixed", "orig_3kp", "orig_3kp_fixed", "Otway_Rees", "rev_1kp",
				"rev_2kp", "rev_3kp", "Secret_for_B", "set_orig", "set_orig_v2", "set_rev", "set_rev_v2", "ShareAgree",
				"WL92", "WMF" };

		int a = 1;

		for (int i = 0; i < filenames.length; i++) {
			String filename = filenames[i];
			String filepath = "./study_cases/" + filename;
			String outpath = "./processed_study_cases/" + filename;

			AnBxHandler anbxHandlerObject = new AnBxHandler();

			String filecontent = anbxHandlerObject.writeFile(anbxHandlerObject.openFile(filepath + ".AnB"));
			if (anbxHandlerObject.saveFile(outpath + "AnB", filecontent)) {
				System.out.println("file save: " + filename + "AnB.peal");
			} else {
				System.out.println("Error at saving file: " + filename + "AnB.peal");
			}
//			 System.out.println(filecontent);

			 filecontent =
			 anbxHandlerObject.writeFile(anbxHandlerObject.openFile(filepath +
			 ".AnBx"));
			 if (anbxHandlerObject.saveFile(outpath + "AnBx", filecontent)) {
			 System.out.println("file save: " + filename + "AnBx.peal");
			 } else {
			 System.out.println("Error at saving file: "+ filename +
			 "AnBx.peal");
			 }
			 // System.out.println(filecontent);
		}
	}
}
