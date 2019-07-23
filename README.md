# ninehive
A MVP library for Android.


# Download

```groovy
dependencies {
    def ninehive_version = '0.2.0'
    implementation "com.github.henrypra:ninehive:$ninehive_version"
}
```

You also have to add the url in your root build.gradle at the end of the repositories:

```groovy
allprojects {
  repositories {
        ...
        maven { url "https://jitpack.io" }
  }
}
```

# Usage

`MainFragment.kt`
```kotlin
fun initCalculation() {
    if (!edt_value_one?.text.isNullOrEmpty()) {
        presenter?.onCalculateClicked(edt_value_one?.text.toString().toDouble())
    }
}

override fun displayResult(dollar: Double?) {
    tv_result?.text = dollar.toString()
}
```

`MainContract.kt`
```kotlin
interface MainContract {
    interface Presenter : BasePresenter {
        fun onCalculateClicked(euro: Double?)
    }

    interface View : BaseView<Presenter> {
        fun displayResult(dollar: Double?)
    }

}

```

`MainPresenter.kt`
```kotlin
private val excRate = 1.12085

override fun onCalculateClicked(euro: Double?) {
    view.displayResult(euro?.times(excRate))
}

```
