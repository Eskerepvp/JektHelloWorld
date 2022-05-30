package org.example.pages;

import com.pepperoni.jekt.Elements;
import de.inetsoftware.jwebassembly.api.annotation.Export;

import static com.pepperoni.jekt.Elements.*;


public class HelloWorld  {

    @Export
    public static void helloworld() {
        p("Hello World Using the Jekt Framework!");
    }

}
