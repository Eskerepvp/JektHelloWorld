package org.example.pages;

import com.pepperoni.jekt.Elements;
import de.inetsoftware.jwebassembly.api.annotation.Export;

import static com.pepperoni.jekt.Elements.*;


/**
 * @author Pepperoni
 */

public class About {

    /**
     * The default method MUST class name to lowercase.
     * All pages must be in the "pages" directory.
     */

    @Export // this is required
    public static void about() {

        style("    body {\n" +
                "        color: #fff;\n" +
                "        font-family: Lato, Helvetica Neue, Helvetica, Arial, sans-serif;\n" +
                "        font-weight: 400;\n" +
                "        text-align: center;\n" +
                "        background-color: #2e3440;\n" +
                "    }");


        head("Head", "'<title>Jekt Demo</title>'");

        div("This text came from Jekt, a web framework written in Java and compiles to HTML, JavaScript, and CSS!");

        div("About Page");

    }

}
