package com.google.android.libraries.places.widget.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ug7;
import defpackage.wg7;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bj\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000e"}, d2 = {"Lcom/google/android/libraries/places/widget/model/AutocompleteListDensity;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TWO_LINE", "MULTI_LINE", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "java.com.google.android.libraries.places.widget.model_autocomplete_3p"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutocompleteListDensity implements Parcelable {
    public static final Parcelable.Creator<AutocompleteListDensity> CREATOR;
    public static final AutocompleteListDensity MULTI_LINE;
    public static final AutocompleteListDensity TWO_LINE;
    private static final /* synthetic */ AutocompleteListDensity[] zza;
    private static final /* synthetic */ ug7 zzb;

    static {
        AutocompleteListDensity autocompleteListDensity = new AutocompleteListDensity("TWO_LINE", 0);
        TWO_LINE = autocompleteListDensity;
        AutocompleteListDensity autocompleteListDensity2 = new AutocompleteListDensity("MULTI_LINE", 1);
        MULTI_LINE = autocompleteListDensity2;
        AutocompleteListDensity[] autocompleteListDensityArr = {autocompleteListDensity, autocompleteListDensity2};
        zza = autocompleteListDensityArr;
        zzb = new wg7(autocompleteListDensityArr);
        CREATOR = new Parcelable.Creator() { // from class: com.google.android.libraries.places.widget.model.zzo
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return AutocompleteListDensity.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object[] newArray(int i) {
                return new AutocompleteListDensity[i];
            }
        };
    }

    private AutocompleteListDensity(String str, int i) {
    }

    public static ug7 getEntries() {
        return zzb;
    }

    public static AutocompleteListDensity valueOf(String str) {
        return (AutocompleteListDensity) Enum.valueOf(AutocompleteListDensity.class, str);
    }

    public static AutocompleteListDensity[] values() {
        return (AutocompleteListDensity[]) zza.clone();
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
