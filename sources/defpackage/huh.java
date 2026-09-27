package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.mlkit.common.MlKitException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class huh implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ huh(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, iuh] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, juh] */
    /* JADX WARN: Type inference failed for: r0v30, types: [m81, java.lang.Object, v5i] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        u2i createFromParcel;
        Long valueOf;
        boolean z3;
        boolean z4;
        ArrayList arrayList = null;
        LinkedHashMap linkedHashMap = null;
        Integer valueOf2 = null;
        llg llgVar = null;
        LinkedHashMap linkedHashMap2 = null;
        w2i w2iVar = null;
        boolean z5 = true;
        int i = 0;
        switch (this.a) {
            case 0:
                ?? obj = new Object();
                obj.a = parcel.readInt();
                obj.b = parcel.readInt();
                if (parcel.readInt() != 1) {
                    z5 = false;
                }
                obj.d = z5;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    obj.c = iArr;
                    parcel.readIntArray(iArr);
                }
                return obj;
            case 1:
                ?? obj2 = new Object();
                obj2.a = parcel.readInt();
                obj2.b = parcel.readInt();
                int readInt2 = parcel.readInt();
                obj2.c = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    obj2.d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                obj2.e = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    obj2.f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                if (parcel.readInt() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                obj2.h = z;
                if (parcel.readInt() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                obj2.i = z2;
                if (parcel.readInt() != 1) {
                    z5 = false;
                }
                obj2.j = z5;
                obj2.g = parcel.readArrayList(iuh.class.getClassLoader());
                return obj2;
            case 2:
                parcel.getClass();
                String readString = parcel.readString();
                int readInt4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt4);
                while (i != readInt4) {
                    arrayList2.add(parcel.readValue(uxh.class.getClassLoader()));
                    i++;
                }
                return new uxh(readString, arrayList2);
            case 3:
                parcel.getClass();
                return new ayh(parcel.readInt(), (ll9) parcel.readParcelable(ayh.class.getClassLoader()));
            case 4:
                return new uzh(parcel);
            case 5:
                parcel.getClass();
                return new t2i(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
            case 6:
                parcel.getClass();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int readInt5 = parcel.readInt();
                    arrayList = new ArrayList(readInt5);
                    while (i != readInt5) {
                        i = woa.e(v2i.CREATOR, parcel, arrayList, i, 1);
                    }
                }
                return new u2i(readString2, readString3, readString4, readString5, readString6, readString7, readString8, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 7:
                parcel.getClass();
                String readString9 = parcel.readString();
                if (parcel.readInt() == 0) {
                    createFromParcel = null;
                } else {
                    createFromParcel = u2i.CREATOR.createFromParcel(parcel);
                }
                u2i u2iVar = createFromParcel;
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(parcel.readLong());
                }
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (parcel.readInt() != 0) {
                    w2iVar = w2i.CREATOR.createFromParcel(parcel);
                }
                return new x2i(readString9, u2iVar, valueOf, readString10, readString11, z3, w2iVar, parcel.readString(), parcel.readString());
            case 8:
                parcel.getClass();
                String readString12 = parcel.readString();
                if (parcel.readInt() == 0) {
                    z5 = false;
                }
                String readString13 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int readInt6 = parcel.readInt();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(readInt6);
                    while (i != readInt6) {
                        linkedHashMap3.put(parcel.readString(), parcel.readString());
                        i++;
                    }
                    linkedHashMap2 = linkedHashMap3;
                }
                return new v2i(readString12, z5, readString13, linkedHashMap2);
            case 9:
                parcel.getClass();
                return new w2i(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 10:
                parcel.getClass();
                if (parcel.readInt() != 0) {
                    llgVar = llg.CREATOR.createFromParcel(parcel);
                }
                return new y2i(llgVar);
            case 11:
                parcel.getClass();
                return new a3i(parcel.readString(), parcel.readString(), parcel.readString(), z2i.CREATOR.createFromParcel(parcel));
            case 12:
                parcel.getClass();
                String readString14 = parcel.readString();
                PublicKey publicKey = (PublicKey) parcel.readSerializable();
                int readInt7 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt7);
                while (i != readInt7) {
                    arrayList3.add(parcel.readSerializable());
                    i++;
                }
                return new z2i(readString14, publicKey, arrayList3, parcel.readString());
            case 13:
                parcel.getClass();
                llg llgVar2 = (llg) parcel.readParcelable(d3i.class.getClassLoader());
                t1e createFromParcel2 = t1e.CREATOR.createFromParcel(parcel);
                c8i c8iVar = (c8i) parcel.readParcelable(d3i.class.getClassLoader());
                t7i createFromParcel3 = t7i.CREATOR.createFromParcel(parcel);
                yd0 yd0Var = (yd0) parcel.readParcelable(d3i.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (parcel.readInt() != 0) {
                    valueOf2 = Integer.valueOf(parcel.readInt());
                }
                Integer num = valueOf2;
                String readString15 = parcel.readString();
                int readInt8 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt8);
                while (i != readInt8) {
                    i = sv6.b(parcel, linkedHashSet, i, 1);
                }
                return new d3i(llgVar2, createFromParcel2, c8iVar, createFromParcel3, yd0Var, z4, num, readString15, linkedHashSet);
            case 14:
                ?? m81Var = new m81(parcel);
                m81Var.d = parcel.readString();
                m81Var.e = parcel.readInt();
                return m81Var;
            case 15:
                parcel.getClass();
                Parcelable readParcelable = parcel.readParcelable(o6i.class.getClassLoader());
                String readString16 = parcel.readString();
                if (parcel.readInt() == 0) {
                    z5 = false;
                }
                return new o6i(readParcelable, readString16, z5);
            case 16:
                parcel.getClass();
                String readString17 = parcel.readString();
                String readString18 = parcel.readString();
                String readString19 = parcel.readString();
                String readString20 = parcel.readString();
                String readString21 = parcel.readString();
                String readString22 = parcel.readString();
                String readString23 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int readInt9 = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(readInt9);
                    while (i != readInt9) {
                        linkedHashMap.put(parcel.readString(), parcel.readString());
                        i++;
                    }
                }
                return new q6i(readString17, readString18, readString19, readString20, readString21, readString22, readString23, linkedHashMap);
            case 17:
                parcel.getClass();
                return new e7i(parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(e7i.class.getClassLoader()), parcel.readString());
            case MlKitException.UNSUPPORTED /* 18 */:
                parcel.getClass();
                parcel.readInt();
                return f7i.a;
            case zh4.REMOTE_EXCEPTION /* 19 */:
                parcel.getClass();
                return new g7i(parcel.readString());
            case 20:
                parcel.getClass();
                return new h7i(parcel.readString());
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                parcel.getClass();
                return new i7i(parcel.readString());
            case 22:
                parcel.getClass();
                return new j7i(parcel.readString());
            case 23:
                parcel.getClass();
                return new k7i(parcel.readInt(), parcel.readString(), parcel.readString());
            case 24:
                parcel.getClass();
                return new l7i(parcel.readString());
            case 25:
                parcel.getClass();
                return new m7i(parcel.readString());
            case 26:
                parcel.getClass();
                return new o7i((Uri) parcel.readParcelable(o7i.class.getClassLoader()), parcel.readString());
            case 27:
                parcel.getClass();
                return new q7i(p7i.CREATOR.createFromParcel(parcel));
            case 28:
                parcel.getClass();
                return new p7i(parcel.readString());
            default:
                parcel.getClass();
                return new t7i(parcel.readString(), parcel.readString(), parcel.readString(), s7i.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new iuh[i];
            case 1:
                return new juh[i];
            case 2:
                return new uxh[i];
            case 3:
                return new ayh[i];
            case 4:
                return new uzh[i];
            case 5:
                return new t2i[i];
            case 6:
                return new u2i[i];
            case 7:
                return new x2i[i];
            case 8:
                return new v2i[i];
            case 9:
                return new w2i[i];
            case 10:
                return new y2i[i];
            case 11:
                return new a3i[i];
            case 12:
                return new z2i[i];
            case 13:
                return new d3i[i];
            case 14:
                return new v5i[i];
            case 15:
                return new o6i[i];
            case 16:
                return new q6i[i];
            case 17:
                return new e7i[i];
            case MlKitException.UNSUPPORTED /* 18 */:
                return new f7i[i];
            case zh4.REMOTE_EXCEPTION /* 19 */:
                return new g7i[i];
            case 20:
                return new h7i[i];
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return new i7i[i];
            case 22:
                return new j7i[i];
            case 23:
                return new k7i[i];
            case 24:
                return new l7i[i];
            case 25:
                return new m7i[i];
            case 26:
                return new o7i[i];
            case 27:
                return new q7i[i];
            case 28:
                return new p7i[i];
            default:
                return new t7i[i];
        }
    }
}
