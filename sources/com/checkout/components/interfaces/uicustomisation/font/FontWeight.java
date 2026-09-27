package com.checkout.components.interfaces.uicustomisation.font;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ug7;
import defpackage.wg7;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/checkout/components/interfaces/uicustomisation/font/FontWeight;", "Landroid/os/Parcelable;", "", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Light", "Normal", "Medium", "SemiBold", "Bold", "ExtraBold", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FontWeight implements Parcelable {
    public static final FontWeight Bold;
    public static final Parcelable.Creator<FontWeight> CREATOR;
    public static final FontWeight ExtraBold;
    public static final FontWeight Light;
    public static final FontWeight Medium;
    public static final FontWeight Normal;
    public static final FontWeight SemiBold;
    private static final /* synthetic */ FontWeight[] a;
    private static final /* synthetic */ ug7 b;

    static {
        FontWeight fontWeight = new FontWeight("Light", 0);
        Light = fontWeight;
        FontWeight fontWeight2 = new FontWeight("Normal", 1);
        Normal = fontWeight2;
        FontWeight fontWeight3 = new FontWeight("Medium", 2);
        Medium = fontWeight3;
        FontWeight fontWeight4 = new FontWeight("SemiBold", 3);
        SemiBold = fontWeight4;
        FontWeight fontWeight5 = new FontWeight("Bold", 4);
        Bold = fontWeight5;
        FontWeight fontWeight6 = new FontWeight("ExtraBold", 5);
        ExtraBold = fontWeight6;
        FontWeight[] fontWeightArr = {fontWeight, fontWeight2, fontWeight3, fontWeight4, fontWeight5, fontWeight6};
        a = fontWeightArr;
        b = new wg7(fontWeightArr);
        CREATOR = new Parcelable.Creator<FontWeight>() { // from class: com.checkout.components.interfaces.uicustomisation.font.FontWeight.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FontWeight createFromParcel(Parcel parcel) {
                parcel.getClass();
                String readString = parcel.readString();
                Parcelable.Creator<FontWeight> creator = FontWeight.CREATOR;
                return (FontWeight) Enum.valueOf(FontWeight.class, readString);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FontWeight[] newArray(int i) {
                return new FontWeight[i];
            }

            @Override // android.os.Parcelable.Creator
            public final FontWeight[] newArray(int i) {
                return new FontWeight[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ FontWeight createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }
        };
    }

    private FontWeight(String str, int i) {
    }

    public static ug7 getEntries() {
        return b;
    }

    public static FontWeight valueOf(String str) {
        return (FontWeight) Enum.valueOf(FontWeight.class, str);
    }

    public static FontWeight[] values() {
        return (FontWeight[]) a.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(name());
    }
}
