package ninehive

class PresenterNullException internal constructor(className: String) :
    RuntimeException("Presenter for $className is null")