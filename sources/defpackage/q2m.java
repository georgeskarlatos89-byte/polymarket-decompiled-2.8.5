package defpackage;

import android.content.Context;
import java.time.DateTimeException;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeParseException;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class q2m {
    public static final okj a = new okj(true, 5);
    public static final okj b = new okj(true, 1);
    public static final okj c = new okj(false, 3);
    public static final okj d = new okj(true, 2);
    public static final okj e = new okj(true, 4);
    public static final okj f = new okj(true, 6);
    public static final okj g = new okj(false, 7);
    public static final h6a h = new h6a(true, 2);
    public static final h6a i = new h6a(true, 3);
    public static final h6a j = new h6a(true, 0);
    public static final h6a k = new h6a(true, 1);

    public static String a(OffsetDateTime offsetDateTime) {
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        fy7 fy7Var = fy7.SECOND;
        if (!offsetDateTime.getOffset().equals(zoneOffset)) {
            offsetDateTime = offsetDateTime.atZoneSameInstant(zoneOffset).toOffsetDateTime();
        }
        int totalSeconds = zoneOffset.getTotalSeconds();
        l3j l3jVar = new l3j(totalSeconds / 3600, (totalSeconds % 3600) / 60);
        char[] cArr = new char[29];
        int year = offsetDateTime.getYear();
        fy7 fy7Var2 = fy7.YEAR;
        c8b.c(year, 0, 4, cArr);
        if (fy7Var == fy7Var2) {
            return wzl.c(cArr, fy7Var2.a(), null);
        }
        cArr[4] = '-';
        int monthValue = offsetDateTime.getMonthValue();
        fy7 fy7Var3 = fy7.MONTH;
        c8b.c(monthValue, 5, 2, cArr);
        if (fy7Var == fy7Var3) {
            return wzl.c(cArr, fy7Var3.a(), null);
        }
        cArr[7] = '-';
        int dayOfMonth = offsetDateTime.getDayOfMonth();
        fy7 fy7Var4 = fy7.DAY;
        c8b.c(dayOfMonth, 8, 2, cArr);
        if (fy7Var == fy7Var4) {
            return wzl.c(cArr, fy7Var4.a(), null);
        }
        cArr[10] = 'T';
        c8b.c(offsetDateTime.getHour(), 11, 2, cArr);
        cArr[13] = ':';
        int minute = offsetDateTime.getMinute();
        fy7 fy7Var5 = fy7.MINUTE;
        c8b.c(minute, 14, 2, cArr);
        if (fy7Var == fy7Var5) {
            return wzl.c(cArr, fy7Var5.a(), l3jVar);
        }
        cArr[16] = ':';
        c8b.c(offsetDateTime.getSecond(), 17, 2, cArr);
        cArr[19] = '.';
        c8b.c((int) (offsetDateTime.getNano() / wzl.a[2]), 20, 3, cArr);
        return wzl.c(cArr, 23, l3jVar);
    }

    public static cy7 b(Context context, vpi vpiVar) {
        return new cy7(context, null, cy7.e, vpiVar, zw8.c, 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0250  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static OffsetDateTime c(String str) {
        String ch;
        l3j l3jVar;
        iv5 iv5Var;
        char charAt;
        boolean z;
        int ordinal;
        fy7 fy7Var;
        ZoneOffset ofHoursMinutes;
        tvd tvdVar = tvd.e;
        if (str != null) {
            int length = str.length();
            if (length >= 0) {
                int b2 = c8b.b(0, 4, str);
                l3j l3jVar2 = l3j.c;
                if (4 == length) {
                    z = true;
                    iv5Var = new iv5(fy7.YEAR, b2, 0, 0, 0, 0, 0, 0, null, 0);
                } else {
                    fy7 fy7Var2 = fy7.MONTH;
                    ryb.a(fy7Var2, str, 4, '-');
                    int b3 = c8b.b(5, 7, str);
                    if (7 == length) {
                        z = true;
                        iv5Var = new iv5(fy7Var2, b2, b3, 0, 0, 0, 0, 0, null, 0);
                    } else {
                        fy7 fy7Var3 = fy7.DAY;
                        ryb.a(fy7Var3, str, 7, '-');
                        int b4 = c8b.b(8, 10, str);
                        if (10 == length) {
                            z = true;
                            iv5Var = new iv5(fy7Var3, b2, b3, b4, 0, 0, 0, 0, null, 0);
                        } else {
                            char charAt2 = str.charAt(10);
                            char[] cArr = tvdVar.a;
                            char[] cArr2 = tvdVar.b;
                            for (char c2 : cArr) {
                                if (c2 == charAt2) {
                                    int b5 = c8b.b(11, 13, str);
                                    fy7 fy7Var4 = fy7.MINUTE;
                                    ryb.a(fy7Var4, str, 13, ':');
                                    int b6 = c8b.b(14, 16, str);
                                    if (length == 16) {
                                        iv5Var = new iv5(fy7Var4, b2, b3, b4, b5, b6, 0, 0, null, 0);
                                    } else {
                                        char charAt3 = str.charAt(16);
                                        if (charAt3 != '+' && charAt3 != '-') {
                                            if (charAt3 != ':') {
                                                if (charAt3 != 'Z' && charAt3 != 'z') {
                                                    ryb.d(16, str, ':', 'Z', 'z', '+', '-');
                                                    throw null;
                                                }
                                            } else {
                                                int length2 = str.length();
                                                if (length2 > 19) {
                                                    char charAt4 = str.charAt(19);
                                                    int length3 = cArr2.length;
                                                    int i2 = 0;
                                                    while (true) {
                                                        if (i2 < length3) {
                                                            if (cArr2[i2] == charAt4) {
                                                                int i3 = 20;
                                                                int i4 = 0;
                                                                int i5 = 0;
                                                                while (i3 < str.length() && (charAt = str.charAt(i3)) >= '0' && charAt <= '9') {
                                                                    i4++;
                                                                    i5 = (charAt - '0') + (i5 * 10);
                                                                    i3++;
                                                                }
                                                                int i6 = i3 - 1;
                                                                if (i4 != 0) {
                                                                    if (i4 <= 9) {
                                                                        int i7 = i5;
                                                                        for (int i8 = i4; i8 < 9; i8++) {
                                                                            i7 *= 10;
                                                                        }
                                                                        iv5Var = new iv5(fy7.NANO, b2, b3, b4, b5, b6, c8b.b(17, 19, str), i7, x2m.d(tvdVar, str, i3), i4);
                                                                    } else {
                                                                        throw new DateTimeParseException(String.format("Maximum supported number of fraction digits in second is 9, got %d: %s", Integer.valueOf(i4), str), str, i6);
                                                                    }
                                                                } else {
                                                                    throw new DateTimeParseException("Must have at least 1 fraction digit: ".concat(str), str, i6);
                                                                }
                                                            } else {
                                                                i2++;
                                                            }
                                                        } else if (charAt4 != 'Z' && charAt4 != 'z') {
                                                            if (charAt4 != '+' && charAt4 != '-') {
                                                                char[] cArr3 = new char[cArr2.length + 4];
                                                                System.arraycopy(cArr2, 0, cArr3, 0, cArr2.length);
                                                                System.arraycopy(new char[]{'Z', 'z', '+', '-'}, 0, cArr3, cArr2.length, 4);
                                                                ryb.d(19, str, cArr3);
                                                                throw null;
                                                            }
                                                            l3j d2 = x2m.d(tvdVar, str, 19);
                                                            int b7 = c8b.b(17, 19, str);
                                                            fy7 fy7Var5 = fy7.SECOND;
                                                            fy7Var5.a();
                                                            iv5Var = new iv5(fy7Var5, b2, b3, b4, b5, b6, b7, 0, d2, 0);
                                                        } else {
                                                            int b8 = c8b.b(17, 19, str);
                                                            fy7 fy7Var6 = fy7.SECOND;
                                                            fy7Var6.a();
                                                            iv5Var = new iv5(fy7Var6, b2, b3, b4, b5, b6, b8, 0, l3jVar2, 0);
                                                            l3jVar = l3jVar2;
                                                        }
                                                    }
                                                } else {
                                                    l3jVar = l3jVar2;
                                                    if (length2 == 19) {
                                                        iv5Var = new iv5(fy7.SECOND, b2, b3, b4, b5, b6, c8b.b(17, 19, str), 0, null, 0);
                                                    } else {
                                                        throw new DateTimeParseException("Unexpected end of input: ".concat(str), str, 16);
                                                    }
                                                }
                                                ordinal = fy7.SECOND.ordinal();
                                                fy7Var = iv5Var.a;
                                                if (ordinal > fy7Var.ordinal()) {
                                                    fy7 fy7Var7 = fy7.MINUTE;
                                                    if (fy7Var7.ordinal() <= fy7Var.ordinal()) {
                                                        l3j l3jVar3 = iv5Var.i;
                                                        if (l3jVar3 != null) {
                                                            if (l3jVar3.equals(l3jVar)) {
                                                                ofHoursMinutes = ZoneOffset.UTC;
                                                            } else {
                                                                ofHoursMinutes = ZoneOffset.ofHoursMinutes(l3jVar3.a, l3jVar3.b);
                                                            }
                                                            return OffsetDateTime.of(iv5Var.b, iv5Var.c, iv5Var.d, iv5Var.e, iv5Var.f, iv5Var.g, iv5Var.h, ofHoursMinutes);
                                                        }
                                                        String iv5Var2 = iv5Var.toString();
                                                        throw new DateTimeParseException("No timezone information: ".concat(iv5Var2), iv5Var2, iv5Var2.length());
                                                    }
                                                    throw new DateTimeException("No " + fy7Var7.name() + " field found");
                                                }
                                                throw new DateTimeParseException("Unexpected end of input, missing field " + fy7.values()[fy7Var.ordinal() + 1] + ": " + str, str, fy7Var.a());
                                            }
                                        }
                                        l3jVar = l3jVar2;
                                        l3j d3 = x2m.d(tvdVar, str, 16);
                                        fy7Var4.a();
                                        iv5Var = new iv5(fy7Var4, b2, b3, b4, b5, b6, 0, 0, d3, 0);
                                        ordinal = fy7.SECOND.ordinal();
                                        fy7Var = iv5Var.a;
                                        if (ordinal > fy7Var.ordinal()) {
                                        }
                                    }
                                    l3jVar = l3jVar2;
                                    ordinal = fy7.SECOND.ordinal();
                                    fy7Var = iv5Var.a;
                                    if (ordinal > fy7Var.ordinal()) {
                                    }
                                }
                            }
                            char[] cArr4 = tvdVar.a;
                            if (cArr4.length > 1) {
                                ch = Arrays.toString(cArr4);
                            } else {
                                ch = Character.toString(cArr4[0]);
                            }
                            throw new DateTimeParseException(String.format("Expected character %s at position %d, found %s: %s", ch, 11, Character.valueOf(str.charAt(10)), str), str, 10);
                        }
                    }
                }
                l3jVar = l3jVar2;
                ordinal = fy7.SECOND.ordinal();
                fy7Var = iv5Var.a;
                if (ordinal > fy7Var.ordinal()) {
                }
            } else {
                throw new IndexOutOfBoundsException(String.format("offset is %d which is equal to or larger than the input length of %d", 0, Integer.valueOf(str.length())));
            }
        } else {
            dmk.s("text cannot be null");
            return null;
        }
    }
}
