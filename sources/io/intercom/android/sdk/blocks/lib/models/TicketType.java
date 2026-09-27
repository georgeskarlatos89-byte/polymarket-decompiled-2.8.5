package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.ace;
import defpackage.hdi;
import defpackage.woa;
import io.radar.sdk.RadarTrackingOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0001)B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JA\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÇ\u0001J\b\u0010\u001d\u001a\u00020\u001eH\u0007J\u0013\u0010\u001f\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010!H×\u0003J\t\u0010\"\u001a\u00020\u001eH×\u0001J\t\u0010#\u001a\u00020\u0005H×\u0001J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001eH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006*"}, d2 = {"Lio/intercom/android/sdk/blocks/lib/models/TicketType;", "Landroid/os/Parcelable;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", Keys.KEY_NAME, "", "emoji", "attributes", "", "Lio/intercom/android/sdk/blocks/lib/models/TicketAttribute;", "archived", "", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getEmoji", "getAttributes", "()Ljava/util/List;", "getArchived", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class TicketType implements Parcelable {

    @SerializedName("archived")
    private final boolean archived;

    @SerializedName("attributes")
    private final List<TicketAttribute> attributes;

    @SerializedName("emoji")
    private final String emoji;

    @SerializedName(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID)
    private final long id;

    @SerializedName(Keys.KEY_NAME)
    private final String name;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TicketType> CREATOR = new Creator();
    private static final TicketType NULL = new TicketType(-1, "", "", CollectionsKt.emptyList(), false);

    public TicketType(long j, String str, String str2, List<TicketAttribute> list, boolean z) {
        ace.B(str, str2, list);
        this.id = j;
        this.name = str;
        this.emoji = str2;
        this.attributes = list;
        this.archived = z;
    }

    public static final /* synthetic */ TicketType access$getNULL$cp() {
        return NULL;
    }

    public static /* synthetic */ TicketType copy$default(TicketType ticketType, long j, String str, String str2, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = ticketType.id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = ticketType.name;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = ticketType.emoji;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            list = ticketType.attributes;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            z = ticketType.archived;
        }
        return ticketType.copy(j2, str3, str4, list2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEmoji() {
        return this.emoji;
    }

    public final List<TicketAttribute> component4() {
        return this.attributes;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getArchived() {
        return this.archived;
    }

    public final TicketType copy(long id, String name, String emoji, List<TicketAttribute> attributes, boolean archived) {
        name.getClass();
        emoji.getClass();
        attributes.getClass();
        return new TicketType(id, name, emoji, attributes, archived);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TicketType)) {
            return false;
        }
        TicketType ticketType = (TicketType) other;
        if (this.id == ticketType.id && Intrinsics.areEqual(this.name, ticketType.name) && Intrinsics.areEqual(this.emoji, ticketType.emoji) && Intrinsics.areEqual(this.attributes, ticketType.attributes) && this.archived == ticketType.archived) {
            return true;
        }
        return false;
    }

    public final boolean getArchived() {
        return this.archived;
    }

    public final List<TicketAttribute> getAttributes() {
        return this.attributes;
    }

    public final String getEmoji() {
        return this.emoji;
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return Boolean.hashCode(this.archived) + hdi.f(hdi.e(hdi.e(Long.hashCode(this.id) * 31, 31, this.name), 31, this.emoji), 31, this.attributes);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TicketType(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", emoji=");
        sb.append(this.emoji);
        sb.append(", attributes=");
        sb.append(this.attributes);
        sb.append(", archived=");
        return hdi.t(sb, this.archived, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeLong(this.id);
        dest.writeString(this.name);
        dest.writeString(this.emoji);
        Iterator s = woa.s(this.attributes, dest);
        while (s.hasNext()) {
            ((TicketAttribute) s.next()).writeToParcel(dest, flags);
        }
        dest.writeInt(this.archived ? 1 : 0);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/blocks/lib/models/TicketType$Companion;", "", "<init>", "()V", "NULL", "Lio/intercom/android/sdk/blocks/lib/models/TicketType;", "getNULL", "()Lio/intercom/android/sdk/blocks/lib/models/TicketType;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TicketType getNULL() {
            return TicketType.access$getNULL$cp();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<TicketType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TicketType createFromParcel(Parcel parcel) {
            boolean z;
            parcel.getClass();
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = woa.e(TicketAttribute.CREATOR, parcel, arrayList, i, 1);
            }
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new TicketType(readLong, readString, readString2, arrayList, z);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TicketType[] newArray(int i) {
            return newArray(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TicketType[] newArray(int i) {
            return new TicketType[i];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TicketType createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }
    }
}
