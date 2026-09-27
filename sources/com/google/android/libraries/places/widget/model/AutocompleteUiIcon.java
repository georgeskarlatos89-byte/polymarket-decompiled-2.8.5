package com.google.android.libraries.places.widget.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J\b\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0012"}, d2 = {"Lcom/google/android/libraries/places/widget/model/AutocompleteUiIcon;", "Landroid/os/Parcelable;", "resourceId", "", "<init>", "(I)V", "equals", "", "other", "", "hashCode", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "java.com.google.android.libraries.places.widget.model_autocomplete_3p"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutocompleteUiIcon implements Parcelable {
    private final int zza;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<AutocompleteUiIcon> CREATOR = new zzq();
    private static final int zzb = R.drawable.location_on_icon;

    public /* synthetic */ AutocompleteUiIcon(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this.zza = i;
    }

    public static final AutocompleteUiIcon listItemDefaultIcon() {
        return INSTANCE.listItemDefaultIcon();
    }

    public static final AutocompleteUiIcon noIcon() {
        return INSTANCE.noIcon();
    }

    public static final /* synthetic */ int zza() {
        return zzb;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof AutocompleteUiIcon) && this.zza == ((AutocompleteUiIcon) obj).zza) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.zza);
    }

    /* renamed from: resourceId, reason: from getter */
    public final int getZza() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.zza);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007¨\u0006\f"}, d2 = {"Lcom/google/android/libraries/places/widget/model/AutocompleteUiIcon$Companion;", "", "<init>", "()V", "DEFAULT_LIST_ITEM_ICON_RESOURCE_ID", "", "getDEFAULT_LIST_ITEM_ICON_RESOURCE_ID$annotations", "getDEFAULT_LIST_ITEM_ICON_RESOURCE_ID", "()I", "noIcon", "Lcom/google/android/libraries/places/widget/model/AutocompleteUiIcon;", "listItemDefaultIcon", "java.com.google.android.libraries.places.widget.model_autocomplete_3p"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final AutocompleteUiIcon listItemDefaultIcon() {
            return new AutocompleteUiIcon(AutocompleteUiIcon.zza(), null);
        }

        public final AutocompleteUiIcon noIcon() {
            return new AutocompleteUiIcon(0, null);
        }

        private Companion() {
            throw null;
        }
    }
}
