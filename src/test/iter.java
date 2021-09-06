package test;

import javax.crypto.*;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

class iter{

    private static String instan;
    public static void main(String[] args) {
//        long start = System.currentTimeMillis();
//        LoginActivity loginActivity = new LoginActivity();
//        System.out.println("load offset=" + (System.currentTimeMillis() - start) + "ms");
//        loginActivity.crack();
        instan = new String(new byte[]{80, 66, 69, 87, 73, 84, 72, 77, 68, 53, 97, 110, 100, 68, 69, 83});
        Key v1 = get_key("Google");
        PBEParameterSpec ivv = new PBEParameterSpec("AndroidN".getBytes(), 50);
        Cipher cipher = null;
        try {
            cipher = Cipher.getInstance(instan);
            cipher.init(Cipher.DECRYPT_MODE, v1, ivv);

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        }

        byte[] flag = new byte[]{0xc, (byte) 0xdb, 0x30, 0x8, (byte) 0xbc, (byte) 0xf4, (byte) 0x88, 0x50, (byte) 0xa8, (byte) 0xa0, 0x78, 0x77,
                0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0};
        for (int a=0; a<0xff;a++) {
            for (int b=0; b<0xff;b++) {
                for (int c=0; c<0xff;c++) {
                    for (int d=0; d<0xff;d++) {
                        for (int e=0; e<0xff;e++) {
                            for (int f=0; f<0xff;f++) {
                                for (int g=0; g<0xff;g++) {
                                    for (int h=0; h<0xff;h++) {
                                        for (int i=0; i<0xff;i++) {
                                            for (int j=0; j<0xff;j++) {
                                                for (int k=0; k<0xff;k++) {
                                                    for (int l=1; l<0xff;l++) {
                                                        flag[12] = (byte)a;
                                                        flag[13] = (byte)b;
                                                        flag[14] = (byte)c;
                                                        flag[15] = (byte)d;
                                                        flag[16] = (byte)e;
                                                        flag[17] = (byte)f;
                                                        flag[18] = (byte)g;
                                                        flag[19] = (byte)h;
                                                        flag[20] = (byte)i;
                                                        flag[21] = (byte)j;
                                                        flag[22] = (byte)k;
                                                        flag[23] = (byte)l;
//                                                        flag[23] = (byte)a;
//                                                        flag[22] = (byte)b;
//                                                        flag[21] = (byte)c;
//                                                        flag[20] = (byte)d;
//                                                        flag[19] = (byte)e;
//                                                        flag[18] = (byte)f;
//                                                        flag[17] = (byte)g;
//                                                        flag[16] = (byte)h;
//                                                        flag[15] = (byte)i;
//                                                        flag[14] = (byte)j;
//                                                        flag[13] = (byte)k;
//                                                        flag[12] = (byte)l;
                                                        byte[] dec = null;
                                                        try {
                                                            boolean printable = true;
                                                            String flagg = new String(cipher.doFinal(flag));
                                                            if (flagg.startsWith("flag{") && flagg.endsWith("}")) {
                                                                System.out.println("Found! " + flagg);
                                                            }
                                                        } catch (BadPaddingException | IllegalBlockSizeException ignored) {
//                                                            System.out.println(Arrays.toString(flag));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("We are still running!");
        }
        System.out.println("OK!");
    }

    private static Key get_key(String arg4) {
        if(arg4 == null || arg4.length() == 0) {
            return null;
        }

        try {
            PBEKeySpec v1_1 = new PBEKeySpec(arg4.toCharArray());
            return SecretKeyFactory.getInstance(instan).generateSecret(v1_1);
        }
        catch(Exception v1) {
            return null;
        }
    }
}
