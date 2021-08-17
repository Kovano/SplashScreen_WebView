package kovano.github.s018_webview_lvl02
//перетачиваю этот активити на сплэшскрин
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Activity2 : AppCompatActivity() {
// к этому файлу нет ответного layout, но есть splashscreen.xml
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()//прикольная штука - удаляет этот активити из стека после ухода с этого же активити, как будто и не открывали, при переходе назад выходит на стол.
    }
}