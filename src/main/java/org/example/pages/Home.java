package org.example.pages;

import de.inetsoftware.jwebassembly.api.annotation.Export;

import static com.pepperoni.jekt.Elements.*;
import static com.pepperoni.jekt.EmbeddedJavaScript.alert;
import static com.pepperoni.jekt.EmbeddedJavaScript.script;
import static com.pepperoni.jekt.router.Links.Link;


/**
 * @author Pepperoni
 */

public class Home {

    /**
     * The default method MUST class name to lowercase.
     * All pages must be in the "pages" directory.
     */

    @Export // this is required
    public static void home() {

        style("    body {\n" +
                "        color: #fff;\n" +
                "        font-family: Lato, Helvetica Neue, Helvetica, Arial, sans-serif;\n" +
                "        font-weight: 400;\n" +
                "        text-align: center;\n" +
                "        background-color: #2e3440;\n" +
                "    }" +
                "a {\n" +
                "  color: hotpink;\n" +
                "}");


        head("Head", "'<title>Jekt Demo</title>'");

        div("This text came from Jekt, a web framework written in Java and compiles to HTML, JavaScript, and CSS!");

        div("Home Page");

        p("Routes:");

        Link(About.class, "About", true, "aboutRoute");

        p(" "); // blank space

        Link(Counter.class, "Counter", true, "counterRoute");

        p(" "); // blank space

        Link(Examples.class, "Examples", true, "examplesRoute");

        p("");

        Link(HelloWorld.class, "Hello World", true, "helloWorldRoute");


    }

}
