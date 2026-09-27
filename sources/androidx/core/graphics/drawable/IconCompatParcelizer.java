package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dmk;
import defpackage.k7k;
import defpackage.l7k;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.core.graphics.drawable.IconCompat, java.lang.Object] */
    public static IconCompat read(k7k k7kVar) {
        int readInt;
        ?? obj = new Object();
        obj.a = -1;
        obj.c = null;
        obj.d = null;
        obj.e = 0;
        obj.f = 0;
        obj.g = null;
        obj.h = IconCompat.k;
        obj.i = null;
        if (!k7kVar.e(1)) {
            readInt = -1;
        } else {
            readInt = ((l7k) k7kVar).e.readInt();
        }
        obj.a = readInt;
        byte[] bArr = obj.c;
        if (k7kVar.e(2)) {
            Parcel parcel = ((l7k) k7kVar).e;
            int readInt2 = parcel.readInt();
            if (readInt2 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt2];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        obj.c = bArr;
        obj.d = k7kVar.f(obj.d, 3);
        int i = obj.e;
        if (k7kVar.e(4)) {
            i = ((l7k) k7kVar).e.readInt();
        }
        obj.e = i;
        int i2 = obj.f;
        if (k7kVar.e(5)) {
            i2 = ((l7k) k7kVar).e.readInt();
        }
        obj.f = i2;
        obj.g = (ColorStateList) k7kVar.f(obj.g, 6);
        String str = obj.i;
        if (k7kVar.e(7)) {
            str = ((l7k) k7kVar).e.readString();
        }
        obj.i = str;
        String str2 = obj.j;
        if (k7kVar.e(8)) {
            str2 = ((l7k) k7kVar).e.readString();
        }
        obj.j = str2;
        obj.h = PorterDuff.Mode.valueOf(obj.i);
        switch (obj.a) {
            case -1:
                Parcelable parcelable = obj.d;
                if (parcelable != null) {
                    obj.b = parcelable;
                    return obj;
                }
                dmk.v("Invalid icon");
                return null;
            case 0:
            default:
                return obj;
            case 1:
            case 5:
                Parcelable parcelable2 = obj.d;
                if (parcelable2 != null) {
                    obj.b = parcelable2;
                    return obj;
                }
                byte[] bArr3 = obj.c;
                obj.b = bArr3;
                obj.a = 3;
                obj.e = 0;
                obj.f = bArr3.length;
                return obj;
            case 2:
            case 4:
            case 6:
                String str3 = new String(obj.c, Charset.forName("UTF-16"));
                obj.b = str3;
                if (obj.a == 2 && obj.j == null) {
                    obj.j = str3.split(":", -1)[0];
                }
                return obj;
            case 3:
                obj.b = obj.c;
                return obj;
        }
    }

    public static void write(IconCompat iconCompat, k7k k7kVar) {
        k7kVar.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            k7kVar.h(1);
            ((l7k) k7kVar).e.writeInt(i);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            k7kVar.h(2);
            Parcel parcel = ((l7k) k7kVar).e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            k7kVar.h(3);
            ((l7k) k7kVar).e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            k7kVar.h(4);
            ((l7k) k7kVar).e.writeInt(i2);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            k7kVar.h(5);
            ((l7k) k7kVar).e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            k7kVar.h(6);
            ((l7k) k7kVar).e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            k7kVar.h(7);
            ((l7k) k7kVar).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            k7kVar.h(8);
            ((l7k) k7kVar).e.writeString(str2);
        }
    }
}
