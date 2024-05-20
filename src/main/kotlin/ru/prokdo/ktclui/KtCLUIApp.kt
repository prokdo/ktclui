package ktclui

import ktclui.screen.Screen

internal open class KtCLUIApp private constructor() {
    protected lateinit var _currentScreen: Screen

    fun launch() = this._currentScreen.show()

    fun setScreen(screen: Screen) { this._currentScreen = screen }

    fun changeScreen(screen: Screen) {
        this._currentScreen = screen
        this._currentScreen.show()
    }

    companion object {
        private val instance by lazy { KtCLUIApp() }

        operator fun invoke(): KtCLUIApp = KtCLUIApp.instance

        operator fun invoke(screen: Screen): KtCLUIApp {
            KtCLUIApp.instance._currentScreen = screen

            return KtCLUIApp.instance
        }
    }
}
