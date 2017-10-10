
public class StaticClass10 {

    public static int staticInt52;
    static byte[] staticByteArray1 = new byte[2048];
    static byte[] staticByteArray2 = new byte[2048];
    static Buffer[] staticBufferArray1 = new Buffer[2048];
    static int staticInt50 = 0;
    static int[] staticIntArray19 = new int[2048];
    static int staticInt49 = 0;
    static int[] staticIntArray21 = new int[2048];
    static int[] staticIntArray22 = new int[2048];
    static int[] staticIntArray18 = new int[2048];
    static int[] staticIntArray20 = new int[2048];
    static int staticInt51 = 0;
    static int[] staticIntArray23 = new int[2048];
    static Buffer staticBuffer2 = new Buffer(new byte[5000]);

    StaticClass10() throws Throwable {
        throw new Error();
    }

    static final void initGPI(Packet packet_0) {
        packet_0.initBitAccess();
        int i_2 = Client.staticInt293;
        Player player_3 = BufferWrapper.staticPlayer1 = Client.staticPlayerArray1[i_2] = new Player();
        player_3.int681 = i_2;
        int i_4 = packet_0.readBits(30);
        byte b_5 = (byte) (i_4 >> 28);
        int i_6 = i_4 >> 14 & 0x3fff;
        int i_7 = i_4 & 0x3fff;
        player_3.intArray103[0] = i_6 - DataClass10.staticInt111;
        player_3.int626 = (player_3.intArray103[0] << 7) + (player_3.method696() << 6);
        player_3.intArray104[0] = i_7 - Class4.staticInt53;
        player_3.int609 = (player_3.intArray104[0] << 7) + (player_3.method696() << 6);
        DataClass14.staticInt156 = (player_3.int683 = b_5 * 612649739) * 649046179;

        // player appearance
        if (staticBufferArray1[i_2] != null)
            player_3.method695(staticBufferArray1[i_2]);

        staticInt50 = 0;
        staticIntArray19[staticInt50++] = i_2;
        staticByteArray1[i_2] = 0;
        staticInt49 = 0;

        for (int i_8 = 1; i_8 < 2048; i_8++)
            if (i_8 != i_2) {
                int i_9 = packet_0.readBits(18);
                int i_10 = i_9 >> 16;
                int i_11 = i_9 >> 8 & 0x255;
                int i_12 = i_9 & 0x255;
                staticIntArray22[i_8] = (i_10 << 28) + (i_11 << 14) + i_12;
                staticIntArray18[i_8] = 0;
                staticIntArray20[i_8] = -1;
                staticIntArray21[staticInt49++] = i_8;
                staticByteArray1[i_8] = 0;
            }

        packet_0.finishBitAccess();
    }

