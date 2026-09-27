package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.mlkit.common.MlKitException;
import java.security.KeyPair;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class hl9 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ hl9(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z = false;
        boolean z2 = false;
        Bundle bundle = null;
        si6 si6Var = null;
        si6 si6Var2 = null;
        switch (this.a) {
            case 0:
                parcel.getClass();
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt2);
                for (int i = 0; i != readInt2; i++) {
                    arrayList.add(parcel.readParcelable(il9.class.getClassLoader()));
                }
                int readInt3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt3);
                for (int i2 = 0; i2 != readInt3; i2++) {
                    arrayList2.add(parcel.readValue(il9.class.getClassLoader()));
                }
                return new il9(readInt, arrayList, arrayList2);
            case 1:
                parcel.getClass();
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                return new ll9(readString, z2, (fud) parcel.readParcelable(ll9.class.getClassLoader()));
            case 2:
                int v = fxn.v(parcel);
                while (parcel.dataPosition() < v) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 1) {
                        fxn.u(parcel, readInt4);
                    } else {
                        bundle = fxn.a(parcel, readInt4);
                    }
                }
                fxn.l(parcel, v);
                return new cs9(bundle);
            case 3:
                parcel.getClass();
                return new xs9(parcel.readString());
            case 4:
                parcel.getClass();
                return new ys9(parcel.readString());
            case 5:
                parcel.getClass();
                return new zs9(parcel.readString());
            case 6:
                parcel.getClass();
                return new bv9(parcel.readString(), (KeyPair) parcel.readSerializable(), cd3.CREATOR.createFromParcel(parcel), parcel.readInt(), w3a.CREATOR.createFromParcel(parcel));
            case 7:
                parcel.getClass();
                return new cv9((zd3) parcel.readParcelable(cv9.class.getClassLoader()));
            case 8:
                parcel.getClass();
                return new dv9(ce3.CREATOR.createFromParcel(parcel));
            case 9:
                parcel.getClass();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                return new h0a(readString2, readString3, readString4, z);
            case 10:
                parcel.getClass();
                return new v1a(parcel.readString(), parcel.readString(), n14.CREATOR.createFromParcel(parcel));
            case 11:
                parcel.getClass();
                parcel.readInt();
                return w1a.a;
            case 12:
                parcel.getClass();
                return new y1a(x1a.valueOf(parcel.readString()));
            case 13:
                parcel.getClass();
                return new z1a(bee.CREATOR.createFromParcel(parcel));
            case 14:
                parcel.getClass();
                return new a2a(bee.CREATOR.createFromParcel(parcel));
            case 15:
                parcel.getClass();
                return new b2a(bee.CREATOR.createFromParcel(parcel));
            case 16:
                parcel.getClass();
                return new d2a(parcel.readString());
            case 17:
                parcel.getClass();
                parcel.readInt();
                return e2a.a;
            case MlKitException.UNSUPPORTED /* 18 */:
                parcel.getClass();
                return new a3a(parcel.readString());
            case zh4.REMOTE_EXCEPTION /* 19 */:
                parcel.getClass();
                return new b3a(parcel.readString(), (Throwable) parcel.readSerializable());
            case 20:
                parcel.getClass();
                return new c3a(parcel.readString());
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                parcel.getClass();
                return new i3a(parcel.readString(), parcel.createStringArrayList(), (c8i) parcel.readParcelable(i3a.class.getClassLoader()), parcel.readString());
            case 22:
                parcel.getClass();
                zt4 zt4Var = (zt4) parcel.readParcelable(q3a.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    si6Var2 = si6.valueOf(parcel.readString());
                }
                return new q3a(zt4Var, si6Var2);
            case 23:
                parcel.getClass();
                c8i c8iVar = (c8i) parcel.readParcelable(r3a.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    si6Var = si6.valueOf(parcel.readString());
                }
                return new r3a(c8iVar, si6Var);
            case 24:
                parcel.getClass();
                return new w3a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 25:
                parcel.getClass();
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                readParcelable.getClass();
                return new z3a((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 26:
                parcel.getClass();
                parcel.readInt();
                return q5a.a;
            case 27:
                parcel.getClass();
                parcel.readInt();
                return r5a.a;
            case 28:
                parcel.getClass();
                return new s5a((Throwable) parcel.readSerializable());
            default:
                parcel.getClass();
                return new u5a((ybe) parcel.readParcelable(u5a.class.getClassLoader()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new il9[i];
            case 1:
                return new ll9[i];
            case 2:
                return new cs9[i];
            case 3:
                return new xs9[i];
            case 4:
                return new ys9[i];
            case 5:
                return new zs9[i];
            case 6:
                return new bv9[i];
            case 7:
                return new cv9[i];
            case 8:
                return new dv9[i];
            case 9:
                return new h0a[i];
            case 10:
                return new v1a[i];
            case 11:
                return new w1a[i];
            case 12:
                return new y1a[i];
            case 13:
                return new z1a[i];
            case 14:
                return new a2a[i];
            case 15:
                return new b2a[i];
            case 16:
                return new d2a[i];
            case 17:
                return new e2a[i];
            case MlKitException.UNSUPPORTED /* 18 */:
                return new a3a[i];
            case zh4.REMOTE_EXCEPTION /* 19 */:
                return new b3a[i];
            case 20:
                return new c3a[i];
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return new i3a[i];
            case 22:
                return new q3a[i];
            case 23:
                return new r3a[i];
            case 24:
                return new w3a[i];
            case 25:
                return new z3a[i];
            case 26:
                return new q5a[i];
            case 27:
                return new r5a[i];
            case 28:
                return new s5a[i];
            default:
                return new u5a[i];
        }
    }
}
