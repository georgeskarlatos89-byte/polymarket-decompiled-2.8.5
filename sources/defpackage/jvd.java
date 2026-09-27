package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class jvd implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ jvd(int i) {
        this.a = i;
    }

    public static kvd a(Parcel parcel, ClassLoader classLoader) {
        zch zchVar;
        if (classLoader == null) {
            classLoader = jvd.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt != 0) {
            if (readInt != 1) {
                if (readInt == 2) {
                    zchVar = nim.p;
                } else {
                    dmk.n(sv6.j(readInt, "Unsupported MutableState policy ", " was restored"));
                    return null;
                }
            } else {
                zchVar = vwb.q;
            }
        } else {
            zchVar = vwb.l;
        }
        return new kvd(readValue, zchVar);
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [android.view.View$BaseSavedState, java.lang.Object, dbk] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return a(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return l0.b;
                }
                dmk.n("superState must be null");
                return null;
            case 2:
                return new gy3(parcel, null);
            case 3:
                return new gm8(parcel, null);
            case 4:
                return new btf(parcel, null);
            case 5:
                return new b6h(parcel, null);
            case 6:
                return new h5j(parcel, null);
            default:
                ?? baseSavedState = new View.BaseSavedState(parcel, null);
                baseSavedState.a = parcel.readInt();
                baseSavedState.b = parcel.readInt();
                baseSavedState.c = parcel.readParcelable(null);
                return baseSavedState;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new kvd[i];
            case 1:
                return new l0[i];
            case 2:
                return new gy3[i];
            case 3:
                return new gm8[i];
            case 4:
                return new btf[i];
            case 5:
                return new b6h[i];
            case 6:
                return new h5j[i];
            default:
                return new dbk[i];
        }
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [android.view.View$BaseSavedState, java.lang.Object, dbk] */
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return l0.b;
                }
                dmk.n("superState must be null");
                return null;
            case 2:
                return new gy3(parcel, classLoader);
            case 3:
                return new gm8(parcel, classLoader);
            case 4:
                return new btf(parcel, classLoader);
            case 5:
                return new b6h(parcel, classLoader);
            case 6:
                return new h5j(parcel, classLoader);
            default:
                ?? baseSavedState = new View.BaseSavedState(parcel, classLoader);
                baseSavedState.a = parcel.readInt();
                baseSavedState.b = parcel.readInt();
                baseSavedState.c = parcel.readParcelable(classLoader);
                return baseSavedState;
        }
    }
}
