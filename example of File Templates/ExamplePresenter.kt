class ExamplePresenterImpl() : ExampleContract.Presenter {
    var view: ExampleContract.View? = null


    override fun attachView(view: ExampleContract.View) {
        this.view = view
    }

    override fun detachView() {
        this.view = null
    }
}
