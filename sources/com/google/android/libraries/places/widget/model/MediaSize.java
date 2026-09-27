package com.google.android.libraries.places.widget.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ug7;
import defpackage.wg7;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tj\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u000f"}, d2 = {"Lcom/google/android/libraries/places/widget/model/MediaSize;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "SMALL", "MEDIUM", "LARGE", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "java.com.google.android.libraries.places.widget.model_media_size_3p"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MediaSize implements Parcelable {
    public static final Parcelable.Creator<MediaSize> CREATOR;
    public static final MediaSize LARGE;
    public static final MediaSize MEDIUM;
    public static final MediaSize SMALL;
    private static final /* synthetic */ MediaSize[] zza;
    private static final /* synthetic */ ug7 zzb;

    static {
        MediaSize mediaSize = new MediaSize("SMALL", 0);
        SMALL = mediaSize;
        MediaSize mediaSize2 = new MediaSize("MEDIUM", 1);
        MEDIUM = mediaSize2;
        MediaSize mediaSize3 = new MediaSize("LARGE", 2);
        LARGE = mediaSize3;
        MediaSize[] mediaSizeArr = {mediaSize, mediaSize2, mediaSize3};
        zza = mediaSizeArr;
        zzb = new wg7(mediaSizeArr);
        CREATOR = new Parcelable.Creator() { // from class: com.google.android.libraries.places.widget.model.zzv
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return MediaSize.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object[] newArray(int i) {
                return new MediaSize[i];
            }
        };
    }

    private MediaSize(String str, int i) {
    }

    public static ug7 getEntries() {
        return zzb;
    }

    public static MediaSize valueOf(String str) {
        return (MediaSize) Enum.valueOf(MediaSize.class, str);
    }

    public static MediaSize[] values() {
        return (MediaSize[]) zza.clone();
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
