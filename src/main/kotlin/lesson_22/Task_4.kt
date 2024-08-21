package lesson_22


fun main() {

    val viewModel = MainScreenState()
    val noDataScreen = viewModel.loadData()
    val fullDataScreen = viewModel.loadData("Новые данные")
}

data class MainScreenState(
    val data: String? = null,
    val isLoading: Boolean = false,
) {

    fun loadData(): MainScreenState {
        val loadState = this.copy(isLoading = true)
        println("Загрузка инициализирована")
        return loadState
    }

    fun loadData(addData: String): MainScreenState {
        val fullDataState = this.copy(data = addData, isLoading = false)
        println("Данные загружены")
        return fullDataState
    }

}