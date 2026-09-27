package com.checkout.components.interfaces.uicustomisation.font;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ug7;
import defpackage.wg7;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/checkout/components/interfaces/uicustomisation/font/FontStyle;", "Landroid/os/Parcelable;", "", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Normal", "Italic", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FontStyle implements Parcelable {
    public static final Parcelable.Creator<FontStyle> CREATOR;
    public static final FontStyle Italic;
    public static final FontStyle Normal;
    private static final /* synthetic */ FontStyle[] a;
    private static final /* synthetic */ ug7 b;

    static {
        FontStyle fontStyle = new FontStyle("Normal", 0);
        Normal = fontStyle;
        FontStyle fontStyle2 = new FontStyle("Italic", 1);
        Italic = fontStyle2;
        FontStyle[] fontStyleArr = {fontStyle, fontStyle2};
        a = fontStyleArr;
        b = new wg7(fontStyleArr);
        CREATOR = new Parcelable.Creator<FontStyle>() { // from class: com.checkout.components.interfaces.uicustomisation.font.FontStyle.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FontStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                String readString = parcel.readString();
                Parcelable.Creator<FontStyle> creator = FontStyle.CREATOR;
                return (FontStyle) Enum.valueOf(FontStyle.class, readString);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FontStyle[] newArray(int i) {
                return new FontStyle[i];
            }

            @Override // android.os.Parcelable.Creator
            public final FontStyle[] newArray(int i) {
                return new FontStyle[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ FontStyle createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }
        };
    }

    private FontStyle(String str, int i) {
    }

    public static ug7 getEntries() {
        return b;
    }

    public static FontStyle valueOf(String str) {
        return (FontStyle) Enum.valueOf(FontStyle.class, str);
    }

    public static FontStyle[] values() {
        return (FontStyle[]) a.clone();
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
