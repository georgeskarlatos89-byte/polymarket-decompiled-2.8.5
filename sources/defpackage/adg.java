package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class adg extends RuntimeException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public adg(String str, Parcel parcel) {
        super(r2.toString());
        int dataPosition = parcel.dataPosition();
        int dataSize = parcel.dataSize();
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(dataPosition).length() + 6 + String.valueOf(dataSize).length());
        k84.l(dataPosition, str, " Parcel: pos=", " size=", sb);
        sb.append(dataSize);
    }
}
