package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import defpackage.sv6;
import io.intercom.android.sdk.models.Avatar;
import io.radar.sdk.RadarTrackingOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÂ\u0003JB\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÇ\u0001¢\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u001fH\u0007J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H×\u0003J\t\u0010$\u001a\u00020\u001fH×\u0001J\t\u0010%\u001a\u00020\u0003H×\u0001J\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006+"}, d2 = {"Lio/intercom/android/sdk/models/Metadata;", "Landroid/os/Parcelable;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "suffix", "timestamp", "", "_avatars", "", "Lio/intercom/android/sdk/models/Avatar$Builder;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getSuffix", "getTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "get_avatars$annotations", "()V", "avatars", "Lio/intercom/android/sdk/models/Avatar;", "getAvatars", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;)Lio/intercom/android/sdk/models/Metadata;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Metadata implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Metadata> CREATOR = new Creator();

    @SerializedName("avatars")
    private final List<Avatar.Builder> _avatars;

    @SerializedName("suffix")
    private final String suffix;

    @SerializedName("timestamp")
    private final Long timestamp;

    @SerializedName(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE)
    private final String title;

    public /* synthetic */ Metadata(String str, String str2, Long l, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : list);
    }

    private final List<Avatar.Builder> component4() {
        return this._avatars;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Metadata copy$default(Metadata metadata, String str, String str2, Long l, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = metadata.title;
        }
        if ((i & 2) != 0) {
            str2 = metadata.suffix;
        }
        if ((i & 4) != 0) {
            l = metadata.timestamp;
        }
        if ((i & 8) != 0) {
            list = metadata._avatars;
        }
        return metadata.copy(str, str2, l, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSuffix() {
        return this.suffix;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    public final Metadata copy(String title, String suffix, Long timestamp, List<Avatar.Builder> _avatars) {
        title.getClass();
        return new Metadata(title, suffix, timestamp, _avatars);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Metadata)) {
            return false;
        }
        Metadata metadata = (Metadata) other;
        if (Intrinsics.areEqual(this.title, metadata.title) && Intrinsics.areEqual(this.suffix, metadata.suffix) && Intrinsics.areEqual(this.timestamp, metadata.timestamp) && Intrinsics.areEqual(this._avatars, metadata._avatars)) {
            return true;
        }
        return false;
    }

    public final List<Avatar> getAvatars() {
        List<Avatar.Builder> list = this._avatars;
        if (list != null) {
            List<Avatar.Builder> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.w(list2));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((Avatar.Builder) it.next()).build());
            }
            return arrayList;
        }
        return CollectionsKt.emptyList();
    }

    public final String getSuffix() {
        return this.suffix;
    }

    public final Long getTimestamp() {
        return this.timestamp;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.title.hashCode() * 31;
        String str = this.suffix;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        Long l = this.timestamp;
        if (l == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        List<Avatar.Builder> list = this._avatars;
        if (list != null) {
            i = list.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Metadata(title=");
        sb.append(this.title);
        sb.append(", suffix=");
        sb.append(this.suffix);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(", _avatars=");
        return sv6.r(sb, this._avatars, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.title);
        dest.writeString(this.suffix);
        Long l = this.timestamp;
        if (l == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l.longValue());
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<Metadata> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Metadata createFromParcel(Parcel parcel) {
            Long valueOf;
            parcel.getClass();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(parcel.readLong());
            }
            return new Metadata(readString, readString2, valueOf, null, 8, null);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Metadata[] newArray(int i) {
            return newArray(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Metadata[] newArray(int i) {
            return new Metadata[i];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Metadata createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }
    }

    private static /* synthetic */ void get_avatars$annotations() {
    }

    public Metadata(String str, String str2, Long l, List<Avatar.Builder> list) {
        str.getClass();
        this.title = str;
        this.suffix = str2;
        this.timestamp = l;
        this._avatars = list;
    }

    public Metadata() {
        this(null, null, null, null, 15, null);
    }
}