    static final void staticMethod53(Packet packet_0, int i_1) {
        int i_3 = packet_0.off;
        staticInt51 = 0;
        int i_4 = 0;
        packet_0.initBitAccess();

        int i_5;
        int i_6;
        int i_7;
        for (i_5 = 0; i_5 < staticInt50; i_5++) {
            i_6 = staticIntArray19[i_5];
            if ((staticByteArray1[i_6] & 0x1) == 0)
                if (i_4 > 0) {
                    --i_4;
                    staticByteArray1[i_6] = (byte) (staticByteArray1[i_6] | 0x2);
                } else {
                    i_7 = packet_0.readBits(1);
                    if (i_7 == 0) {
                        i_4 = staticMethod54(packet_0);
                        staticByteArray1[i_6] = (byte) (staticByteArray1[i_6] | 0x2);
                    } else
                        staticMethod55(packet_0, i_6);
                }
        }

        packet_0.finishBitAccess();
        if (i_4 != 0)
            throw new RuntimeException();
        else {
            packet_0.initBitAccess();

            for (i_5 = 0; i_5 < staticInt50; i_5++) {
                i_6 = staticIntArray19[i_5];
                if ((staticByteArray1[i_6] & 0x1) != 0)
                    if (i_4 > 0) {
                        --i_4;
                        staticByteArray1[i_6] = (byte) (staticByteArray1[i_6] | 0x2);
                    } else {
                        i_7 = packet_0.readBits(1);
                        if (i_7 == 0) {
                            i_4 = staticMethod54(packet_0);
                            staticByteArray1[i_6] = (byte) (staticByteArray1[i_6] | 0x2);
                        } else
                            staticMethod55(packet_0, i_6);
                    }
            }

            packet_0.finishBitAccess();
            if (i_4 != 0)
                throw new RuntimeException();
            else {
                packet_0.initBitAccess();

                for (i_5 = 0; i_5 < staticInt49; i_5++) {
                    i_6 = staticIntArray21[i_5];
                    if ((staticByteArray1[i_6] & 0x1) != 0)
                        if (i_4 > 0) {
                            --i_4;
                            staticByteArray1[i_6] = (byte) (staticByteArray1[i_6] | 0x2);
                        } else {
                            i_7 = packet_0.readBits(1);
                            if (i_7 == 0) {
                                i_4 = staticMethod54(packet_0);
                                staticByteArray1[i_6] = (byte) (staticByteArray1[i_6] | 0x2);
                            } else if (staticMethod56(packet_0, i_6))
                                staticByteArray1[i_6] = (byte) (staticByteArray1[i_6] | 0x2);
                        }
                }

                packet_0.finishBitAccess();
                if (i_4 != 0)
                    throw new RuntimeException();
                else {
                    packet_0.initBitAccess();

                    for (i_5 = 0; i_5 < staticInt49; i_5++) {
                        i_6 = staticIntArray21[i_5];
                        if ((staticByteArray1[i_6] & 0x1) == 0)
                            if (i_4 > 0) {
                                --i_4;
                                staticByteArray1[i_6] = (byte) (staticByteArray1[i_6] | 0x2);
                            } else {
                                i_7 = packet_0.readBits(1);
                                if (i_7 == 0) {
                                    i_4 = staticMethod54(packet_0);
                                    staticByteArray1[i_6] = (byte) (staticByteArray1[i_6] | 0x2);
                                } else if (staticMethod56(packet_0, i_6))
                                    staticByteArray1[i_6] = (byte) (staticByteArray1[i_6] | 0x2);
                            }
                    }

                    packet_0.finishBitAccess();
                    if (i_4 != 0)
                        throw new RuntimeException();
                    else {
                        staticInt50 = 0;
                        staticInt49 = 0;

                        for (i_5 = 1; i_5 < 2048; i_5++) {
                            staticByteArray1[i_5] = (byte) (staticByteArray1[i_5] >> 1);
                            Player player_8 = Client.staticPlayerArray1[i_5];
                            if (player_8 != null)
                                staticIntArray19[staticInt50++] = i_5;
                            else
                                staticIntArray21[staticInt49++] = i_5;
                        }

                        staticMethod57(packet_0);
                        if (i_1 != packet_0.off - i_3)
                            throw new RuntimeException(packet_0.off - i_3 + " " + i_1);
                    }
                }
            }
        }
    }

    static int staticMethod54(Packet packet_0) {
        int i_2 = packet_0.readBits(2);
        int i_3;
        if (i_2 == 0)
            i_3 = 0;
        else if (i_2 == 1)
            i_3 = packet_0.readBits(5);
        else if (i_2 == 2)
            i_3 = packet_0.readBits(8);
        else
            i_3 = packet_0.readBits(11);

        return i_3;
    }

