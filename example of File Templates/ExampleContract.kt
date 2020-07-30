interface ExampleContract {

    interface View {
    }

    interface Presenter {
        fun attachView(view: ExampleContract.View)
        fun detachView()
    }
}
