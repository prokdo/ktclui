package ktclui.controller

import java.math.BigDecimal
import java.math.BigInteger
 
import ktclui.KtCLUIApp
import ktclui.screen.Screen

internal abstract class ScreenController {
    fun changeScreen(screen: Screen) = KtCLUIApp().changeScreen(screen)

    fun verifyString(string: String?) = !(string.isNullOrBlank() || string.isNullOrEmpty())

    fun verifyUInt(strUInt: String?) = strUInt?.toUIntOrNull()

    fun verifyInt(strInt: String?) = strInt?.toIntOrNull()

    fun verifyDouble(strDouble: String?) = strDouble?.toDoubleOrNull()

    fun verifyFloat(strFloat: String?) = strFloat?.toFloatOrNull()

    fun verifyBigDecimal(strBigDecimal: String?): BigDecimal? {
        if (!verifyString(strBigDecimal)) return null

        try { return BigDecimal(strBigDecimal) }
        catch (_: Exception) { return null }
    }

    fun verifyBigInteger(strBigInteger: String?): BigInteger? {
        if (!verifyString(strBigInteger)) return null

        try { return BigInteger(strBigInteger) }
        catch (_: Exception) { return null }
    }
}
