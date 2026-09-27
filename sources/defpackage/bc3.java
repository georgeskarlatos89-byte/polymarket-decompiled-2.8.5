package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class bc3 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ bc3(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Boolean valueOf;
        Boolean valueOf2;
        fd3 valueOf3;
        ArrayList arrayList;
        boolean z;
        Boolean valueOf4;
        boolean z2;
        Boolean valueOf5;
        Boolean valueOf6;
        qtj valueOf7;
        boolean z3;
        boolean z4;
        ArrayList arrayList2;
        qd3 createFromParcel;
        ArrayList arrayList3;
        qd3 createFromParcel2;
        qtj valueOf8;
        qtj valueOf9;
        qtj valueOf10;
        qtj valueOf11;
        qtj valueOf12;
        qtj valueOf13;
        switch (this.a) {
            case 0:
                parcel.getClass();
                parcel.readInt();
                return cc3.a;
            case 1:
                parcel.getClass();
                return new dc3(parcel.readString());
            case 2:
                boolean z5 = true;
                parcel.getClass();
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    if (parcel.readInt() == 0) {
                        z5 = false;
                    }
                    valueOf = Boolean.valueOf(z5);
                }
                return new ec3(readString, valueOf);
            case 3:
                boolean z6 = true;
                parcel.getClass();
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    if (parcel.readInt() == 0) {
                        z6 = false;
                    }
                    valueOf2 = Boolean.valueOf(z6);
                }
                return new fc3(valueOf2);
            case 4:
                parcel.getClass();
                parcel.readInt();
                return gc3.a;
            case 5:
                parcel.getClass();
                return new cd3(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 6:
                parcel.getClass();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                llg createFromParcel3 = llg.CREATOR.createFromParcel(parcel);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = fd3.valueOf(parcel.readString());
                }
                String readString7 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = woa.e(fdc.CREATOR, parcel, arrayList4, i, 1);
                    }
                    arrayList = arrayList4;
                }
                boolean z7 = true;
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    valueOf4 = Boolean.valueOf(z);
                }
                if (parcel.readInt() == 0) {
                    valueOf5 = null;
                } else {
                    if (parcel.readInt() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    valueOf5 = Boolean.valueOf(z2);
                }
                if (parcel.readInt() == 0) {
                    valueOf6 = null;
                } else {
                    if (parcel.readInt() == 0) {
                        z7 = false;
                    }
                    valueOf6 = Boolean.valueOf(z7);
                }
                return new gd3(readString2, readString3, readString4, createFromParcel3, readString5, readString6, valueOf3, readString7, arrayList, valueOf4, valueOf5, valueOf6);
            case 7:
                parcel.getClass();
                return new id3((n96) parcel.readSerializable(), parcel.readString(), gd3.CREATOR.createFromParcel(parcel), parcel.readString(), hd3.CREATOR.createFromParcel(parcel));
            case 8:
                parcel.getClass();
                return new hd3(parcel.createByteArray(), parcel.createByteArray());
            case 9:
                parcel.getClass();
                return new kd3(oi7.CREATOR.createFromParcel(parcel));
            case 10:
                parcel.getClass();
                return new ld3((Throwable) parcel.readSerializable());
            case 11:
                parcel.getClass();
                return new md3(gd3.CREATOR.createFromParcel(parcel), rd3.CREATOR.createFromParcel(parcel), id3.CREATOR.createFromParcel(parcel));
            case 12:
                parcel.getClass();
                return new nd3(oi7.CREATOR.createFromParcel(parcel));
            case 13:
                parcel.getClass();
                return new pd3(parcel.readString(), parcel.readString());
            case 14:
                parcel.getClass();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf7 = null;
                } else {
                    valueOf7 = qtj.valueOf(parcel.readString());
                }
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int readInt2 = parcel.readInt();
                    arrayList2 = new ArrayList(readInt2);
                    int i2 = 0;
                    while (i2 != readInt2) {
                        i2 = woa.e(pd3.CREATOR, parcel, arrayList2, i2, 1);
                        readInt2 = readInt2;
                    }
                }
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                if (parcel.readInt() == 0) {
                    createFromParcel = null;
                } else {
                    createFromParcel = qd3.CREATOR.createFromParcel(parcel);
                }
                qd3 qd3Var = createFromParcel;
                if (parcel.readInt() == 0) {
                    arrayList3 = null;
                } else {
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList5 = new ArrayList(readInt3);
                    int i3 = 0;
                    while (i3 != readInt3) {
                        i3 = woa.e(fdc.CREATOR, parcel, arrayList5, i3, 1);
                        readInt3 = readInt3;
                        arrayList2 = arrayList2;
                    }
                    arrayList3 = arrayList5;
                }
                ArrayList arrayList6 = arrayList2;
                String readString18 = parcel.readString();
                String readString19 = parcel.readString();
                String readString20 = parcel.readString();
                String readString21 = parcel.readString();
                if (parcel.readInt() == 0) {
                    createFromParcel2 = null;
                } else {
                    createFromParcel2 = qd3.CREATOR.createFromParcel(parcel);
                }
                return new rd3(readString8, readString9, readString10, readString11, valueOf7, z3, readString12, readString13, readString14, readString15, z4, arrayList6, readString16, readString17, qd3Var, arrayList3, readString18, readString19, readString20, readString21, createFromParcel2, parcel.readString(), llg.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 15:
                parcel.getClass();
                return new qd3(parcel.readString(), parcel.readString(), parcel.readString());
            case 16:
                parcel.getClass();
                String readString22 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf8 = null;
                } else {
                    valueOf8 = qtj.valueOf(parcel.readString());
                }
                return new td3(readString22, valueOf8, w3a.CREATOR.createFromParcel(parcel));
            case 17:
                parcel.getClass();
                String readString23 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf9 = null;
                } else {
                    valueOf9 = qtj.valueOf(parcel.readString());
                }
                return new ud3(readString23, valueOf9, w3a.CREATOR.createFromParcel(parcel));
            case MlKitException.UNSUPPORTED /* 18 */:
                parcel.getClass();
                oi7 createFromParcel4 = oi7.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    valueOf10 = null;
                } else {
                    valueOf10 = qtj.valueOf(parcel.readString());
                }
                return new vd3(createFromParcel4, valueOf10, w3a.CREATOR.createFromParcel(parcel));
            case zh4.REMOTE_EXCEPTION /* 19 */:
                parcel.getClass();
                Throwable th = (Throwable) parcel.readSerializable();
                if (parcel.readInt() == 0) {
                    valueOf11 = null;
                } else {
                    valueOf11 = qtj.valueOf(parcel.readString());
                }
                return new wd3(th, valueOf11, w3a.CREATOR.createFromParcel(parcel));
            case 20:
                parcel.getClass();
                String readString24 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf12 = null;
                } else {
                    valueOf12 = qtj.valueOf(parcel.readString());
                }
                return new xd3(readString24, valueOf12, w3a.CREATOR.createFromParcel(parcel));
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                parcel.getClass();
                String readString25 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf13 = null;
                } else {
                    valueOf13 = qtj.valueOf(parcel.readString());
                }
                return new yd3(readString25, valueOf13, w3a.CREATOR.createFromParcel(parcel));
            case 22:
                parcel.getClass();
                return new ce3(rd3.CREATOR.createFromParcel(parcel), gd3.CREATOR.createFromParcel(parcel), (o9i) parcel.readParcelable(ce3.class.getClassLoader()), id3.CREATOR.createFromParcel(parcel), (d6i) parcel.readSerializable(), parcel.readInt(), w3a.CREATOR.createFromParcel(parcel));
            case 23:
                parcel.getClass();
                parcel.readInt();
                return bz3.a;
            case 24:
                parcel.getClass();
                parcel.readInt();
                return cz3.a;
            case 25:
                parcel.getClass();
                return new dz3(parcel.readFloat());
            case 26:
                parcel.getClass();
                return new ez3(parcel.readLong());
            case 27:
                parcel.getClass();
                return new fz3(parcel.readLong());
            case 28:
                parcel.getClass();
                return new iz3(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            default:
                parcel.getClass();
                String readString26 = parcel.readString();
                long readLong = parcel.readLong();
                String readString27 = parcel.readString();
                int readInt4 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = woa.e(d14.CREATOR, parcel, arrayList7, i4, 1);
                }
                return new y04(readString26, readLong, readString27, arrayList7);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new cc3[i];
            case 1:
                return new dc3[i];
            case 2:
                return new ec3[i];
            case 3:
                return new fc3[i];
            case 4:
                return new gc3[i];
            case 5:
                return new cd3[i];
            case 6:
                return new gd3[i];
            case 7:
                return new id3[i];
            case 8:
                return new hd3[i];
            case 9:
                return new kd3[i];
            case 10:
                return new ld3[i];
            case 11:
                return new md3[i];
            case 12:
                return new nd3[i];
            case 13:
                return new pd3[i];
            case 14:
                return new rd3[i];
            case 15:
                return new qd3[i];
            case 16:
                return new td3[i];
            case 17:
                return new ud3[i];
            case MlKitException.UNSUPPORTED /* 18 */:
                return new vd3[i];
            case zh4.REMOTE_EXCEPTION /* 19 */:
                return new wd3[i];
            case 20:
                return new xd3[i];
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return new yd3[i];
            case 22:
                return new ce3[i];
            case 23:
                return new bz3[i];
            case 24:
                return new cz3[i];
            case 25:
                return new dz3[i];
            case 26:
                return new ez3[i];
            case 27:
                return new fz3[i];
            case 28:
                return new iz3[i];
            default:
                return new y04[i];
        }
    }
}
