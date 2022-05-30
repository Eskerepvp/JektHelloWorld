package org.example.pages;

import de.inetsoftware.jwebassembly.api.annotation.Export;

import static com.pepperoni.jekt.Elements.*;
import static com.pepperoni.jekt.EmbeddedJavaScript.*;
import static com.pepperoni.jekt.JavaEmbeddedHTML.*;

public class Counter {


    @Export
    public static void counter() {


        String buttonStyle = "background-color: #4CAF50; /* Green */  border: none;  color: white;  padding: 7px 16px;  text-align: center;  text-decoration: none;  display: inline-block;  font-size: 16px; cursor: pointer; margin-left: 1em; margin-top:25em; border-radius: 25px;";

        style("    body {\n" +
                "        color: #fff;\n" +
                "        font-family: Lato, Helvetica Neue, Helvetica, Arial, sans-serif;\n" +
                "        font-weight: 400;\n" +
                "        text-align: center;\n" +
                "        align-items: center;\n" +
                "        justify-content: center;\n" +
                "        background-color: #2e3440;\n" +
                "    }");




        jeh("CounterVar", "'" +
                "<h1 id=\"counterTextDiv\">Counter</h1> " +
                "<h1 id=\"count\">" + "0" + "</h1>" +
                "<button style=\"" + buttonStyle + "\"" + " id=\"increaseButton\" onclick=\"  \">Increase</button>" +
                "<button style=\"" + buttonStyle + "\"" + " id=\"decreaseButton\">Decrease</button>'");

        script("let counterDisplayElem = document.getElementById(\"count\");\n" +
                "let counterMinusElem = document.getElementById(\"decreaseButton\");\n" +
                "let counterPlusElem = document.getElementById(\"increaseButton\");\n");

        script("let count = 0;\n" +
                "\n" +
                "updateDisplay();\n" +
                "\n" +
                "counterPlusElem.addEventListener(\"click\",()=>{\n" +
                "    count++;\n" +
                "    updateDisplay();\n" +
                "}) ;\n" +
                "\n" +
                "counterMinusElem.addEventListener(\"click\",()=>{\n" +
                "    count--;\n" +
                "    updateDisplay();\n" +
                "});\n" +
                "\n" +
                "function updateDisplay(){\n" +
                "    counterDisplayElem.innerHTML = count;\n" +
                "};");



    }

    @Export
    public static void increaseCount() {
    }

}
