package defpackage;

import android.os.BadParcelableException;
import android.os.Parcel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class oil {
    public static final /* synthetic */ int a = 0;

    static {
        oil.class.getClassLoader();
    }

    public static void a(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
        } else {
            throw new BadParcelableException(hdi.l(dataAvail, "Parcel data not fully consumed, unread size: ", new StringBuilder(String.valueOf(dataAvail).length() + 45)));
        }
    }
}
