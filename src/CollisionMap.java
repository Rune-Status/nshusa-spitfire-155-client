public class CollisionMap {

    int int233 = 0;
    int int234 = 0;
    int int235;
    int int236;
    public int[][] intArrayArray10;

    public CollisionMap(int i_1, int i_2) {
        int235 = i_1;
        int236 = i_2;
        intArrayArray10 = new int[int235][int236];
        method234();
    }

    public void method234() {
        for (int i_2 = 0; i_2 < int235; i_2++)
            for (int i_3 = 0; i_3 < int236; i_3++)
                if (i_2 != 0 && i_3 != 0 && i_2 < int235 - 5 && i_3 < int236 - 5)
                    intArrayArray10[i_2][i_3] = 16777216;
                else
                    intArrayArray10[i_2][i_3] = 16777215;

    }

    public void method235(int i_1, int i_2, int i_3, int i_4, boolean bool_5) {
        i_1 -= int233;
        i_2 -= int234;
        if (i_3 == 0) {
            if (i_4 == 0) {
                method239(i_1, i_2, 128);
                method239(i_1 - 1, i_2, 8);
            }

            if (i_4 == 1) {
                method239(i_1, i_2, 2);
                method239(i_1, i_2 + 1, 32);
            }

            if (i_4 == 2) {
                method239(i_1, i_2, 8);
                method239(i_1 + 1, i_2, 128);
            }

            if (i_4 == 3) {
                method239(i_1, i_2, 32);
                method239(i_1, i_2 - 1, 2);
            }
        }

        if (i_3 == 1 || i_3 == 3) {
            if (i_4 == 0) {
                method239(i_1, i_2, 1);
                method239(i_1 - 1, i_2 + 1, 16);
            }

            if (i_4 == 1) {
                method239(i_1, i_2, 4);
                method239(i_1 + 1, i_2 + 1, 64);
            }

            if (i_4 == 2) {
                method239(i_1, i_2, 16);
                method239(i_1 + 1, i_2 - 1, 1);
            }

            if (i_4 == 3) {
                method239(i_1, i_2, 64);
                method239(i_1 - 1, i_2 - 1, 4);
            }
        }

        if (i_3 == 2) {
            if (i_4 == 0) {
                method239(i_1, i_2, 130);
                method239(i_1 - 1, i_2, 8);
                method239(i_1, i_2 + 1, 32);
            }

            if (i_4 == 1) {
                method239(i_1, i_2, 10);
                method239(i_1, i_2 + 1, 32);
                method239(i_1 + 1, i_2, 128);
            }

            if (i_4 == 2) {
                method239(i_1, i_2, 40);
                method239(i_1 + 1, i_2, 128);
                method239(i_1, i_2 - 1, 2);
            }

            if (i_4 == 3) {
                method239(i_1, i_2, 160);
                method239(i_1, i_2 - 1, 2);
                method239(i_1 - 1, i_2, 8);
            }
        }

        if (bool_5) {
            if (i_3 == 0) {
                if (i_4 == 0) {
                    method239(i_1, i_2, 65536);
                    method239(i_1 - 1, i_2, 4096);
                }

                if (i_4 == 1) {
                    method239(i_1, i_2, 1024);
                    method239(i_1, i_2 + 1, 16384);
                }

                if (i_4 == 2) {
                    method239(i_1, i_2, 4096);
                    method239(i_1 + 1, i_2, 65536);
                }

                if (i_4 == 3) {
                    method239(i_1, i_2, 16384);
                    method239(i_1, i_2 - 1, 1024);
                }
            }

            if (i_3 == 1 || i_3 == 3) {
                if (i_4 == 0) {
                    method239(i_1, i_2, 512);
                    method239(i_1 - 1, i_2 + 1, 8192);
                }

                if (i_4 == 1) {
                    method239(i_1, i_2, 2048);
                    method239(i_1 + 1, i_2 + 1, 32768);
                }

                if (i_4 == 2) {
                    method239(i_1, i_2, 8192);
                    method239(i_1 + 1, i_2 - 1, 512);
                }

                if (i_4 == 3) {
                    method239(i_1, i_2, 32768);
                    method239(i_1 - 1, i_2 - 1, 2048);
                }
            }

            if (i_3 == 2) {
                if (i_4 == 0) {
                    method239(i_1, i_2, 66560);
                    method239(i_1 - 1, i_2, 4096);
                    method239(i_1, i_2 + 1, 16384);
                }

                if (i_4 == 1) {
                    method239(i_1, i_2, 5120);
                    method239(i_1, i_2 + 1, 16384);
                    method239(i_1 + 1, i_2, 65536);
                }

                if (i_4 == 2) {
                    method239(i_1, i_2, 20480);
                    method239(i_1 + 1, i_2, 65536);
                    method239(i_1, i_2 - 1, 1024);
                }

                if (i_4 == 3) {
                    method239(i_1, i_2, 81920);
                    method239(i_1, i_2 - 1, 1024);
                    method239(i_1 - 1, i_2, 4096);
                }
            }
        }

    }

    public void method236(int i_1, int i_2, int i_3, int i_4, boolean bool_5) {
        int i_7 = 256;
        if (bool_5)
            i_7 += 131072;

        i_1 -= int233;
        i_2 -= int234;

        for (int i_8 = i_1; i_8 < i_1 + i_3; i_8++)
            if (i_8 >= 0 && i_8 < int235)
                for (int i_9 = i_2; i_9 < i_4 + i_2; i_9++)
                    if (i_9 >= 0 && i_9 < int236)
                        method239(i_8, i_9, i_7);

    }

    public void method237(int i_1, int i_2) {
        i_1 -= int233;
        i_2 -= int234;
        intArrayArray10[i_1][i_2] |= 0x200000;
    }

    public void method238(int i_1, int i_2) {
        i_1 -= int233;
        i_2 -= int234;
        intArrayArray10[i_1][i_2] |= 0x40000;
    }

    void method239(int i_1, int i_2, int i_3) {
        intArrayArray10[i_1][i_2] |= i_3;
    }

    public void method240(int i_1, int i_2, int i_3, int i_4, boolean bool_5) {
        i_1 -= int233;
        i_2 -= int234;
        if (i_3 == 0) {
            if (i_4 == 0) {
                method242(i_1, i_2, 128);
                method242(i_1 - 1, i_2, 8);
            }

            if (i_4 == 1) {
                method242(i_1, i_2, 2);
                method242(i_1, i_2 + 1, 32);
            }

            if (i_4 == 2) {
                method242(i_1, i_2, 8);
                method242(i_1 + 1, i_2, 128);
            }

            if (i_4 == 3) {
                method242(i_1, i_2, 32);
                method242(i_1, i_2 - 1, 2);
            }
        }

        if (i_3 == 1 || i_3 == 3) {
            if (i_4 == 0) {
                method242(i_1, i_2, 1);
                method242(i_1 - 1, i_2 + 1, 16);
            }

            if (i_4 == 1) {
                method242(i_1, i_2, 4);
                method242(i_1 + 1, i_2 + 1, 64);
            }

            if (i_4 == 2) {
                method242(i_1, i_2, 16);
                method242(i_1 + 1, i_2 - 1, 1);
            }

            if (i_4 == 3) {
                method242(i_1, i_2, 64);
                method242(i_1 - 1, i_2 - 1, 4);
            }
        }

        if (i_3 == 2) {
            if (i_4 == 0) {
                method242(i_1, i_2, 130);
                method242(i_1 - 1, i_2, 8);
                method242(i_1, i_2 + 1, 32);
            }

            if (i_4 == 1) {
                method242(i_1, i_2, 10);
                method242(i_1, i_2 + 1, 32);
                method242(i_1 + 1, i_2, 128);
            }

            if (i_4 == 2) {
                method242(i_1, i_2, 40);
                method242(i_1 + 1, i_2, 128);
                method242(i_1, i_2 - 1, 2);
            }

            if (i_4 == 3) {
                method242(i_1, i_2, 160);
                method242(i_1, i_2 - 1, 2);
                method242(i_1 - 1, i_2, 8);
            }
        }

        if (bool_5) {
            if (i_3 == 0) {
                if (i_4 == 0) {
                    method242(i_1, i_2, 65536);
                    method242(i_1 - 1, i_2, 4096);
                }

                if (i_4 == 1) {
                    method242(i_1, i_2, 1024);
                    method242(i_1, i_2 + 1, 16384);
                }

                if (i_4 == 2) {
                    method242(i_1, i_2, 4096);
                    method242(i_1 + 1, i_2, 65536);
                }

                if (i_4 == 3) {
                    method242(i_1, i_2, 16384);
                    method242(i_1, i_2 - 1, 1024);
                }
            }

            if (i_3 == 1 || i_3 == 3) {
                if (i_4 == 0) {
                    method242(i_1, i_2, 512);
                    method242(i_1 - 1, i_2 + 1, 8192);
                }

                if (i_4 == 1) {
                    method242(i_1, i_2, 2048);
                    method242(i_1 + 1, i_2 + 1, 32768);
                }

                if (i_4 == 2) {
                    method242(i_1, i_2, 8192);
                    method242(i_1 + 1, i_2 - 1, 512);
                }

                if (i_4 == 3) {
                    method242(i_1, i_2, 32768);
                    method242(i_1 - 1, i_2 - 1, 2048);
                }
            }

            if (i_3 == 2) {
                if (i_4 == 0) {
                    method242(i_1, i_2, 66560);
                    method242(i_1 - 1, i_2, 4096);
                    method242(i_1, i_2 + 1, 16384);
                }

                if (i_4 == 1) {
                    method242(i_1, i_2, 5120);
                    method242(i_1, i_2 + 1, 16384);
                    method242(i_1 + 1, i_2, 65536);
                }

                if (i_4 == 2) {
                    method242(i_1, i_2, 20480);
                    method242(i_1 + 1, i_2, 65536);
                    method242(i_1, i_2 - 1, 1024);
                }

                if (i_4 == 3) {
                    method242(i_1, i_2, 81920);
                    method242(i_1, i_2 - 1, 1024);
                    method242(i_1 - 1, i_2, 4096);
                }
            }
        }

    }

    public void method241(int i_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
        int i_8 = 256;
        if (bool_6)
            i_8 += 131072;

        i_1 -= int233;
        i_2 -= int234;
        int i_9;
        if (i_5 == 1 || i_5 == 3) {
            i_9 = i_3;
            i_3 = i_4;
            i_4 = i_9;
        }

        for (i_9 = i_1; i_9 < i_3 + i_1; i_9++)
            if (i_9 >= 0 && i_9 < int235)
                for (int i_10 = i_2; i_10 < i_4 + i_2; i_10++)
                    if (i_10 >= 0 && i_10 < int236)
                        method242(i_9, i_10, i_8);

    }

    void method242(int i_1, int i_2, int i_3) {
        intArrayArray10[i_1][i_2] &= ~i_3;
    }

    public void method243(int i_1, int i_2) {
        i_1 -= int233;
        i_2 -= int234;
        intArrayArray10[i_1][i_2] &= ~0x40000;
    }

}
