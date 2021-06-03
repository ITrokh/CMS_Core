package com.kpi.web.systems.lab2.statics;

import com.kpi.web.systems.lab2.model.enums.Language;

public class StaticFieldsUtils {

    public static String getProceedText(Language language) {
        return language == Language.UA
                ? "Перейти"
                : "Open";
    }

    public static String getHeaderText(Language language) {
        return language == Language.UA
                ? "Лаб 2 - Ядро CMS-Системи - Розробка інтелектуальних Web-систем"
                : "Lab 2 - CMS Core - Development of Intelligent Web Systems";
    }

    public static String getFooterSignText(Language language) {
        return language == Language.UA
                ? "Виконав : Трохименко Іван, студент групи ІП-03мн"
                : "Developed by Ivan Trokhymenko, student of IP-03mn";
    }

    public static String getFooterCopyrightsText(Language language) {
        return language == Language.UA
                ? "(c) Всі права знаходяться під охороною."
                : "(c) All rights reserved.";
    }

    public static String getOpenText(Language language) {
        return language == Language.UA
                ? "Перейти →"
                : "Open →";
    }

    public static String getOpenTextShortened() {
        return ">";
    }
}
