package io.sentry.vendor;

import com.fingerprintjs.android.fpjs_pro.g;
import defpackage.dmk;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;
import okhttp3.internal.ws.RealWebSocket;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class a {
    public static final byte[] a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    public static boolean a(String str, int i, char c) {
        if (i < str.length() && str.charAt(i) == c) {
            return true;
        }
        return false;
    }

    public static byte[] b(byte[] bArr) {
        byte[] bArr2;
        int length = bArr.length;
        int i = (length / 3) * 4;
        int i2 = length % 3;
        if (i2 != 1) {
            if (i2 == 2) {
                i += 3;
            }
        } else {
            i += 2;
        }
        byte[] bArr3 = new byte[i];
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        while (true) {
            int i6 = i3 + 3;
            bArr2 = a;
            if (i6 > length) {
                break;
            }
            int i7 = (bArr[i3 + 2] & MessagePack.Code.EXT_TIMESTAMP) | ((bArr[i3] & MessagePack.Code.EXT_TIMESTAMP) << 16) | ((bArr[i3 + 1] & MessagePack.Code.EXT_TIMESTAMP) << 8);
            bArr3[i4] = bArr2[(i7 >> 18) & 63];
            bArr3[i4 + 1] = bArr2[(i7 >> 12) & 63];
            bArr3[i4 + 2] = bArr2[(i7 >> 6) & 63];
            bArr3[i4 + 3] = bArr2[i7 & 63];
            int i8 = i4 + 4;
            i5--;
            if (i5 == 0) {
                i4 += 5;
                bArr3[i8] = 10;
                i5 = 19;
            } else {
                i4 = i8;
            }
            i3 = i6;
        }
        if (i3 == length - 1) {
            int i9 = (bArr[i3] & MessagePack.Code.EXT_TIMESTAMP) << 4;
            bArr3[i4] = bArr2[(i9 >> 6) & 63];
            bArr3[i4 + 1] = bArr2[i9 & 63];
            return bArr3;
        }
        if (i3 == length - 2) {
            int i10 = ((bArr[i3 + 1] & MessagePack.Code.EXT_TIMESTAMP) << 2) | ((bArr[i3] & MessagePack.Code.EXT_TIMESTAMP) << 10);
            bArr3[i4] = bArr2[(i10 >> 12) & 63];
            bArr3[i4 + 1] = bArr2[(i10 >> 6) & 63];
            bArr3[i4 + 2] = bArr2[i10 & 63];
        }
        return bArr3;
    }

    public static long c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        if (i2 <= 2) {
            i9 = 1;
        } else {
            i9 = 0;
        }
        long j = i - i9;
        long e = e(j, 400L);
        int i11 = (int) (j - (400 * e));
        if (i2 > 2) {
            i10 = -3;
        } else {
            i10 = 9;
        }
        return (((i6 * 1000) + ((i5 * RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS) + ((i4 * 3600000) + ((((e * 146097) + ((((i11 / 4) + (i11 * 365)) - (i11 / 100)) + ((((((i2 + i10) * 153) + 2) / 5) + i3) - 1))) - 719468) * 86400000)))) + i7) - i8;
    }

    public static long d(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(new SimpleTimeZone(i8, "GMT"));
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i2 - 1);
        gregorianCalendar.set(5, i3);
        gregorianCalendar.set(11, i4);
        gregorianCalendar.set(12, i5);
        gregorianCalendar.set(13, i6);
        gregorianCalendar.set(14, i7);
        return gregorianCalendar.getTimeInMillis();
    }

    public static long e(long j, long j2) {
        int i;
        long j3 = j / j2;
        if (j - (j2 * j3) != 0 && (i = ((int) ((j ^ j2) >> 63)) | 1) < 0) {
            return j3 + i;
        }
        return j3;
    }

    public static String f(long j) {
        int i;
        int i2;
        if (j < -12219292800000L) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(new SimpleTimeZone(0, "UTC"));
            gregorianCalendar.setTimeInMillis(j);
            StringBuilder sb = new StringBuilder(24);
            g(sb, gregorianCalendar.get(1), 4);
            sb.append('-');
            g(sb, gregorianCalendar.get(2) + 1, 2);
            sb.append('-');
            g(sb, gregorianCalendar.get(5), 2);
            sb.append('T');
            g(sb, gregorianCalendar.get(11), 2);
            sb.append(':');
            g(sb, gregorianCalendar.get(12), 2);
            sb.append(':');
            g(sb, gregorianCalendar.get(13), 2);
            sb.append('.');
            g(sb, gregorianCalendar.get(14), 3);
            sb.append('Z');
            return sb.toString();
        }
        long e = e(j, 86400000L);
        int e2 = (int) (j - (e(j, 86400000L) * 86400000));
        long j2 = e + 719468;
        long e3 = e(j2, 146097L);
        int i3 = (int) (j2 - (146097 * e3));
        int i4 = (((i3 / 36524) + (i3 - (i3 / 1460))) - (i3 / 146096)) / 365;
        int i5 = (int) ((e3 * 400) + i4);
        int i6 = i3 - (((i4 / 4) + (i4 * 365)) - (i4 / 100));
        int i7 = ((i6 * 5) + 2) / 153;
        int i8 = (i6 - (((i7 * 153) + 2) / 5)) + 1;
        if (i7 < 10) {
            i = i7 + 3;
        } else {
            i = i7 - 9;
        }
        if (i <= 2) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int[] iArr = {i5 + i2, i, i8};
        int i9 = e2 / 3600000;
        int i10 = e2 - (3600000 * i9);
        int i11 = i10 / 60000;
        int i12 = i10 - (60000 * i11);
        int i13 = i12 / 1000;
        StringBuilder sb2 = new StringBuilder(24);
        g(sb2, iArr[0], 4);
        sb2.append('-');
        g(sb2, iArr[1], 2);
        sb2.append('-');
        g(sb2, iArr[2], 2);
        sb2.append('T');
        g(sb2, i9, 2);
        sb2.append(':');
        g(sb2, i11, 2);
        sb2.append(':');
        g(sb2, i13, 2);
        sb2.append('.');
        g(sb2, i12 - (i13 * 1000), 3);
        sb2.append('Z');
        return sb2.toString();
    }

    public static void g(StringBuilder sb, int i, int i2) {
        if (i < 0) {
            sb.append('-');
            g(sb, -i, i2);
            return;
        }
        String num = Integer.toString(i);
        for (int length = i2 - num.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(num);
    }

    public static int h(String str, int i, int i2) {
        if (i >= 0 && i2 <= str.length() && i < i2) {
            int i3 = 0;
            for (int i4 = i; i4 < i2; i4++) {
                char charAt = str.charAt(i4);
                if (charAt >= '0' && charAt <= '9') {
                    i3 = g.b(i3, 10, charAt, 48);
                } else {
                    throw new NumberFormatException("Invalid number: ".concat(str.substring(i, i2)));
                }
            }
            return i3;
        }
        throw new NumberFormatException(str);
    }

    public static long i(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        char charAt;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int length = str.length();
        int h = h(str, 0, 4);
        if (a(str, 4, '-')) {
            i = 5;
        } else {
            i = 4;
        }
        int i11 = i + 2;
        int h2 = h(str, i, i11);
        if (a(str, i11, '-')) {
            i11 = i + 3;
        }
        int i12 = i11 + 2;
        int h3 = h(str, i11, i12);
        int i13 = -1;
        if (!a(str, i12, 'T')) {
            if (i12 == length) {
                return new GregorianCalendar(h, h2 - 1, h3).getTimeInMillis();
            }
            char charAt2 = str.charAt(i12);
            if (charAt2 != 'Z' && charAt2 != '+' && charAt2 != '-') {
                dmk.v("Invalid date separator");
                return 0L;
            }
            char charAt3 = str.charAt(i12);
            if (charAt3 == 'Z') {
                i8 = i11 + 3;
                z2 = true;
                i10 = 0;
            } else {
                if (charAt3 != '+' && charAt3 != '-') {
                    dmk.v("Invalid time zone indicator");
                    return 0L;
                }
                if (charAt3 == '+') {
                    i13 = 1;
                }
                int i14 = i11 + 5;
                int h4 = h(str, i11 + 3, i14);
                if (a(str, i14, ':')) {
                    i14 = i11 + 6;
                }
                int i15 = i14 + 2;
                if (length >= i15) {
                    i9 = h(str, i14, i15);
                    i8 = i15;
                } else {
                    i8 = i14;
                    i9 = 0;
                }
                if (h4 >= 0 && h4 <= 23 && i9 >= 0 && i9 <= 59) {
                    i10 = i13 * ((int) ((i9 * RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS) + (h4 * 3600000)));
                    z2 = false;
                } else {
                    dmk.v("Invalid time zone");
                    return 0L;
                }
            }
            if (!z2 && i8 != length) {
                dmk.v("Invalid trailing characters");
                return 0L;
            }
            if (h >= 1582 && (h != 1582 || (h2 >= 10 && (h2 != 10 || h3 >= 15)))) {
                j(h, h2, h3);
                return c(h, h2, h3, 0, 0, 0, 0, i10);
            }
            return d(h, h2, h3, 0, 0, 0, 0, i10);
        }
        j(h, h2, h3);
        int i16 = i11 + 5;
        int h5 = h(str, i11 + 3, i16);
        if (a(str, i16, ':')) {
            i16 = i11 + 6;
        }
        int i17 = i16 + 2;
        int h6 = h(str, i16, i17);
        if (a(str, i17, ':')) {
            i17 = i16 + 3;
        }
        if (length > i17 && (charAt = str.charAt(i17)) != 'Z' && charAt != '+' && charAt != '-') {
            int i18 = i17 + 2;
            i3 = h(str, i17, i18);
            if (i3 > 59 && i3 < 63) {
                i3 = 59;
            }
            if (a(str, i18, '.')) {
                int i19 = i17 + 3;
                int i20 = i19;
                while (true) {
                    if (i20 < str.length()) {
                        char charAt4 = str.charAt(i20);
                        if (charAt4 < '0' || charAt4 > '9') {
                            break;
                        }
                        i20++;
                    } else {
                        i20 = str.length();
                        break;
                    }
                }
                if (i20 != i19) {
                    int min = Math.min(i20, i17 + 6);
                    int h7 = h(str, i19, min);
                    int i21 = min - i19;
                    if (i21 != 1) {
                        if (i21 == 2) {
                            h7 *= 10;
                        }
                    } else {
                        h7 *= 100;
                    }
                    int i22 = i20;
                    i2 = h7;
                    i17 = i22;
                } else {
                    dmk.v("Missing millisecond digits");
                    return 0L;
                }
            } else {
                i17 = i18;
                i2 = 0;
            }
        } else {
            i2 = 0;
            i3 = 0;
        }
        if (h5 >= 0 && h5 <= 23 && h6 >= 0 && h6 <= 59 && i3 >= 0 && i3 <= 59 && i2 >= 0 && i2 <= 999) {
            if (length > i17) {
                char charAt5 = str.charAt(i17);
                if (charAt5 == 'Z') {
                    i4 = i17 + 1;
                    i6 = h6;
                    z = true;
                    i7 = 0;
                } else {
                    if (charAt5 != '+' && charAt5 != '-') {
                        dmk.v("Invalid time zone indicator");
                        return 0L;
                    }
                    if (charAt5 == '+') {
                        i13 = 1;
                    }
                    int i23 = i17 + 3;
                    int h8 = h(str, i17 + 1, i23);
                    if (a(str, i23, ':')) {
                        i23 = i17 + 4;
                    }
                    i4 = i23 + 2;
                    if (length >= i4) {
                        i5 = h(str, i23, i4);
                    } else {
                        i4 = i23;
                        i5 = 0;
                    }
                    if (h8 >= 0 && h8 <= 23 && i5 >= 0 && i5 <= 59) {
                        i6 = h6;
                        i7 = i13 * ((int) ((i5 * RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS) + (h8 * 3600000)));
                        z = false;
                    } else {
                        dmk.v("Invalid time zone");
                        return 0L;
                    }
                }
                if (!z && i4 != length) {
                    dmk.v("Invalid trailing characters");
                    return 0L;
                }
                if (h >= 1582 && (h != 1582 || (h2 >= 10 && (h2 != 10 || h3 >= 15)))) {
                    return c(h, h2, h3, h5, i6, i3, i2, i7);
                }
                return d(h, h2, h3, h5, i6, i3, i2, i7);
            }
            dmk.v("No time zone indicator");
            return 0L;
        }
        dmk.v("Invalid time");
        return 0L;
    }

    public static void j(int i, int i2, int i3) {
        int i4;
        if (i >= 1 && i2 >= 1 && i2 <= 12 && i3 >= 1) {
            if (i2 != 2) {
                if (i2 != 4 && i2 != 6 && i2 != 9 && i2 != 11) {
                    i4 = 31;
                } else {
                    i4 = 30;
                }
            } else if (i % 4 == 0 && (i % 100 != 0 || i % CarouselScreenFragment.CAROUSEL_ANIMATION_MS == 0)) {
                i4 = 29;
            } else {
                i4 = 28;
            }
            if (i3 <= i4) {
                return;
            }
        }
        dmk.v("Invalid date");
    }
}
