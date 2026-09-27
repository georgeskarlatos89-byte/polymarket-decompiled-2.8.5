package com.socure.docv.capturesdk.feature.scanner.data;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.ix2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\t\b\u0016¢\u0006\u0004\b\b\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/socure/docv/capturesdk/feature/scanner/data/ViewDimensions;", "", "container", "Lcom/socure/docv/capturesdk/feature/scanner/data/Container;", "guidingBox", "Lcom/socure/docv/capturesdk/feature/scanner/data/GuidingBox;", "default", "", "<init>", "(Lcom/socure/docv/capturesdk/feature/scanner/data/Container;Lcom/socure/docv/capturesdk/feature/scanner/data/GuidingBox;Z)V", "()V", "getContainer", "()Lcom/socure/docv/capturesdk/feature/scanner/data/Container;", "getGuidingBox", "()Lcom/socure/docv/capturesdk/feature/scanner/data/GuidingBox;", "getDefault", "()Z", "toString", "", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ViewDimensions {
    public static final int $stable = 8;
    private final Container container;
    private final boolean default;
    private final GuidingBox guidingBox;

    public ViewDimensions() {
        this(new Container(0, 0), new GuidingBox(0, 0, 0, 0, new Dimension(ConstantsKt.UNSET, ConstantsKt.UNSET)), true);
    }

    public static /* synthetic */ ViewDimensions copy$default(ViewDimensions viewDimensions, Container container, GuidingBox guidingBox, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            container = viewDimensions.container;
        }
        if ((i & 2) != 0) {
            guidingBox = viewDimensions.guidingBox;
        }
        if ((i & 4) != 0) {
            z = viewDimensions.default;
        }
        return viewDimensions.copy(container, guidingBox, z);
    }

    /* renamed from: component1, reason: from getter */
    public final Container getContainer() {
        return this.container;
    }

    /* renamed from: component2, reason: from getter */
    public final GuidingBox getGuidingBox() {
        return this.guidingBox;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getDefault() {
        return this.default;
    }

    public final ViewDimensions copy(Container container, GuidingBox guidingBox, boolean r3) {
        container.getClass();
        guidingBox.getClass();
        return new ViewDimensions(container, guidingBox, r3);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewDimensions)) {
            return false;
        }
        ViewDimensions viewDimensions = (ViewDimensions) other;
        if (Intrinsics.areEqual(this.container, viewDimensions.container) && Intrinsics.areEqual(this.guidingBox, viewDimensions.guidingBox) && this.default == viewDimensions.default) {
            return true;
        }
        return false;
    }

    public final Container getContainer() {
        return this.container;
    }

    public final boolean getDefault() {
        return this.default;
    }

    public final GuidingBox getGuidingBox() {
        return this.guidingBox;
    }

    public int hashCode() {
        return Boolean.hashCode(this.default) + ((this.guidingBox.hashCode() + (this.container.hashCode() * 31)) * 31);
    }

    public String toString() {
        Container container = this.container;
        GuidingBox guidingBox = this.guidingBox;
        boolean z = this.default;
        StringBuilder sb = new StringBuilder("ViewDimensions(container=");
        sb.append(container);
        sb.append(", guidingBox=");
        sb.append(guidingBox);
        sb.append(", default=");
        return ix2.r(sb, z, ")");
    }

    public /* synthetic */ ViewDimensions(Container container, GuidingBox guidingBox, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(container, guidingBox, (i & 4) != 0 ? false : z);
    }

    public ViewDimensions(Container container, GuidingBox guidingBox, boolean z) {
        container.getClass();
        guidingBox.getClass();
        this.container = container;
        this.guidingBox = guidingBox;
        this.default = z;
    }
}
