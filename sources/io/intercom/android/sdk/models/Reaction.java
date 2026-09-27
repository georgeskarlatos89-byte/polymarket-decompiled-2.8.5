package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import defpackage.m51;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0003H\u0007J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0003H×\u0001J\t\u0010\u0016\u001a\u00020\u0005H×\u0001J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lio/intercom/android/sdk/models/Reaction;", "Landroid/os/Parcelable;", "index", "", "_imageUrl", "", "<init>", "(ILjava/lang/String;)V", "getIndex", "()I", "imageUrl", "getImageUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Reaction implements Parcelable {
    public static final int $stable = 0;

    @SerializedName("image_url")
    private final String _imageUrl;

    @SerializedName("index")
    private final int index;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<Reaction> CREATOR = new Creator();

    public /* synthetic */ Reaction(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str);
    }

    /* renamed from: component2, reason: from getter */
    private final String get_imageUrl() {
        return this._imageUrl;
    }

    public static /* synthetic */ Reaction copy$default(Reaction reaction, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = reaction.index;
        }
        if ((i2 & 2) != 0) {
            str = reaction._imageUrl;
        }
        return reaction.copy(i, str);
    }

    public static final Reaction create(int i, String str) {
        return INSTANCE.create(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    public final Reaction copy(int index, String _imageUrl) {
        return new Reaction(index, _imageUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Reaction)) {
            return false;
        }
        Reaction reaction = (Reaction) other;
        if (this.index == reaction.index && Intrinsics.areEqual(this._imageUrl, reaction._imageUrl)) {
            return true;
        }
        return false;
    }

    public final String getImageUrl() {
        String str = this._imageUrl;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final int getIndex() {
        return this.index;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.index) * 31;
        String str = this._imageUrl;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Reaction(index=");
        sb.append(this.index);
        sb.append(", _imageUrl=");
        return m51.m(sb, this._imageUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.index);
        dest.writeString(this._imageUrl);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/models/Reaction$Companion;", "", "<init>", "()V", "create", "Lio/intercom/android/sdk/models/Reaction;", "index", "", "imageUrl", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Reaction create(int index, String imageUrl) {
            imageUrl.getClass();
            return new Reaction(index, imageUrl);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<Reaction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Reaction createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Reaction(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Reaction[] newArray(int i) {
            return newArray(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Reaction[] newArray(int i) {
            return new Reaction[i];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Reaction createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }
    }

    public Reaction(int i, String str) {
        this.index = i;
        this._imageUrl = str;
    }

    public Reaction() {
        this(0, null, 3, null);
    }
}
