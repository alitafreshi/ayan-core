package ir.tafreshiali.monshi_plus_domain

sealed class ScreenTypes(val route: String) {
    object SingleInput : ScreenTypes(route = "singleInputScreen")
    object MultiInput : ScreenTypes(route = "multiInputScreen")
    object ComplexInput : ScreenTypes(route = "complexInputScreen")
    object PlateInput : ScreenTypes(route = "plateInputScreen")
}
