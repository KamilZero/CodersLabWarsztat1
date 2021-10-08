package pl.coderslab;

import org.apache.commons.lang3.StringUtils;

public class MainTest {
    public static void main (String[] args) {
        Boolean b = StringUtils.containsWhitespace("a s d f g");
        System.out.println();
        System.out.println(ConsoleColors.GREEN_BOLD + " green bold");
        System.out.println(ConsoleColors.RED + " red");
    }
}
