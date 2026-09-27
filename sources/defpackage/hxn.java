package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Display;
import android.view.RoundedCorner;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class hxn {
    public static pag a(Display display, int i) {
        int i2;
        RoundedCorner roundedCorner = display.getRoundedCorner(i);
        if (roundedCorner == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        dmk.v(ace.f(position, "Invalid position: "));
                        return null;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        return new pag(i2, roundedCorner.getRadius(), roundedCorner.getCenter());
    }

    public static void b(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int p = p(parcel, i);
        parcel.writeBundle(bundle);
        q(parcel, p);
    }

    public static void c(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int p = p(parcel, i);
        parcel.writeByteArray(bArr);
        q(parcel, p);
    }

    public static void d(Parcel parcel, int i, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int p = p(parcel, i);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        q(parcel, p);
    }

    public static void e(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int p = p(parcel, i);
        parcel.writeStrongBinder(iBinder);
        q(parcel, p);
    }

    public static void f(Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int p = p(parcel, i);
        parcel.writeIntArray(iArr);
        q(parcel, p);
    }

    public static void g(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int p = p(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(((Integer) list.get(i2)).intValue());
        }
        q(parcel, p);
    }

    public static void h(Parcel parcel, int i, Integer num) {
        if (num == null) {
            return;
        }
        o(parcel, i, 4);
        parcel.writeInt(num.intValue());
    }

    public static void i(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int p = p(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        q(parcel, p);
    }

    public static void j(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int p = p(parcel, i);
        parcel.writeString(str);
        q(parcel, p);
    }

    public static void k(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int p = p(parcel, i);
        parcel.writeStringArray(strArr);
        q(parcel, p);
    }

    public static void l(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int p = p(parcel, i);
        parcel.writeStringList(list);
        q(parcel, p);
    }

    public static void m(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int p = p(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        q(parcel, p);
    }

    public static void n(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int p = p(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        q(parcel, p);
    }

    public static void o(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static int p(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void q(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }
}
