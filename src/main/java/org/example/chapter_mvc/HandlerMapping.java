package org.example.chapter_mvc;

public interface HandlerMapping {
    Object findHandler(HandlerKey handlerKey);
}
