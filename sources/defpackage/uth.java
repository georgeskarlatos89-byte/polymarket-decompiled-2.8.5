package defpackage;

import android.text.TextUtils;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class uth {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    /* JADX WARN: Type inference failed for: r0v5, types: [uth, java.lang.Object] */
    public static uth b(String str) {
        char c;
        pfn.b(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < split.length; i5++) {
            String c2 = lfn.c(split[i5].trim());
            c2.getClass();
            switch (c2.hashCode()) {
                case 100571:
                    if (c2.equals("end")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3556653:
                    if (c2.equals("text")) {
                        c = 1;
                        break;
                    }
                    break;
                case 109757538:
                    if (c2.equals(OpsMetricTracker.START)) {
                        c = 2;
                        break;
                    }
                    break;
                case 109780401:
                    if (c2.equals("style")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            c = 65535;
            switch (c) {
                case 0:
                    i2 = i5;
                    break;
                case 1:
                    i3 = i5;
                    break;
                case 2:
                    i = i5;
                    break;
                case 3:
                    i4 = i5;
                    break;
            }
        }
        if (i != -1 && i2 != -1 && i3 != -1) {
            int length = split.length;
            ?? obj = new Object();
            obj.a = i;
            obj.b = i2;
            obj.c = i4;
            obj.d = i3;
            obj.e = length;
            return obj;
        }
        return null;
    }

    public boolean a() {
        int i;
        int i2;
        int i3;
        int i4 = this.a;
        int i5 = 2;
        if ((i4 & 7) != 0) {
            int i6 = this.d;
            int i7 = this.b;
            if (i6 > i7) {
                i3 = 1;
            } else if (i6 == i7) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            if ((i3 & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 112) != 0) {
            int i8 = this.d;
            int i9 = this.c;
            if (i8 > i9) {
                i2 = 1;
            } else if (i8 == i9) {
                i2 = 2;
            } else {
                i2 = 4;
            }
            if (((i2 << 4) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 1792) != 0) {
            int i10 = this.e;
            int i11 = this.b;
            if (i10 > i11) {
                i = 1;
            } else if (i10 == i11) {
                i = 2;
            } else {
                i = 4;
            }
            if (((i << 8) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 28672) != 0) {
            int i12 = this.e;
            int i13 = this.c;
            if (i12 > i13) {
                i5 = 1;
            } else if (i12 != i13) {
                i5 = 4;
            }
            if (((i5 << 12) & i4) == 0) {
                return false;
            }
        }
        return true;
    }
}