    static void staticMethod55(Packet packet_0, int i_1) {
        boolean bool_3 = packet_0.readBits(1) == 1;
        if (bool_3)
            staticIntArray23[staticInt51++] = i_1;

        int i_4 = packet_0.readBits(2);
        Player player_5 = Client.staticPlayerArray1[i_1];
        if (i_4 == 0) {
            if (bool_3)
                player_5.bool76 = false;
            else if (i_1 == Client.staticInt293)
                throw new RuntimeException();
            else {
                staticIntArray22[i_1] = (Class4.staticInt53 + player_5.intArray104[0] >> 13) + (player_5.int683 * 649046179 << 28) + (player_5.intArray103[0] + DataClass10.staticInt111 >> 13 << 14);
                if (player_5.int621 != -1)
                    staticIntArray18[i_1] = player_5.int621;
                else
                    staticIntArray18[i_1] = player_5.int639;

                staticIntArray20[i_1] = player_5.int620;
                Client.staticPlayerArray1[i_1] = null;
                if (packet_0.readBits(1) != 0)
                    staticMethod56(packet_0, i_1);

            }
        } else {
            int i_6;
            int i_7;
            int i_8;
            if (i_4 == 1) {
                i_6 = packet_0.readBits(3);
                i_7 = player_5.intArray103[0];
                i_8 = player_5.intArray104[0];
                if (i_6 == 0) {
                    --i_7;
                    --i_8;
                } else if (i_6 == 1)
                    --i_8;
                else if (i_6 == 2) {
                    ++i_7;
                    --i_8;
                } else if (i_6 == 3)
                    --i_7;
                else if (i_6 == 4)
                    ++i_7;
                else if (i_6 == 5) {
                    --i_7;
                    ++i_8;
                } else if (i_6 == 6)
                    ++i_8;
                else if (i_6 == 7) {
                    ++i_7;
                    ++i_8;
                }

                if (Client.staticInt293 == i_1 && (player_5.int626 < 1536 || player_5.int609 < 1536 || player_5.int626 >= 11776 || player_5.int609 >= 11776)) {
                    player_5.method698(i_7, i_8);
                    player_5.bool76 = false;
                } else if (bool_3) {
                    player_5.bool76 = true;
                    player_5.int689 = i_7;
                    player_5.int690 = i_8;
                } else {
                    player_5.bool76 = false;
                    player_5.method697(i_7, i_8, staticByteArray2[i_1]);
                }

            } else if (i_4 == 2) {
                i_6 = packet_0.readBits(4);
                i_7 = player_5.intArray103[0];
                i_8 = player_5.intArray104[0];
                if (i_6 == 0) {
                    i_7 -= 2;
                    i_8 -= 2;
                } else if (i_6 == 1) {
                    --i_7;
                    i_8 -= 2;
                } else if (i_6 == 2)
                    i_8 -= 2;
                else if (i_6 == 3) {
                    ++i_7;
                    i_8 -= 2;
                } else if (i_6 == 4) {
                    i_7 += 2;
                    i_8 -= 2;
                } else if (i_6 == 5) {
                    i_7 -= 2;
                    --i_8;
                } else if (i_6 == 6) {
                    i_7 += 2;
                    --i_8;
                } else if (i_6 == 7)
                    i_7 -= 2;
                else if (i_6 == 8)
                    i_7 += 2;
                else if (i_6 == 9) {
                    i_7 -= 2;
                    ++i_8;
                } else if (i_6 == 10) {
                    i_7 += 2;
                    ++i_8;
                } else if (i_6 == 11) {
                    i_7 -= 2;
                    i_8 += 2;
                } else if (i_6 == 12) {
                    --i_7;
                    i_8 += 2;
                } else if (i_6 == 13)
                    i_8 += 2;
                else if (i_6 == 14) {
                    ++i_7;
                    i_8 += 2;
                } else if (i_6 == 15) {
                    i_7 += 2;
                    i_8 += 2;
                }

                if (Client.staticInt293 != i_1 || player_5.int626 >= 1536 && player_5.int609 >= 1536 && player_5.int626 < 11776 && player_5.int609 < 11776) {
                    if (bool_3) {
                        player_5.bool76 = true;
                        player_5.int689 = i_7;
                        player_5.int690 = i_8;
                    } else {
                        player_5.bool76 = false;
                        player_5.method697(i_7, i_8, staticByteArray2[i_1]);
                    }
                } else {
                    player_5.method698(i_7, i_8);
                    player_5.bool76 = false;
                }

            } else {
                i_6 = packet_0.readBits(1);
                int i_9;
                int i_10;
                int i_11;
                int i_12;
                if (i_6 == 0) {
                    i_7 = packet_0.readBits(12);
                    i_8 = i_7 >> 10;
                    i_9 = i_7 >> 5 & 0x1f;
                    if (i_9 > 15)
                        i_9 -= 32;

                    i_10 = i_7 & 0x1f;
                    if (i_10 > 15)
                        i_10 -= 32;

                    i_11 = player_5.intArray103[0] + i_9;
                    i_12 = i_10 + player_5.intArray104[0];
                    if (i_1 != Client.staticInt293 || player_5.int626 >= 1536 && player_5.int609 >= 1536 && player_5.int626 < 11776 && player_5.int609 < 11776) {
                        if (bool_3) {
                            player_5.bool76 = true;
                            player_5.int689 = i_11;
                            player_5.int690 = i_12;
                        } else {
                            player_5.bool76 = false;
                            player_5.method697(i_11, i_12, staticByteArray2[i_1]);
                        }
                    } else {
                        player_5.method698(i_11, i_12);
                        player_5.bool76 = false;
                    }

                    player_5.int683 = 612649739 * (byte) (i_8 + player_5.int683 * 649046179 & 0x3);
                    if (i_1 == Client.staticInt293)
                        DataClass14.staticInt156 = player_5.int683 * 649046179;

                } else {
                    i_7 = packet_0.readBits(30);
                    i_8 = i_7 >> 28;
                    i_9 = i_7 >> 14 & 0x3fff;
                    i_10 = i_7 & 0x3fff;
                    i_11 = (i_9 + DataClass10.staticInt111 + player_5.intArray103[0] & 0x3fff) - DataClass10.staticInt111;
                    i_12 = (i_10 + Class4.staticInt53 + player_5.intArray104[0] & 0x3fff) - Class4.staticInt53;
                    if (i_1 == Client.staticInt293 && (player_5.int626 < 1536 || player_5.int609 < 1536 || player_5.int626 >= 11776 || player_5.int609 >= 11776)) {
                        player_5.method698(i_11, i_12);
                        player_5.bool76 = false;
                    } else if (bool_3) {
                        player_5.bool76 = true;
                        player_5.int689 = i_11;
                        player_5.int690 = i_12;
                    } else {
                        player_5.bool76 = false;
                        player_5.method697(i_11, i_12, staticByteArray2[i_1]);
                    }

                    player_5.int683 = 612649739 * (byte) (i_8 + player_5.int683 * 649046179 & 0x3);
                    if (Client.staticInt293 == i_1)
                        DataClass14.staticInt156 = player_5.int683 * 649046179;

                }
            }
        }
    }

