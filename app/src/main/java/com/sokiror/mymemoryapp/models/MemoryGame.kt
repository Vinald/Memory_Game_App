package com.sokiror.mymemoryapp.models

import com.sokiror.mymemoryapp.utils.DEFAULT_ICONS

class MemoryGame ( private val boardSize: BoardSize) {
    val cards: List<MemoryCard>
    private var numPairsFound = 0

    init {
        val chosenImages = DEFAULT_ICONS.shuffled().take(boardSize.getNumPairs())
        val randomizedImages = (chosenImages + chosenImages).shuffled()
        cards = randomizedImages.map{ MemoryCard(it, false, false) }
    }
}
