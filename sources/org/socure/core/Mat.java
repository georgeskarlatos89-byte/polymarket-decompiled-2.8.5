package org.socure.core;

import com.appsflyer.internal.l;
import defpackage.ace;
import defpackage.bd0;
import defpackage.py2;
import io.ably.lib.rest.Auth;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class Mat {
    public final long a;

    public Mat(long j) {
        if (j != 0) {
            this.a = j;
        } else {
            py2.f("Native object address is NULL");
            throw null;
        }
    }

    private static native int nGetD(long j, int i, int i2, int i3, double[] dArr);

    private static native int nGetF(long j, int i, int i2, int i3, float[] fArr);

    private static native int nGetI(long j, int i, int i2, int i3, int[] iArr);

    private static native int nPutF(long j, int i, int i2, int i3, float[] fArr);

    private static native long n_Mat();

    private static native long n_Mat(int i, int i2, int i3);

    private static native long n_Mat(long j, int i, int i2);

    private static native int n_checkVector(long j, int i, int i2);

    private static native int n_cols(long j);

    private static native void n_create(long j, int i, int i2, int i3);

    private static native void n_delete(long j);

    private static native boolean n_empty(long j);

    private static native void n_release(long j);

    private static native int n_rows(long j);

    private static native double[] n_size(long j);

    private static native long n_total(long j);

    private static native int n_type(long j);

    public final int a() {
        return n_checkVector(this.a, 1, 6);
    }

    public final void b(int i, int i2) {
        n_create(this.a, i, 1, i2);
    }

    public final void c(double[] dArr) {
        int n_type = n_type(this.a);
        int length = dArr.length;
        int i = a.a;
        int i2 = (n_type >> 3) + 1;
        if (length % i2 == 0) {
            if ((n_type & 7) == 6) {
                nGetD(this.a, 0, 0, dArr.length, dArr);
                return;
            } else {
                py2.f(ace.f(n_type, "Mat data type is not compatible: "));
                return;
            }
        }
        l.i(dArr.length, i2);
    }

    public final void d(float[] fArr) {
        int n_type = n_type(this.a);
        int length = fArr.length;
        int i = a.a;
        int i2 = (n_type >> 3) + 1;
        if (length % i2 == 0) {
            if ((n_type & 7) == 5) {
                nGetF(this.a, 0, 0, fArr.length, fArr);
                return;
            } else {
                py2.f(ace.f(n_type, "Mat data type is not compatible: "));
                return;
            }
        }
        l.i(fArr.length, i2);
    }

    public final void e(int[] iArr) {
        int n_type = n_type(this.a);
        int length = iArr.length;
        int i = a.a;
        int i2 = (n_type >> 3) + 1;
        if (length % i2 == 0) {
            if ((n_type & 7) == 4) {
                nGetI(this.a, 0, 0, iArr.length, iArr);
                return;
            } else {
                py2.f(ace.f(n_type, "Mat data type is not compatible: "));
                return;
            }
        }
        l.i(iArr.length, i2);
    }

    public final int f() {
        return n_cols(this.a);
    }

    public final void finalize() {
        n_delete(this.a);
        super.finalize();
    }

    public final void g(float[] fArr) {
        int n_type = n_type(this.a);
        int length = fArr.length;
        int i = a.a;
        int i2 = (n_type >> 3) + 1;
        if (length % i2 == 0) {
            if ((n_type & 7) == 5) {
                nPutF(this.a, 0, 0, fArr.length, fArr);
                return;
            } else {
                py2.f(ace.f(n_type, "Mat data type is not compatible: "));
                return;
            }
        }
        l.i(fArr.length, i2);
    }

    public final boolean h() {
        return n_empty(this.a);
    }

    public final void i() {
        n_release(this.a);
    }

    public final int j() {
        return n_rows(this.a);
    }

    public final f k() {
        return new f(n_size(this.a));
    }

    public final long l() {
        return n_total(this.a);
    }

    public final int m() {
        return n_type(this.a);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Mat [ ");
        long j = this.a;
        sb.append(n_rows(j));
        sb.append(Auth.WILDCARD_CLIENTID);
        sb.append(n_cols(j));
        sb.append(", ");
        int n_type = n_type(j);
        int i = a.a;
        switch (n_type & 7) {
            case 0:
                str = "CV_8U";
                break;
            case 1:
                str = "CV_8S";
                break;
            case 2:
                str = "CV_16U";
                break;
            case 3:
                str = "CV_16S";
                break;
            case 4:
                str = "CV_32S";
                break;
            case 5:
                str = "CV_32F";
                break;
            case 6:
                str = "CV_64F";
                break;
            case 7:
                str = "CV_16F";
                break;
            default:
                py2.f(ace.f(n_type, "Unsupported CvType value: "));
                return null;
        }
        int i2 = (n_type >> 3) + 1;
        if (i2 <= 4) {
            str2 = str + "C" + i2;
        } else {
            str2 = str + "C(" + i2 + ")";
        }
        sb.append(str2);
        sb.append(", nativeObj=0x");
        sb.append(Long.toHexString(j));
        sb.append(" ]");
        return sb.toString();
    }

    public Mat() {
        this.a = n_Mat();
    }

    public Mat(int i) {
        this.a = n_Mat(1, 1, 6);
    }

    public Mat(Mat mat) {
        this.a = n_Mat(mat.a, Integer.MIN_VALUE, bd0.API_PRIORITY_OTHER);
    }
}
