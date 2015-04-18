package com.fine.nssali;





import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;









public class AlertDialogManager {
	/**
	 * C'est une fonction pour afficher les alertes Dialog
	 *AGOUZAL Mehdi
	 * */
	public void showAlertDialog(Context context, String title, String message,
			Boolean status) {
		AlertDialog alertDialog = new AlertDialog.Builder(context).create();

		// Setting Dialog Title
		alertDialog.setTitle("Echec de Connexion");

		// Setting Dialog Message
		alertDialog.setMessage("Vous êtes hors connexion,Connectez vous à l'internet et essayez de nouveau.");

		if(status != null)
			// Setting alert dialog icon
			alertDialog.setIcon((status) ? R.drawable.success : R.drawable.fail);

		// Setting OK Button
		alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
			}
		});

		// Showing Alert Message
		alertDialog.show();
	}
}
