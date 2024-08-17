package lessons_1_10.Lesson_2

fun main() {
    val staff: Int = 50
    val staffSalary: Int = 30000
    val externalStaff: Int = 30
    val externalStaffSalary: Int = 20000

    //Расходы на выплату зарплаты постоянных сотрудников
    val monthlyStaffSalary = staff * staffSalary

    //Общие расходы по ЗП после прихода стажеров
    val fullMonthlyStaffSalary = monthlyStaffSalary + (externalStaff * externalStaffSalary)

    // Вычисляю количество работников
    val fullStaff = staff + externalStaff

    // Средняя ЗП одного сотрудника после устройства стажеров
    val meanSalaryPerEmployee: Int = fullMonthlyStaffSalary / fullStaff

    // Вывожу информацию
    println("Расходы на выплату зарплаты постоянных сотрудников: $monthlyStaffSalary руб.")
    println("Общие расходы по ЗП после прихода стажеров: $fullMonthlyStaffSalary руб.")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $meanSalaryPerEmployee руб.")
}