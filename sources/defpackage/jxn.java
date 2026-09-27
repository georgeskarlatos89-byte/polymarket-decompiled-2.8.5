package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class jxn {
    public static final int a(long j, long j2) {
        boolean f = f(j);
        if (f != f(j2)) {
            if (!f) {
                return 1;
            }
            return -1;
        }
        int signum = (int) Math.signum(d(j) - d(j2));
        if (Math.min(d(j), d(j2)) >= 0.0f && e(j) != e(j2)) {
            if (!e(j)) {
                return 1;
            }
            return -1;
        }
        return signum;
    }

    public static bdg b(byte[] bArr, Parcelable.Creator creator) {
        arn.h(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        bdg bdgVar = (bdg) creator.createFromParcel(obtain);
        obtain.recycle();
        return bdgVar;
    }

    public static bdg c(Intent intent, String str, Parcelable.Creator creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return b(byteArrayExtra, creator);
    }

    public static final float d(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final boolean e(long j) {
        if ((j & 2) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean f(long j) {
        if ((j & 1) != 0) {
            return true;
        }
        return false;
    }
}
