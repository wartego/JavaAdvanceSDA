package ZadaniaWlasneZaawansowane.jaknauczycsieprogramowania.usbdevice;

public interface USBDevice {
    boolean connect();
    boolean disconnect();
    String getName();
}
