package com.intellij.idea.customization.base

import com.intellij.toolWindow.DefaultToolWindowLayoutBuilder
import com.intellij.toolWindow.DefaultToolWindowLayoutExtension

internal class RebasedToolWindowLayoutProvider : DefaultToolWindowLayoutExtension {
  override fun buildV1Layout(builder: DefaultToolWindowLayoutBuilder) {
    moveTerminalToRight(builder)
  }

  override fun buildV2Layout(builder: DefaultToolWindowLayoutBuilder) {
    moveTerminalToRight(builder)
  }

  private fun moveTerminalToRight(builder: DefaultToolWindowLayoutBuilder) {
    builder.right.addOrUpdate("Terminal") {
      isVisible = true
      weight = 0.35f
    }
  }
}
