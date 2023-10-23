package com.androiddev.diaryapp.presentation.screens.write

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.createSavedStateHandle
import com.androiddev.diaryapp.model.Mood
import com.androiddev.diaryapp.util.Constants.WRITE_SCREEN_ARGUMENT_KEY

class WriteViewModel(
    private val saveStateHandle: SavedStateHandle
) : ViewModel() {

    var uiState by mutableStateOf(UiState())
    init {
        getDiaryIdArgument()
    }
    fun getDiaryIdArgument() {
        uiState =
            uiState.copy(selectedDiaryId = saveStateHandle.get<String>(key = WRITE_SCREEN_ARGUMENT_KEY))
    }
}

data class UiState(
    val selectedDiaryId: String? = null,
    val title: String = "",
    val description: String = "",
    val mood: Mood = Mood.Neutral
)