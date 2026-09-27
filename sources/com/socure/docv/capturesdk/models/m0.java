package com.socure.docv.capturesdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class m0 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ m0(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        SecondaryDocModuleModel$CameraLoading createFromParcel;
        SecondaryDocModuleModel$CameraCapture createFromParcel2;
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        UnstructuredModuleModel$ErrorLabels createFromParcel3;
        UnstructuredModuleModel$MobileLabels createFromParcel4;
        UnstructuredModuleModel$PreviewMessages createFromParcel5;
        UnstructuredModuleModel$SubmitButtonMessages createFromParcel6;
        boolean z;
        Boolean valueOf4;
        Integer valueOf5;
        SecondaryDocModuleModel$CameraImagePreview secondaryDocModuleModel$CameraImagePreview = null;
        Integer valueOf6 = null;
        Integer valueOf7 = null;
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new SecondaryDocModuleModel$LandingLabels(parcel.readString(), parcel.readString());
            case 1:
                parcel.getClass();
                if (parcel.readInt() == 0) {
                    createFromParcel = null;
                } else {
                    createFromParcel = SecondaryDocModuleModel$CameraLoading.CREATOR.createFromParcel(parcel);
                }
                SecondaryDocModuleModel$CameraLoading secondaryDocModuleModel$CameraLoading = createFromParcel;
                if (parcel.readInt() == 0) {
                    createFromParcel2 = null;
                } else {
                    createFromParcel2 = SecondaryDocModuleModel$CameraCapture.CREATOR.createFromParcel(parcel);
                }
                SecondaryDocModuleModel$CameraCapture secondaryDocModuleModel$CameraCapture = createFromParcel2;
                if (parcel.readInt() != 0) {
                    secondaryDocModuleModel$CameraImagePreview = SecondaryDocModuleModel$CameraImagePreview.CREATOR.createFromParcel(parcel);
                }
                return new SecondaryDocModuleModel$LiveCaptureLabels(secondaryDocModuleModel$CameraLoading, secondaryDocModuleModel$CameraCapture, secondaryDocModuleModel$CameraImagePreview);
            case 2:
                parcel.getClass();
                return new SecondaryDocModuleModel$TransitionLabels(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 3:
                parcel.getClass();
                return new SecondaryDocModuleModel$UploadOptionsModalLabels(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 4:
                parcel.getClass();
                return new q0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), s0.CREATOR.createFromParcel(parcel), r0.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), t0.CREATOR.createFromParcel(parcel), u0.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), p0.CREATOR.createFromParcel(parcel), o0.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), k0.CREATOR.createFromParcel(parcel));
            case 5:
                parcel.getClass();
                return new o0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 6:
                parcel.getClass();
                return new p0(parcel.readString());
            case 7:
                parcel.getClass();
                return new v0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), s0.CREATOR.createFromParcel(parcel), r0.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), t0.CREATOR.createFromParcel(parcel), u0.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), k0.CREATOR.createFromParcel(parcel));
            case 8:
                parcel.getClass();
                return new r0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 9:
                parcel.getClass();
                return new s0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 10:
                parcel.getClass();
                return new t0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 11:
                parcel.getClass();
                return new u0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 12:
                parcel.getClass();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                y0 createFromParcel7 = y0.CREATOR.createFromParcel(parcel);
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() != 0) {
                    valueOf7 = Integer.valueOf(parcel.readInt());
                }
                return new z0(readString, readString2, readString3, readInt, readInt2, readString4, readString5, createFromParcel7, readString6, readString7, valueOf, valueOf7);
            case 13:
                parcel.getClass();
                return new y0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 14:
                parcel.getClass();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
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
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                String readString18 = parcel.readString();
                String readString19 = parcel.readString();
                String readString20 = parcel.readString();
                String readString21 = parcel.readString();
                String readString22 = parcel.readString();
                String readString23 = parcel.readString();
                String readString24 = parcel.readString();
                String readString25 = parcel.readString();
                if (parcel.readInt() == 0) {
                    createFromParcel3 = null;
                } else {
                    createFromParcel3 = UnstructuredModuleModel$ErrorLabels.CREATOR.createFromParcel(parcel);
                }
                UnstructuredModuleModel$ErrorLabels unstructuredModuleModel$ErrorLabels = createFromParcel3;
                if (parcel.readInt() == 0) {
                    createFromParcel4 = null;
                } else {
                    createFromParcel4 = UnstructuredModuleModel$MobileLabels.CREATOR.createFromParcel(parcel);
                }
                UnstructuredModuleModel$MobileLabels unstructuredModuleModel$MobileLabels = createFromParcel4;
                String readString26 = parcel.readString();
                String readString27 = parcel.readString();
                String readString28 = parcel.readString();
                String readString29 = parcel.readString();
                String readString30 = parcel.readString();
                String readString31 = parcel.readString();
                String readString32 = parcel.readString();
                String readString33 = parcel.readString();
                String readString34 = parcel.readString();
                String readString35 = parcel.readString();
                String readString36 = parcel.readString();
                String readString37 = parcel.readString();
                String readString38 = parcel.readString();
                String readString39 = parcel.readString();
                String readString40 = parcel.readString();
                String readString41 = parcel.readString();
                String readString42 = parcel.readString();
                String readString43 = parcel.readString();
                String readString44 = parcel.readString();
                String readString45 = parcel.readString();
                String readString46 = parcel.readString();
                String readString47 = parcel.readString();
                String readString48 = parcel.readString();
                String readString49 = parcel.readString();
                if (parcel.readInt() == 0) {
                    createFromParcel5 = null;
                } else {
                    createFromParcel5 = UnstructuredModuleModel$PreviewMessages.CREATOR.createFromParcel(parcel);
                }
                UnstructuredModuleModel$PreviewMessages unstructuredModuleModel$PreviewMessages = createFromParcel5;
                if (parcel.readInt() == 0) {
                    createFromParcel6 = null;
                } else {
                    createFromParcel6 = UnstructuredModuleModel$SubmitButtonMessages.CREATOR.createFromParcel(parcel);
                }
                UnstructuredModuleModel$SubmitButtonMessages unstructuredModuleModel$SubmitButtonMessages = createFromParcel6;
                String readString50 = parcel.readString();
                String readString51 = parcel.readString();
                String readString52 = parcel.readString();
                String readString53 = parcel.readString();
                String readString54 = parcel.readString();
                String readString55 = parcel.readString();
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
                    valueOf5 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() != 0) {
                    valueOf6 = Integer.valueOf(parcel.readInt());
                }
                return new a1(readString8, readString9, readString10, createStringArrayList, createStringArrayList2, createStringArrayList3, valueOf2, valueOf3, readString11, readString12, readString13, readString14, readString15, readString16, readString17, readString18, readString19, readString20, readString21, readString22, readString23, readString24, readString25, unstructuredModuleModel$ErrorLabels, unstructuredModuleModel$MobileLabels, readString26, readString27, readString28, readString29, readString30, readString31, readString32, readString33, readString34, readString35, readString36, readString37, readString38, readString39, readString40, readString41, readString42, readString43, readString44, readString45, readString46, readString47, readString48, readString49, unstructuredModuleModel$PreviewMessages, unstructuredModuleModel$SubmitButtonMessages, readString50, readString51, readString52, readString53, readString54, readString55, valueOf4, valueOf5, valueOf6, parcel.readString(), parcel.createStringArrayList(), k0.CREATOR.createFromParcel(parcel));
            case 15:
                parcel.getClass();
                return new UnstructuredModuleModel$ErrorLabels(parcel.readString(), parcel.readString(), parcel.readString());
            case 16:
                parcel.getClass();
                return new UnstructuredModuleModel$MobileLabels(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 17:
                parcel.getClass();
                return new UnstructuredModuleModel$PreviewMessages(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            default:
                parcel.getClass();
                return new UnstructuredModuleModel$SubmitButtonMessages(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new SecondaryDocModuleModel$LandingLabels[i];
            case 1:
                return new SecondaryDocModuleModel$LiveCaptureLabels[i];
            case 2:
                return new SecondaryDocModuleModel$TransitionLabels[i];
            case 3:
                return new SecondaryDocModuleModel$UploadOptionsModalLabels[i];
            case 4:
                return new q0[i];
            case 5:
                return new o0[i];
            case 6:
                return new p0[i];
            case 7:
                return new v0[i];
            case 8:
                return new r0[i];
            case 9:
                return new s0[i];
            case 10:
                return new t0[i];
            case 11:
                return new u0[i];
            case 12:
                return new z0[i];
            case 13:
                return new y0[i];
            case 14:
                return new a1[i];
            case 15:
                return new UnstructuredModuleModel$ErrorLabels[i];
            case 16:
                return new UnstructuredModuleModel$MobileLabels[i];
            case 17:
                return new UnstructuredModuleModel$PreviewMessages[i];
            default:
                return new UnstructuredModuleModel$SubmitButtonMessages[i];
        }
    }
}
