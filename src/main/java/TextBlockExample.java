public class TextBlockExample {
    public static void main(String[] args) {

        String messageOld = "'The time has come,' the Walrus said,\n" +
                "'To talk of many things:\n" +
                "Of shoes -- and ships -- and sealing-wax --\n" +
                "Of cabbages -- and kings --\n" +
                "And why the sea is boiling hot --\n" +
                "And whether pigs have wings.'\n";

        String messageNew = """
                'The time has come,' the Walrus said,
                'To talk of many things:
                Of shoes -- and ships -- and sealing-wax --
                Of cabbages -- and kings --
                And why the sea is boiling hot --
                And whether pigs have wings.'
                                """;

        System.out.println("Old version \n" + messageOld);
        System.out.println("New version \n" + messageNew);

        System.out.println("New version for html code \n");
        String html = """
                                  <html>
                                      <body>
                                          <p>Hello World.</p>
                                      </body>
                                  </html>
                """;
        System.out.println(html);
    }
}
