package pl.kj.firstapp;


import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class GreetingController {

    private static final String template2 = "Bye, %s!";
    private static final String template = "Hello, %s!";
    private static final String template3 = "text";
    private final AtomicLong counter = new AtomicLong();
    private CountService countService;

    //Zad1+2
    @RequestMapping(path = "/bye", method = GET)
    public Greeting bye(@RequestParam(value = "name", defaultValue = "World") String name)
    {
        return new Greeting(counter.incrementAndGet(), String.format(template2, name));
    }
    @RequestMapping(path = "/greeting", method = GET)
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name)
    {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    // Zad 3
    @RequestMapping(path="/wiek", method = GET)
    public Wiek wiek (@RequestParam(value = "wiek", defaultValue = "69") int wiek)
    {
        return new Wiek(counter.incrementAndGet(), wiek);
    }


    // Zad 4
    @RequestMapping(path = "/nameiage", method = GET) //4)dodaje zwracana wartosc - imie i wiek
    public Nameiage nameiage(@RequestParam(value = "wiek", defaultValue = "1") int wiek,
                             @RequestParam(value = "name", defaultValue = "User") String name) {
        return new Nameiage(counter.incrementAndGet(), String.format(template, name), wiek);

    }
    // Zad 5
    @RequestMapping(path = "/checkName", method = GET)
    public String checkName(@RequestParam("name") String name) {
        if (name.charAt(name.length() - 1) == 'a') {
            return "Kobieta";
        } else {
            return "Mezczyzna";
        }
    }

    // Zad 6
    @RequestMapping(path = "/checkText", method = GET)
    public boolean checkText(@RequestParam("text") String text) {
        if (text.contains(template3)) {
            return true;
        } else {
            return false;
        }
    }}