package com.checkout.components.interfaces.uicustomisation.font;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ug7;
import defpackage.wg7;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/checkout/components/interfaces/uicustomisation/font/FontName;", "Landroid/os/Parcelable;", "", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Heading", "Subheading", "Footnote", "Button", "Input", "Label", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FontName implements Parcelable {
    public static final FontName Button;
    public static final Parcelable.Creator<FontName> CREATOR;
    public static final FontName Footnote;
    public static final FontName Heading;
    public static final FontName Input;
    public static final FontName Label;
    public static final FontName Subheading;
    private static final /* synthetic */ FontName[] a;
    private static final /* synthetic */ ug7 b;

    static {
        FontName fontName = new FontName("Heading", 0);
        Heading = fontName;
        FontName fontName2 = new FontName("Subheading", 1);
        Subheading = fontName2;
        FontName fontName3 = new FontName("Footnote", 2);
        Footnote = fontName3;
        FontName fontName4 = new FontName("Button", 3);
        Button = fontName4;
        FontName fontName5 = new FontName("Input", 4);
        Input = fontName5;
        FontName fontName6 = new FontName("Label", 5);
        Label = fontName6;
        FontName[] fontNameArr = {fontName, fontName2, fontName3, fontName4, fontName5, fontName6};
        a = fontNameArr;
        b = new wg7(fontNameArr);
        CREATOR = new Parcelable.Creator<FontName>() { // from class: com.checkout.components.interfaces.uicustomisation.font.FontName.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FontName createFromParcel(Parcel parcel) {
                parcel.getClass();
                String readString = parcel.readString();
                Parcelable.Creator<FontName> creator = FontName.CREATOR;
                return (FontName) Enum.valueOf(FontName.class, readString);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FontName[] newArray(int i) {
                return new FontName[i];
            }

            @Override // android.os.Parcelable.Creator
            public final FontName[] newArray(int i) {
                return new FontName[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ FontName createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }
        };
    }

    private FontName(String str, int i) {
    }

    public static ug7 getEntries() {
        return b;
    }

    public static FontName valueOf(String str) {
        return (FontName) Enum.valueOf(FontName.class, str);
    }

    public static FontName[] values() {
        return (FontName[]) a.clone();
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
