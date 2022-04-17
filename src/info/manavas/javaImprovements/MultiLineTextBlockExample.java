package info.manavas.javaImprovements;

public class MultiLineTextBlockExample {
    public static void main(String[] args) {
        String st1 = """
                HELLO WORLD
                Using Text block
                """;
        System.out.println("st1 = " + st1);
        String phrase = """
                {
                    employee : "Mike",
                    employeeId : 4,
                    employeeType: FT
                }
                """;
        System.out.println("phrase = " + phrase);
        String html = """
                <html>
                    <body>
                        <p>"JAVA, programming"</p>
                    </body>
                </html>
                """;
        System.out.println("html = " + html);

        String st2 = st1.concat("This is my first textblock");
        System.out.println("st2 = " + st2);
    }
}
