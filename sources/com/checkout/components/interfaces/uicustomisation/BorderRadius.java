package com.checkout.components.interfaces.uicustomisation;

import android.os.Parcel;
import android.os.Parcelable;
import com.socure.idplus.device.internal.mediaDevice.manager.d;
import defpackage.m51;
import defpackage.woa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\nJ\r\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\fJ8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010\f¨\u0006+"}, d2 = {"Lcom/checkout/components/interfaces/uicustomisation/BorderRadius;", "Landroid/os/Parcelable;", "", "bottomStart", "bottomEnd", "topStart", "topEnd", "<init>", "(IIII)V", "all", "(I)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "component3", "component4", "copy", "(IIII)Lcom/checkout/components/interfaces/uicustomisation/BorderRadius;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getBottomStart", "b", "getBottomEnd", "c", "getTopStart", d.d, "getTopEnd", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BorderRadius implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<BorderRadius> CREATOR = new Creator();

    /* renamed from: a, reason: from kotlin metadata */
    private final int bottomStart;

    /* renamed from: b, reason: from kotlin metadata */
    private final int bottomEnd;

    /* renamed from: c, reason: from kotlin metadata */
    private final int topStart;

    /* renamed from: d, reason: from kotlin metadata */
    private final int topEnd;

    public /* synthetic */ BorderRadius(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }

    public static BorderRadius copy$default(BorderRadius borderRadius, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = borderRadius.bottomStart;
        }
        if ((i5 & 2) != 0) {
            i2 = borderRadius.bottomEnd;
        }
        if ((i5 & 4) != 0) {
            i3 = borderRadius.topStart;
        }
        if ((i5 & 8) != 0) {
            i4 = borderRadius.topEnd;
        }
        borderRadius.getClass();
        return new BorderRadius(i, i2, i3, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getBottomStart() {
        return this.bottomStart;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBottomEnd() {
        return this.bottomEnd;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTopStart() {
        return this.topStart;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTopEnd() {
        return this.topEnd;
    }

    public final BorderRadius copy(int bottomStart, int bottomEnd, int topStart, int topEnd) {
        return new BorderRadius(bottomStart, bottomEnd, topStart, topEnd);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BorderRadius)) {
            return false;
        }
        BorderRadius borderRadius = (BorderRadius) other;
        if (this.bottomStart == borderRadius.bottomStart && this.bottomEnd == borderRadius.bottomEnd && this.topStart == borderRadius.topStart && this.topEnd == borderRadius.topEnd) {
            return true;
        }
        return false;
    }

    public final int getBottomEnd() {
        return this.bottomEnd;
    }

    public final int getBottomStart() {
        return this.bottomStart;
    }

    public final int getTopEnd() {
        return this.topEnd;
    }

    public final int getTopStart() {
        return this.topStart;
    }

    public final int hashCode() {
        return Integer.hashCode(this.topEnd) + woa.b(this.topStart, woa.b(this.bottomEnd, Integer.hashCode(this.bottomStart) * 31, 31), 31);
    }

    public final String toString() {
        int i = this.bottomStart;
        int i2 = this.bottomEnd;
        int i3 = this.topStart;
        int i4 = this.topEnd;
        StringBuilder n = m51.n(i, "BorderRadius(bottomStart=", i2, ", bottomEnd=", ", topStart=");
        n.append(i3);
        n.append(", topEnd=");
        n.append(i4);
        n.append(")");
        return n.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.bottomStart);
        dest.writeInt(this.bottomEnd);
        dest.writeInt(this.topStart);
        dest.writeInt(this.topEnd);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<BorderRadius> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BorderRadius createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BorderRadius(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BorderRadius[] newArray(int i) {
            return new BorderRadius[i];
        }

        @Override // android.os.Parcelable.Creator
        public final BorderRadius[] newArray(int i) {
            return new BorderRadius[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BorderRadius createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }
    }

    public BorderRadius(int i, int i2, int i3, int i4) {
        this.bottomStart = i;
        this.bottomEnd = i2;
        this.topStart = i3;
        this.topEnd = i4;
    }

    public BorderRadius() {
        this(0, 0, 0, 0, 15, null);
    }

    public BorderRadius(int i) {
        this(i, i, i, i);
    }
}
