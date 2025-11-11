package kr.ac.kumoh.s20220300.w25w09_carddealer.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class CardController {
    @GetMapping("/cards/random")
    fun getRandomCard(model : Model): String {
        model.addAttribute(
            "cards",
            "ace_of_spades.png"
        )
        return "cards"
    }
}