    static boolean staticMethod56(Packet packet_0, int i_1) {
        int i_3 = packet_0.readBits(2);
        int i_4;
        int i_5;
        int i_8;
        int i_9;
        int i_10;
        int i_11;
        if (i_3 == 0) {
            if (packet_0.readBits(1) != 0)
                staticMethod56(packet_0, i_1);

            i_4 = packet_0.readBits(13);
            i_5 = packet_0.readBits(13);
            boolean bool_12 = packet_0.readBits(1) == 1;
            if (bool_12)
                staticIntArray23[staticInt51++] = i_1;

            if (Client.staticPlayerArray1[i_1] != null)
                throw new RuntimeException();
            else {
                Player player_13 = Client.staticPlayerArray1[i_1] = new Player();
                player_13.int681 = i_1;
                if (staticBufferArray1[i_1] != null)
                    player_13.method695(staticBufferArray1[i_1]);

                player_13.int639 = staticIntArray18[i_1];
                player_13.int620 = staticIntArray20[i_1];
                i_8 = staticIntArray22[i_1];
                i_9 = i_8 >> 28;
                i_10 = i_8 >> 14 & 0xff;
                i_11 = i_8 & 0xff;
                player_13.byteArray12[0] = staticByteArray2[i_1];
                player_13.int683 = 612649739 * (byte) i_9;
                player_13.method698((i_10 << 13) + i_4 - DataClass10.staticInt111, i_5 + (i_11 << 13) - Class4.staticInt53);
                player_13.bool76 = false;
                return true;
            }
        } else if (i_3 == 1) {
            i_4 = packet_0.readBits(2);
            i_5 = staticIntArray22[i_1];
            staticIntArray22[i_1] = ((i_4 + (i_5 >> 28) & 0x3) << 28) + (i_5 & 0xfffffff);
            return false;
        } else {
            int i_6;
            int i_7;
            if (i_3 == 2) {
                i_4 = packet_0.readBits(5);
                i_5 = i_4 >> 3;
                i_6 = i_4 & 0x7;
                i_7 = staticIntArray22[i_1];
                i_8 = (i_7 >> 28) + i_5 & 0x3;
                i_9 = i_7 >> 14 & 0xff;
                i_10 = i_7 & 0xff;
                if (i_6 == 0) {
                    --i_9;
                    --i_10;
                }

                if (i_6 == 1)
                    --i_10;

                if (i_6 == 2) {
                    ++i_9;
                    --i_10;
                }

                if (i_6 == 3)
                    --i_9;

                if (i_6 == 4)
                    ++i_9;

                if (i_6 == 5) {
                    --i_9;
                    ++i_10;
                }

                if (i_6 == 6)
                    ++i_10;

                if (i_6 == 7) {
                    ++i_9;
                    ++i_10;
                }

                staticIntArray22[i_1] = i_10 + (i_8 << 28) + (i_9 << 14);
                return false;
            } else {
                i_4 = packet_0.readBits(18);
                i_5 = i_4 >> 16;
                i_6 = i_4 >> 8 & 0xff;
                i_7 = i_4 & 0xff;
                i_8 = staticIntArray22[i_1];
                i_9 = i_5 + (i_8 >> 28) & 0x3;
                i_10 = (i_8 >> 14) + i_6 & 0xff;
                i_11 = i_8 + i_7 & 0xff;
                staticIntArray22[i_1] = i_11 + (i_9 << 28) + (i_10 << 14);
                return false;
            }
        }
    }

