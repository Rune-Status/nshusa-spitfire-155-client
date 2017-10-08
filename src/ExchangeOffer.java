public class ExchangeOffer {

    byte flags;
    public int int272;
    public int int268;
    public int int269;
    public int int270;
    public int int271;

    public ExchangeOffer() {
    }

    public ExchangeOffer(Buffer buffer_1, boolean bool_2) {
        flags = buffer_1.method440();
        int272 = buffer_1.method441();
        int268 = buffer_1.method444();
        int269 = buffer_1.method444();
        int270 = buffer_1.method444();
        int271 = buffer_1.method444();
        if (bool_2) {
            int i_4 = 0;
            boolean bool_5 = false;

            while (true) {
                int i_6 = buffer_1.method439();
                if (i_6 == 255) {
                    Integer integer_3 = bool_5 ? Integer.valueOf(i_4) : null;
                    method310(integer_3);
                    break;
                }

                if (i_6 != 0)
                    throw new IllegalStateException("");

                while (true) {
                    int i_7 = buffer_1.method439();
                    if (i_7 == 255)
                        break;

                    --buffer_1.off;
                    if (buffer_1.method441() != 0)
                        throw new IllegalStateException("");

                    if (bool_5)
                        throw new IllegalStateException("");

                    i_4 = buffer_1.method444();
                    bool_5 = true;
                }
            }
        }

    }

    void method310(Integer integer_1) {
    }

    public int method311() {
        return flags & 0x7;
    }

    public int method312() {
        return (flags & 0x8) == 8 ? 1 : 0;
    }

    void method313(int i_1) {
        flags &= ~0x7;
        flags = (byte) (flags | i_1 & 0x7);
    }

    void method314(int i_1) {
        flags &= ~0x8;
        if (i_1 == 1)
            flags = (byte) (flags | 0x8);

    }

}
