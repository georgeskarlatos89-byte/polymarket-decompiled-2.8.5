package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import io.ably.lib.util.AgentHeaderCreator;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class h0n {
    public static final int[] b = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};
    public final /* synthetic */ int a = 2;

    public static int[] b(String str) {
        int i;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i2 = indexOf4 + 2;
        if (i2 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i2) == '/') {
            i = str.indexOf(47, indexOf4 + 3);
            if (i == -1 || i > indexOf2) {
                i = indexOf2;
            }
        } else {
            i = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static boolean c(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 = 0; i2 < 29; i2++) {
            if (b[i2] == i) {
                return true;
            }
        }
        return false;
    }

    public static String d(StringBuilder sb, int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i6 = i;
        int i7 = i6;
        while (i6 <= i2) {
            if (i6 == i2) {
                i3 = i6;
            } else if (sb.charAt(i6) == '/') {
                i3 = i6 + 1;
            } else {
                i6++;
            }
            int i8 = i7 + 1;
            if (i6 == i8 && sb.charAt(i7) == '.') {
                sb.delete(i7, i3);
                i2 -= i3 - i7;
            } else {
                if (i6 == i7 + 2 && sb.charAt(i7) == '.' && sb.charAt(i8) == '.') {
                    i4 = sb.lastIndexOf(AgentHeaderCreator.AGENT_DIVIDER, i7 - 2) + 1;
                    if (i4 > i) {
                        i5 = i4;
                    } else {
                        i5 = i;
                    }
                    sb.delete(i5, i3);
                    i2 -= i3 - i5;
                } else {
                    i4 = i6 + 1;
                }
                i7 = i4;
            }
            i6 = i7;
        }
        return sb.toString();
    }

    public static String e(String str, String str2) {
        int i;
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] b2 = b(str2);
        if (b2[0] != -1) {
            sb.append(str2);
            d(sb, b2[1], b2[2]);
            return sb.toString();
        }
        int[] b3 = b(str);
        if (b2[3] == 0) {
            sb.append((CharSequence) str, 0, b3[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (b2[2] == 0) {
            sb.append((CharSequence) str, 0, b3[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i2 = b2[1];
        if (i2 != 0) {
            int i3 = b3[0] + 1;
            sb.append((CharSequence) str, 0, i3);
            sb.append(str2);
            return d(sb, b2[1] + i3, i3 + b2[2]);
        }
        if (str2.charAt(i2) == '/') {
            sb.append((CharSequence) str, 0, b3[1]);
            sb.append(str2);
            int i4 = b3[1];
            return d(sb, i4, b2[2] + i4);
        }
        int i5 = b3[0] + 2;
        int i6 = b3[1];
        if (i5 < i6 && i6 == b3[2]) {
            sb.append((CharSequence) str, 0, i6);
            sb.append('/');
            sb.append(str2);
            int i7 = b3[1];
            return d(sb, i7, b2[2] + i7 + 1);
        }
        int lastIndexOf = str.lastIndexOf(47, b3[2] - 1);
        if (lastIndexOf == -1) {
            i = b3[1];
        } else {
            i = lastIndexOf + 1;
        }
        sb.append((CharSequence) str, 0, i);
        sb.append(str2);
        return d(sb, b3[1], i + b2[2]);
    }

    public static Uri f(String str, String str2) {
        return Uri.parse(e(str, str2));
    }

    public static jdh g(tu7 tu7Var, boolean z, boolean z2) {
        jdh jdhVar;
        int i;
        long j;
        int i2;
        long j2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        int[] iArr;
        long length = tu7Var.getLength();
        long j3 = -1;
        int i6 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j4 = 4096;
        if (i6 != 0 && length <= 4096) {
            j4 = length;
        }
        int i7 = (int) j4;
        svd svdVar = new svd(64);
        int i8 = 0;
        int i9 = 0;
        boolean z4 = false;
        while (i9 < i7) {
            svdVar.C(8);
            if (!tu7Var.b(svdVar.a, i8, 8, true)) {
                break;
            }
            long v = svdVar.v();
            int g = svdVar.g();
            if (v == 1) {
                j = j3;
                tu7Var.o(svdVar.a, 8, 8);
                i4 = 16;
                svdVar.E(16);
                i2 = i9;
                j2 = svdVar.n();
                i3 = i6;
            } else {
                j = j3;
                if (v == 0) {
                    long length2 = tu7Var.getLength();
                    if (length2 != j) {
                        v = (length2 - tu7Var.g()) + 8;
                    }
                }
                long j5 = v;
                i2 = i9;
                j2 = j5;
                i3 = i6;
                i4 = 8;
            }
            long j6 = i4;
            jdhVar = null;
            if (j2 < j6) {
                return new uwn(23);
            }
            int i10 = i2 + i4;
            if (g == 1836019574) {
                i7 += (int) j2;
                if (i3 != 0 && i7 > length) {
                    i7 = (int) length;
                }
                i9 = i10;
                i6 = i3;
                j3 = j;
                i8 = 0;
            } else if (g != 1836019558 && g != 1836475768) {
                if (g == 1835295092) {
                    z4 = true;
                }
                long j7 = length;
                if ((i10 + j2) - j6 >= i7) {
                    i = 0;
                    break;
                }
                int i11 = (int) (j2 - j6);
                i9 = i10 + i11;
                if (g == 1718909296) {
                    if (i11 < 8) {
                        return new uwn(23);
                    }
                    svdVar.C(i11);
                    tu7Var.o(svdVar.a, 0, i11);
                    if (c(svdVar.g(), z2)) {
                        z4 = true;
                    }
                    svdVar.G(4);
                    int a = svdVar.a() / 4;
                    if (!z4 && a > 0) {
                        iArr = new int[a];
                        int i12 = 0;
                        while (true) {
                            if (i12 < a) {
                                int g2 = svdVar.g();
                                iArr[i12] = g2;
                                if (c(g2, z2)) {
                                    z3 = true;
                                    break;
                                }
                                i12++;
                            } else {
                                z3 = z4;
                                break;
                            }
                        }
                    } else {
                        z3 = z4;
                        iArr = null;
                    }
                    if (!z3) {
                        xvj xvjVar = new xvj(0);
                        if (iArr != null) {
                            if (iArr.length == 0) {
                                return xvjVar;
                            }
                            Arrays.copyOf(iArr, iArr.length);
                        }
                        return xvjVar;
                    }
                    i5 = 0;
                    z4 = z3;
                } else {
                    i5 = 0;
                    if (i11 != 0) {
                        tu7Var.h(i11);
                    }
                }
                i8 = i5;
                i6 = i3;
                j3 = j;
                length = j7;
            } else {
                i = 1;
                break;
            }
        }
        jdhVar = null;
        i = i8;
        if (!z4) {
            return ndg.l;
        }
        if (z != i) {
            if (i != 0) {
                return gdn.x;
            }
            return gdn.y;
        }
        return jdhVar;
    }

    public abstract String a();

    public String toString() {
        switch (this.a) {
            case 2:
                return a();
            default:
                return super.toString();
        }
    }
}
