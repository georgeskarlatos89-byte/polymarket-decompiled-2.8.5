package com.socure.docv.capturesdk.feature.scanner.data;

import defpackage.m51;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/socure/docv/capturesdk/feature/scanner/data/Container;", "", "width", "", "height", "<init>", "(II)V", "getWidth", "()I", "getHeight", "toString", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Container {
    public static final int $stable = 0;
    private final int height;
    private final int width;

    public Container(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public static /* synthetic */ Container copy$default(Container container, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = container.width;
        }
        if ((i3 & 2) != 0) {
            i2 = container.height;
        }
        return container.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component2, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    public final Container copy(int width, int height) {
        return new Container(width, height);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Container)) {
            return false;
        }
        Container container = (Container) other;
        if (this.width == container.width && this.height == container.height) {
            return true;
        }
        return false;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Integer.hashCode(this.height) + (Integer.hashCode(this.width) * 31);
    }

    public String toString() {
        return m51.j(this.width, "Container(width=", this.height, ", height=", ")");
    }
}
