package com.socure.docv.capturesdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.mlkit.common.MlKitException;
import defpackage.woa;
import defpackage.zh4;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class a implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        Boolean valueOf;
        boolean z2;
        Integer valueOf2;
        Integer valueOf3;
        SecondaryDocModuleModel$LandingLabels createFromParcel;
        SecondaryDocModuleModel$UploadOptionsModalLabels createFromParcel2;
        SecondaryDocModuleModel$LiveCaptureLabels createFromParcel3;
        SecondaryDocModuleModel$FileUploadLabels createFromParcel4;
        SecondaryDocModuleModel$ErrorLabels createFromParcel5;
        Boolean valueOf4;
        Integer valueOf5;
        Integer valueOf6;
        SecondaryDocModuleModel$TransitionLabels createFromParcel6;
        SecondaryDocModuleModel$ErrorDetail createFromParcel7;
        SecondaryDocModuleModel$ErrorDetail createFromParcel8;
        SecondaryDocModuleModel$ErrorDetail createFromParcel9;
        SecondaryDocModuleModel$ErrorDetail createFromParcel10;
        SecondaryDocModuleModel$ErrorDetail createFromParcel11;
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new f(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), c.CREATOR.createFromParcel(parcel), b.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), d.CREATOR.createFromParcel(parcel), e.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), k0.CREATOR.createFromParcel(parcel));
            case 1:
                parcel.getClass();
                return new b(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 2:
                parcel.getClass();
                return new c(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 3:
                parcel.getClass();
                return new d(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 4:
                parcel.getClass();
                return new e(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 5:
                parcel.getClass();
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    valueOf = Boolean.valueOf(z);
                }
                return new g(readString, valueOf, parcel.readString(), parcel.readString());
            case 6:
                parcel.getClass();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = woa.e(g.CREATOR, parcel, arrayList, i, 1);
                }
                return new l(readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
            case 7:
                parcel.getClass();
                return new p(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
            case 8:
                parcel.getClass();
                parcel.readInt();
                return q.a;
            case 9:
                parcel.getClass();
                return new w(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), t.CREATOR.createFromParcel(parcel), s.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), u.CREATOR.createFromParcel(parcel), v.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), k0.CREATOR.createFromParcel(parcel));
            case 10:
                parcel.getClass();
                return new s(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 11:
                parcel.getClass();
                return new t(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 12:
                parcel.getClass();
                return new u(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 13:
                parcel.getClass();
                return new v(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 14:
                parcel.getClass();
                return new y(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 15:
                parcel.getClass();
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = woa.e(y.CREATOR, parcel, arrayList2, i2, 1);
                }
                return new z(readString11, readString12, readString13, readString14, readString15, readString16, readString17, arrayList2);
            case 16:
                parcel.getClass();
                return new b0(parcel.readString(), parcel.readString(), parcel.readString());
            case 17:
                parcel.getClass();
                return new i0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), f0.CREATOR.createFromParcel(parcel), e0.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), g0.CREATOR.createFromParcel(parcel), h0.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), k0.CREATOR.createFromParcel(parcel));
            case MlKitException.UNSUPPORTED /* 18 */:
                parcel.getClass();
                return new e0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case zh4.REMOTE_EXCEPTION /* 19 */:
                parcel.getClass();
                return new f0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 20:
                parcel.getClass();
                return new g0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                parcel.getClass();
                return new h0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 22:
                parcel.getClass();
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return new k0(z2, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.createStringArrayList(), parcel.readInt(), parcel.createStringArrayList(), parcel.readFloat());
            case 23:
                parcel.getClass();
                return new SecondaryDocModuleModel$CameraCapture(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 24:
                parcel.getClass();
                return new SecondaryDocModuleModel$CameraImagePreview(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 25:
                parcel.getClass();
                return new SecondaryDocModuleModel$CameraLoading(parcel.readString(), parcel.readString());
            case 26:
                parcel.getClass();
                String readString18 = parcel.readString();
                String readString19 = parcel.readString();
                String readString20 = parcel.readString();
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                boolean z3 = true;
                ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
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
                if (parcel.readInt() == 0) {
                    createFromParcel = null;
                } else {
                    createFromParcel = SecondaryDocModuleModel$LandingLabels.CREATOR.createFromParcel(parcel);
                }
                SecondaryDocModuleModel$LandingLabels secondaryDocModuleModel$LandingLabels = createFromParcel;
                if (parcel.readInt() == 0) {
                    createFromParcel2 = null;
                } else {
                    createFromParcel2 = SecondaryDocModuleModel$UploadOptionsModalLabels.CREATOR.createFromParcel(parcel);
                }
                SecondaryDocModuleModel$UploadOptionsModalLabels secondaryDocModuleModel$UploadOptionsModalLabels = createFromParcel2;
                if (parcel.readInt() == 0) {
                    createFromParcel3 = null;
                } else {
                    createFromParcel3 = SecondaryDocModuleModel$LiveCaptureLabels.CREATOR.createFromParcel(parcel);
                }
                SecondaryDocModuleModel$LiveCaptureLabels secondaryDocModuleModel$LiveCaptureLabels = createFromParcel3;
                if (parcel.readInt() == 0) {
                    createFromParcel4 = null;
                } else {
                    createFromParcel4 = SecondaryDocModuleModel$FileUploadLabels.CREATOR.createFromParcel(parcel);
                }
                SecondaryDocModuleModel$FileUploadLabels secondaryDocModuleModel$FileUploadLabels = createFromParcel4;
                if (parcel.readInt() == 0) {
                    createFromParcel5 = null;
                } else {
                    createFromParcel5 = SecondaryDocModuleModel$ErrorLabels.CREATOR.createFromParcel(parcel);
                }
                SecondaryDocModuleModel$ErrorLabels secondaryDocModuleModel$ErrorLabels = createFromParcel5;
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    if (parcel.readInt() == 0) {
                        z3 = false;
                    }
                    valueOf4 = Boolean.valueOf(z3);
                }
                if (parcel.readInt() == 0) {
                    valueOf5 = null;
                } else {
                    valueOf5 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() == 0) {
                    valueOf6 = null;
                } else {
                    valueOf6 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() == 0) {
                    createFromParcel6 = null;
                } else {
                    createFromParcel6 = SecondaryDocModuleModel$TransitionLabels.CREATOR.createFromParcel(parcel);
                }
                return new n0(readString18, readString19, readString20, createStringArrayList, createStringArrayList2, createStringArrayList3, valueOf2, valueOf3, secondaryDocModuleModel$LandingLabels, secondaryDocModuleModel$UploadOptionsModalLabels, secondaryDocModuleModel$LiveCaptureLabels, secondaryDocModuleModel$FileUploadLabels, secondaryDocModuleModel$ErrorLabels, valueOf4, valueOf5, valueOf6, createFromParcel6);
            case 27:
                parcel.getClass();
                return new SecondaryDocModuleModel$ErrorDetail(parcel.readString(), parcel.readString());
            case 28:
                parcel.getClass();
                String readString21 = parcel.readString();
                if (parcel.readInt() == 0) {
                    createFromParcel7 = null;
                } else {
                    createFromParcel7 = SecondaryDocModuleModel$ErrorDetail.CREATOR.createFromParcel(parcel);
                }
                SecondaryDocModuleModel$ErrorDetail secondaryDocModuleModel$ErrorDetail = createFromParcel7;
                if (parcel.readInt() == 0) {
                    createFromParcel8 = null;
                } else {
                    createFromParcel8 = SecondaryDocModuleModel$ErrorDetail.CREATOR.createFromParcel(parcel);
                }
                SecondaryDocModuleModel$ErrorDetail secondaryDocModuleModel$ErrorDetail2 = createFromParcel8;
                if (parcel.readInt() == 0) {
                    createFromParcel9 = null;
                } else {
                    createFromParcel9 = SecondaryDocModuleModel$ErrorDetail.CREATOR.createFromParcel(parcel);
                }
                SecondaryDocModuleModel$ErrorDetail secondaryDocModuleModel$ErrorDetail3 = createFromParcel9;
                if (parcel.readInt() == 0) {
                    createFromParcel10 = null;
                } else {
                    createFromParcel10 = SecondaryDocModuleModel$ErrorDetail.CREATOR.createFromParcel(parcel);
                }
                SecondaryDocModuleModel$ErrorDetail secondaryDocModuleModel$ErrorDetail4 = createFromParcel10;
                if (parcel.readInt() == 0) {
                    createFromParcel11 = null;
                } else {
                    createFromParcel11 = SecondaryDocModuleModel$ErrorDetail.CREATOR.createFromParcel(parcel);
                }
                return new SecondaryDocModuleModel$ErrorLabels(readString21, secondaryDocModuleModel$ErrorDetail, secondaryDocModuleModel$ErrorDetail2, secondaryDocModuleModel$ErrorDetail3, secondaryDocModuleModel$ErrorDetail4, createFromParcel11);
            default:
                parcel.getClass();
                return new SecondaryDocModuleModel$FileUploadLabels(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new f[i];
            case 1:
                return new b[i];
            case 2:
                return new c[i];
            case 3:
                return new d[i];
            case 4:
                return new e[i];
            case 5:
                return new g[i];
            case 6:
                return new l[i];
            case 7:
                return new p[i];
            case 8:
                return new q[i];
            case 9:
                return new w[i];
            case 10:
                return new s[i];
            case 11:
                return new t[i];
            case 12:
                return new u[i];
            case 13:
                return new v[i];
            case 14:
                return new y[i];
            case 15:
                return new z[i];
            case 16:
                return new b0[i];
            case 17:
                return new i0[i];
            case MlKitException.UNSUPPORTED /* 18 */:
                return new e0[i];
            case zh4.REMOTE_EXCEPTION /* 19 */:
                return new f0[i];
            case 20:
                return new g0[i];
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return new h0[i];
            case 22:
                return new k0[i];
            case 23:
                return new SecondaryDocModuleModel$CameraCapture[i];
            case 24:
                return new SecondaryDocModuleModel$CameraImagePreview[i];
            case 25:
                return new SecondaryDocModuleModel$CameraLoading[i];
            case 26:
                return new n0[i];
            case 27:
                return new SecondaryDocModuleModel$ErrorDetail[i];
            case 28:
                return new SecondaryDocModuleModel$ErrorLabels[i];
            default:
                return new SecondaryDocModuleModel$FileUploadLabels[i];
        }
    }
}
