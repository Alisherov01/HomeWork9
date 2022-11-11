public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Oled", "Razer",
                "Black", "mSata",
                "Windows", "RTX 3090",
                true, "Sven");
        System.out.println(computer);
        System.out.println( );


        Display display = new Display(17, "Razer",
                "Twisted Nematic");
        System.out.println(display);
        System.out.println( );


        SSD ssd = new SSD("1 тб", "Intel");
        System.out.println(ssd);
        System.out.println( );


        RAM ram = new RAM("8 гб", "SK Hynix");
        System.out.println(ram);
        System.out.println();


        USBports usb = new USBports(3, 56315);
        System.out.println(usb);
        System.out.println();


        Keyboard keyboard = new Keyboard(true, true);
        System.out.println(keyboard);
    }
}

