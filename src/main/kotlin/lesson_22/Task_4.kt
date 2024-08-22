package lesson_22

fun main() {

    val state = MainScreenState()
    val viewModel = ViewModel(state)

    println(viewModel.getData())
    viewModel.loadData()

}

data class MainScreenState(
    val data: String? = null,
    val isLoading: Boolean = false,
) {
    override fun toString(): String {
        return "Данные - $data\nЗагрузка - $isLoading\n"
    }
}

class ViewModel(
    private var mainScreenState: MainScreenState,
) {

    fun getData(): MainScreenState = mainScreenState

    fun loadData() {

        mainScreenState = mainScreenState.copy(isLoading = true)
        println("Состояние: $mainScreenState")
        print("Загрузка данных")
        val animation: List<String> = listOf(".", ".", ".", ".")

        animation.forEach { point ->
            print(point)
            Thread.sleep(1000)
        }

        println()

        val loadedData = "Данные с сервака"
        mainScreenState = mainScreenState.copy(data = loadedData, isLoading = false)
        println("Данные загружены.\nСостояние: $mainScreenState\n")
    }
}