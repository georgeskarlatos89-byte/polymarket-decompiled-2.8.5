package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÇ\u0001J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0010H×\u0001J\t\u0010\u0016\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lio/intercom/android/sdk/models/EventContent;", "Landroid/os/Parcelable;", "text", "", "weight", "Lio/intercom/android/sdk/models/Weight;", "<init>", "(Ljava/lang/String;Lio/intercom/android/sdk/models/Weight;)V", "getText", "()Ljava/lang/String;", "getWeight", "()Lio/intercom/android/sdk/models/Weight;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class EventContent implements Parcelable {
    public static final int $stable = 0;

    @SerializedName("text")
    private final String text;

    @SerializedName("weight")
    private final Weight weight;
    public static final Parcelable.Creator<EventContent> CREATOR = new Creator();
    public static final EventContent EMPTY = new EventContent(null, null, 3, null);

    public /* synthetic */ EventContent(String str, Weight weight, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : weight);
    }

    public static /* synthetic */ EventContent copy$default(EventContent eventContent, String str, Weight weight, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventContent.text;
        }
        if ((i & 2) != 0) {
            weight = eventContent.weight;
        }
        return eventContent.copy(str, weight);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final Weight getWeight() {
        return this.weight;
    }

    public final EventContent copy(String text, Weight weight) {
        text.getClass();
        return new EventContent(text, weight);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventContent)) {
            return false;
        }
        EventContent eventContent = (EventContent) other;
        if (Intrinsics.areEqual(this.text, eventContent.text) && this.weight == eventContent.weight) {
            return true;
        }
        return false;
    }

    public final String getText() {
        return this.text;
    }

    public final Weight getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.text.hashCode() * 31;
        Weight weight = this.weight;
        if (weight == null) {
            hashCode = 0;
        } else {
            hashCode = weight.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "EventContent(text=" + this.text + ", weight=" + this.weight + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.text);
        Weight weight = this.weight;
        if (weight == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(weight.name());
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<EventContent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EventContent createFromParcel(Parcel parcel) {
            Weight valueOf;
            parcel.getClass();
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Weight.valueOf(parcel.readString());
            }
            return new EventContent(readString, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ EventContent[] newArray(int i) {
            return newArray(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EventContent[] newArray(int i) {
            return new EventContent[i];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ EventContent createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }
    }

    public EventContent(String str, Weight weight) {
        str.getClass();
        this.text = str;
        this.weight = weight;
    }

    public EventContent() {
        this(null, null, 3, null);
    }
}
