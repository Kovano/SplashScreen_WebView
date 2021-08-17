package kovano.github.s018_webview_lvl02

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import androidx.core.view.get
import android.webkit.WebViewClient
import kovano.github.s018_webview_lvl02.databinding.ActivityMainBinding

/**
Для сплэш скрина.
1. файл colors.xml : добавляю свой цвет, пригодится для фона странички сплэшскрина.
2. добавляю файл *.png в папку drawable - это самого лого для сплэшскрина.
3. создаю splashscreen.xml - файл описывает сплэшскрин (вот тут свой фоновый цвет из первого пункта и подключаю).
4. в файле themes.xml тут объявляю тему сплэшскрин.
5. создаю Activity2.kt - активити на сплэшскрин.
6. файл манифеста: тут запускаю приложение с активити, в котором прописываю сплэшскрин.
*/
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val urlWeb = "https://google.ru/"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        webViewSetup()
    }
        @SuppressLint("SetJavaScriptEnabled")
    private fun webViewSetup () {
            binding.wV1.webViewClient =  WebViewClient()
            binding.wV1.apply {
                loadUrl(urlWeb)
                settings.javaScriptEnabled = true
                settings.safeBrowsingEnabled = true
            }
    }
}