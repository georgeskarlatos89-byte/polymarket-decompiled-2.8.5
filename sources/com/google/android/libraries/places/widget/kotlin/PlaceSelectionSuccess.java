package com.google.android.libraries.places.widget.kotlin;

import com.google.android.libraries.places.api.model.Place;
import defpackage.hm6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@hm6
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/google/android/libraries/places/widget/kotlin/PlaceSelectionSuccess;", "Lcom/google/android/libraries/places/widget/kotlin/PlaceSelectionResult;", "place", "Lcom/google/android/libraries/places/api/model/Place;", "<init>", "(Lcom/google/android/libraries/places/api/model/Place;)V", "getPlace", "()Lcom/google/android/libraries/places/api/model/Place;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "java.com.google.android.libraries.places.widget.kotlin_kotlin_3p"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PlaceSelectionSuccess extends PlaceSelectionResult {

    /* renamed from: zza, reason: from toString */
    private final Place place;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaceSelectionSuccess(Place place) {
        super(null);
        place.getClass();
        this.place = place;
    }

    public static /* synthetic */ PlaceSelectionSuccess copy$default(PlaceSelectionSuccess placeSelectionSuccess, Place place, int i, Object obj) {
        if ((i & 1) != 0) {
            place = placeSelectionSuccess.place;
        }
        return placeSelectionSuccess.copy(place);
    }

    /* renamed from: component1, reason: from getter */
    public final Place getPlace() {
        return this.place;
    }

    public final PlaceSelectionSuccess copy(Place place) {
        place.getClass();
        return new PlaceSelectionSuccess(place);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof PlaceSelectionSuccess) && Intrinsics.areEqual(this.place, ((PlaceSelectionSuccess) other).place)) {
            return true;
        }
        return false;
    }

    public final Place getPlace() {
        return this.place;
    }

    public int hashCode() {
        return this.place.hashCode();
    }

    public String toString() {
        Place place = this.place;
        StringBuilder sb = new StringBuilder(String.valueOf(place).length() + 29);
        sb.append("PlaceSelectionSuccess(place=");
        sb.append(place);
        sb.append(")");
        return sb.toString();
    }
}
