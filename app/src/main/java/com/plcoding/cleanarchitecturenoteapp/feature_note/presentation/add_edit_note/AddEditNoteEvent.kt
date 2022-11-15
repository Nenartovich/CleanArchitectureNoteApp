package com.plcoding.cleanarchitecturenoteapp.feature_note.presentation.add_edit_note

import androidx.compose.ui.focus.FocusState

sealed class AddEditNoteEvent {

    data class EnteredTitle(val value: String) : AddEditNoteEvent()
    data class ChangeTitleFocus(val titleFocus: FocusState) : AddEditNoteEvent()

    data class EnteredContent(val value: String) : AddEditNoteEvent()
    data class ChangeContentFocus(val contentFocus: FocusState) : AddEditNoteEvent()

    data class ChangeColor(val color: Int) : AddEditNoteEvent()

    object SaveNote : AddEditNoteEvent()
}