    // TODO player update masks
    static final void staticMethod57(Packet packet_0) {
        for (int i_2 = 0; i_2 < staticInt51; i_2++) {
            int i_3 = staticIntArray23[i_2];
            Player player_4 = Client.staticPlayerArray1[i_3];
            int i_5 = packet_0.method439();
            if ((i_5 & 0x4) != 0)
                i_5 += packet_0.method439() << 8;

            byte b_6 = -1;
            if ((i_5 & 0x80) != 0) {
                player_4.int620 = packet_0.readUShortLE();
                if (player_4.int620 == 65535)
                    player_4.int620 = -1;
            }

            int i_7;
            if ((i_5 & 0x800) != 0) {
                player_4.int640 = packet_0.method478();
                i_7 = packet_0.method486();
                player_4.int613 = i_7 >> 16;
                player_4.int630 = (i_7 & 0xffff) + Client.staticInt166;
                player_4.int631 = 0;
                player_4.int629 = 0;
                if (player_4.int630 > Client.staticInt166)
                    player_4.int631 = -1;

                if (player_4.int640 == 65535)
                    player_4.int640 = -1;
            }

            if ((i_5 & 0x2) != 0) {
                i_7 = packet_0.method467();
                byte[] bytes_8 = new byte[i_7];
                Buffer buffer_9 = new Buffer(bytes_8);
                packet_0.method489(bytes_8, 0, i_7);
                staticBufferArray1[i_3] = buffer_9;
                player_4.method695(buffer_9);
            }

            if ((i_5 & 0x1000) != 0)
                b_6 = packet_0.method440();

            if ((i_5 & 0x400) != 0)
                staticByteArray2[i_3] = packet_0.method472();

            if ((i_5 & 0x100) != 0)
                for (i_7 = 0; i_7 < 3; i_7++)
                    player_4.op[i_7] = packet_0.method448();

            if ((i_5 & 0x200) != 0) {
                player_4.int622 = packet_0.method471();
                player_4.int619 = packet_0.method471();
                player_4.int632 = packet_0.method470();
                player_4.int614 = packet_0.method470();
                player_4.int636 = packet_0.method478() + Client.staticInt166;
                player_4.int635 = packet_0.readUShortLE() + Client.staticInt166;
                player_4.int641 = packet_0.method478();
                if (player_4.bool76) {
                    player_4.int622 += player_4.int689;
                    player_4.int619 += player_4.int690;
                    player_4.int632 += player_4.int689;
                    player_4.int614 += player_4.int690;
                    player_4.int611 = 0;
                } else {
                    player_4.int622 += player_4.intArray103[0];
                    player_4.int619 += player_4.intArray104[0];
                    player_4.int632 += player_4.intArray103[0];
                    player_4.int614 += player_4.intArray104[0];
                    player_4.int611 = 1;
                }

                player_4.int625 = 0;
            }

            int i_10;
            int i_11;
            int i_14;
            int i_18;
            if ((i_5 & 0x20) != 0) {
                i_7 = packet_0.method469();
                int i_12;
                int i_13;
                int i_19;
                if (i_7 > 0)
                    for (i_18 = 0; i_18 < i_7; i_18++) {
                        i_10 = -1;
                        i_11 = -1;
                        i_12 = -1;
                        i_19 = packet_0.method453();
                        if (i_19 == 32767) {
                            i_19 = packet_0.method453();
                            i_11 = packet_0.method453();
                            i_10 = packet_0.method453();
                            i_12 = packet_0.method453();
                        } else if (i_19 != 32766)
                            i_11 = packet_0.method453();
                        else
                            i_19 = -1;

                        i_13 = packet_0.method453();
                        player_4.method610(i_19, i_11, i_10, i_12, Client.staticInt166, i_13);
                    }

                i_18 = packet_0.method439();
                if (i_18 > 0)
                    for (i_19 = 0; i_19 < i_18; i_19++) {
                        i_10 = packet_0.method453();
                        i_11 = packet_0.method453();
                        if (i_11 != 32767) {
                            i_12 = packet_0.method453();
                            i_13 = packet_0.method469();
                            i_14 = i_11 > 0 ? packet_0.method469() : i_13;
                            player_4.method611(i_10, Client.staticInt166, i_11, i_12, i_13, i_14);
                        } else
                            player_4.method612(i_10);
                    }
            }

            if ((i_5 & 0x8) != 0) {
                i_7 = packet_0.readUShortA();
                if (i_7 == 65535)
                    i_7 = -1;

                i_18 = packet_0.method439();
                Client.staticMethod275(player_4, i_7, i_18);
            }

            if ((i_5 & 0x10) != 0) {
                i_7 = packet_0.readUShortLE();
                Class6 class6_20 = (Class6) StaticClass26.staticMethod155(Class6.staticMethod175(), packet_0.method439());
                boolean bool_22 = packet_0.method467() == 1;
                i_10 = packet_0.method468();
                i_11 = packet_0.off;
                if (player_4.name != null && player_4.playerDef1 != null) {
                    boolean bool_23 = false;
                    if (class6_20.bool17 && Client.staticMethod356(player_4.name))
                        bool_23 = true;

                    if (!bool_23 && Client.staticInt291 == 0 && !player_4.bool78) {
                        staticBuffer2.off = 0;
                        packet_0.method488(staticBuffer2.buf, 0, i_10);
                        staticBuffer2.off = 0;
                        String string_24 = TypeFace.staticMethod495(StaticClass51.staticMethod215(StaticClass50.staticMethod207(staticBuffer2)));
                        player_4.string43 = string_24.trim();
                        player_4.int616 = i_7 >> 8;
                        player_4.int617 = i_7 & 0xff;
                        player_4.int615 = 150;
                        player_4.bool70 = bool_22;
                        player_4.bool71 = BufferWrapper.staticPlayer1 != player_4 && class6_20.bool17 && Client.staticString317 != "" && string_24.toLowerCase().indexOf(Client.staticString317) == -1;
                        if (class6_20.bool16)
                            i_14 = bool_22 ? 91 : 1;
                        else
                            i_14 = bool_22 ? 90 : 2;

                        if (class6_20.int259 != -1) {
                            int i_17 = class6_20.int259;
                            String string_16 = "<img=" + i_17 + ">";
                            StaticClass12.staticMethod59(i_14, string_16 + player_4.name, string_24);
                        } else
                            StaticClass12.staticMethod59(i_14, player_4.name, string_24);
                    }
                }

                packet_0.off = i_11 + i_10;
            }

            if ((i_5 & 0x40) != 0) {
                player_4.int621 = packet_0.method478();
                if (player_4.int611 == 0) {
                    player_4.int639 = player_4.int621;
                    player_4.int621 = -1;
                }
            }

            if ((i_5 & 0x1) != 0) {
                player_4.string43 = packet_0.method448();
                if (player_4.string43.charAt(0) == 126) {
                    player_4.string43 = player_4.string43.substring(1);
                    StaticClass12.staticMethod59(2, player_4.name, player_4.string43);
                } else if (BufferWrapper.staticPlayer1 == player_4)
                    StaticClass12.staticMethod59(2, player_4.name, player_4.string43);

                player_4.bool70 = false;
                player_4.int616 = 0;
                player_4.int617 = 0;
                player_4.int615 = 150;
            }

            if (player_4.bool76)
                if (b_6 == 127)
                    player_4.method698(player_4.int689, player_4.int690);
                else {
                    byte b_21;
                    if (b_6 != -1)
                        b_21 = b_6;
                    else
                        b_21 = staticByteArray2[i_3];

                    player_4.method697(player_4.int689, player_4.int690, b_21);
                }
        }

    }

}
