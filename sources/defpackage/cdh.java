package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class cdh implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ cdh(int i) {
        this.a = i;
    }

    public static ddh a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = cdh.class.getClassLoader();
        }
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new ddh();
        }
        wke d = nah.c.d();
        for (int i = 0; i < readInt; i++) {
            d.add(parcel.readValue(classLoader));
        }
        return new ddh(d.c());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return a(parcel, null);
            case 1:
                return new ci1(parcel, null);
            case 2:
                return new v65(parcel, null);
            case 3:
                return new e4c(parcel, null);
            case 4:
                return new smg(parcel, null);
            case 5:
                return new wvi(parcel, null);
            default:
                return new uak(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ddh[i];
            case 1:
                return new ci1[i];
            case 2:
                return new v65[i];
            case 3:
                return new e4c[i];
            case 4:
                return new smg[i];
            case 5:
                return new wvi[i];
            default:
                return new uak[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                return new ci1(parcel, classLoader);
            case 2:
                return new v65(parcel, classLoader);
            case 3:
                return new e4c(parcel, classLoader);
            case 4:
                return new smg(parcel, classLoader);
            case 5:
                return new wvi(parcel, classLoader);
            default:
                return new uak(parcel, classLoader);
        }
    }
}
