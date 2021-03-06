public class NameEncoderDecoder {
    public String encode(String name) {
        String changedName = name
                .replace("e", "1")
                .replace("u", "2")
                .replace("i", "3")
                .replace("o", "4")
                .replace("a", "5");
        return "NOTFORYOU" + changedName + "YESNOTFORYOU";
    }
    public String decode(String name) {
        String decodeName = name
               .substring(9)
                .replace("YESNOTFORYOU", "")
                .replace("YES", "")
                .replace("1", "e")
                .replace("2", "u")
                .replace("3", "i")
                .replace("4", "o")
                .replace("5", "a")
                .strip();
        return decodeName;
    }

    public static void main(String[] args) {
        NameEncoderDecoder names = new NameEncoderDecoder();

        String nameCode = names.encode("Crab");
        System.out.println("names.encode(\"Crab\") = " + nameCode);

        String nameDeCode = names.decode("NOTFORYOUCr5bYESNOTFORYOU");
        System.out.println("names.decode(\"NOTFORYOUCr5bYESNOTFORYOU\") = " + nameDeCode);

        String nameDeCodeTwo = names.decode("NOTFORYOUNOTFORYOUYESNOTFORYOU");
        System.out.println("names.decode(\"NOTFORYOUNOTFORYOUYESNOTFORYOU\") = " + nameDeCodeTwo);
           }
}
