package com.example.e4.rcp.todo.handler;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;

public class RemoveTodoHandler {
  @Execute
  public void execute() {
    System.out.println("RemoveTodoHandler Called");
  }
} 