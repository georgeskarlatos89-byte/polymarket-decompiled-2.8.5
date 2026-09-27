package defpackage;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.spec.InvalidParameterSpecException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class q35 {
    public static final Set a;
    public static final Map b;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        fe7 fe7Var = fe7.d;
        linkedHashSet.add(fe7Var);
        fe7 fe7Var2 = fe7.e;
        linkedHashSet.add(fe7Var2);
        fe7 fe7Var3 = fe7.f;
        linkedHashSet.add(fe7Var3);
        fe7 fe7Var4 = fe7.i;
        linkedHashSet.add(fe7Var4);
        fe7 fe7Var5 = fe7.j;
        linkedHashSet.add(fe7Var5);
        fe7 fe7Var6 = fe7.k;
        linkedHashSet.add(fe7Var6);
        fe7 fe7Var7 = fe7.g;
        linkedHashSet.add(fe7Var7);
        fe7 fe7Var8 = fe7.h;
        linkedHashSet.add(fe7Var8);
        fe7 fe7Var9 = fe7.l;
        linkedHashSet.add(fe7Var9);
        a = Collections.unmodifiableSet(linkedHashSet);
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        hashSet.add(fe7Var4);
        hashSet2.add(fe7Var5);
        hashSet3.add(fe7Var6);
        hashSet3.add(fe7Var);
        hashSet3.add(fe7Var7);
        hashSet3.add(fe7Var9);
        hashSet4.add(fe7Var2);
        hashSet5.add(fe7Var3);
        hashSet5.add(fe7Var8);
        hashMap.put(128, Collections.unmodifiableSet(hashSet));
        hashMap.put(192, Collections.unmodifiableSet(hashSet2));
        hashMap.put(256, Collections.unmodifiableSet(hashSet3));
        hashMap.put(384, Collections.unmodifiableSet(hashSet4));
        hashMap.put(Integer.valueOf(Barcode.FORMAT_UPC_A), Collections.unmodifiableSet(hashSet5));
        b = Collections.unmodifiableMap(hashMap);
    }

    public static void a(SecretKey secretKey, fe7 fe7Var) {
        int i;
        int i2 = fe7Var.c;
        try {
            if (secretKey.getEncoded() == null) {
                i = 0;
            } else {
                long length = r5.length * 8;
                i = (int) length;
                if (i != length) {
                    throw new Exception("Integer overflow");
                }
            }
            if (i == 0 || i2 == i) {
                return;
            }
            throw new Exception("The Content Encryption Key (CEK) length for " + fe7Var + " must be " + i2 + " bits");
        } catch (t1a e) {
            throw new Exception("The Content Encryption Key (CEK) is too long: " + e.getMessage());
        }
    }

    public static byte[] b(caa caaVar, byte[] bArr, h81 h81Var, h81 h81Var2, h81 h81Var3, SecretKey secretKey, daa daaVar) {
        SecretKeySpec secretKeySpec;
        SecretKeySpec secretKeySpec2;
        byte[] doFinal;
        SecretKey hoaVar;
        Cipher cipher;
        byte[] bArr2;
        byte[] bArr3;
        if (bArr == null) {
            return b(caaVar, caaVar.a().a.getBytes(StandardCharsets.US_ASCII), h81Var, h81Var2, h81Var3, secretKey, daaVar);
        }
        fe7 fe7Var = caaVar.o;
        a(secretKey, fe7Var);
        if (!fe7Var.equals(fe7.d) && !fe7Var.equals(fe7.e) && !fe7Var.equals(fe7.f)) {
            if (!fe7Var.equals(fe7.i) && !fe7Var.equals(fe7.j) && !fe7Var.equals(fe7.k)) {
                if (!fe7Var.equals(fe7.g) && !fe7Var.equals(fe7.h)) {
                    if (fe7Var.equals(fe7.l)) {
                        byte[] a2 = h81Var.a();
                        byte[] a3 = h81Var2.a();
                        byte[] a4 = h81Var3.a();
                        try {
                            dz9 dz9Var = new dz9(1, secretKey.getEncoded());
                            byte[] a5 = oin.a(a2, a3, a4);
                            try {
                                if (a5.length >= 40) {
                                    doFinal = dz9Var.a(ByteBuffer.wrap(a5, 24, a5.length - 24), Arrays.copyOf(a5, 24), bArr);
                                } else {
                                    throw new GeneralSecurityException("ciphertext too short");
                                }
                            } catch (GeneralSecurityException e) {
                                throw new Exception("XChaCha20Poly1305 decryption failed: " + e.getMessage(), e);
                            }
                        } catch (GeneralSecurityException e2) {
                            throw new Exception("Invalid XChaCha20Poly1305 key: " + e2.getMessage(), e2);
                        }
                    } else {
                        throw new Exception(j9n.d(fe7Var, a));
                    }
                } else {
                    Map map = caaVar.e;
                    if (map.get("epu") instanceof String) {
                        bArr2 = new d81((String) map.get("epu")).a();
                    } else {
                        bArr2 = null;
                    }
                    if (map.get("epv") instanceof String) {
                        bArr3 = new d81((String) map.get("epv")).a();
                    } else {
                        bArr3 = null;
                    }
                    y6m.e(secretKey, fe7Var, bArr2, bArr3);
                    StringBuilder sb = new StringBuilder();
                    sb.append(caaVar.a().a);
                    sb.append(".");
                    throw null;
                }
            } else {
                byte[] a6 = h81Var.a();
                byte[] a7 = h81Var2.a();
                byte[] a8 = h81Var3.a();
                Provider provider = (Provider) daaVar.a;
                if (secretKey.getAlgorithm().equals("AES")) {
                    hoaVar = secretKey;
                } else {
                    hoaVar = new hoa(secretKey);
                }
                try {
                    if (provider != null) {
                        cipher = Cipher.getInstance("AES/GCM/NoPadding", provider);
                    } else {
                        cipher = Cipher.getInstance("AES/GCM/NoPadding");
                    }
                    cipher.init(2, hoaVar, new GCMParameterSpec(128, a6));
                    cipher.updateAAD(bArr);
                    try {
                        doFinal = cipher.doFinal(oin.a(a7, a8));
                    } catch (BadPaddingException | IllegalBlockSizeException e3) {
                        throw new Exception("AES/GCM/NoPadding decryption failed: " + e3.getMessage(), e3);
                    }
                } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e4) {
                    throw new Exception("Couldn't create AES/GCM/NoPadding cipher: " + e4.getMessage(), e4);
                }
            }
        } else {
            byte[] a9 = h81Var.a();
            byte[] a10 = h81Var2.a();
            byte[] a11 = h81Var3.a();
            Provider provider2 = (Provider) daaVar.a;
            byte[] encoded = secretKey.getEncoded();
            int i = 32;
            if (encoded.length == 32) {
                i = 16;
                secretKeySpec = new SecretKeySpec(encoded, 0, 16, "HMACSHA256");
                secretKeySpec2 = new SecretKeySpec(encoded, 16, 16, "AES");
            } else if (encoded.length == 48) {
                i = 24;
                secretKeySpec = new SecretKeySpec(encoded, 0, 24, "HMACSHA384");
                secretKeySpec2 = new SecretKeySpec(encoded, 24, 24, "AES");
            } else if (encoded.length == 64) {
                secretKeySpec = new SecretKeySpec(encoded, 0, 32, "HMACSHA512");
                secretKeySpec2 = new SecretKeySpec(encoded, 32, 32, "AES");
            } else {
                throw new Exception("Unsupported AES/CBC/PKCS5Padding/HMAC-SHA2 key length, must be 256, 384 or 512 bits");
            }
            long length = bArr.length * 8;
            long j = (int) length;
            if (j == length) {
                byte[] array = ByteBuffer.allocate(8).putLong(j).array();
                if (brn.a(Arrays.copyOf(ftl.a(secretKeySpec.getAlgorithm(), secretKeySpec, ByteBuffer.allocate(bArr.length + a9.length + a10.length + array.length).put(bArr).put(a9).put(a10).put(array).array(), provider2), i), a11)) {
                    try {
                        doFinal = s6n.a(secretKeySpec2, false, a9, provider2).doFinal(a10);
                    } catch (Exception e5) {
                        throw new Exception(e5.getMessage(), e5);
                    }
                } else {
                    throw new Exception("MAC check failed");
                }
            } else {
                throw new Exception("Integer overflow");
            }
        }
        cs4 cs4Var = caaVar.q;
        if (cs4Var == null) {
            return doFinal;
        }
        if (cs4Var.equals(cs4.b)) {
            try {
                return kvn.a(doFinal);
            } catch (Exception e6) {
                throw new Exception(k84.e(e6, new StringBuilder("Couldn't decompress plain text: ")), e6);
            }
        }
        f05.i(cs4Var, "Unsupported compression algorithm: ");
        return null;
    }

    public static u6b c(caa caaVar, byte[] bArr, byte[] bArr2, SecretKey secretKey, h81 h81Var, daa daaVar) {
        Deflater deflater;
        DeflaterOutputStream deflaterOutputStream;
        byte[] byteArray;
        h81 h81Var2;
        SecretKeySpec secretKeySpec;
        SecretKeySpec secretKeySpec2;
        ry9 ry9Var;
        byte[] bArr3;
        Cipher cipher;
        int i;
        long j;
        byte[] bArr4;
        if (bArr2 == null) {
            return c(caaVar, bArr, caaVar.a().a.getBytes(StandardCharsets.US_ASCII), secretKey, h81Var, daaVar);
        }
        SecretKey secretKey2 = secretKey;
        fe7 fe7Var = caaVar.o;
        a(secretKey2, fe7Var);
        cs4 cs4Var = caaVar.q;
        DeflaterOutputStream deflaterOutputStream2 = null;
        byte[] bArr5 = null;
        deflaterOutputStream2 = null;
        if (cs4Var == null) {
            byteArray = bArr;
        } else if (cs4Var.equals(cs4.b)) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    deflater = new Deflater(8, true);
                    try {
                        deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    deflater = null;
                }
                try {
                    deflaterOutputStream.write(bArr);
                    deflaterOutputStream.close();
                    deflater.end();
                    byteArray = byteArrayOutputStream.toByteArray();
                } catch (Throwable th3) {
                    th = th3;
                    deflaterOutputStream2 = deflaterOutputStream;
                    if (deflaterOutputStream2 != null) {
                        deflaterOutputStream2.close();
                    }
                    if (deflater != null) {
                        deflater.end();
                    }
                    throw th;
                }
            } catch (Exception e) {
                throw new Exception(k84.e(e, new StringBuilder("Couldn't compress plain text: ")), e);
            }
        } else {
            f05.i(cs4Var, "Unsupported compression algorithm: ");
            return null;
        }
        int i2 = 24;
        int i3 = 0;
        if (fe7Var.equals(fe7.d) || fe7Var.equals(fe7.e) || fe7Var.equals(fe7.f)) {
            h81Var2 = h81Var;
            byte[] bArr6 = new byte[16];
            new SecureRandom().nextBytes(bArr6);
            Provider provider = (Provider) daaVar.a;
            byte[] encoded = secretKey2.getEncoded();
            if (encoded.length == 32) {
                secretKeySpec = new SecretKeySpec(encoded, 0, 16, "HMACSHA256");
                secretKeySpec2 = new SecretKeySpec(encoded, 16, 16, "AES");
                i2 = 16;
            } else if (encoded.length == 48) {
                secretKeySpec = new SecretKeySpec(encoded, 0, 24, "HMACSHA384");
                secretKeySpec2 = new SecretKeySpec(encoded, 24, 24, "AES");
            } else if (encoded.length == 64) {
                secretKeySpec = new SecretKeySpec(encoded, 0, 32, "HMACSHA512");
                i2 = 32;
                secretKeySpec2 = new SecretKeySpec(encoded, 32, 32, "AES");
            } else {
                throw new Exception("Unsupported AES/CBC/PKCS5Padding/HMAC-SHA2 key length, must be 256, 384 or 512 bits");
            }
            try {
                byte[] doFinal = s6n.a(secretKeySpec2, true, bArr6, provider).doFinal(byteArray);
                long length = bArr2.length * 8;
                long j2 = (int) length;
                if (j2 == length) {
                    byte[] array = ByteBuffer.allocate(8).putLong(j2).array();
                    ry9Var = new ry9(doFinal, Arrays.copyOf(ftl.a(secretKeySpec.getAlgorithm(), secretKeySpec, ByteBuffer.allocate(bArr2.length + 16 + doFinal.length + array.length).put(bArr2).put(bArr6).put(doFinal).put(array).array(), provider), i2));
                    bArr3 = bArr6;
                } else {
                    throw new Exception("Integer overflow");
                }
            } catch (Exception e2) {
                throw new Exception(e2.getMessage(), e2);
            }
        } else if (fe7Var.equals(fe7.i) || fe7Var.equals(fe7.j) || fe7Var.equals(fe7.k)) {
            h81Var2 = h81Var;
            byte[] bArr7 = new byte[12];
            new SecureRandom().nextBytes(bArr7);
            Provider provider2 = (Provider) daaVar.a;
            if (!secretKey2.getAlgorithm().equals("AES")) {
                secretKey2 = new hoa(secretKey2);
            }
            try {
                if (provider2 != null) {
                    cipher = Cipher.getInstance("AES/GCM/NoPadding", provider2);
                } else {
                    cipher = Cipher.getInstance("AES/GCM/NoPadding");
                }
                cipher.init(1, secretKey2, new GCMParameterSpec(128, bArr7));
                cipher.updateAAD(bArr2);
                try {
                    byte[] doFinal2 = cipher.doFinal(byteArray);
                    int length2 = doFinal2.length - 16;
                    byte[] e3 = oin.e(doFinal2, 0, length2);
                    byte[] e4 = oin.e(doFinal2, length2, 16);
                    AlgorithmParameters parameters = cipher.getParameters();
                    if (parameters != null) {
                        try {
                            GCMParameterSpec gCMParameterSpec = (GCMParameterSpec) parameters.getParameterSpec(GCMParameterSpec.class);
                            byte[] iv = gCMParameterSpec.getIV();
                            int tLen = gCMParameterSpec.getTLen();
                            if (iv == null) {
                                j = 8;
                                i = 0;
                            } else {
                                long length3 = iv.length * 8;
                                i = (int) length3;
                                j = 8;
                                if (i != length3) {
                                    throw new Exception("Integer overflow");
                                }
                            }
                            if (i == 96) {
                                if (tLen == 128) {
                                    ry9 ry9Var2 = new ry9(e3, e4);
                                    bArr3 = iv;
                                    ry9Var = ry9Var2;
                                } else {
                                    throw new Exception(String.format("Authentication tag length of %d bits is required, got %d", 128, Integer.valueOf(tLen)));
                                }
                            } else {
                                if (iv != null) {
                                    long length4 = iv.length * j;
                                    i3 = (int) length4;
                                    if (i3 != length4) {
                                        throw new Exception("Integer overflow");
                                    }
                                }
                                throw new Exception(String.format("IV length of %d bits is required, got %d", 96, Integer.valueOf(i3)));
                            }
                        } catch (InvalidParameterSpecException e5) {
                            throw new Exception(e5.getMessage(), e5);
                        }
                    } else {
                        throw new Exception("AES GCM ciphers are expected to make use of algorithm parameters");
                    }
                } catch (BadPaddingException | IllegalBlockSizeException e6) {
                    throw new Exception("Couldn't encrypt with AES/GCM/NoPadding: " + e6.getMessage(), e6);
                }
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e7) {
                throw new Exception("Couldn't create AES/GCM/NoPadding cipher: " + e7.getMessage(), e7);
            }
        } else if (!fe7Var.equals(fe7.g) && !fe7Var.equals(fe7.h)) {
            if (fe7Var.equals(fe7.l)) {
                try {
                    dz9 dz9Var = new dz9(1, secretKey2.getEncoded());
                    try {
                        ByteBuffer allocate = ByteBuffer.allocate(byteArray.length + 40);
                        byte[] a2 = hnf.a(24);
                        allocate.put(a2);
                        dz9Var.b(allocate, a2, byteArray, bArr2);
                        byte[] array2 = allocate.array();
                        int length5 = array2.length;
                        bArr3 = oin.e(array2, 0, 24);
                        ry9Var = new ry9(oin.e(array2, 24, length5 - 40), oin.e(array2, length5 - 16, 16));
                        h81Var2 = h81Var;
                    } catch (GeneralSecurityException e8) {
                        throw new Exception("Couldn't encrypt with XChaCha20Poly1305: " + e8.getMessage(), e8);
                    }
                } catch (GeneralSecurityException e9) {
                    throw new Exception("Invalid XChaCha20Poly1305 key: " + e9.getMessage(), e9);
                }
            } else {
                throw new Exception(j9n.d(fe7Var, a));
            }
        } else {
            byte[] bArr8 = new byte[16];
            new SecureRandom().nextBytes(bArr8);
            Provider provider3 = (Provider) daaVar.a;
            Map map = caaVar.e;
            if (map.get("epu") instanceof String) {
                bArr4 = new d81((String) map.get("epu")).a();
            } else {
                bArr4 = null;
            }
            if (map.get("epv") instanceof String) {
                bArr5 = new d81((String) map.get("epv")).a();
            }
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream2.write(y6m.a);
                byte[] encoded2 = secretKey2.getEncoded();
                byteArrayOutputStream2.write(encoded2);
                int length6 = encoded2.length * 8;
                byteArrayOutputStream2.write(gsm.b(length6 / 2));
                byteArrayOutputStream2.write(fe7Var.a.getBytes(ouh.a));
                byte[] bArr9 = y6m.b;
                if (bArr4 != null) {
                    byteArrayOutputStream2.write(gsm.b(bArr4.length));
                    byteArrayOutputStream2.write(bArr4);
                } else {
                    byteArrayOutputStream2.write(bArr9);
                }
                if (bArr5 != null) {
                    byteArrayOutputStream2.write(gsm.b(bArr5.length));
                    byteArrayOutputStream2.write(bArr5);
                } else {
                    byteArrayOutputStream2.write(bArr9);
                }
                byteArrayOutputStream2.write(y6m.c);
                try {
                    byte[] digest = MessageDigest.getInstance("SHA-" + length6).digest(byteArrayOutputStream2.toByteArray());
                    int length7 = digest.length / 2;
                    byte[] bArr10 = new byte[length7];
                    System.arraycopy(digest, 0, bArr10, 0, length7);
                    try {
                        byte[] doFinal3 = s6n.a(new SecretKeySpec(bArr10, "AES"), true, bArr8, provider3).doFinal(byteArray);
                        SecretKeySpec e10 = y6m.e(secretKey2, fe7Var, bArr4, bArr5);
                        StringBuilder sb = new StringBuilder();
                        sb.append(caaVar.a());
                        sb.append(".");
                        h81Var2 = h81Var;
                        sb.append(h81Var2);
                        sb.append(".");
                        sb.append(h81.c(bArr8));
                        sb.append(".");
                        sb.append(h81.c(doFinal3));
                        ry9Var = new ry9(doFinal3, ftl.a(e10.getAlgorithm(), e10, sb.toString().getBytes(ouh.a), provider3));
                        bArr3 = bArr8;
                    } catch (Exception e11) {
                        throw new Exception(e11.getMessage(), e11);
                    }
                } catch (NoSuchAlgorithmException e12) {
                    throw new Exception(e12.getMessage(), e12);
                }
            } catch (IOException e13) {
                throw new Exception(e13.getMessage(), e13);
            }
        }
        return new u6b(caaVar, h81Var2, h81.c(bArr3), h81.c((byte[]) ry9Var.b), h81.c((byte[]) ry9Var.c), 24);
    }
}
