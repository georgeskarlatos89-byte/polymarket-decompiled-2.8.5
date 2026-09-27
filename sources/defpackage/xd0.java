package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.b;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class xd0 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ xd0(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [android.view.View$BaseSavedState, xg0, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z = true;
        int i = 0;
        Object obj = null;
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new yd0(parcel.readString(), parcel.readString(), parcel.readString());
            case 1:
                ?? baseSavedState = new View.BaseSavedState(parcel);
                if (parcel.readByte() == 0) {
                    z = false;
                }
                baseSavedState.a = z;
                return baseSavedState;
            case 2:
                parcel.getClass();
                return new vh0(parcel.readString(), parcel.readInt());
            case 3:
                parcel.getClass();
                return new wh0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 4:
                parcel.getClass();
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                while (i != readInt) {
                    i = sv6.b(parcel, linkedHashSet, i, 1);
                }
                return new iq0(readString, linkedHashSet);
            case 5:
                parcel.getClass();
                parcel.readInt();
                return jq0.a;
            case 6:
                parcel.getClass();
                parcel.readInt();
                return kq0.a;
            case 7:
                parcel.getClass();
                return new lq0(parcel.readString());
            case 8:
                parcel.getClass();
                return new sq0(parcel.readString(), parcel.createStringArrayList());
            case 9:
                parcel.getClass();
                return new fs0((ll9) parcel.readParcelable(fs0.class.getClassLoader()));
            case 10:
                parcel.getClass();
                return new ks0((ll9) parcel.readParcelable(ks0.class.getClassLoader()));
            case 11:
                parcel.getClass();
                return new mu0(parcel.readString(), llg.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 12:
                parcel.getClass();
                parcel.readInt();
                return pz0.a;
            case 13:
                parcel.getClass();
                return new qz0(pce.CREATOR.createFromParcel(parcel));
            case 14:
                parcel.getClass();
                return new tz0(parcel.readString(), parcel.readString(), parcel.readString(), (rz0) parcel.readParcelable(tz0.class.getClassLoader()));
            case 15:
                parcel.getClass();
                String readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    obj = ece.CREATOR.createFromParcel(parcel);
                }
                return new uz0(readString2, (ece) obj);
            case 16:
                parcel.getClass();
                String readString3 = parcel.readString();
                if (parcel.readInt() != 0) {
                    obj = ece.CREATOR.createFromParcel(parcel);
                }
                return new vz0(readString3, (ece) obj);
            case 17:
                parcel.getClass();
                if (parcel.readInt() != 0) {
                    obj = ece.CREATOR.createFromParcel(parcel);
                }
                return new xz0((ece) obj);
            case MlKitException.UNSUPPORTED /* 18 */:
                parcel.getClass();
                if (parcel.readInt() != 0) {
                    obj = ece.CREATOR.createFromParcel(parcel);
                }
                return new yz0((ece) obj);
            case zh4.REMOTE_EXCEPTION /* 19 */:
                parcel.getClass();
                int readInt2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = woa.e(k01.CREATOR, parcel, arrayList, i, 1);
                }
                return new b01(arrayList, parcel.readString());
            case 20:
                parcel.getClass();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                if (parcel.readInt() != 0) {
                    obj = u8i.CREATOR.createFromParcel(parcel);
                }
                return new k01(readString4, readString5, readString6, (u8i) obj);
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return new b(parcel);
            case 22:
                return new z21(parcel);
            case 23:
                parcel.getClass();
                return new x31((c7e) parcel.readParcelable(x31.class.getClassLoader()), (e8e) parcel.readParcelable(x31.class.getClassLoader()));
            case 24:
                parcel.getClass();
                parcel.readInt();
                return new b41();
            case 25:
                parcel.getClass();
                parcel.readInt();
                return new e41();
            case 26:
                parcel.getClass();
                return new o41(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), pce.CREATOR.createFromParcel(parcel));
            case 27:
                parcel.getClass();
                parcel.readInt();
                return r41.a;
            case 28:
                parcel.getClass();
                parcel.readInt();
                return s41.a;
            default:
                parcel.getClass();
                parcel.readInt();
                return t41.a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new yd0[i];
            case 1:
                return new xg0[i];
            case 2:
                return new vh0[i];
            case 3:
                return new wh0[i];
            case 4:
                return new iq0[i];
            case 5:
                return new jq0[i];
            case 6:
                return new kq0[i];
            case 7:
                return new lq0[i];
            case 8:
                return new sq0[i];
            case 9:
                return new fs0[i];
            case 10:
                return new ks0[i];
            case 11:
                return new mu0[i];
            case 12:
                return new pz0[i];
            case 13:
                return new qz0[i];
            case 14:
                return new tz0[i];
            case 15:
                return new uz0[i];
            case 16:
                return new vz0[i];
            case 17:
                return new xz0[i];
            case MlKitException.UNSUPPORTED /* 18 */:
                return new yz0[i];
            case zh4.REMOTE_EXCEPTION /* 19 */:
                return new b01[i];
            case 20:
                return new k01[i];
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return new b[i];
            case 22:
                return new z21[i];
            case 23:
                return new x31[i];
            case 24:
                return new b41[i];
            case 25:
                return new e41[i];
            case 26:
                return new o41[i];
            case 27:
                return new r41[i];
            case 28:
                return new s41[i];
            default:
                return new t41[i];
        }
    }
}
