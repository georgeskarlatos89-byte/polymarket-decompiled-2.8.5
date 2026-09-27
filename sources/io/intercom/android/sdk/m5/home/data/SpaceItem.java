package io.intercom.android.sdk.m5.home.data;

import com.google.gson.annotations.SerializedName;
import defpackage.hdi;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0017\u001a\u00020\u0018H×\u0001J\t\u0010\u0019\u001a\u00020\u0005H×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/m5/home/data/SpaceItem;", "", MetricTracker.Object.BADGE, "Lio/intercom/android/sdk/m5/home/data/Badge;", "label", "", "type", "Lio/intercom/android/sdk/m5/home/data/SpaceItemType;", "<init>", "(Lio/intercom/android/sdk/m5/home/data/Badge;Ljava/lang/String;Lio/intercom/android/sdk/m5/home/data/SpaceItemType;)V", "getBadge", "()Lio/intercom/android/sdk/m5/home/data/Badge;", "getLabel", "()Ljava/lang/String;", "getType", "()Lio/intercom/android/sdk/m5/home/data/SpaceItemType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SpaceItem {
    public static final int $stable = 0;

    @SerializedName(MetricTracker.Object.BADGE)
    private final Badge badge;

    @SerializedName("label")
    private final String label;

    @SerializedName("type")
    private final SpaceItemType type;

    public SpaceItem(Badge badge, String str, SpaceItemType spaceItemType) {
        str.getClass();
        spaceItemType.getClass();
        this.badge = badge;
        this.label = str;
        this.type = spaceItemType;
    }

    public static /* synthetic */ SpaceItem copy$default(SpaceItem spaceItem, Badge badge, String str, SpaceItemType spaceItemType, int i, Object obj) {
        if ((i & 1) != 0) {
            badge = spaceItem.badge;
        }
        if ((i & 2) != 0) {
            str = spaceItem.label;
        }
        if ((i & 4) != 0) {
            spaceItemType = spaceItem.type;
        }
        return spaceItem.copy(badge, str, spaceItemType);
    }

    /* renamed from: component1, reason: from getter */
    public final Badge getBadge() {
        return this.badge;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component3, reason: from getter */
    public final SpaceItemType getType() {
        return this.type;
    }

    public final SpaceItem copy(Badge badge, String label, SpaceItemType type) {
        label.getClass();
        type.getClass();
        return new SpaceItem(badge, label, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpaceItem)) {
            return false;
        }
        SpaceItem spaceItem = (SpaceItem) other;
        if (Intrinsics.areEqual(this.badge, spaceItem.badge) && Intrinsics.areEqual(this.label, spaceItem.label) && this.type == spaceItem.type) {
            return true;
        }
        return false;
    }

    public final Badge getBadge() {
        return this.badge;
    }

    public final String getLabel() {
        return this.label;
    }

    public final SpaceItemType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode;
        Badge badge = this.badge;
        if (badge == null) {
            hashCode = 0;
        } else {
            hashCode = badge.hashCode();
        }
        return this.type.hashCode() + hdi.e(hashCode * 31, 31, this.label);
    }

    public String toString() {
        return "SpaceItem(badge=" + this.badge + ", label=" + this.label + ", type=" + this.type + ')';
    }
}
