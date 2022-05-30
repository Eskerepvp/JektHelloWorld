package org.example.pages;

import de.inetsoftware.jwebassembly.api.annotation.Export;

import static com.pepperoni.jekt.Elements.*;
import static com.pepperoni.jekt.EmbeddedJavaScript.*;
import static com.pepperoni.jekt.JavaEmbeddedHTML.jeh;
import static com.pepperoni.jekt.router.Links.Link;

/**
 * @author Pepperoni
 */

public class Examples {


    @Export
    public static void examples() {

        /**
         * The "head" method uses JavaEmbeddedHTML.jeh() to create a head element, overrides what is declared in the html file
         * The "body" method is the same as the "head" method, but html body element instead.
         */

        head("ThisCameFromHeadMethod", "'<title>Jekt</title>'");

        body("ThisCameFromBodyMethod", "`<div>Hi AlphaStallion</div>`");


        /**
         * This creates a style element, the css code is represented as a java.lang.String
         */

        style("    body {\n" +
                "        color: #fff;\n" +
                "        font-family: Lato, Helvetica Neue, Helvetica, Arial, sans-serif;\n" +
                "        font-weight: 400;\n" +
                "        background-color: #2e3440;\n" +
                "    }");

        /**
         * These are just integers to test out java math in javascript/html
         */

        int javaMath = 5 + 2 * 9 + 8;

        int pps = 2;

        int himom = 5;

        /**
         * h1 through canvas is showing how to make html elements in java.
         */

        h1("H1");
        h2("H2");
        h3("H3");
        h4("H4");
        h5("H5");
        h6("H6");
        p("Paragraph");
        div("Div");
        button("Button");
        canvas("Canvas");

        /**
         * The jeh() method is java embedded html, were you can write any html
         * code as a string.
         * You need a variable name because what I do is create a javascript
         * variable, with the String varName inside the jeh method.
         * This takes the java string and converts it to a javascript string.
         * Then in javascript, document.body.innerHTML += varName
         */

        jeh("HackyDiv", "'<div> This is so hacky! </div>';");

        /**
         * Ignore most of this,
         * These are notes/test to myself to see if
         * things work.
         * You can read this if you want to learn how everything works.
         */

        jeh("NotHackyDiv", "'<div> This is not so hacky! </div>';");
        jeh("CoolDiv", "'<div id = \"coolDiv\"> This is cool! </div>'");
        jeh("CoolButton", "'<button type= \"button\"> Click Me! </button>'");
        jeh("MultipleHackyElements", "'<div id = \"SuperHacky!\"> " + javaMath + " </div>  <img src=\"https://final.doordashdev.repl.co/Hacky.png\" alt=\"Hacky Image!\" width=\"500\" height=\"600\">  '");
        jeh("ButtonJavaScript", "'<button onclick=\"hackyFunction()\">Ultra Hacky!</button>'");
        div(String.valueOf(1 + 2));
        script("console.log('JavaScript')");
        script("function hackyFunction() {alert('Ultra Hacky!')}");
        script("console.log('Java Inside Javascript!" + (pps) + "')"); // java inside javascript
        function("helloHacky", alert("Hello Hacky"));
        script(alert("Internal JavaScript"));
        script(console_log("Internal JavaScript"));
        script(jsConst("constInt", "2"));
        script(jsConst("constString", "'Not Hacky'"));
        script(var("javaVar", "'this var came from java'"));
        script(jsClass("HackyClass",
                "foo, bar",
                "this.foo = foo; this.bar = bar;",
                "" +
                        "alertHacky() { alert('Hacky Class') }"));
        jeh("HiMom", "'<div>Hi Mom!" + (himom) + "</div>'");
        /**
         * This the jVoid Method runs a JAVA method
         * from html/javascript.
         * !!
         */
        jeh("JavaMethodInsideJS", "'<button onclick=" + jVoid(WrapMode.Quotes,"JektHelloWorld-1.0-SNAPSHOT.wasm", "test") + " >Java Method</button>'");
        jeh("HelloFromTheOtherSide", "'<button onclick=" + jVoid(WrapMode.Quotes,"JektHelloWorld-1.0-SNAPSHOT.wasm", "aVoid") + " >Click Me</button>'");


        jeh("LinkTest", Link(About.class, "Test"));
        /**
         * Link, for the router and compiler I made.
         * There is a String link, and link that returns void
         * This is for java embedded html.
         */
        Link(About.class, " " + "Test 2", true, "test2Link");
    }

    @Export
    public static void test() {
        script(alert("Hello from the other side"));
    }

    @Export
    public static void aVoid() {
        div("Hello from the other side!");
    }

}
