package project.dscjss.plasmadonor.Util

import android.content.Context
import android.widget.Toast

class Utilities {

    companion object {

        fun showShortToast(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }

        fun showLongToast(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_LONG).show()
        }
    }

}