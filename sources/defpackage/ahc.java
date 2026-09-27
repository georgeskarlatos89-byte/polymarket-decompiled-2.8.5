package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.versionedparcelable.ParcelImpl;
import com.google.mlkit.common.MlKitException;
import com.stripe.android.financialconnections.model.OwnershipRefresh$Status;
import com.stripe.android.model.MobileFallbackWebviewParams$WebviewRequirementType;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class ahc implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ ahc(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [android.view.View$BaseSavedState, java.lang.Object, w1d] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        mzd valueOf;
        Integer valueOf2;
        Integer valueOf3;
        Integer num = null;
        nzd nzdVar = null;
        xzd xzdVar = null;
        boolean z3 = false;
        int i = 0;
        boolean z4 = false;
        switch (this.a) {
            case 0:
                parcel.getClass();
                if (parcel.readInt() != 0) {
                    z3 = true;
                }
                return new bhc(z3);
            case 1:
                parcel.getClass();
                return new chc(bhc.CREATOR.createFromParcel(parcel));
            case 2:
                parcel.getClass();
                return new ghc(MobileFallbackWebviewParams$WebviewRequirementType.valueOf(parcel.readString()), parcel.readString());
            case 3:
                return ikc.e(parcel.readInt(), parcel.readInt());
            case 4:
                parcel.getClass();
                return new lsc((ll9) parcel.readParcelable(lsc.class.getClassLoader()), cdj.valueOf(parcel.readString()));
            case 5:
                parcel.getClass();
                Integer num2 = null;
                bdb createFromParcel = bdb.CREATOR.createFromParcel(parcel);
                u7e createFromParcel2 = u7e.CREATOR.createFromParcel(parcel);
                q2g valueOf4 = q2g.valueOf(parcel.readString());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                wdb valueOf5 = wdb.valueOf(parcel.readString());
                n9b createFromParcel3 = n9b.CREATOR.createFromParcel(parcel);
                String readString3 = parcel.readString();
                lfb lfbVar = (lfb) parcel.readParcelable(tsc.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    num2 = Integer.valueOf(parcel.readInt());
                }
                return new tsc(createFromParcel, createFromParcel2, valueOf4, readString, readString2, valueOf5, createFromParcel3, readString3, lfbVar, num2);
            case 6:
                ?? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.a = parcel.readInt();
                return baseSavedState;
            case 7:
                parcel.getClass();
                return new b4d(parcel.readString());
            case 8:
                parcel.getClass();
                float readFloat = parcel.readFloat();
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                return new c6d(z4, readFloat);
            case 9:
                parcel.getClass();
                return new n6d(u7e.CREATOR.createFromParcel(parcel));
            case 10:
                parcel.getClass();
                parcel.readInt();
                return o6d.a;
            case 11:
                parcel.getClass();
                return new p6d(parcel.readString(), parcel.readInt(), parcel.readInt());
            case 12:
                parcel.getClass();
                parcel.readInt();
                return ved.INSTANCE;
            case 13:
                parcel.getClass();
                return new kpd(parcel.readInt(), OwnershipRefresh$Status.valueOf(parcel.readString()));
            case 14:
                parcel.getClass();
                return dud.valueOf(parcel.readString());
            case 15:
                parcel.getClass();
                return eud.valueOf(parcel.readString());
            case 16:
                return new ParcelImpl(parcel);
            case 17:
                return new gvd(parcel.readFloat());
            case MlKitException.UNSUPPORTED /* 18 */:
                return new hvd(parcel.readInt());
            case zh4.REMOTE_EXCEPTION /* 19 */:
                return new ivd(parcel.readLong());
            case 20:
                parcel.getClass();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                if (parcel.readInt() != 0) {
                    num = Integer.valueOf(parcel.readInt());
                }
                return new owd(readString4, readString5, num);
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                parcel.getClass();
                owd createFromParcel4 = owd.CREATOR.createFromParcel(parcel);
                String readString6 = parcel.readString();
                int readInt = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                while (i != readInt) {
                    i = sv6.b(parcel, linkedHashSet, i, 1);
                }
                return new rwd(createFromParcel4, readString6, linkedHashSet);
            case 22:
                parcel.getClass();
                return new swd((Throwable) parcel.readSerializable());
            case 23:
                parcel.getClass();
                return new twd(parcel.readString());
            case 24:
                parcel.getClass();
                return new vwd(owd.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.createStringArrayList());
            case 25:
                parcel.getClass();
                return new cxd(owd.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.createStringArrayList());
            case 26:
                parcel.getClass();
                parcel.readInt();
                return dxd.a;
            case 27:
                parcel.getClass();
                String readString7 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                String readString8 = parcel.readString();
                f0f f0fVar = (f0f) parcel.readParcelable(kzd.class.getClassLoader());
                f0f f0fVar2 = (f0f) parcel.readParcelable(kzd.class.getClassLoader());
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                if (parcel.readInt() != 0) {
                    xzdVar = xzd.CREATOR.createFromParcel(parcel);
                }
                return new kzd(readString7, z, readString8, f0fVar, f0fVar2, readString9, readString10, readString11, readString12, readString13, xzdVar, parcel.readString(), parcel.readString());
            case 28:
                parcel.getClass();
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int readInt2 = parcel.readInt();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = mzd.valueOf(parcel.readString());
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Integer.valueOf(parcel.readInt());
                }
                String readString14 = parcel.readString();
                if (parcel.readInt() != 0) {
                    nzdVar = nzd.CREATOR.createFromParcel(parcel);
                }
                return new lzd(z2, readInt2, valueOf, valueOf2, valueOf3, readString14, nzdVar);
            default:
                parcel.getClass();
                return new nzd(u0e.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new bhc[i];
            case 1:
                return new chc[i];
            case 2:
                return new ghc[i];
            case 3:
                return new ikc[i];
            case 4:
                return new lsc[i];
            case 5:
                return new tsc[i];
            case 6:
                return new w1d[i];
            case 7:
                return new b4d[i];
            case 8:
                return new c6d[i];
            case 9:
                return new n6d[i];
            case 10:
                return new o6d[i];
            case 11:
                return new p6d[i];
            case 12:
                return new ved[i];
            case 13:
                return new kpd[i];
            case 14:
                return new dud[i];
            case 15:
                return new eud[i];
            case 16:
                return new ParcelImpl[i];
            case 17:
                return new gvd[i];
            case MlKitException.UNSUPPORTED /* 18 */:
                return new hvd[i];
            case zh4.REMOTE_EXCEPTION /* 19 */:
                return new ivd[i];
            case 20:
                return new owd[i];
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return new rwd[i];
            case 22:
                return new swd[i];
            case 23:
                return new twd[i];
            case 24:
                return new vwd[i];
            case 25:
                return new cxd[i];
            case 26:
                return new dxd[i];
            case 27:
                return new kzd[i];
            case 28:
                return new lzd[i];
            default:
                return new nzd[i];
        }
    }
}
