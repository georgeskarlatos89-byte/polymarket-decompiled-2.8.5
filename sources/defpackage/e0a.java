package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class e0a implements Comparable, Serializable {
    public static final e0a c = new e0a(-31557014167219200L, 0);
    public static final e0a d = new e0a(31556889864403199L, 999999999);
    public final long a;
    public final int b;

    public e0a(long j, int i) {
        this.a = j;
        this.b = i;
        if (-31557014167219200L <= j && j < 31556889864403200L) {
            return;
        }
        dmk.v("Instant exceeds minimum or maximum instant");
        throw null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        e0a e0aVar = (e0a) obj;
        e0aVar.getClass();
        int e = Intrinsics.e(this.a, e0aVar.a);
        if (e != 0) {
            return e;
        }
        return Intrinsics.d(this.b, e0aVar.b);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e0a) {
                e0a e0aVar = (e0a) obj;
                if (this.a != e0aVar.a || this.b != e0aVar.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.b * 51) + Long.hashCode(this.a);
    }

    public final String toString() {
        long j;
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        long j2 = this.a;
        long j3 = j2 / 86400;
        if ((j2 ^ 86400) < 0 && j3 * 86400 != j2) {
            j3--;
        }
        long j4 = j2 % 86400;
        int i = (int) (j4 + (86400 & (((j4 ^ 86400) & ((-j4) | j4)) >> 63)));
        long j5 = 719468 + j3;
        if (j5 < 0) {
            long j6 = ((j3 + 719469) / 146097) - 1;
            j = j6 * 400;
            j5 += (-j6) * 146097;
        } else {
            j = 0;
        }
        long j7 = ((400 * j5) + 591) / 146097;
        long j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        if (j8 < 0) {
            j7--;
            j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        }
        int i2 = (int) j8;
        int i3 = ((i2 * 5) + 2) / 153;
        int i4 = ((i3 + 2) % 12) + 1;
        int i5 = (i2 - (((i3 * 306) + 5) / 10)) + 1;
        int i6 = (int) (j7 + j + (i3 / 10));
        int i7 = i / 3600;
        int i8 = i - (i7 * 3600);
        int i9 = i8 / 60;
        int i10 = i8 - (i9 * 60);
        int i11 = 0;
        if (Math.abs(i6) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (i6 >= 0) {
                sb2.append(i6 + 10000);
                sb2.deleteCharAt(0).getClass();
            } else {
                sb2.append(i6 - 10000);
                sb2.deleteCharAt(1).getClass();
            }
            sb.append((CharSequence) sb2);
        } else {
            if (i6 >= 10000) {
                sb.append('+');
            }
            sb.append(i6);
        }
        sb.append('-');
        d2m.c(sb, sb, i4);
        sb.append('-');
        d2m.c(sb, sb, i5);
        sb.append('T');
        d2m.c(sb, sb, i7);
        sb.append(':');
        d2m.c(sb, sb, i9);
        sb.append(':');
        d2m.c(sb, sb, i10);
        int i12 = this.b;
        if (i12 != 0) {
            sb.append('.');
            while (true) {
                int i13 = i11 + 1;
                iArr = d2m.a;
                if (i12 % iArr[i13] != 0) {
                    break;
                }
                i11 = i13;
            }
            int i14 = i11 - (i11 % 3);
            String valueOf = String.valueOf((i12 / iArr[i14]) + iArr[9 - i14]);
            valueOf.getClass();
            sb.append(valueOf.substring(1));
        }
        sb.append('Z');
        return sb.toString();
    }
}
