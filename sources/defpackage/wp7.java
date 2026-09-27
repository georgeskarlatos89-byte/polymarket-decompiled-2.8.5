package defpackage;

import android.util.Pair;
import io.ably.lib.util.AgentHeaderCreator;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.ws.WebSocketProtocol;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class wp7 {
    public static final Pattern b = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern c = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern d = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final ArrayList e;
    public final ArrayList a;

    static {
        up7 up7Var = new up7(0);
        up7Var.b = 0;
        e = Collections.list(up7Var);
    }

    public wp7() {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        up7 up7Var = new up7(1);
        up7Var.b = 0;
        this.a = Collections.list(up7Var);
    }

    public static Pair a(String str) {
        int intValue;
        int i;
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair a = a(split[0]);
            if (((Integer) a.first).intValue() == 2) {
                return a;
            }
            for (int i2 = 1; i2 < split.length; i2++) {
                Pair a2 = a(split[i2]);
                if (!((Integer) a2.first).equals(a.first) && !((Integer) a2.second).equals(a.first)) {
                    intValue = -1;
                } else {
                    intValue = ((Integer) a.first).intValue();
                }
                if (((Integer) a.second).intValue() != -1 && (((Integer) a2.first).equals(a.second) || ((Integer) a2.second).equals(a.second))) {
                    i = ((Integer) a.second).intValue();
                } else {
                    i = -1;
                }
                if (intValue == -1 && i == -1) {
                    return new Pair(2, -1);
                }
                if (intValue == -1) {
                    a = new Pair(Integer.valueOf(i), -1);
                } else if (i == -1) {
                    a = new Pair(Integer.valueOf(intValue), -1);
                }
            }
            return a;
        }
        if (str.contains(AgentHeaderCreator.AGENT_DIVIDER)) {
            String[] split2 = str.split(AgentHeaderCreator.AGENT_DIVIDER, -1);
            if (split2.length == 2) {
                try {
                    long parseDouble = (long) Double.parseDouble(split2[0]);
                    long parseDouble2 = (long) Double.parseDouble(split2[1]);
                    if (parseDouble >= 0 && parseDouble2 >= 0) {
                        if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                            return new Pair(10, 5);
                        }
                        return new Pair(5, -1);
                    }
                    return new Pair(10, -1);
                } catch (NumberFormatException unused) {
                }
            }
            return new Pair(2, -1);
        }
        try {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong >= 0 && parseLong <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                    return new Pair(3, 4);
                }
                if (parseLong < 0) {
                    return new Pair(9, -1);
                }
                return new Pair(4, -1);
            } catch (NumberFormatException unused2) {
                return new Pair(2, -1);
            }
        } catch (NumberFormatException unused3) {
            Double.parseDouble(str);
            return new Pair(12, -1);
        }
    }

    public final void b(String str, String str2, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((Map) it.next()).containsKey(str)) {
                return;
            }
        }
        c(str, str2, arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0174, code lost:
    
        if (r7 != r9) goto L45;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:46:0x017b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:109:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0342  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(String str, String str2, List list) {
        int i;
        ByteOrder byteOrder;
        int i2;
        sp7 sp7Var;
        int i3;
        int i4;
        String str3 = str;
        String str4 = str2;
        ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
        if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && str4 != null) {
            boolean find = c.matcher(str4).find();
            boolean find2 = d.matcher(str4).find();
            if (str4.length() == 19 && (find || find2)) {
                if (find2) {
                    str4 = str4.replaceAll("-", ":");
                }
            } else {
                o9n.f("ExifData", "Invalid value for " + str3 + " : " + str4);
                return;
            }
        }
        if ("ISOSpeedRatings".equals(str3)) {
            str3 = "PhotographicSensitivity";
        }
        String str5 = str3;
        int i5 = 3;
        int i6 = 2;
        int i7 = 1;
        if (str4 != null && zp7.d.contains(str5)) {
            if (str5.equals("GPSTimeStamp")) {
                Matcher matcher = b.matcher(str4);
                if (!matcher.find()) {
                    o9n.f("ExifData", "Invalid value for " + str5 + " : " + str4);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                String group = matcher.group(1);
                group.getClass();
                sb.append(Integer.parseInt(group));
                sb.append("/1,");
                String group2 = matcher.group(2);
                group2.getClass();
                sb.append(Integer.parseInt(group2));
                sb.append("/1,");
                String group3 = matcher.group(3);
                group3.getClass();
                sb.append(Integer.parseInt(group3));
                sb.append("/1");
                str4 = sb.toString();
            } else {
                try {
                    str4 = ((long) (Double.parseDouble(str4) * 10000.0d)) + "/10000";
                } catch (NumberFormatException e2) {
                    o9n.g("ExifData", m51.k("Invalid value for ", str5, " : ", str4), e2);
                    return;
                }
            }
        }
        int i8 = 0;
        int i9 = 0;
        while (true) {
            nq7[] nq7VarArr = zp7.b;
            if (i9 < 4) {
                nq7 nq7Var = (nq7) ((HashMap) e.get(i9)).get(str5);
                if (nq7Var != null) {
                    int i10 = nq7Var.d;
                    int i11 = nq7Var.c;
                    if (str4 == null) {
                        ((Map) list.get(i9)).remove(str5);
                    } else {
                        Pair a = a(str4);
                        int i12 = -1;
                        if (i11 != ((Integer) a.first).intValue() && i11 != ((Integer) a.second).intValue()) {
                            if (i10 == -1 || (i10 != ((Integer) a.first).intValue() && i10 != ((Integer) a.second).intValue())) {
                                if (i11 != i7) {
                                    if (i11 != 7) {
                                    }
                                }
                            }
                            switch (i10) {
                                case 1:
                                    i = i5;
                                    byteOrder = byteOrder2;
                                    Map map = (Map) list.get(i9);
                                    Charset charset = sp7.d;
                                    i2 = i7;
                                    if (str4.length() == i2) {
                                        i8 = 0;
                                        if (str4.charAt(0) >= '0' && str4.charAt(0) <= '1') {
                                            byte[] bArr = new byte[i2];
                                            bArr[0] = (byte) (str4.charAt(0) - '0');
                                            sp7Var = new sp7(bArr, i2, i2);
                                            map.put(str5, sp7Var);
                                            break;
                                        }
                                    } else {
                                        i8 = 0;
                                    }
                                    byte[] bytes = str4.getBytes(sp7.d);
                                    sp7Var = new sp7(bytes, i2, bytes.length);
                                    map.put(str5, sp7Var);
                                    break;
                                case 2:
                                case 7:
                                    i = i5;
                                    byteOrder = byteOrder2;
                                    i3 = i7;
                                    Map map2 = (Map) list.get(i9);
                                    Charset charset2 = sp7.d;
                                    byte[] bytes2 = str4.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(sp7.d);
                                    i6 = 2;
                                    map2.put(str5, new sp7(bytes2, 2, bytes2.length));
                                    i8 = 0;
                                    i2 = i3;
                                    break;
                                case 3:
                                    int i13 = i5;
                                    i3 = i7;
                                    byteOrder = byteOrder2;
                                    String[] split = str4.split(",", -1);
                                    int length = split.length;
                                    int[] iArr = new int[length];
                                    for (int i14 = 0; i14 < split.length; i14++) {
                                        iArr[i14] = Integer.parseInt(split[i14]);
                                    }
                                    Map map3 = (Map) list.get(i9);
                                    ByteBuffer wrap = ByteBuffer.wrap(new byte[sp7.f[i13] * length]);
                                    wrap.order(byteOrder);
                                    for (int i15 = 0; i15 < length; i15++) {
                                        wrap.putShort((short) iArr[i15]);
                                    }
                                    i = i13;
                                    map3.put(str5, new sp7(wrap.array(), i, length));
                                    i8 = 0;
                                    i6 = 2;
                                    i2 = i3;
                                    break;
                                case 4:
                                    i4 = i5;
                                    i3 = i7;
                                    byteOrder = byteOrder2;
                                    String[] split2 = str4.split(",", -1);
                                    long[] jArr = new long[split2.length];
                                    for (int i16 = 0; i16 < split2.length; i16++) {
                                        jArr[i16] = Long.parseLong(split2[i16]);
                                    }
                                    ((Map) list.get(i9)).put(str5, sp7.b(jArr, byteOrder));
                                    i = i4;
                                    i8 = 0;
                                    i6 = 2;
                                    i2 = i3;
                                    break;
                                case 5:
                                    i4 = i5;
                                    i3 = i7;
                                    int i17 = -1;
                                    String[] split3 = str4.split(",", -1);
                                    int length2 = split3.length;
                                    dj1[] dj1VarArr = new dj1[length2];
                                    int i18 = i8;
                                    while (i18 < split3.length) {
                                        String[] split4 = split3[i18].split(AgentHeaderCreator.AGENT_DIVIDER, i17);
                                        dj1VarArr[i18] = new dj1((long) Double.parseDouble(split4[i8]), (long) Double.parseDouble(split4[i3]), 2, (byte) 0);
                                        i18++;
                                        byteOrder2 = byteOrder2;
                                        length2 = length2;
                                        i17 = -1;
                                        i8 = 0;
                                    }
                                    byteOrder = byteOrder2;
                                    int i19 = length2;
                                    Map map4 = (Map) list.get(i9);
                                    ByteBuffer wrap2 = ByteBuffer.wrap(new byte[sp7.f[5] * i19]);
                                    wrap2.order(byteOrder);
                                    for (int i20 = 0; i20 < i19; i20++) {
                                        dj1 dj1Var = dj1VarArr[i20];
                                        wrap2.putInt((int) dj1Var.b);
                                        wrap2.putInt((int) dj1Var.c);
                                    }
                                    map4.put(str5, new sp7(wrap2.array(), 5, i19));
                                    i = i4;
                                    i8 = 0;
                                    i6 = 2;
                                    i2 = i3;
                                    break;
                                case 9:
                                    int i21 = i5;
                                    i3 = i7;
                                    String[] split5 = str4.split(",", -1);
                                    int length3 = split5.length;
                                    int[] iArr2 = new int[length3];
                                    for (int i22 = i8; i22 < split5.length; i22++) {
                                        iArr2[i22] = Integer.parseInt(split5[i22]);
                                    }
                                    Map map5 = (Map) list.get(i9);
                                    ByteBuffer wrap3 = ByteBuffer.wrap(new byte[sp7.f[9] * length3]);
                                    wrap3.order(byteOrder2);
                                    for (int i23 = i8; i23 < length3; i23++) {
                                        wrap3.putInt(iArr2[i23]);
                                    }
                                    map5.put(str5, new sp7(wrap3.array(), 9, length3));
                                    i = i21;
                                    byteOrder = byteOrder2;
                                    i2 = i3;
                                    break;
                                case 10:
                                    i3 = i7;
                                    String[] split6 = str4.split(",", -1);
                                    int length4 = split6.length;
                                    dj1[] dj1VarArr2 = new dj1[length4];
                                    int i24 = i8;
                                    while (i24 < split6.length) {
                                        String[] split7 = split6[i24].split(AgentHeaderCreator.AGENT_DIVIDER, i12);
                                        dj1VarArr2[i24] = new dj1((long) Double.parseDouble(split7[i8]), (long) Double.parseDouble(split7[i3]), 2, (byte) 0);
                                        i24++;
                                        i5 = i5;
                                        str4 = str4;
                                        i12 = -1;
                                    }
                                    int i25 = i5;
                                    String str6 = str4;
                                    Map map6 = (Map) list.get(i9);
                                    ByteBuffer wrap4 = ByteBuffer.wrap(new byte[sp7.f[10] * length4]);
                                    wrap4.order(byteOrder2);
                                    for (int i26 = i8; i26 < length4; i26++) {
                                        dj1 dj1Var2 = dj1VarArr2[i26];
                                        wrap4.putInt((int) dj1Var2.b);
                                        wrap4.putInt((int) dj1Var2.c);
                                    }
                                    map6.put(str5, new sp7(wrap4.array(), 10, length4));
                                    i = i25;
                                    str4 = str6;
                                    byteOrder = byteOrder2;
                                    i2 = i3;
                                    break;
                                case 12:
                                    String[] split8 = str4.split(",", -1);
                                    int length5 = split8.length;
                                    double[] dArr = new double[length5];
                                    for (int i27 = i8; i27 < split8.length; i27++) {
                                        dArr[i27] = Double.parseDouble(split8[i27]);
                                    }
                                    Map map7 = (Map) list.get(i9);
                                    ByteBuffer wrap5 = ByteBuffer.wrap(new byte[sp7.f[12] * length5]);
                                    wrap5.order(byteOrder2);
                                    int i28 = i8;
                                    while (i28 < length5) {
                                        double[] dArr2 = dArr;
                                        wrap5.putDouble(dArr2[i28]);
                                        i28++;
                                        i7 = i7;
                                        dArr = dArr2;
                                    }
                                    i3 = i7;
                                    map7.put(str5, new sp7(wrap5.array(), 12, length5));
                                    i = i5;
                                    byteOrder = byteOrder2;
                                    i2 = i3;
                                    break;
                            }
                            i9++;
                            i7 = i2;
                            i5 = i;
                            byteOrder2 = byteOrder;
                        }
                        i10 = i11;
                        switch (i10) {
                        }
                        i9++;
                        i7 = i2;
                        i5 = i;
                        byteOrder2 = byteOrder;
                    }
                }
                i = i5;
                byteOrder = byteOrder2;
                i2 = i7;
                i9++;
                i7 = i2;
                i5 = i;
                byteOrder2 = byteOrder;
            } else {
                return;
            }
        }
    }

    public final void d(int i) {
        int i2;
        if (i != 0) {
            if (i != 90) {
                if (i != 180) {
                    if (i != 270) {
                        o9n.f("ExifData", "Unexpected orientation value: " + i + ". Must be one of 0, 90, 180, 270.");
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                } else {
                    i2 = 3;
                }
            } else {
                i2 = 6;
            }
        } else {
            i2 = 1;
        }
        c("Orientation", String.valueOf(i2), this.a);
    }
}
