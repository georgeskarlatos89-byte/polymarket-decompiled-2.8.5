package com.google.android.libraries.places.widget.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.woa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bJ\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u000f\u0010\t\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/google/android/libraries/places/widget/model/AutocompleteUiCustomization;", "Landroid/os/Parcelable;", "listDensity", "Lcom/google/android/libraries/places/widget/model/AutocompleteListDensity;", "noMatchingResultsMessage", "", "listItemIcon", "Lcom/google/android/libraries/places/widget/model/AutocompleteUiIcon;", "searchBarHint", "theme", "", "<init>", "(Lcom/google/android/libraries/places/widget/model/AutocompleteListDensity;Ljava/lang/String;Lcom/google/android/libraries/places/widget/model/AutocompleteUiIcon;Ljava/lang/String;Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "equals", "", "other", "", "hashCode", "()Ljava/lang/Integer;", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "Builder", "java.com.google.android.libraries.places.widget.model_autocomplete_3p"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutocompleteUiCustomization implements Parcelable {
    private final AutocompleteListDensity zza;
    private final String zzb;
    private final AutocompleteUiIcon zzc;
    private final String zzd;
    private final Integer zze;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<AutocompleteUiCustomization> CREATOR = new zzp();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001J\u0012\u0010\u0004\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007J\u0012\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J\u0019\u0010\u0019\u001a\u00020\u00002\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\"H\u0007¨\u0006#"}, d2 = {"Lcom/google/android/libraries/places/widget/model/AutocompleteUiCustomization$Builder;", "", "<init>", "()V", "listDensity", "Lcom/google/android/libraries/places/widget/model/AutocompleteListDensity;", "getListDensity", "()Lcom/google/android/libraries/places/widget/model/AutocompleteListDensity;", "setListDensity", "(Lcom/google/android/libraries/places/widget/model/AutocompleteListDensity;)V", "noMatchingResultsMessage", "", "getNoMatchingResultsMessage", "()Ljava/lang/String;", "setNoMatchingResultsMessage", "(Ljava/lang/String;)V", "listItemIcon", "Lcom/google/android/libraries/places/widget/model/AutocompleteUiIcon;", "getListItemIcon", "()Lcom/google/android/libraries/places/widget/model/AutocompleteUiIcon;", "setListItemIcon", "(Lcom/google/android/libraries/places/widget/model/AutocompleteUiIcon;)V", "searchBarHint", "getSearchBarHint", "setSearchBarHint", "theme", "", "getTheme", "()Ljava/lang/Integer;", "setTheme", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "(Ljava/lang/Integer;)Lcom/google/android/libraries/places/widget/model/AutocompleteUiCustomization$Builder;", "build", "Lcom/google/android/libraries/places/widget/model/AutocompleteUiCustomization;", "java.com.google.android.libraries.places.widget.model_autocomplete_3p"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Builder {
        private AutocompleteListDensity zza;
        private AutocompleteUiIcon zzb;
        private Integer zzc;

        public final AutocompleteUiCustomization build() {
            return new AutocompleteUiCustomization(this.zza, null, this.zzb, null, this.zzc, null);
        }

        public final Builder listDensity(AutocompleteListDensity listDensity) {
            this.zza = listDensity;
            return this;
        }

        public final Builder listItemIcon(AutocompleteUiIcon listItemIcon) {
            this.zzb = listItemIcon;
            return this;
        }

        public final Builder theme(Integer theme) {
            this.zzc = theme;
            return this;
        }
    }

    public /* synthetic */ AutocompleteUiCustomization(AutocompleteListDensity autocompleteListDensity, String str, AutocompleteUiIcon autocompleteUiIcon, String str2, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
        this.zza = autocompleteListDensity;
        this.zzb = str;
        this.zzc = autocompleteUiIcon;
        this.zzd = str2;
        this.zze = num;
    }

    public static final Builder builder() {
        return INSTANCE.builder();
    }

    public static final AutocompleteUiCustomization create() {
        return INSTANCE.create();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        Integer num;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutocompleteUiCustomization)) {
            return false;
        }
        AutocompleteListDensity zza = getZza();
        Integer num2 = null;
        if (zza != null) {
            str = zza.name();
        } else {
            str = null;
        }
        AutocompleteUiCustomization autocompleteUiCustomization = (AutocompleteUiCustomization) obj;
        AutocompleteListDensity zza2 = autocompleteUiCustomization.getZza();
        if (zza2 != null) {
            str2 = zza2.name();
        } else {
            str2 = null;
        }
        if (Intrinsics.areEqual(str, str2) && Intrinsics.areEqual(this.zzb, autocompleteUiCustomization.zzb)) {
            AutocompleteUiIcon zzc = getZzc();
            if (zzc != null) {
                num = Integer.valueOf(zzc.getZza());
            } else {
                num = null;
            }
            AutocompleteUiIcon zzc2 = autocompleteUiCustomization.getZzc();
            if (zzc2 != null) {
                num2 = Integer.valueOf(zzc2.getZza());
            }
            if (Intrinsics.areEqual(num, num2) && Intrinsics.areEqual(this.zzd, autocompleteUiCustomization.zzd) && Intrinsics.areEqual(getZze(), autocompleteUiCustomization.getZze())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String name;
        AutocompleteListDensity zza = getZza();
        int i5 = 0;
        if (zza != null && (name = zza.name()) != null) {
            i = name.hashCode();
        } else {
            i = 0;
        }
        String str = this.zzb;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = i * 31;
        AutocompleteUiIcon zzc = getZzc();
        if (zzc != null) {
            i3 = Integer.hashCode(zzc.getZza());
        } else {
            i3 = 0;
        }
        int i7 = (((i6 + i2) * 31) + i3) * 31;
        String str2 = this.zzd;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i8 = (i7 + i4) * 31;
        Integer zze = getZze();
        if (zze != null) {
            i5 = Integer.hashCode(zze.intValue());
        }
        return i8 + i5;
    }

    /* renamed from: listDensity, reason: from getter */
    public final AutocompleteListDensity getZza() {
        return this.zza;
    }

    /* renamed from: listItemIcon, reason: from getter */
    public final AutocompleteUiIcon getZzc() {
        return this.zzc;
    }

    /* renamed from: theme, reason: from getter */
    public final Integer getZze() {
        return this.zze;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        AutocompleteListDensity autocompleteListDensity = this.zza;
        if (autocompleteListDensity == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            autocompleteListDensity.writeToParcel(parcel, i);
        }
        parcel.writeString(this.zzb);
        AutocompleteUiIcon autocompleteUiIcon = this.zzc;
        if (autocompleteUiIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            autocompleteUiIcon.writeToParcel(parcel, i);
        }
        parcel.writeString(this.zzd);
        Integer num = this.zze;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            woa.z(parcel, 1, num);
        }
    }

    /* renamed from: zza, reason: from getter */
    public final String getZzb() {
        return this.zzb;
    }

    /* renamed from: zzb, reason: from getter */
    public final String getZzd() {
        return this.zzd;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001J\b\u0010\u0004\u001a\u00020\u0005H\u0007J1\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/google/android/libraries/places/widget/model/AutocompleteUiCustomization$Companion;", "", "<init>", "()V", "builder", "Lcom/google/android/libraries/places/widget/model/AutocompleteUiCustomization$Builder;", "create", "Lcom/google/android/libraries/places/widget/model/AutocompleteUiCustomization;", "listDensity", "Lcom/google/android/libraries/places/widget/model/AutocompleteListDensity;", "listItemIcon", "Lcom/google/android/libraries/places/widget/model/AutocompleteUiIcon;", "theme", "", "(Lcom/google/android/libraries/places/widget/model/AutocompleteListDensity;Lcom/google/android/libraries/places/widget/model/AutocompleteUiIcon;Ljava/lang/Integer;)Lcom/google/android/libraries/places/widget/model/AutocompleteUiCustomization;", "java.com.google.android.libraries.places.widget.model_autocomplete_3p"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static /* synthetic */ AutocompleteUiCustomization zza(Companion companion, AutocompleteListDensity autocompleteListDensity, AutocompleteUiIcon autocompleteUiIcon, Integer num, int i, Object obj) {
            if (1 == (i & 1)) {
                autocompleteListDensity = null;
            }
            if ((i & 2) != 0) {
                autocompleteUiIcon = null;
            }
            return companion.create(autocompleteListDensity, autocompleteUiIcon, null);
        }

        public final Builder builder() {
            return new Builder();
        }

        public final AutocompleteUiCustomization create(AutocompleteListDensity listDensity, AutocompleteUiIcon listItemIcon, Integer theme) {
            return new Builder().listDensity(listDensity).listItemIcon(listItemIcon).theme(theme).build();
        }

        private Companion() {
            throw null;
        }

        public final AutocompleteUiCustomization create(AutocompleteListDensity autocompleteListDensity) {
            return zza(this, autocompleteListDensity, null, null, 6, null);
        }

        public final AutocompleteUiCustomization create(AutocompleteListDensity autocompleteListDensity, AutocompleteUiIcon autocompleteUiIcon) {
            return zza(this, autocompleteListDensity, autocompleteUiIcon, null, 4, null);
        }

        public final AutocompleteUiCustomization create() {
            return zza(this, null, null, null, 7, null);
        }
    }

    public static final AutocompleteUiCustomization create(AutocompleteListDensity autocompleteListDensity) {
        return INSTANCE.create(autocompleteListDensity);
    }

    public static final AutocompleteUiCustomization create(AutocompleteListDensity autocompleteListDensity, AutocompleteUiIcon autocompleteUiIcon) {
        return INSTANCE.create(autocompleteListDensity, autocompleteUiIcon);
    }

    public static final AutocompleteUiCustomization create(AutocompleteListDensity autocompleteListDensity, AutocompleteUiIcon autocompleteUiIcon, Integer num) {
        return INSTANCE.create(autocompleteListDensity, autocompleteUiIcon, num);
    }
}
