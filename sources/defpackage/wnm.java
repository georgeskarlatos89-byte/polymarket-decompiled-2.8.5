package defpackage;

import kotlin.jvm.functions.Function1;
import skip.lib.Duration;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class wnm {
    public static final long a(float f, float f2) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        int i = hbj.c;
        return floatToRawIntBits;
    }

    public static e0a b(int i, long j) {
        long j2 = i;
        long j3 = j2 / Duration.ATTOSECONDS_PER_NANOSECOND;
        if ((j2 ^ Duration.ATTOSECONDS_PER_NANOSECOND) < 0 && j3 * Duration.ATTOSECONDS_PER_NANOSECOND != j2) {
            j3--;
        }
        long j4 = j + j3;
        if ((j ^ j4) < 0 && (j3 ^ j) >= 0) {
            if (j > 0) {
                return e0a.d;
            }
            return e0a.c;
        }
        if (j4 < -31557014167219200L) {
            return e0a.c;
        }
        if (j4 > 31556889864403199L) {
            return e0a.d;
        }
        long j5 = j2 % Duration.ATTOSECONDS_PER_NANOSECOND;
        return new e0a(j4, (int) (j5 + ((((j5 ^ Duration.ATTOSECONDS_PER_NANOSECOND) & ((-j5) | j5)) >> 63) & Duration.ATTOSECONDS_PER_NANOSECOND)));
    }

    public static final kjc c(kjc kjcVar, Function1 function1) {
        return kjcVar.e(new qid(function1));
    }
}
